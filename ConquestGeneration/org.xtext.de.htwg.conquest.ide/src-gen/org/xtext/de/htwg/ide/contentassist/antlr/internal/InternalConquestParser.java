package org.xtext.de.htwg.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.de.htwg.services.ConquestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalConquestParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(ConquestGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleGame"
    // InternalConquest.g:53:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalConquest.g:54:1: ( ruleGame EOF )
            // InternalConquest.g:55:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalConquest.g:62:1: ruleGame : ( ( rule__Game__FieldAssignment ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConquest.g:66:2: ( ( ( rule__Game__FieldAssignment ) ) )
            // InternalConquest.g:67:2: ( ( rule__Game__FieldAssignment ) )
            {
            // InternalConquest.g:67:2: ( ( rule__Game__FieldAssignment ) )
            // InternalConquest.g:68:3: ( rule__Game__FieldAssignment )
            {
             before(grammarAccess.getGameAccess().getFieldAssignment()); 
            // InternalConquest.g:69:3: ( rule__Game__FieldAssignment )
            // InternalConquest.g:69:4: rule__Game__FieldAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Game__FieldAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getFieldAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleField"
    // InternalConquest.g:78:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalConquest.g:79:1: ( ruleField EOF )
            // InternalConquest.g:80:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalConquest.g:87:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConquest.g:91:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalConquest.g:92:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalConquest.g:92:2: ( ( rule__Field__Group__0 ) )
            // InternalConquest.g:93:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalConquest.g:94:3: ( rule__Field__Group__0 )
            // InternalConquest.g:94:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "rule__Field__Group__0"
    // InternalConquest.g:102:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConquest.g:106:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalConquest.g:107:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalConquest.g:114:1: rule__Field__Group__0__Impl : ( 'size' ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConquest.g:118:1: ( ( 'size' ) )
            // InternalConquest.g:119:1: ( 'size' )
            {
            // InternalConquest.g:119:1: ( 'size' )
            // InternalConquest.g:120:2: 'size'
            {
             before(grammarAccess.getFieldAccess().getSizeKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getSizeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalConquest.g:129:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConquest.g:133:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalConquest.g:134:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalConquest.g:141:1: rule__Field__Group__1__Impl : ( ( rule__Field__NameAssignment_1 ) ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConquest.g:145:1: ( ( ( rule__Field__NameAssignment_1 ) ) )
            // InternalConquest.g:146:1: ( ( rule__Field__NameAssignment_1 ) )
            {
            // InternalConquest.g:146:1: ( ( rule__Field__NameAssignment_1 ) )
            // InternalConquest.g:147:2: ( rule__Field__NameAssignment_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1()); 
            // InternalConquest.g:148:2: ( rule__Field__NameAssignment_1 )
            // InternalConquest.g:148:3: rule__Field__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalConquest.g:156:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConquest.g:160:1: ( rule__Field__Group__2__Impl )
            // InternalConquest.g:161:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalConquest.g:167:1: rule__Field__Group__2__Impl : ( '!' ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConquest.g:171:1: ( ( '!' ) )
            // InternalConquest.g:172:1: ( '!' )
            {
            // InternalConquest.g:172:1: ( '!' )
            // InternalConquest.g:173:2: '!'
            {
             before(grammarAccess.getFieldAccess().getExclamationMarkKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Game__FieldAssignment"
    // InternalConquest.g:183:1: rule__Game__FieldAssignment : ( ruleField ) ;
    public final void rule__Game__FieldAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConquest.g:187:1: ( ( ruleField ) )
            // InternalConquest.g:188:2: ( ruleField )
            {
            // InternalConquest.g:188:2: ( ruleField )
            // InternalConquest.g:189:3: ruleField
            {
             before(grammarAccess.getGameAccess().getFieldFieldParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getGameAccess().getFieldFieldParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__FieldAssignment"


    // $ANTLR start "rule__Field__NameAssignment_1"
    // InternalConquest.g:198:1: rule__Field__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalConquest.g:202:1: ( ( RULE_ID ) )
            // InternalConquest.g:203:2: ( RULE_ID )
            {
            // InternalConquest.g:203:2: ( RULE_ID )
            // InternalConquest.g:204:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});

}