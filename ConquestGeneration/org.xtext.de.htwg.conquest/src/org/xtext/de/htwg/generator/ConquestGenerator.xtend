/*
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.de.htwg.conquest.ClassesList
import org.xtext.de.htwg.conquest.ColorList
import org.xtext.de.htwg.conquest.Conquest
import org.xtext.de.htwg.conquest.Entity


/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ConquestGenerator extends AbstractGenerator {

	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val conquest = resource.contents.head as Conquest
		val colors = createColorUtil(conquest.colorList)
		val conquestmod = createConquestModule(conquest.classesList)
		fsa.generateFile("de/htwg/conquest/util/ColorUtil.java", colors)
		fsa.generateFile("de/htwg/conquest/ConquestModule.java", conquestmod)
		conquest.entityList.entities.forEach[element | generateEntity(element, fsa)]
	}
	
	def createConquestModule(ClassesList classesList) '''
		package de.htwg.conquest;
		
		import com.google.inject.AbstractModule;
		import com.google.inject.Singleton;
		
		�FOR Class : classesList.classes SEPARATOR ", "�
			import �Class.interfacePath�
		�ENDFOR�
		
		public class ConquestModule extends AbstractModule {
			
			@Override
			protected void configure(){
				�FOR Class : classesList.classes SEPARATOR ", "�
					bind(�Class.interfaceName�).to(�Class.classPath�).in(Singleton.class);
				�ENDFOR�
			}
		}
	'''
	
	def generateEntity(Entity entity, IFileSystemAccess2 fsa) {
		if(entity.hasInterface == "true") fsa.generateFile("de/htwg/conquest/model/" + "I" + entity.name + ".java", createInterface(entity))
		fsa.generateFile("de/htwg/conquest/model/impl/" + entity.name + ".java", createClass(entity))
	}

	def createClass(Entity entity) '''
		package �entity.package�
		
		�FOR i : entity.imports�
			import �i�; 
		�ENDFOR�
		
		public class �entity.name��IF entity.hasInterface == "true"� implements I�entity.name��ENDIF� {
			
			�FOR f : entity.fieldList.fields�
				private �f.type� �f.name�;
			�ENDFOR�
			
			public �entity.name�(�FOR a : entity.constructor.args SEPARATOR ", "��a��ENDFOR�) {
				�FOR b : entity.constructor.body�
					�b�
				�ENDFOR�
			}
			
			�FOR f : entity.fieldList.fields�
				@Override
				public �f.type� get�f.name.toFirstUpper�() {
					return this.�f.name�;
				}
				
				@Override
				public void set�f.name.toFirstUpper�(�f.type� �f.name�) {
					this.�f.name� = �f.name�;
				}
				
			�ENDFOR�
			
			�FOR m : entity.methodList.methods�
				@Override
				public �m.type� �m.name�(�FOR a : m.args SEPARATOR ", "��a��ENDFOR�) {
					�FOR b : m.body�
						�b�
					�ENDFOR�
				}
				
			�ENDFOR�
		}
	'''

	def createInterface(Entity entity) '''
		package �entity.package.toString().split(".impl").get(0)�
		
		�FOR i : entity.imports�
			import �i�;
		�ENDFOR�
		
		public interface I�entity.name� {
			
			�FOR f : entity.fieldList.fields�
				public �f.type� get�f.name.toFirstUpper�();
				public void set�f.name.toFirstUpper�(�f.type� �f.name�);
			�ENDFOR�
			�FOR m : entity.methodList.methods�
				public �m.type� �m.name�(�FOR a : m.args SEPARATOR ", "��a��ENDFOR�);
			�ENDFOR�
		}
	'''

	def createColorUtil(ColorList colorList) '''
		package de.htwg.conquest.util;
		
		import java.awt.Color;
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.List;
		
		public class ColorUtil {
		
			public static final List<Color> getColorSet(int num) {
				return colors.subList(0, num);
			}
			
			public static final int getSize() {
				return colors.size();
			}
		
			private static final List<Color> colors = new ArrayList<>(Arrays.asList(
				�FOR color : colorList.colors SEPARATOR ", "�
					Color.�color�
				�ENDFOR�
			));
			
			public static final String getColorText(Color c) {
				String co = "";
				�FOR color : colorList.colors SEPARATOR " else "�
					if(c.equals(Color.�color�)) {
						co = "�color.toString.toLowerCase�";
					}
				�ENDFOR�
				else {
				co = " ";
				}
				return co;
			}
		}
	'''
	

}
