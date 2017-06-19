package org.xtext.de.htwg.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.de.htwg.services.ConquestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConquestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'size'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalConquestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalConquestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalConquestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalConquest.g"; }



     	private ConquestGrammarAccess grammarAccess;

        public InternalConquestParser(TokenStream input, ConquestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected ConquestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalConquest.g:64:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalConquest.g:64:45: (iv_ruleGame= ruleGame EOF )
            // InternalConquest.g:65:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalConquest.g:71:1: ruleGame returns [EObject current=null] : ( (lv_field_0_0= ruleField ) ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        EObject lv_field_0_0 = null;



        	enterRule();

        try {
            // InternalConquest.g:77:2: ( ( (lv_field_0_0= ruleField ) ) )
            // InternalConquest.g:78:2: ( (lv_field_0_0= ruleField ) )
            {
            // InternalConquest.g:78:2: ( (lv_field_0_0= ruleField ) )
            // InternalConquest.g:79:3: (lv_field_0_0= ruleField )
            {
            // InternalConquest.g:79:3: (lv_field_0_0= ruleField )
            // InternalConquest.g:80:4: lv_field_0_0= ruleField
            {

            				newCompositeNode(grammarAccess.getGameAccess().getFieldFieldParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_field_0_0=ruleField();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getGameRule());
            				}
            				set(
            					current,
            					"field",
            					lv_field_0_0,
            					"org.xtext.de.htwg.Conquest.Field");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleField"
    // InternalConquest.g:100:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalConquest.g:100:46: (iv_ruleField= ruleField EOF )
            // InternalConquest.g:101:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalConquest.g:107:1: ruleField returns [EObject current=null] : (otherlv_0= 'size' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalConquest.g:113:2: ( (otherlv_0= 'size' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // InternalConquest.g:114:2: (otherlv_0= 'size' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // InternalConquest.g:114:2: (otherlv_0= 'size' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // InternalConquest.g:115:3: otherlv_0= 'size' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getSizeKeyword_0());
            		
            // InternalConquest.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalConquest.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalConquest.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalConquest.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getExclamationMarkKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});

}