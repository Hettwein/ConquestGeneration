/*
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractConquestValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.de.htwg.conquest.ConquestPackage.eINSTANCE);
		return result;
	}
	
}
