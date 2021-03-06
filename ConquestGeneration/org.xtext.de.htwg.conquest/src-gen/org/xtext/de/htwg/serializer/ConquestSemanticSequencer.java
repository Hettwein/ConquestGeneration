/*
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.de.htwg.conquest.ConquestPackage;
import org.xtext.de.htwg.conquest.Field;
import org.xtext.de.htwg.conquest.Game;
import org.xtext.de.htwg.services.ConquestGrammarAccess;

@SuppressWarnings("all")
public class ConquestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ConquestGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ConquestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ConquestPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case ConquestPackage.GAME:
				sequence_Game(context, (Game) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Field returns Field
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Field(ISerializationContext context, Field semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ConquestPackage.Literals.FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConquestPackage.Literals.FIELD__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Game returns Game
	 *
	 * Constraint:
	 *     field=Field
	 */
	protected void sequence_Game(ISerializationContext context, Game semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ConquestPackage.Literals.GAME__FIELD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ConquestPackage.Literals.GAME__FIELD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGameAccess().getFieldFieldParserRuleCall_0(), semanticObject.getField());
		feeder.finish();
	}
	
	
}
