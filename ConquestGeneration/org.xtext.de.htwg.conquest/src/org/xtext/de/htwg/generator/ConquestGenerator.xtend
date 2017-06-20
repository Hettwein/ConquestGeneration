/*
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.de.htwg.conquest.Conquest
import org.xtext.de.htwg.conquest.PlayerList

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ConquestGenerator extends AbstractGenerator {
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val conquest = resource.contents.head as Conquest
		val pList = createPlayerListTxt(conquest.playerList)
		fsa.generateFile("PlayerTest.txt", pList)
	}

	def createPlayerListTxt(PlayerList playerList) '''
		�FOR player : playerList.players�
			test spieler �player.name� hat �player.cells� Feld(er)
		�ENDFOR�
	'''
}
