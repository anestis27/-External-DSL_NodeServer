package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'get'", "'put'", "'post'", "'delete'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'*'", "'/'", "'True'", "'False'", "'#'", "'->'", "':'", "'-'", "'@'", "'REQUIRE'", "'('", "')'", "'||'", "'&&'", "'+'", "'!'", "'.'", "'SERVER'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__MembersAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__MembersAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__MembersAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__MembersAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__MembersAssignment )*
            {
             before(grammarAccess.getModelAccess().getMembersAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__MembersAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==27||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__MembersAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__MembersAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMembersAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMember"
    // InternalMyDsl.g:78:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleMember EOF )
            // InternalMyDsl.g:80:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMyDsl.g:87:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Member__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Member__Alternatives )
            // InternalMyDsl.g:94:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleServerEntity"
    // InternalMyDsl.g:103:1: entryRuleServerEntity : ruleServerEntity EOF ;
    public final void entryRuleServerEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleServerEntity EOF )
            // InternalMyDsl.g:105:1: ruleServerEntity EOF
            {
             before(grammarAccess.getServerEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleServerEntity();

            state._fsp--;

             after(grammarAccess.getServerEntityRule()); 
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
    // $ANTLR end "entryRuleServerEntity"


    // $ANTLR start "ruleServerEntity"
    // InternalMyDsl.g:112:1: ruleServerEntity : ( ( rule__ServerEntity__Group__0 ) ) ;
    public final void ruleServerEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__ServerEntity__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__ServerEntity__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__ServerEntity__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__ServerEntity__Group__0 )
            {
             before(grammarAccess.getServerEntityAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__ServerEntity__Group__0 )
            // InternalMyDsl.g:119:4: rule__ServerEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServerEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServerEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleServerEntity"


    // $ANTLR start "entryRuleIsServer"
    // InternalMyDsl.g:128:1: entryRuleIsServer : ruleIsServer EOF ;
    public final void entryRuleIsServer() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleIsServer EOF )
            // InternalMyDsl.g:130:1: ruleIsServer EOF
            {
             before(grammarAccess.getIsServerRule()); 
            pushFollow(FOLLOW_1);
            ruleIsServer();

            state._fsp--;

             after(grammarAccess.getIsServerRule()); 
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
    // $ANTLR end "entryRuleIsServer"


    // $ANTLR start "ruleIsServer"
    // InternalMyDsl.g:137:1: ruleIsServer : ( ( rule__IsServer__ValueAssignment ) ) ;
    public final void ruleIsServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__IsServer__ValueAssignment ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__IsServer__ValueAssignment ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__IsServer__ValueAssignment ) )
            // InternalMyDsl.g:143:3: ( rule__IsServer__ValueAssignment )
            {
             before(grammarAccess.getIsServerAccess().getValueAssignment()); 
            // InternalMyDsl.g:144:3: ( rule__IsServer__ValueAssignment )
            // InternalMyDsl.g:144:4: rule__IsServer__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IsServer__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIsServerAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleIsServer"


    // $ANTLR start "entryRuleMemberEntity"
    // InternalMyDsl.g:153:1: entryRuleMemberEntity : ruleMemberEntity EOF ;
    public final void entryRuleMemberEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleMemberEntity EOF )
            // InternalMyDsl.g:155:1: ruleMemberEntity EOF
            {
             before(grammarAccess.getMemberEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleMemberEntity();

            state._fsp--;

             after(grammarAccess.getMemberEntityRule()); 
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
    // $ANTLR end "entryRuleMemberEntity"


    // $ANTLR start "ruleMemberEntity"
    // InternalMyDsl.g:162:1: ruleMemberEntity : ( ( rule__MemberEntity__Group__0 ) ) ;
    public final void ruleMemberEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__MemberEntity__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__MemberEntity__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__MemberEntity__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__MemberEntity__Group__0 )
            {
             before(grammarAccess.getMemberEntityAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__MemberEntity__Group__0 )
            // InternalMyDsl.g:169:4: rule__MemberEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemberEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemberEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleMemberEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:178:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:180:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:187:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:194:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleValueType"
    // InternalMyDsl.g:203:1: entryRuleValueType : ruleValueType EOF ;
    public final void entryRuleValueType() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleValueType EOF )
            // InternalMyDsl.g:205:1: ruleValueType EOF
            {
             before(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getValueTypeRule()); 
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
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalMyDsl.g:212:1: ruleValueType : ( ( rule__ValueType__ElementTypeAssignment ) ) ;
    public final void ruleValueType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__ValueType__ElementTypeAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__ValueType__ElementTypeAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__ValueType__ElementTypeAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__ValueType__ElementTypeAssignment )
            {
             before(grammarAccess.getValueTypeAccess().getElementTypeAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__ValueType__ElementTypeAssignment )
            // InternalMyDsl.g:219:4: rule__ValueType__ElementTypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ValueType__ElementTypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getValueTypeAccess().getElementTypeAssignment()); 

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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleElementType"
    // InternalMyDsl.g:228:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleElementType EOF )
            // InternalMyDsl.g:230:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalMyDsl.g:237:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__ElementType__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__ElementType__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__ElementType__Alternatives )
            // InternalMyDsl.g:244:4: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleEntityType"
    // InternalMyDsl.g:253:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEntityType EOF )
            // InternalMyDsl.g:255:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalMyDsl.g:262:1: ruleEntityType : ( ( rule__EntityType__EntityAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__EntityType__EntityAssignment ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__EntityType__EntityAssignment ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__EntityType__EntityAssignment ) )
            // InternalMyDsl.g:268:3: ( rule__EntityType__EntityAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 
            // InternalMyDsl.g:269:3: ( rule__EntityType__EntityAssignment )
            // InternalMyDsl.g:269:4: rule__EntityType__EntityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__EntityType__EntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 

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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleBasicType"
    // InternalMyDsl.g:278:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleBasicType EOF )
            // InternalMyDsl.g:280:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalMyDsl.g:287:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__BasicType__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__BasicType__Alternatives )
            // InternalMyDsl.g:294:4: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleArrayType"
    // InternalMyDsl.g:303:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleArrayType EOF )
            // InternalMyDsl.g:305:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalMyDsl.g:312:1: ruleArrayType : ( ( ( rule__ArrayType__ArrayElementsAssignment ) ) ( ( rule__ArrayType__ArrayElementsAssignment )* ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( ( rule__ArrayType__ArrayElementsAssignment ) ) ( ( rule__ArrayType__ArrayElementsAssignment )* ) ) )
            // InternalMyDsl.g:317:2: ( ( ( rule__ArrayType__ArrayElementsAssignment ) ) ( ( rule__ArrayType__ArrayElementsAssignment )* ) )
            {
            // InternalMyDsl.g:317:2: ( ( ( rule__ArrayType__ArrayElementsAssignment ) ) ( ( rule__ArrayType__ArrayElementsAssignment )* ) )
            // InternalMyDsl.g:318:3: ( ( rule__ArrayType__ArrayElementsAssignment ) ) ( ( rule__ArrayType__ArrayElementsAssignment )* )
            {
            // InternalMyDsl.g:318:3: ( ( rule__ArrayType__ArrayElementsAssignment ) )
            // InternalMyDsl.g:319:4: ( rule__ArrayType__ArrayElementsAssignment )
            {
             before(grammarAccess.getArrayTypeAccess().getArrayElementsAssignment()); 
            // InternalMyDsl.g:320:4: ( rule__ArrayType__ArrayElementsAssignment )
            // InternalMyDsl.g:320:5: rule__ArrayType__ArrayElementsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__ArrayType__ArrayElementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getArrayElementsAssignment()); 

            }

            // InternalMyDsl.g:323:3: ( ( rule__ArrayType__ArrayElementsAssignment )* )
            // InternalMyDsl.g:324:4: ( rule__ArrayType__ArrayElementsAssignment )*
            {
             before(grammarAccess.getArrayTypeAccess().getArrayElementsAssignment()); 
            // InternalMyDsl.g:325:4: ( rule__ArrayType__ArrayElementsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==30) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:325:5: rule__ArrayType__ArrayElementsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ArrayType__ArrayElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getArrayTypeAccess().getArrayElementsAssignment()); 

            }


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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleArrayElement"
    // InternalMyDsl.g:335:1: entryRuleArrayElement : ruleArrayElement EOF ;
    public final void entryRuleArrayElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:336:1: ( ruleArrayElement EOF )
            // InternalMyDsl.g:337:1: ruleArrayElement EOF
            {
             before(grammarAccess.getArrayElementRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayElement();

            state._fsp--;

             after(grammarAccess.getArrayElementRule()); 
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
    // $ANTLR end "entryRuleArrayElement"


    // $ANTLR start "ruleArrayElement"
    // InternalMyDsl.g:344:1: ruleArrayElement : ( ( rule__ArrayElement__Group__0 ) ) ;
    public final void ruleArrayElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:2: ( ( ( rule__ArrayElement__Group__0 ) ) )
            // InternalMyDsl.g:349:2: ( ( rule__ArrayElement__Group__0 ) )
            {
            // InternalMyDsl.g:349:2: ( ( rule__ArrayElement__Group__0 ) )
            // InternalMyDsl.g:350:3: ( rule__ArrayElement__Group__0 )
            {
             before(grammarAccess.getArrayElementAccess().getGroup()); 
            // InternalMyDsl.g:351:3: ( rule__ArrayElement__Group__0 )
            // InternalMyDsl.g:351:4: rule__ArrayElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayElementAccess().getGroup()); 

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
    // $ANTLR end "ruleArrayElement"


    // $ANTLR start "entryRuleVerb"
    // InternalMyDsl.g:360:1: entryRuleVerb : ruleVerb EOF ;
    public final void entryRuleVerb() throws RecognitionException {
        try {
            // InternalMyDsl.g:361:1: ( ruleVerb EOF )
            // InternalMyDsl.g:362:1: ruleVerb EOF
            {
             before(grammarAccess.getVerbRule()); 
            pushFollow(FOLLOW_1);
            ruleVerb();

            state._fsp--;

             after(grammarAccess.getVerbRule()); 
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
    // $ANTLR end "entryRuleVerb"


    // $ANTLR start "ruleVerb"
    // InternalMyDsl.g:369:1: ruleVerb : ( ( rule__Verb__Group__0 ) ) ;
    public final void ruleVerb() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:373:2: ( ( ( rule__Verb__Group__0 ) ) )
            // InternalMyDsl.g:374:2: ( ( rule__Verb__Group__0 ) )
            {
            // InternalMyDsl.g:374:2: ( ( rule__Verb__Group__0 ) )
            // InternalMyDsl.g:375:3: ( rule__Verb__Group__0 )
            {
             before(grammarAccess.getVerbAccess().getGroup()); 
            // InternalMyDsl.g:376:3: ( rule__Verb__Group__0 )
            // InternalMyDsl.g:376:4: rule__Verb__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Verb__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerbAccess().getGroup()); 

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
    // $ANTLR end "ruleVerb"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:385:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMyDsl.g:386:1: ( ruleRule EOF )
            // InternalMyDsl.g:387:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:394:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:398:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMyDsl.g:399:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMyDsl.g:399:2: ( ( rule__Rule__Group__0 ) )
            // InternalMyDsl.g:400:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMyDsl.g:401:3: ( rule__Rule__Group__0 )
            // InternalMyDsl.g:401:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:410:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:411:1: ( ruleCondition EOF )
            // InternalMyDsl.g:412:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:419:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalMyDsl.g:424:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalMyDsl.g:424:2: ( ( rule__Condition__Group__0 ) )
            // InternalMyDsl.g:425:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalMyDsl.g:426:3: ( rule__Condition__Group__0 )
            // InternalMyDsl.g:426:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:435:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:436:1: ( ruleExpression EOF )
            // InternalMyDsl.g:437:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:444:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:2: ( ( ruleOr ) )
            // InternalMyDsl.g:449:2: ( ruleOr )
            {
            // InternalMyDsl.g:449:2: ( ruleOr )
            // InternalMyDsl.g:450:3: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalMyDsl.g:460:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalMyDsl.g:461:1: ( ruleOr EOF )
            // InternalMyDsl.g:462:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMyDsl.g:469:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalMyDsl.g:474:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalMyDsl.g:474:2: ( ( rule__Or__Group__0 ) )
            // InternalMyDsl.g:475:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalMyDsl.g:476:3: ( rule__Or__Group__0 )
            // InternalMyDsl.g:476:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMyDsl.g:485:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalMyDsl.g:486:1: ( ruleAnd EOF )
            // InternalMyDsl.g:487:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMyDsl.g:494:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:498:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalMyDsl.g:499:2: ( ( rule__And__Group__0 ) )
            {
            // InternalMyDsl.g:499:2: ( ( rule__And__Group__0 ) )
            // InternalMyDsl.g:500:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalMyDsl.g:501:3: ( rule__And__Group__0 )
            // InternalMyDsl.g:501:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMyDsl.g:510:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalMyDsl.g:511:1: ( ruleEquality EOF )
            // InternalMyDsl.g:512:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMyDsl.g:519:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalMyDsl.g:524:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalMyDsl.g:524:2: ( ( rule__Equality__Group__0 ) )
            // InternalMyDsl.g:525:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalMyDsl.g:526:3: ( rule__Equality__Group__0 )
            // InternalMyDsl.g:526:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMyDsl.g:535:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalMyDsl.g:536:1: ( ruleComparison EOF )
            // InternalMyDsl.g:537:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMyDsl.g:544:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:548:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalMyDsl.g:549:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalMyDsl.g:549:2: ( ( rule__Comparison__Group__0 ) )
            // InternalMyDsl.g:550:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalMyDsl.g:551:3: ( rule__Comparison__Group__0 )
            // InternalMyDsl.g:551:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMyDsl.g:560:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalMyDsl.g:561:1: ( rulePlusOrMinus EOF )
            // InternalMyDsl.g:562:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMyDsl.g:569:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:573:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalMyDsl.g:574:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalMyDsl.g:574:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalMyDsl.g:575:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalMyDsl.g:576:3: ( rule__PlusOrMinus__Group__0 )
            // InternalMyDsl.g:576:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMyDsl.g:585:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalMyDsl.g:586:1: ( ruleMulOrDiv EOF )
            // InternalMyDsl.g:587:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMyDsl.g:594:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalMyDsl.g:599:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalMyDsl.g:599:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalMyDsl.g:600:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalMyDsl.g:601:3: ( rule__MulOrDiv__Group__0 )
            // InternalMyDsl.g:601:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:610:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMyDsl.g:611:1: ( rulePrimary EOF )
            // InternalMyDsl.g:612:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:619:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMyDsl.g:624:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMyDsl.g:624:2: ( ( rule__Primary__Alternatives ) )
            // InternalMyDsl.g:625:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMyDsl.g:626:3: ( rule__Primary__Alternatives )
            // InternalMyDsl.g:626:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalMyDsl.g:635:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalMyDsl.g:636:1: ( ruleAtomic EOF )
            // InternalMyDsl.g:637:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMyDsl.g:644:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:648:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalMyDsl.g:649:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalMyDsl.g:649:2: ( ( rule__Atomic__Alternatives ) )
            // InternalMyDsl.g:650:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalMyDsl.g:651:3: ( rule__Atomic__Alternatives )
            // InternalMyDsl.g:651:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMyDsl.g:660:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMyDsl.g:661:1: ( ruleQualifiedName EOF )
            // InternalMyDsl.g:662:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMyDsl.g:669:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMyDsl.g:674:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMyDsl.g:674:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMyDsl.g:675:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMyDsl.g:676:3: ( rule__QualifiedName__Group__0 )
            // InternalMyDsl.g:676:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalMyDsl.g:684:1: rule__Member__Alternatives : ( ( ruleServerEntity ) | ( ruleMemberEntity ) | ( ruleVerb ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( ( ruleServerEntity ) | ( ruleMemberEntity ) | ( ruleVerb ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==EOF||(LA3_3>=27 && LA3_3<=28)||LA3_3==31) ) {
                        alt3=2;
                    }
                    else if ( (LA3_3==40) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==31) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:689:2: ( ruleServerEntity )
                    {
                    // InternalMyDsl.g:689:2: ( ruleServerEntity )
                    // InternalMyDsl.g:690:3: ruleServerEntity
                    {
                     before(grammarAccess.getMemberAccess().getServerEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleServerEntity();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getServerEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:695:2: ( ruleMemberEntity )
                    {
                    // InternalMyDsl.g:695:2: ( ruleMemberEntity )
                    // InternalMyDsl.g:696:3: ruleMemberEntity
                    {
                     before(grammarAccess.getMemberAccess().getMemberEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMemberEntity();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getMemberEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:701:2: ( ruleVerb )
                    {
                    // InternalMyDsl.g:701:2: ( ruleVerb )
                    // InternalMyDsl.g:702:3: ruleVerb
                    {
                     before(grammarAccess.getMemberAccess().getVerbParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVerb();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getVerbParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__ElementType__Alternatives"
    // InternalMyDsl.g:711:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleEntityType ) | ( ruleArrayType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( ( ruleBasicType ) | ( ruleEntityType ) | ( ruleArrayType ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 11:
            case 12:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:716:2: ( ruleBasicType )
                    {
                    // InternalMyDsl.g:716:2: ( ruleBasicType )
                    // InternalMyDsl.g:717:3: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:722:2: ( ruleEntityType )
                    {
                    // InternalMyDsl.g:722:2: ( ruleEntityType )
                    // InternalMyDsl.g:723:3: ruleEntityType
                    {
                     before(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntityType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:728:2: ( ruleArrayType )
                    {
                    // InternalMyDsl.g:728:2: ( ruleArrayType )
                    // InternalMyDsl.g:729:3: ruleArrayType
                    {
                     before(grammarAccess.getElementTypeAccess().getArrayTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getArrayTypeParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalMyDsl.g:738:1: rule__BasicType__Alternatives : ( ( ( rule__BasicType__Group_0__0 ) ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( ( ( rule__BasicType__Group_0__0 ) ) | ( ( rule__BasicType__Group_1__0 ) ) | ( ( rule__BasicType__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case 11:
            case 12:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:743:2: ( ( rule__BasicType__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:743:2: ( ( rule__BasicType__Group_0__0 ) )
                    // InternalMyDsl.g:744:3: ( rule__BasicType__Group_0__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_0()); 
                    // InternalMyDsl.g:745:3: ( rule__BasicType__Group_0__0 )
                    // InternalMyDsl.g:745:4: rule__BasicType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:749:2: ( ( rule__BasicType__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:749:2: ( ( rule__BasicType__Group_1__0 ) )
                    // InternalMyDsl.g:750:3: ( rule__BasicType__Group_1__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_1()); 
                    // InternalMyDsl.g:751:3: ( rule__BasicType__Group_1__0 )
                    // InternalMyDsl.g:751:4: rule__BasicType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:755:2: ( ( rule__BasicType__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:755:2: ( ( rule__BasicType__Group_2__0 ) )
                    // InternalMyDsl.g:756:3: ( rule__BasicType__Group_2__0 )
                    {
                     before(grammarAccess.getBasicTypeAccess().getGroup_2()); 
                    // InternalMyDsl.g:757:3: ( rule__BasicType__Group_2__0 )
                    // InternalMyDsl.g:757:4: rule__BasicType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicTypeAccess().getGroup_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__BasicType__ValueAlternatives_2_1_0"
    // InternalMyDsl.g:765:1: rule__BasicType__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__BasicType__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:770:2: ( 'true' )
                    {
                    // InternalMyDsl.g:770:2: ( 'true' )
                    // InternalMyDsl.g:771:3: 'true'
                    {
                     before(grammarAccess.getBasicTypeAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:776:2: ( 'false' )
                    {
                    // InternalMyDsl.g:776:2: ( 'false' )
                    // InternalMyDsl.g:777:3: 'false'
                    {
                     before(grammarAccess.getBasicTypeAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBasicTypeAccess().getValueFalseKeyword_2_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__BasicType__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__Verb__VerbAlternatives_1_0"
    // InternalMyDsl.g:786:1: rule__Verb__VerbAlternatives_1_0 : ( ( 'get' ) | ( 'put' ) | ( 'post' ) | ( 'delete' ) );
    public final void rule__Verb__VerbAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:790:1: ( ( 'get' ) | ( 'put' ) | ( 'post' ) | ( 'delete' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:791:2: ( 'get' )
                    {
                    // InternalMyDsl.g:791:2: ( 'get' )
                    // InternalMyDsl.g:792:3: 'get'
                    {
                     before(grammarAccess.getVerbAccess().getVerbGetKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getVerbAccess().getVerbGetKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:797:2: ( 'put' )
                    {
                    // InternalMyDsl.g:797:2: ( 'put' )
                    // InternalMyDsl.g:798:3: 'put'
                    {
                     before(grammarAccess.getVerbAccess().getVerbPutKeyword_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getVerbAccess().getVerbPutKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:803:2: ( 'post' )
                    {
                    // InternalMyDsl.g:803:2: ( 'post' )
                    // InternalMyDsl.g:804:3: 'post'
                    {
                     before(grammarAccess.getVerbAccess().getVerbPostKeyword_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getVerbAccess().getVerbPostKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:809:2: ( 'delete' )
                    {
                    // InternalMyDsl.g:809:2: ( 'delete' )
                    // InternalMyDsl.g:810:3: 'delete'
                    {
                     before(grammarAccess.getVerbAccess().getVerbDeleteKeyword_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVerbAccess().getVerbDeleteKeyword_1_0_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Verb__VerbAlternatives_1_0"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // InternalMyDsl.g:819:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:823:1: ( ( '==' ) | ( '!=' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:824:2: ( '==' )
                    {
                    // InternalMyDsl.g:824:2: ( '==' )
                    // InternalMyDsl.g:825:3: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:830:2: ( '!=' )
                    {
                    // InternalMyDsl.g:830:2: ( '!=' )
                    // InternalMyDsl.g:831:3: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // InternalMyDsl.g:840:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:844:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:845:2: ( '>=' )
                    {
                    // InternalMyDsl.g:845:2: ( '>=' )
                    // InternalMyDsl.g:846:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:851:2: ( '<=' )
                    {
                    // InternalMyDsl.g:851:2: ( '<=' )
                    // InternalMyDsl.g:852:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:857:2: ( '>' )
                    {
                    // InternalMyDsl.g:857:2: ( '>' )
                    // InternalMyDsl.g:858:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:863:2: ( '<' )
                    {
                    // InternalMyDsl.g:863:2: ( '<' )
                    // InternalMyDsl.g:864:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalMyDsl.g:873:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            else if ( (LA10_0==30) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:878:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalMyDsl.g:878:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalMyDsl.g:879:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalMyDsl.g:880:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalMyDsl.g:880:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:884:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalMyDsl.g:884:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalMyDsl.g:885:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalMyDsl.g:886:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalMyDsl.g:886:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_0_1_0"
    // InternalMyDsl.g:894:1: rule__MulOrDiv__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( ( '*' ) | ( '/' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:899:2: ( '*' )
                    {
                    // InternalMyDsl.g:899:2: ( '*' )
                    // InternalMyDsl.g:900:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:905:2: ( '/' )
                    {
                    // InternalMyDsl.g:905:2: ( '/' )
                    // InternalMyDsl.g:906:3: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMyDsl.g:915:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt12=1;
                }
                break;
            case 38:
                {
                alt12=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 25:
            case 26:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:920:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:920:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMyDsl.g:921:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMyDsl.g:922:3: ( rule__Primary__Group_0__0 )
                    // InternalMyDsl.g:922:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:926:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:926:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMyDsl.g:927:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMyDsl.g:928:3: ( rule__Primary__Group_1__0 )
                    // InternalMyDsl.g:928:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:932:2: ( ruleAtomic )
                    {
                    // InternalMyDsl.g:932:2: ( ruleAtomic )
                    // InternalMyDsl.g:933:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalMyDsl.g:942:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case 25:
            case 26:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:947:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:947:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalMyDsl.g:948:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalMyDsl.g:949:3: ( rule__Atomic__Group_0__0 )
                    // InternalMyDsl.g:949:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:953:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:953:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalMyDsl.g:954:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalMyDsl.g:955:3: ( rule__Atomic__Group_1__0 )
                    // InternalMyDsl.g:955:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:959:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:959:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalMyDsl.g:960:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalMyDsl.g:961:3: ( rule__Atomic__Group_2__0 )
                    // InternalMyDsl.g:961:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:965:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalMyDsl.g:965:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalMyDsl.g:966:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalMyDsl.g:967:3: ( rule__Atomic__Group_3__0 )
                    // InternalMyDsl.g:967:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // InternalMyDsl.g:975:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'True' ) | ( 'False' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:979:1: ( ( 'True' ) | ( 'False' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            else if ( (LA14_0==26) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:980:2: ( 'True' )
                    {
                    // InternalMyDsl.g:980:2: ( 'True' )
                    // InternalMyDsl.g:981:3: 'True'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:986:2: ( 'False' )
                    {
                    // InternalMyDsl.g:986:2: ( 'False' )
                    // InternalMyDsl.g:987:3: 'False'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__ServerEntity__Group__0"
    // InternalMyDsl.g:996:1: rule__ServerEntity__Group__0 : rule__ServerEntity__Group__0__Impl rule__ServerEntity__Group__1 ;
    public final void rule__ServerEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( rule__ServerEntity__Group__0__Impl rule__ServerEntity__Group__1 )
            // InternalMyDsl.g:1001:2: rule__ServerEntity__Group__0__Impl rule__ServerEntity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ServerEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerEntity__Group__1();

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
    // $ANTLR end "rule__ServerEntity__Group__0"


    // $ANTLR start "rule__ServerEntity__Group__0__Impl"
    // InternalMyDsl.g:1008:1: rule__ServerEntity__Group__0__Impl : ( '#' ) ;
    public final void rule__ServerEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1012:1: ( ( '#' ) )
            // InternalMyDsl.g:1013:1: ( '#' )
            {
            // InternalMyDsl.g:1013:1: ( '#' )
            // InternalMyDsl.g:1014:2: '#'
            {
             before(grammarAccess.getServerEntityAccess().getNumberSignKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getServerEntityAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__ServerEntity__Group__0__Impl"


    // $ANTLR start "rule__ServerEntity__Group__1"
    // InternalMyDsl.g:1023:1: rule__ServerEntity__Group__1 : rule__ServerEntity__Group__1__Impl rule__ServerEntity__Group__2 ;
    public final void rule__ServerEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1027:1: ( rule__ServerEntity__Group__1__Impl rule__ServerEntity__Group__2 )
            // InternalMyDsl.g:1028:2: rule__ServerEntity__Group__1__Impl rule__ServerEntity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ServerEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerEntity__Group__2();

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
    // $ANTLR end "rule__ServerEntity__Group__1"


    // $ANTLR start "rule__ServerEntity__Group__1__Impl"
    // InternalMyDsl.g:1035:1: rule__ServerEntity__Group__1__Impl : ( ( rule__ServerEntity__NameAssignment_1 ) ) ;
    public final void rule__ServerEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( ( ( rule__ServerEntity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1040:1: ( ( rule__ServerEntity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1040:1: ( ( rule__ServerEntity__NameAssignment_1 ) )
            // InternalMyDsl.g:1041:2: ( rule__ServerEntity__NameAssignment_1 )
            {
             before(grammarAccess.getServerEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1042:2: ( rule__ServerEntity__NameAssignment_1 )
            // InternalMyDsl.g:1042:3: rule__ServerEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServerEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServerEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ServerEntity__Group__1__Impl"


    // $ANTLR start "rule__ServerEntity__Group__2"
    // InternalMyDsl.g:1050:1: rule__ServerEntity__Group__2 : rule__ServerEntity__Group__2__Impl rule__ServerEntity__Group__3 ;
    public final void rule__ServerEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( rule__ServerEntity__Group__2__Impl rule__ServerEntity__Group__3 )
            // InternalMyDsl.g:1055:2: rule__ServerEntity__Group__2__Impl rule__ServerEntity__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ServerEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServerEntity__Group__3();

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
    // $ANTLR end "rule__ServerEntity__Group__2"


    // $ANTLR start "rule__ServerEntity__Group__2__Impl"
    // InternalMyDsl.g:1062:1: rule__ServerEntity__Group__2__Impl : ( ( rule__ServerEntity__IsAssignment_2 ) ) ;
    public final void rule__ServerEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( ( ( rule__ServerEntity__IsAssignment_2 ) ) )
            // InternalMyDsl.g:1067:1: ( ( rule__ServerEntity__IsAssignment_2 ) )
            {
            // InternalMyDsl.g:1067:1: ( ( rule__ServerEntity__IsAssignment_2 ) )
            // InternalMyDsl.g:1068:2: ( rule__ServerEntity__IsAssignment_2 )
            {
             before(grammarAccess.getServerEntityAccess().getIsAssignment_2()); 
            // InternalMyDsl.g:1069:2: ( rule__ServerEntity__IsAssignment_2 )
            // InternalMyDsl.g:1069:3: rule__ServerEntity__IsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ServerEntity__IsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServerEntityAccess().getIsAssignment_2()); 

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
    // $ANTLR end "rule__ServerEntity__Group__2__Impl"


    // $ANTLR start "rule__ServerEntity__Group__3"
    // InternalMyDsl.g:1077:1: rule__ServerEntity__Group__3 : rule__ServerEntity__Group__3__Impl ;
    public final void rule__ServerEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( rule__ServerEntity__Group__3__Impl )
            // InternalMyDsl.g:1082:2: rule__ServerEntity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServerEntity__Group__3__Impl();

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
    // $ANTLR end "rule__ServerEntity__Group__3"


    // $ANTLR start "rule__ServerEntity__Group__3__Impl"
    // InternalMyDsl.g:1088:1: rule__ServerEntity__Group__3__Impl : ( ( rule__ServerEntity__AttributesAssignment_3 )* ) ;
    public final void rule__ServerEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1092:1: ( ( ( rule__ServerEntity__AttributesAssignment_3 )* ) )
            // InternalMyDsl.g:1093:1: ( ( rule__ServerEntity__AttributesAssignment_3 )* )
            {
            // InternalMyDsl.g:1093:1: ( ( rule__ServerEntity__AttributesAssignment_3 )* )
            // InternalMyDsl.g:1094:2: ( rule__ServerEntity__AttributesAssignment_3 )*
            {
             before(grammarAccess.getServerEntityAccess().getAttributesAssignment_3()); 
            // InternalMyDsl.g:1095:2: ( rule__ServerEntity__AttributesAssignment_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1095:3: rule__ServerEntity__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ServerEntity__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getServerEntityAccess().getAttributesAssignment_3()); 

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
    // $ANTLR end "rule__ServerEntity__Group__3__Impl"


    // $ANTLR start "rule__MemberEntity__Group__0"
    // InternalMyDsl.g:1104:1: rule__MemberEntity__Group__0 : rule__MemberEntity__Group__0__Impl rule__MemberEntity__Group__1 ;
    public final void rule__MemberEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( rule__MemberEntity__Group__0__Impl rule__MemberEntity__Group__1 )
            // InternalMyDsl.g:1109:2: rule__MemberEntity__Group__0__Impl rule__MemberEntity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MemberEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEntity__Group__1();

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
    // $ANTLR end "rule__MemberEntity__Group__0"


    // $ANTLR start "rule__MemberEntity__Group__0__Impl"
    // InternalMyDsl.g:1116:1: rule__MemberEntity__Group__0__Impl : ( '#' ) ;
    public final void rule__MemberEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( ( '#' ) )
            // InternalMyDsl.g:1121:1: ( '#' )
            {
            // InternalMyDsl.g:1121:1: ( '#' )
            // InternalMyDsl.g:1122:2: '#'
            {
             before(grammarAccess.getMemberEntityAccess().getNumberSignKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMemberEntityAccess().getNumberSignKeyword_0()); 

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
    // $ANTLR end "rule__MemberEntity__Group__0__Impl"


    // $ANTLR start "rule__MemberEntity__Group__1"
    // InternalMyDsl.g:1131:1: rule__MemberEntity__Group__1 : rule__MemberEntity__Group__1__Impl rule__MemberEntity__Group__2 ;
    public final void rule__MemberEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1135:1: ( rule__MemberEntity__Group__1__Impl rule__MemberEntity__Group__2 )
            // InternalMyDsl.g:1136:2: rule__MemberEntity__Group__1__Impl rule__MemberEntity__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MemberEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemberEntity__Group__2();

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
    // $ANTLR end "rule__MemberEntity__Group__1"


    // $ANTLR start "rule__MemberEntity__Group__1__Impl"
    // InternalMyDsl.g:1143:1: rule__MemberEntity__Group__1__Impl : ( ( rule__MemberEntity__NameAssignment_1 ) ) ;
    public final void rule__MemberEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( ( ( rule__MemberEntity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1148:1: ( ( rule__MemberEntity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1148:1: ( ( rule__MemberEntity__NameAssignment_1 ) )
            // InternalMyDsl.g:1149:2: ( rule__MemberEntity__NameAssignment_1 )
            {
             before(grammarAccess.getMemberEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1150:2: ( rule__MemberEntity__NameAssignment_1 )
            // InternalMyDsl.g:1150:3: rule__MemberEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MemberEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMemberEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__MemberEntity__Group__1__Impl"


    // $ANTLR start "rule__MemberEntity__Group__2"
    // InternalMyDsl.g:1158:1: rule__MemberEntity__Group__2 : rule__MemberEntity__Group__2__Impl ;
    public final void rule__MemberEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( rule__MemberEntity__Group__2__Impl )
            // InternalMyDsl.g:1163:2: rule__MemberEntity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemberEntity__Group__2__Impl();

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
    // $ANTLR end "rule__MemberEntity__Group__2"


    // $ANTLR start "rule__MemberEntity__Group__2__Impl"
    // InternalMyDsl.g:1169:1: rule__MemberEntity__Group__2__Impl : ( ( rule__MemberEntity__AttributesAssignment_2 )* ) ;
    public final void rule__MemberEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1173:1: ( ( ( rule__MemberEntity__AttributesAssignment_2 )* ) )
            // InternalMyDsl.g:1174:1: ( ( rule__MemberEntity__AttributesAssignment_2 )* )
            {
            // InternalMyDsl.g:1174:1: ( ( rule__MemberEntity__AttributesAssignment_2 )* )
            // InternalMyDsl.g:1175:2: ( rule__MemberEntity__AttributesAssignment_2 )*
            {
             before(grammarAccess.getMemberEntityAccess().getAttributesAssignment_2()); 
            // InternalMyDsl.g:1176:2: ( rule__MemberEntity__AttributesAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1176:3: rule__MemberEntity__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__MemberEntity__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMemberEntityAccess().getAttributesAssignment_2()); 

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
    // $ANTLR end "rule__MemberEntity__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:1185:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:1190:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:1197:1: rule__Attribute__Group__0__Impl : ( '->' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1201:1: ( ( '->' ) )
            // InternalMyDsl.g:1202:1: ( '->' )
            {
            // InternalMyDsl.g:1202:1: ( '->' )
            // InternalMyDsl.g:1203:2: '->'
            {
             before(grammarAccess.getAttributeAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:1212:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:1217:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:1224:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1229:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1229:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:1230:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1231:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:1231:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:1239:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:1244:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:1251:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( ( ':' ) )
            // InternalMyDsl.g:1256:1: ( ':' )
            {
            // InternalMyDsl.g:1256:1: ( ':' )
            // InternalMyDsl.g:1257:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMyDsl.g:1266:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( rule__Attribute__Group__3__Impl )
            // InternalMyDsl.g:1271:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMyDsl.g:1277:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__ValueAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( ( ( rule__Attribute__ValueAssignment_3 ) ) )
            // InternalMyDsl.g:1282:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            {
            // InternalMyDsl.g:1282:1: ( ( rule__Attribute__ValueAssignment_3 ) )
            // InternalMyDsl.g:1283:2: ( rule__Attribute__ValueAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_3()); 
            // InternalMyDsl.g:1284:2: ( rule__Attribute__ValueAssignment_3 )
            // InternalMyDsl.g:1284:3: rule__Attribute__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__BasicType__Group_0__0"
    // InternalMyDsl.g:1293:1: rule__BasicType__Group_0__0 : rule__BasicType__Group_0__0__Impl rule__BasicType__Group_0__1 ;
    public final void rule__BasicType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( rule__BasicType__Group_0__0__Impl rule__BasicType__Group_0__1 )
            // InternalMyDsl.g:1298:2: rule__BasicType__Group_0__0__Impl rule__BasicType__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__BasicType__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicType__Group_0__1();

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
    // $ANTLR end "rule__BasicType__Group_0__0"


    // $ANTLR start "rule__BasicType__Group_0__0__Impl"
    // InternalMyDsl.g:1305:1: rule__BasicType__Group_0__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( ( () ) )
            // InternalMyDsl.g:1310:1: ( () )
            {
            // InternalMyDsl.g:1310:1: ( () )
            // InternalMyDsl.g:1311:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getIntTypeAction_0_0()); 
            // InternalMyDsl.g:1312:2: ()
            // InternalMyDsl.g:1312:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getIntTypeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Group_0__0__Impl"


    // $ANTLR start "rule__BasicType__Group_0__1"
    // InternalMyDsl.g:1320:1: rule__BasicType__Group_0__1 : rule__BasicType__Group_0__1__Impl ;
    public final void rule__BasicType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( rule__BasicType__Group_0__1__Impl )
            // InternalMyDsl.g:1325:2: rule__BasicType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Group_0__1__Impl();

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
    // $ANTLR end "rule__BasicType__Group_0__1"


    // $ANTLR start "rule__BasicType__Group_0__1__Impl"
    // InternalMyDsl.g:1331:1: rule__BasicType__Group_0__1__Impl : ( ( rule__BasicType__ValueAssignment_0_1 ) ) ;
    public final void rule__BasicType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1335:1: ( ( ( rule__BasicType__ValueAssignment_0_1 ) ) )
            // InternalMyDsl.g:1336:1: ( ( rule__BasicType__ValueAssignment_0_1 ) )
            {
            // InternalMyDsl.g:1336:1: ( ( rule__BasicType__ValueAssignment_0_1 ) )
            // InternalMyDsl.g:1337:2: ( rule__BasicType__ValueAssignment_0_1 )
            {
             before(grammarAccess.getBasicTypeAccess().getValueAssignment_0_1()); 
            // InternalMyDsl.g:1338:2: ( rule__BasicType__ValueAssignment_0_1 )
            // InternalMyDsl.g:1338:3: rule__BasicType__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__BasicType__Group_0__1__Impl"


    // $ANTLR start "rule__BasicType__Group_1__0"
    // InternalMyDsl.g:1347:1: rule__BasicType__Group_1__0 : rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 ;
    public final void rule__BasicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1 )
            // InternalMyDsl.g:1352:2: rule__BasicType__Group_1__0__Impl rule__BasicType__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__BasicType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicType__Group_1__1();

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
    // $ANTLR end "rule__BasicType__Group_1__0"


    // $ANTLR start "rule__BasicType__Group_1__0__Impl"
    // InternalMyDsl.g:1359:1: rule__BasicType__Group_1__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( ( () ) )
            // InternalMyDsl.g:1364:1: ( () )
            {
            // InternalMyDsl.g:1364:1: ( () )
            // InternalMyDsl.g:1365:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getStringTypeAction_1_0()); 
            // InternalMyDsl.g:1366:2: ()
            // InternalMyDsl.g:1366:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getStringTypeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Group_1__0__Impl"


    // $ANTLR start "rule__BasicType__Group_1__1"
    // InternalMyDsl.g:1374:1: rule__BasicType__Group_1__1 : rule__BasicType__Group_1__1__Impl ;
    public final void rule__BasicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( rule__BasicType__Group_1__1__Impl )
            // InternalMyDsl.g:1379:2: rule__BasicType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Group_1__1__Impl();

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
    // $ANTLR end "rule__BasicType__Group_1__1"


    // $ANTLR start "rule__BasicType__Group_1__1__Impl"
    // InternalMyDsl.g:1385:1: rule__BasicType__Group_1__1__Impl : ( ( rule__BasicType__ValueAssignment_1_1 ) ) ;
    public final void rule__BasicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1389:1: ( ( ( rule__BasicType__ValueAssignment_1_1 ) ) )
            // InternalMyDsl.g:1390:1: ( ( rule__BasicType__ValueAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1390:1: ( ( rule__BasicType__ValueAssignment_1_1 ) )
            // InternalMyDsl.g:1391:2: ( rule__BasicType__ValueAssignment_1_1 )
            {
             before(grammarAccess.getBasicTypeAccess().getValueAssignment_1_1()); 
            // InternalMyDsl.g:1392:2: ( rule__BasicType__ValueAssignment_1_1 )
            // InternalMyDsl.g:1392:3: rule__BasicType__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__BasicType__Group_1__1__Impl"


    // $ANTLR start "rule__BasicType__Group_2__0"
    // InternalMyDsl.g:1401:1: rule__BasicType__Group_2__0 : rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 ;
    public final void rule__BasicType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1 )
            // InternalMyDsl.g:1406:2: rule__BasicType__Group_2__0__Impl rule__BasicType__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__BasicType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicType__Group_2__1();

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
    // $ANTLR end "rule__BasicType__Group_2__0"


    // $ANTLR start "rule__BasicType__Group_2__0__Impl"
    // InternalMyDsl.g:1413:1: rule__BasicType__Group_2__0__Impl : ( () ) ;
    public final void rule__BasicType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1417:1: ( ( () ) )
            // InternalMyDsl.g:1418:1: ( () )
            {
            // InternalMyDsl.g:1418:1: ( () )
            // InternalMyDsl.g:1419:2: ()
            {
             before(grammarAccess.getBasicTypeAccess().getBoolTypeAction_2_0()); 
            // InternalMyDsl.g:1420:2: ()
            // InternalMyDsl.g:1420:3: 
            {
            }

             after(grammarAccess.getBasicTypeAccess().getBoolTypeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Group_2__0__Impl"


    // $ANTLR start "rule__BasicType__Group_2__1"
    // InternalMyDsl.g:1428:1: rule__BasicType__Group_2__1 : rule__BasicType__Group_2__1__Impl ;
    public final void rule__BasicType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( rule__BasicType__Group_2__1__Impl )
            // InternalMyDsl.g:1433:2: rule__BasicType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Group_2__1__Impl();

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
    // $ANTLR end "rule__BasicType__Group_2__1"


    // $ANTLR start "rule__BasicType__Group_2__1__Impl"
    // InternalMyDsl.g:1439:1: rule__BasicType__Group_2__1__Impl : ( ( rule__BasicType__ValueAssignment_2_1 ) ) ;
    public final void rule__BasicType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1443:1: ( ( ( rule__BasicType__ValueAssignment_2_1 ) ) )
            // InternalMyDsl.g:1444:1: ( ( rule__BasicType__ValueAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1444:1: ( ( rule__BasicType__ValueAssignment_2_1 ) )
            // InternalMyDsl.g:1445:2: ( rule__BasicType__ValueAssignment_2_1 )
            {
             before(grammarAccess.getBasicTypeAccess().getValueAssignment_2_1()); 
            // InternalMyDsl.g:1446:2: ( rule__BasicType__ValueAssignment_2_1 )
            // InternalMyDsl.g:1446:3: rule__BasicType__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__BasicType__Group_2__1__Impl"


    // $ANTLR start "rule__ArrayElement__Group__0"
    // InternalMyDsl.g:1455:1: rule__ArrayElement__Group__0 : rule__ArrayElement__Group__0__Impl rule__ArrayElement__Group__1 ;
    public final void rule__ArrayElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1459:1: ( rule__ArrayElement__Group__0__Impl rule__ArrayElement__Group__1 )
            // InternalMyDsl.g:1460:2: rule__ArrayElement__Group__0__Impl rule__ArrayElement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ArrayElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayElement__Group__1();

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
    // $ANTLR end "rule__ArrayElement__Group__0"


    // $ANTLR start "rule__ArrayElement__Group__0__Impl"
    // InternalMyDsl.g:1467:1: rule__ArrayElement__Group__0__Impl : ( '-' ) ;
    public final void rule__ArrayElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( ( '-' ) )
            // InternalMyDsl.g:1472:1: ( '-' )
            {
            // InternalMyDsl.g:1472:1: ( '-' )
            // InternalMyDsl.g:1473:2: '-'
            {
             before(grammarAccess.getArrayElementAccess().getHyphenMinusKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getArrayElementAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__ArrayElement__Group__0__Impl"


    // $ANTLR start "rule__ArrayElement__Group__1"
    // InternalMyDsl.g:1482:1: rule__ArrayElement__Group__1 : rule__ArrayElement__Group__1__Impl ;
    public final void rule__ArrayElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( rule__ArrayElement__Group__1__Impl )
            // InternalMyDsl.g:1487:2: rule__ArrayElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayElement__Group__1__Impl();

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
    // $ANTLR end "rule__ArrayElement__Group__1"


    // $ANTLR start "rule__ArrayElement__Group__1__Impl"
    // InternalMyDsl.g:1493:1: rule__ArrayElement__Group__1__Impl : ( ( rule__ArrayElement__ValueAssignment_1 ) ) ;
    public final void rule__ArrayElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1497:1: ( ( ( rule__ArrayElement__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:1498:1: ( ( rule__ArrayElement__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:1498:1: ( ( rule__ArrayElement__ValueAssignment_1 ) )
            // InternalMyDsl.g:1499:2: ( rule__ArrayElement__ValueAssignment_1 )
            {
             before(grammarAccess.getArrayElementAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:1500:2: ( rule__ArrayElement__ValueAssignment_1 )
            // InternalMyDsl.g:1500:3: rule__ArrayElement__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayElement__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayElementAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__ArrayElement__Group__1__Impl"


    // $ANTLR start "rule__Verb__Group__0"
    // InternalMyDsl.g:1509:1: rule__Verb__Group__0 : rule__Verb__Group__0__Impl rule__Verb__Group__1 ;
    public final void rule__Verb__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( rule__Verb__Group__0__Impl rule__Verb__Group__1 )
            // InternalMyDsl.g:1514:2: rule__Verb__Group__0__Impl rule__Verb__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Verb__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verb__Group__1();

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
    // $ANTLR end "rule__Verb__Group__0"


    // $ANTLR start "rule__Verb__Group__0__Impl"
    // InternalMyDsl.g:1521:1: rule__Verb__Group__0__Impl : ( '@' ) ;
    public final void rule__Verb__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( ( '@' ) )
            // InternalMyDsl.g:1526:1: ( '@' )
            {
            // InternalMyDsl.g:1526:1: ( '@' )
            // InternalMyDsl.g:1527:2: '@'
            {
             before(grammarAccess.getVerbAccess().getCommercialAtKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVerbAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__Verb__Group__0__Impl"


    // $ANTLR start "rule__Verb__Group__1"
    // InternalMyDsl.g:1536:1: rule__Verb__Group__1 : rule__Verb__Group__1__Impl rule__Verb__Group__2 ;
    public final void rule__Verb__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( rule__Verb__Group__1__Impl rule__Verb__Group__2 )
            // InternalMyDsl.g:1541:2: rule__Verb__Group__1__Impl rule__Verb__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Verb__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verb__Group__2();

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
    // $ANTLR end "rule__Verb__Group__1"


    // $ANTLR start "rule__Verb__Group__1__Impl"
    // InternalMyDsl.g:1548:1: rule__Verb__Group__1__Impl : ( ( rule__Verb__VerbAssignment_1 ) ) ;
    public final void rule__Verb__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1552:1: ( ( ( rule__Verb__VerbAssignment_1 ) ) )
            // InternalMyDsl.g:1553:1: ( ( rule__Verb__VerbAssignment_1 ) )
            {
            // InternalMyDsl.g:1553:1: ( ( rule__Verb__VerbAssignment_1 ) )
            // InternalMyDsl.g:1554:2: ( rule__Verb__VerbAssignment_1 )
            {
             before(grammarAccess.getVerbAccess().getVerbAssignment_1()); 
            // InternalMyDsl.g:1555:2: ( rule__Verb__VerbAssignment_1 )
            // InternalMyDsl.g:1555:3: rule__Verb__VerbAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Verb__VerbAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVerbAccess().getVerbAssignment_1()); 

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
    // $ANTLR end "rule__Verb__Group__1__Impl"


    // $ANTLR start "rule__Verb__Group__2"
    // InternalMyDsl.g:1563:1: rule__Verb__Group__2 : rule__Verb__Group__2__Impl rule__Verb__Group__3 ;
    public final void rule__Verb__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1567:1: ( rule__Verb__Group__2__Impl rule__Verb__Group__3 )
            // InternalMyDsl.g:1568:2: rule__Verb__Group__2__Impl rule__Verb__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Verb__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verb__Group__3();

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
    // $ANTLR end "rule__Verb__Group__2"


    // $ANTLR start "rule__Verb__Group__2__Impl"
    // InternalMyDsl.g:1575:1: rule__Verb__Group__2__Impl : ( ( rule__Verb__QaAssignment_2 ) ) ;
    public final void rule__Verb__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1579:1: ( ( ( rule__Verb__QaAssignment_2 ) ) )
            // InternalMyDsl.g:1580:1: ( ( rule__Verb__QaAssignment_2 ) )
            {
            // InternalMyDsl.g:1580:1: ( ( rule__Verb__QaAssignment_2 ) )
            // InternalMyDsl.g:1581:2: ( rule__Verb__QaAssignment_2 )
            {
             before(grammarAccess.getVerbAccess().getQaAssignment_2()); 
            // InternalMyDsl.g:1582:2: ( rule__Verb__QaAssignment_2 )
            // InternalMyDsl.g:1582:3: rule__Verb__QaAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Verb__QaAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVerbAccess().getQaAssignment_2()); 

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
    // $ANTLR end "rule__Verb__Group__2__Impl"


    // $ANTLR start "rule__Verb__Group__3"
    // InternalMyDsl.g:1590:1: rule__Verb__Group__3 : rule__Verb__Group__3__Impl ;
    public final void rule__Verb__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( rule__Verb__Group__3__Impl )
            // InternalMyDsl.g:1595:2: rule__Verb__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verb__Group__3__Impl();

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
    // $ANTLR end "rule__Verb__Group__3"


    // $ANTLR start "rule__Verb__Group__3__Impl"
    // InternalMyDsl.g:1601:1: rule__Verb__Group__3__Impl : ( ( rule__Verb__RulesAssignment_3 ) ) ;
    public final void rule__Verb__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1605:1: ( ( ( rule__Verb__RulesAssignment_3 ) ) )
            // InternalMyDsl.g:1606:1: ( ( rule__Verb__RulesAssignment_3 ) )
            {
            // InternalMyDsl.g:1606:1: ( ( rule__Verb__RulesAssignment_3 ) )
            // InternalMyDsl.g:1607:2: ( rule__Verb__RulesAssignment_3 )
            {
             before(grammarAccess.getVerbAccess().getRulesAssignment_3()); 
            // InternalMyDsl.g:1608:2: ( rule__Verb__RulesAssignment_3 )
            // InternalMyDsl.g:1608:3: rule__Verb__RulesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Verb__RulesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVerbAccess().getRulesAssignment_3()); 

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
    // $ANTLR end "rule__Verb__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMyDsl.g:1617:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMyDsl.g:1622:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalMyDsl.g:1629:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ConditionAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( ( ( rule__Rule__ConditionAssignment_0 ) ) )
            // InternalMyDsl.g:1634:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            {
            // InternalMyDsl.g:1634:1: ( ( rule__Rule__ConditionAssignment_0 ) )
            // InternalMyDsl.g:1635:2: ( rule__Rule__ConditionAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_0()); 
            // InternalMyDsl.g:1636:2: ( rule__Rule__ConditionAssignment_0 )
            // InternalMyDsl.g:1636:3: rule__Rule__ConditionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalMyDsl.g:1644:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( rule__Rule__Group__1__Impl )
            // InternalMyDsl.g:1649:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__1__Impl();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalMyDsl.g:1655:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__UrlAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1659:1: ( ( ( rule__Rule__UrlAssignment_1 ) ) )
            // InternalMyDsl.g:1660:1: ( ( rule__Rule__UrlAssignment_1 ) )
            {
            // InternalMyDsl.g:1660:1: ( ( rule__Rule__UrlAssignment_1 ) )
            // InternalMyDsl.g:1661:2: ( rule__Rule__UrlAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getUrlAssignment_1()); 
            // InternalMyDsl.g:1662:2: ( rule__Rule__UrlAssignment_1 )
            // InternalMyDsl.g:1662:3: rule__Rule__UrlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__UrlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getUrlAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalMyDsl.g:1671:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMyDsl.g:1676:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalMyDsl.g:1683:1: rule__Condition__Group__0__Impl : ( 'REQUIRE' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1687:1: ( ( 'REQUIRE' ) )
            // InternalMyDsl.g:1688:1: ( 'REQUIRE' )
            {
            // InternalMyDsl.g:1688:1: ( 'REQUIRE' )
            // InternalMyDsl.g:1689:2: 'REQUIRE'
            {
             before(grammarAccess.getConditionAccess().getREQUIREKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getREQUIREKeyword_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalMyDsl.g:1698:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalMyDsl.g:1703:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalMyDsl.g:1710:1: rule__Condition__Group__1__Impl : ( '(' ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( ( '(' ) )
            // InternalMyDsl.g:1715:1: ( '(' )
            {
            // InternalMyDsl.g:1715:1: ( '(' )
            // InternalMyDsl.g:1716:2: '('
            {
             before(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalMyDsl.g:1725:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl rule__Condition__Group__3 ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( rule__Condition__Group__2__Impl rule__Condition__Group__3 )
            // InternalMyDsl.g:1730:2: rule__Condition__Group__2__Impl rule__Condition__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Condition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__3();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalMyDsl.g:1737:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__ExpressionAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( ( ( rule__Condition__ExpressionAssignment_2 ) ) )
            // InternalMyDsl.g:1742:1: ( ( rule__Condition__ExpressionAssignment_2 ) )
            {
            // InternalMyDsl.g:1742:1: ( ( rule__Condition__ExpressionAssignment_2 ) )
            // InternalMyDsl.g:1743:2: ( rule__Condition__ExpressionAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getExpressionAssignment_2()); 
            // InternalMyDsl.g:1744:2: ( rule__Condition__ExpressionAssignment_2 )
            // InternalMyDsl.g:1744:3: rule__Condition__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getExpressionAssignment_2()); 

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Condition__Group__3"
    // InternalMyDsl.g:1752:1: rule__Condition__Group__3 : rule__Condition__Group__3__Impl ;
    public final void rule__Condition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( rule__Condition__Group__3__Impl )
            // InternalMyDsl.g:1757:2: rule__Condition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__3__Impl();

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
    // $ANTLR end "rule__Condition__Group__3"


    // $ANTLR start "rule__Condition__Group__3__Impl"
    // InternalMyDsl.g:1763:1: rule__Condition__Group__3__Impl : ( ')' ) ;
    public final void rule__Condition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1767:1: ( ( ')' ) )
            // InternalMyDsl.g:1768:1: ( ')' )
            {
            // InternalMyDsl.g:1768:1: ( ')' )
            // InternalMyDsl.g:1769:2: ')'
            {
             before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Condition__Group__3__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalMyDsl.g:1779:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1783:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalMyDsl.g:1784:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalMyDsl.g:1791:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( ( ruleAnd ) )
            // InternalMyDsl.g:1796:1: ( ruleAnd )
            {
            // InternalMyDsl.g:1796:1: ( ruleAnd )
            // InternalMyDsl.g:1797:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalMyDsl.g:1806:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( rule__Or__Group__1__Impl )
            // InternalMyDsl.g:1811:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalMyDsl.g:1817:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1821:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalMyDsl.g:1822:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalMyDsl.g:1822:1: ( ( rule__Or__Group_1__0 )* )
            // InternalMyDsl.g:1823:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalMyDsl.g:1824:2: ( rule__Or__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1824:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalMyDsl.g:1833:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalMyDsl.g:1838:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalMyDsl.g:1845:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( () ) )
            // InternalMyDsl.g:1850:1: ( () )
            {
            // InternalMyDsl.g:1850:1: ( () )
            // InternalMyDsl.g:1851:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalMyDsl.g:1852:2: ()
            // InternalMyDsl.g:1852:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalMyDsl.g:1860:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalMyDsl.g:1865:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalMyDsl.g:1872:1: rule__Or__Group_1__1__Impl : ( '||' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( ( '||' ) )
            // InternalMyDsl.g:1877:1: ( '||' )
            {
            // InternalMyDsl.g:1877:1: ( '||' )
            // InternalMyDsl.g:1878:2: '||'
            {
             before(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1()); 

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
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalMyDsl.g:1887:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( rule__Or__Group_1__2__Impl )
            // InternalMyDsl.g:1892:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalMyDsl.g:1898:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1902:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:1903:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1903:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalMyDsl.g:1904:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:1905:2: ( rule__Or__RightAssignment_1_2 )
            // InternalMyDsl.g:1905:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalMyDsl.g:1914:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalMyDsl.g:1919:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalMyDsl.g:1926:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( ( ruleEquality ) )
            // InternalMyDsl.g:1931:1: ( ruleEquality )
            {
            // InternalMyDsl.g:1931:1: ( ruleEquality )
            // InternalMyDsl.g:1932:2: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalMyDsl.g:1941:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1945:1: ( rule__And__Group__1__Impl )
            // InternalMyDsl.g:1946:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalMyDsl.g:1952:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1956:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalMyDsl.g:1957:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalMyDsl.g:1957:1: ( ( rule__And__Group_1__0 )* )
            // InternalMyDsl.g:1958:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalMyDsl.g:1959:2: ( rule__And__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1959:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalMyDsl.g:1968:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalMyDsl.g:1973:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalMyDsl.g:1980:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( ( () ) )
            // InternalMyDsl.g:1985:1: ( () )
            {
            // InternalMyDsl.g:1985:1: ( () )
            // InternalMyDsl.g:1986:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalMyDsl.g:1987:2: ()
            // InternalMyDsl.g:1987:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalMyDsl.g:1995:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1999:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalMyDsl.g:2000:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalMyDsl.g:2007:1: rule__And__Group_1__1__Impl : ( '&&' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2011:1: ( ( '&&' ) )
            // InternalMyDsl.g:2012:1: ( '&&' )
            {
            // InternalMyDsl.g:2012:1: ( '&&' )
            // InternalMyDsl.g:2013:2: '&&'
            {
             before(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1()); 

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
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalMyDsl.g:2022:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2026:1: ( rule__And__Group_1__2__Impl )
            // InternalMyDsl.g:2027:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalMyDsl.g:2033:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2037:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2038:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2038:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2039:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2040:2: ( rule__And__RightAssignment_1_2 )
            // InternalMyDsl.g:2040:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalMyDsl.g:2049:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2053:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalMyDsl.g:2054:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalMyDsl.g:2061:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2065:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:2066:1: ( ruleComparison )
            {
            // InternalMyDsl.g:2066:1: ( ruleComparison )
            // InternalMyDsl.g:2067:2: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

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
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalMyDsl.g:2076:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( rule__Equality__Group__1__Impl )
            // InternalMyDsl.g:2081:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalMyDsl.g:2087:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2091:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalMyDsl.g:2092:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalMyDsl.g:2092:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalMyDsl.g:2093:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalMyDsl.g:2094:2: ( rule__Equality__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=17 && LA19_0<=18)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2094:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalMyDsl.g:2103:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2107:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalMyDsl.g:2108:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalMyDsl.g:2115:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2119:1: ( ( () ) )
            // InternalMyDsl.g:2120:1: ( () )
            {
            // InternalMyDsl.g:2120:1: ( () )
            // InternalMyDsl.g:2121:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalMyDsl.g:2122:2: ()
            // InternalMyDsl.g:2122:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalMyDsl.g:2130:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalMyDsl.g:2135:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalMyDsl.g:2142:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalMyDsl.g:2147:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2147:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalMyDsl.g:2148:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalMyDsl.g:2149:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalMyDsl.g:2149:3: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalMyDsl.g:2157:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2161:1: ( rule__Equality__Group_1__2__Impl )
            // InternalMyDsl.g:2162:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalMyDsl.g:2168:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2172:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2173:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2173:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2174:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2175:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalMyDsl.g:2175:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalMyDsl.g:2184:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalMyDsl.g:2189:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalMyDsl.g:2196:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2200:1: ( ( rulePlusOrMinus ) )
            // InternalMyDsl.g:2201:1: ( rulePlusOrMinus )
            {
            // InternalMyDsl.g:2201:1: ( rulePlusOrMinus )
            // InternalMyDsl.g:2202:2: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalMyDsl.g:2211:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( rule__Comparison__Group__1__Impl )
            // InternalMyDsl.g:2216:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalMyDsl.g:2222:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2226:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalMyDsl.g:2227:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalMyDsl.g:2227:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalMyDsl.g:2228:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalMyDsl.g:2229:2: ( rule__Comparison__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=19 && LA20_0<=22)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2229:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalMyDsl.g:2238:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalMyDsl.g:2243:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalMyDsl.g:2250:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2254:1: ( ( () ) )
            // InternalMyDsl.g:2255:1: ( () )
            {
            // InternalMyDsl.g:2255:1: ( () )
            // InternalMyDsl.g:2256:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalMyDsl.g:2257:2: ()
            // InternalMyDsl.g:2257:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalMyDsl.g:2265:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalMyDsl.g:2270:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalMyDsl.g:2277:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2281:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalMyDsl.g:2282:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2282:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalMyDsl.g:2283:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalMyDsl.g:2284:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalMyDsl.g:2284:3: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalMyDsl.g:2292:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalMyDsl.g:2297:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalMyDsl.g:2303:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2307:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2308:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2308:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2309:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2310:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalMyDsl.g:2310:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalMyDsl.g:2319:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2323:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalMyDsl.g:2324:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalMyDsl.g:2331:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2335:1: ( ( ruleMulOrDiv ) )
            // InternalMyDsl.g:2336:1: ( ruleMulOrDiv )
            {
            // InternalMyDsl.g:2336:1: ( ruleMulOrDiv )
            // InternalMyDsl.g:2337:2: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalMyDsl.g:2346:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2350:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalMyDsl.g:2351:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalMyDsl.g:2357:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2361:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalMyDsl.g:2362:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalMyDsl.g:2362:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalMyDsl.g:2363:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalMyDsl.g:2364:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30||LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:2364:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalMyDsl.g:2373:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2377:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalMyDsl.g:2378:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalMyDsl.g:2385:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalMyDsl.g:2390:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalMyDsl.g:2390:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalMyDsl.g:2391:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalMyDsl.g:2392:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalMyDsl.g:2392:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalMyDsl.g:2400:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalMyDsl.g:2405:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalMyDsl.g:2411:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2415:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:2416:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2416:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalMyDsl.g:2417:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:2418:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalMyDsl.g:2418:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalMyDsl.g:2427:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalMyDsl.g:2432:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_29);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalMyDsl.g:2439:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( ( () ) )
            // InternalMyDsl.g:2444:1: ( () )
            {
            // InternalMyDsl.g:2444:1: ( () )
            // InternalMyDsl.g:2445:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalMyDsl.g:2446:2: ()
            // InternalMyDsl.g:2446:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalMyDsl.g:2454:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2458:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalMyDsl.g:2459:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalMyDsl.g:2465:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2469:1: ( ( '+' ) )
            // InternalMyDsl.g:2470:1: ( '+' )
            {
            // InternalMyDsl.g:2470:1: ( '+' )
            // InternalMyDsl.g:2471:2: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalMyDsl.g:2481:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2485:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalMyDsl.g:2486:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_27);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalMyDsl.g:2493:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( ( () ) )
            // InternalMyDsl.g:2498:1: ( () )
            {
            // InternalMyDsl.g:2498:1: ( () )
            // InternalMyDsl.g:2499:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalMyDsl.g:2500:2: ()
            // InternalMyDsl.g:2500:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalMyDsl.g:2508:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalMyDsl.g:2513:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalMyDsl.g:2519:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2523:1: ( ( '-' ) )
            // InternalMyDsl.g:2524:1: ( '-' )
            {
            // InternalMyDsl.g:2524:1: ( '-' )
            // InternalMyDsl.g:2525:2: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalMyDsl.g:2535:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2539:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalMyDsl.g:2540:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

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
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalMyDsl.g:2547:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2551:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:2552:1: ( rulePrimary )
            {
            // InternalMyDsl.g:2552:1: ( rulePrimary )
            // InternalMyDsl.g:2553:2: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalMyDsl.g:2562:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2566:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalMyDsl.g:2567:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalMyDsl.g:2573:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2577:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalMyDsl.g:2578:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalMyDsl.g:2578:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalMyDsl.g:2579:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalMyDsl.g:2580:2: ( rule__MulOrDiv__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=23 && LA22_0<=24)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:2580:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalMyDsl.g:2589:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2593:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalMyDsl.g:2594:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalMyDsl.g:2601:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Group_1_0__0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2605:1: ( ( ( rule__MulOrDiv__Group_1_0__0 ) ) )
            // InternalMyDsl.g:2606:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:2606:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            // InternalMyDsl.g:2607:2: ( rule__MulOrDiv__Group_1_0__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 
            // InternalMyDsl.g:2608:2: ( rule__MulOrDiv__Group_1_0__0 )
            // InternalMyDsl.g:2608:3: rule__MulOrDiv__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalMyDsl.g:2616:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2620:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalMyDsl.g:2621:2: rule__MulOrDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalMyDsl.g:2627:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2631:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:2632:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2632:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // InternalMyDsl.g:2633:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:2634:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            // InternalMyDsl.g:2634:3: rule__MulOrDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__0"
    // InternalMyDsl.g:2643:1: rule__MulOrDiv__Group_1_0__0 : rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 ;
    public final void rule__MulOrDiv__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2647:1: ( rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 )
            // InternalMyDsl.g:2648:2: rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1
            {
            pushFollow(FOLLOW_30);
            rule__MulOrDiv__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__0__Impl"
    // InternalMyDsl.g:2655:1: rule__MulOrDiv__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2659:1: ( ( () ) )
            // InternalMyDsl.g:2660:1: ( () )
            {
            // InternalMyDsl.g:2660:1: ( () )
            // InternalMyDsl.g:2661:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 
            // InternalMyDsl.g:2662:2: ()
            // InternalMyDsl.g:2662:3: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__1"
    // InternalMyDsl.g:2670:1: rule__MulOrDiv__Group_1_0__1 : rule__MulOrDiv__Group_1_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2674:1: ( rule__MulOrDiv__Group_1_0__1__Impl )
            // InternalMyDsl.g:2675:2: rule__MulOrDiv__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__1__Impl"
    // InternalMyDsl.g:2681:1: rule__MulOrDiv__Group_1_0__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) ;
    public final void rule__MulOrDiv__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2685:1: ( ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) )
            // InternalMyDsl.g:2686:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            {
            // InternalMyDsl.g:2686:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            // InternalMyDsl.g:2687:2: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 
            // InternalMyDsl.g:2688:2: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            // InternalMyDsl.g:2688:3: rule__MulOrDiv__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMyDsl.g:2697:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2701:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMyDsl.g:2702:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMyDsl.g:2709:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( ( '(' ) )
            // InternalMyDsl.g:2714:1: ( '(' )
            {
            // InternalMyDsl.g:2714:1: ( '(' )
            // InternalMyDsl.g:2715:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMyDsl.g:2724:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMyDsl.g:2729:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_18);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMyDsl.g:2736:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2740:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2741:1: ( ruleExpression )
            {
            // InternalMyDsl.g:2741:1: ( ruleExpression )
            // InternalMyDsl.g:2742:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalMyDsl.g:2751:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2755:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMyDsl.g:2756:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalMyDsl.g:2762:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2766:1: ( ( ')' ) )
            // InternalMyDsl.g:2767:1: ( ')' )
            {
            // InternalMyDsl.g:2767:1: ( ')' )
            // InternalMyDsl.g:2768:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

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
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMyDsl.g:2778:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2782:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMyDsl.g:2783:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMyDsl.g:2790:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( ( () ) )
            // InternalMyDsl.g:2795:1: ( () )
            {
            // InternalMyDsl.g:2795:1: ( () )
            // InternalMyDsl.g:2796:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalMyDsl.g:2797:2: ()
            // InternalMyDsl.g:2797:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMyDsl.g:2805:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2809:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMyDsl.g:2810:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMyDsl.g:2817:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2821:1: ( ( '!' ) )
            // InternalMyDsl.g:2822:1: ( '!' )
            {
            // InternalMyDsl.g:2822:1: ( '!' )
            // InternalMyDsl.g:2823:2: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalMyDsl.g:2832:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2836:1: ( rule__Primary__Group_1__2__Impl )
            // InternalMyDsl.g:2837:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalMyDsl.g:2843:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2847:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalMyDsl.g:2848:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2848:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalMyDsl.g:2849:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalMyDsl.g:2850:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalMyDsl.g:2850:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalMyDsl.g:2859:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2863:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalMyDsl.g:2864:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalMyDsl.g:2871:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2875:1: ( ( () ) )
            // InternalMyDsl.g:2876:1: ( () )
            {
            // InternalMyDsl.g:2876:1: ( () )
            // InternalMyDsl.g:2877:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // InternalMyDsl.g:2878:2: ()
            // InternalMyDsl.g:2878:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalMyDsl.g:2886:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalMyDsl.g:2891:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalMyDsl.g:2897:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2901:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalMyDsl.g:2902:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalMyDsl.g:2902:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalMyDsl.g:2903:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalMyDsl.g:2904:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalMyDsl.g:2904:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalMyDsl.g:2913:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2917:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalMyDsl.g:2918:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalMyDsl.g:2925:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2929:1: ( ( () ) )
            // InternalMyDsl.g:2930:1: ( () )
            {
            // InternalMyDsl.g:2930:1: ( () )
            // InternalMyDsl.g:2931:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // InternalMyDsl.g:2932:2: ()
            // InternalMyDsl.g:2932:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalMyDsl.g:2940:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2944:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalMyDsl.g:2945:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalMyDsl.g:2951:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2955:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalMyDsl.g:2956:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2956:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalMyDsl.g:2957:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalMyDsl.g:2958:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalMyDsl.g:2958:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalMyDsl.g:2967:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2971:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalMyDsl.g:2972:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_33);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalMyDsl.g:2979:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2983:1: ( ( () ) )
            // InternalMyDsl.g:2984:1: ( () )
            {
            // InternalMyDsl.g:2984:1: ( () )
            // InternalMyDsl.g:2985:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // InternalMyDsl.g:2986:2: ()
            // InternalMyDsl.g:2986:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalMyDsl.g:2994:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2998:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalMyDsl.g:2999:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalMyDsl.g:3005:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3009:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalMyDsl.g:3010:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalMyDsl.g:3010:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalMyDsl.g:3011:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalMyDsl.g:3012:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalMyDsl.g:3012:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // InternalMyDsl.g:3021:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3025:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalMyDsl.g:3026:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // InternalMyDsl.g:3033:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( ( () ) )
            // InternalMyDsl.g:3038:1: ( () )
            {
            // InternalMyDsl.g:3038:1: ( () )
            // InternalMyDsl.g:3039:2: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableConstantAction_3_0()); 
            // InternalMyDsl.g:3040:2: ()
            // InternalMyDsl.g:3040:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableConstantAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // InternalMyDsl.g:3048:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3052:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalMyDsl.g:3053:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // InternalMyDsl.g:3059:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3063:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalMyDsl.g:3064:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3064:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalMyDsl.g:3065:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            // InternalMyDsl.g:3066:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalMyDsl.g:3066:3: rule__Atomic__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMyDsl.g:3075:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3079:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMyDsl.g:3080:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMyDsl.g:3087:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3091:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3092:1: ( RULE_ID )
            {
            // InternalMyDsl.g:3092:1: ( RULE_ID )
            // InternalMyDsl.g:3093:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMyDsl.g:3102:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3106:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMyDsl.g:3107:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMyDsl.g:3113:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3117:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMyDsl.g:3118:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMyDsl.g:3118:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMyDsl.g:3119:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMyDsl.g:3120:2: ( rule__QualifiedName__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==39) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:3120:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMyDsl.g:3129:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3133:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMyDsl.g:3134:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMyDsl.g:3141:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3145:1: ( ( '.' ) )
            // InternalMyDsl.g:3146:1: ( '.' )
            {
            // InternalMyDsl.g:3146:1: ( '.' )
            // InternalMyDsl.g:3147:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMyDsl.g:3156:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3160:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMyDsl.g:3161:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMyDsl.g:3167:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3171:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3172:1: ( RULE_ID )
            {
            // InternalMyDsl.g:3172:1: ( RULE_ID )
            // InternalMyDsl.g:3173:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Model__MembersAssignment"
    // InternalMyDsl.g:3183:1: rule__Model__MembersAssignment : ( ruleMember ) ;
    public final void rule__Model__MembersAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3187:1: ( ( ruleMember ) )
            // InternalMyDsl.g:3188:2: ( ruleMember )
            {
            // InternalMyDsl.g:3188:2: ( ruleMember )
            // InternalMyDsl.g:3189:3: ruleMember
            {
             before(grammarAccess.getModelAccess().getMembersMemberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMembersMemberParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__MembersAssignment"


    // $ANTLR start "rule__ServerEntity__NameAssignment_1"
    // InternalMyDsl.g:3198:1: rule__ServerEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServerEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3202:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3203:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3203:2: ( RULE_ID )
            // InternalMyDsl.g:3204:3: RULE_ID
            {
             before(grammarAccess.getServerEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServerEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ServerEntity__NameAssignment_1"


    // $ANTLR start "rule__ServerEntity__IsAssignment_2"
    // InternalMyDsl.g:3213:1: rule__ServerEntity__IsAssignment_2 : ( ruleIsServer ) ;
    public final void rule__ServerEntity__IsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3217:1: ( ( ruleIsServer ) )
            // InternalMyDsl.g:3218:2: ( ruleIsServer )
            {
            // InternalMyDsl.g:3218:2: ( ruleIsServer )
            // InternalMyDsl.g:3219:3: ruleIsServer
            {
             before(grammarAccess.getServerEntityAccess().getIsIsServerParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIsServer();

            state._fsp--;

             after(grammarAccess.getServerEntityAccess().getIsIsServerParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ServerEntity__IsAssignment_2"


    // $ANTLR start "rule__ServerEntity__AttributesAssignment_3"
    // InternalMyDsl.g:3228:1: rule__ServerEntity__AttributesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__ServerEntity__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3232:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:3233:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:3233:2: ( ruleAttribute )
            // InternalMyDsl.g:3234:3: ruleAttribute
            {
             before(grammarAccess.getServerEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getServerEntityAccess().getAttributesAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ServerEntity__AttributesAssignment_3"


    // $ANTLR start "rule__IsServer__ValueAssignment"
    // InternalMyDsl.g:3243:1: rule__IsServer__ValueAssignment : ( ( 'SERVER' ) ) ;
    public final void rule__IsServer__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( ( ( 'SERVER' ) ) )
            // InternalMyDsl.g:3248:2: ( ( 'SERVER' ) )
            {
            // InternalMyDsl.g:3248:2: ( ( 'SERVER' ) )
            // InternalMyDsl.g:3249:3: ( 'SERVER' )
            {
             before(grammarAccess.getIsServerAccess().getValueSERVERKeyword_0()); 
            // InternalMyDsl.g:3250:3: ( 'SERVER' )
            // InternalMyDsl.g:3251:4: 'SERVER'
            {
             before(grammarAccess.getIsServerAccess().getValueSERVERKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIsServerAccess().getValueSERVERKeyword_0()); 

            }

             after(grammarAccess.getIsServerAccess().getValueSERVERKeyword_0()); 

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
    // $ANTLR end "rule__IsServer__ValueAssignment"


    // $ANTLR start "rule__MemberEntity__NameAssignment_1"
    // InternalMyDsl.g:3262:1: rule__MemberEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MemberEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3266:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3267:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3267:2: ( RULE_ID )
            // InternalMyDsl.g:3268:3: RULE_ID
            {
             before(grammarAccess.getMemberEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMemberEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__MemberEntity__NameAssignment_1"


    // $ANTLR start "rule__MemberEntity__AttributesAssignment_2"
    // InternalMyDsl.g:3277:1: rule__MemberEntity__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__MemberEntity__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3281:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:3282:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:3282:2: ( ruleAttribute )
            // InternalMyDsl.g:3283:3: ruleAttribute
            {
             before(grammarAccess.getMemberEntityAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getMemberEntityAccess().getAttributesAttributeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__MemberEntity__AttributesAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:3292:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3296:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3297:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3297:2: ( RULE_ID )
            // InternalMyDsl.g:3298:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__ValueAssignment_3"
    // InternalMyDsl.g:3307:1: rule__Attribute__ValueAssignment_3 : ( ruleValueType ) ;
    public final void rule__Attribute__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3311:1: ( ( ruleValueType ) )
            // InternalMyDsl.g:3312:2: ( ruleValueType )
            {
            // InternalMyDsl.g:3312:2: ( ruleValueType )
            // InternalMyDsl.g:3313:3: ruleValueType
            {
             before(grammarAccess.getAttributeAccess().getValueValueTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValueType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getValueValueTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Attribute__ValueAssignment_3"


    // $ANTLR start "rule__ValueType__ElementTypeAssignment"
    // InternalMyDsl.g:3322:1: rule__ValueType__ElementTypeAssignment : ( ruleElementType ) ;
    public final void rule__ValueType__ElementTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3326:1: ( ( ruleElementType ) )
            // InternalMyDsl.g:3327:2: ( ruleElementType )
            {
            // InternalMyDsl.g:3327:2: ( ruleElementType )
            // InternalMyDsl.g:3328:3: ruleElementType
            {
             before(grammarAccess.getValueTypeAccess().getElementTypeElementTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getValueTypeAccess().getElementTypeElementTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__ValueType__ElementTypeAssignment"


    // $ANTLR start "rule__EntityType__EntityAssignment"
    // InternalMyDsl.g:3337:1: rule__EntityType__EntityAssignment : ( ( RULE_ID ) ) ;
    public final void rule__EntityType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3341:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:3342:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:3342:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:3343:3: ( RULE_ID )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0()); 
            // InternalMyDsl.g:3344:3: ( RULE_ID )
            // InternalMyDsl.g:3345:4: RULE_ID
            {
             before(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityTypeAccess().getEntityEntityIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0()); 

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
    // $ANTLR end "rule__EntityType__EntityAssignment"


    // $ANTLR start "rule__BasicType__ValueAssignment_0_1"
    // InternalMyDsl.g:3356:1: rule__BasicType__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__BasicType__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3360:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3361:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3361:2: ( RULE_INT )
            // InternalMyDsl.g:3362:3: RULE_INT
            {
             before(grammarAccess.getBasicTypeAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__BasicType__ValueAssignment_0_1"


    // $ANTLR start "rule__BasicType__ValueAssignment_1_1"
    // InternalMyDsl.g:3371:1: rule__BasicType__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__BasicType__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3375:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3376:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3376:2: ( RULE_STRING )
            // InternalMyDsl.g:3377:3: RULE_STRING
            {
             before(grammarAccess.getBasicTypeAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBasicTypeAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__BasicType__ValueAssignment_1_1"


    // $ANTLR start "rule__BasicType__ValueAssignment_2_1"
    // InternalMyDsl.g:3386:1: rule__BasicType__ValueAssignment_2_1 : ( ( rule__BasicType__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__BasicType__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3390:1: ( ( ( rule__BasicType__ValueAlternatives_2_1_0 ) ) )
            // InternalMyDsl.g:3391:2: ( ( rule__BasicType__ValueAlternatives_2_1_0 ) )
            {
            // InternalMyDsl.g:3391:2: ( ( rule__BasicType__ValueAlternatives_2_1_0 ) )
            // InternalMyDsl.g:3392:3: ( rule__BasicType__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getValueAlternatives_2_1_0()); 
            // InternalMyDsl.g:3393:3: ( rule__BasicType__ValueAlternatives_2_1_0 )
            // InternalMyDsl.g:3393:4: rule__BasicType__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getValueAlternatives_2_1_0()); 

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
    // $ANTLR end "rule__BasicType__ValueAssignment_2_1"


    // $ANTLR start "rule__ArrayType__ArrayElementsAssignment"
    // InternalMyDsl.g:3401:1: rule__ArrayType__ArrayElementsAssignment : ( ruleArrayElement ) ;
    public final void rule__ArrayType__ArrayElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3405:1: ( ( ruleArrayElement ) )
            // InternalMyDsl.g:3406:2: ( ruleArrayElement )
            {
            // InternalMyDsl.g:3406:2: ( ruleArrayElement )
            // InternalMyDsl.g:3407:3: ruleArrayElement
            {
             before(grammarAccess.getArrayTypeAccess().getArrayElementsArrayElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleArrayElement();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getArrayElementsArrayElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__ArrayType__ArrayElementsAssignment"


    // $ANTLR start "rule__ArrayElement__ValueAssignment_1"
    // InternalMyDsl.g:3416:1: rule__ArrayElement__ValueAssignment_1 : ( ruleBasicType ) ;
    public final void rule__ArrayElement__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3420:1: ( ( ruleBasicType ) )
            // InternalMyDsl.g:3421:2: ( ruleBasicType )
            {
            // InternalMyDsl.g:3421:2: ( ruleBasicType )
            // InternalMyDsl.g:3422:3: ruleBasicType
            {
             before(grammarAccess.getArrayElementAccess().getValueBasicTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getArrayElementAccess().getValueBasicTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ArrayElement__ValueAssignment_1"


    // $ANTLR start "rule__Verb__VerbAssignment_1"
    // InternalMyDsl.g:3431:1: rule__Verb__VerbAssignment_1 : ( ( rule__Verb__VerbAlternatives_1_0 ) ) ;
    public final void rule__Verb__VerbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3435:1: ( ( ( rule__Verb__VerbAlternatives_1_0 ) ) )
            // InternalMyDsl.g:3436:2: ( ( rule__Verb__VerbAlternatives_1_0 ) )
            {
            // InternalMyDsl.g:3436:2: ( ( rule__Verb__VerbAlternatives_1_0 ) )
            // InternalMyDsl.g:3437:3: ( rule__Verb__VerbAlternatives_1_0 )
            {
             before(grammarAccess.getVerbAccess().getVerbAlternatives_1_0()); 
            // InternalMyDsl.g:3438:3: ( rule__Verb__VerbAlternatives_1_0 )
            // InternalMyDsl.g:3438:4: rule__Verb__VerbAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Verb__VerbAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getVerbAccess().getVerbAlternatives_1_0()); 

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
    // $ANTLR end "rule__Verb__VerbAssignment_1"


    // $ANTLR start "rule__Verb__QaAssignment_2"
    // InternalMyDsl.g:3446:1: rule__Verb__QaAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Verb__QaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3450:1: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:3451:2: ( ruleQualifiedName )
            {
            // InternalMyDsl.g:3451:2: ( ruleQualifiedName )
            // InternalMyDsl.g:3452:3: ruleQualifiedName
            {
             before(grammarAccess.getVerbAccess().getQaQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getVerbAccess().getQaQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Verb__QaAssignment_2"


    // $ANTLR start "rule__Verb__RulesAssignment_3"
    // InternalMyDsl.g:3461:1: rule__Verb__RulesAssignment_3 : ( ruleRule ) ;
    public final void rule__Verb__RulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3465:1: ( ( ruleRule ) )
            // InternalMyDsl.g:3466:2: ( ruleRule )
            {
            // InternalMyDsl.g:3466:2: ( ruleRule )
            // InternalMyDsl.g:3467:3: ruleRule
            {
             before(grammarAccess.getVerbAccess().getRulesRuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getVerbAccess().getRulesRuleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Verb__RulesAssignment_3"


    // $ANTLR start "rule__Rule__ConditionAssignment_0"
    // InternalMyDsl.g:3476:1: rule__Rule__ConditionAssignment_0 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3480:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:3481:2: ( ruleCondition )
            {
            // InternalMyDsl.g:3481:2: ( ruleCondition )
            // InternalMyDsl.g:3482:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Rule__ConditionAssignment_0"


    // $ANTLR start "rule__Rule__UrlAssignment_1"
    // InternalMyDsl.g:3491:1: rule__Rule__UrlAssignment_1 : ( ruleArrayType ) ;
    public final void rule__Rule__UrlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3495:1: ( ( ruleArrayType ) )
            // InternalMyDsl.g:3496:2: ( ruleArrayType )
            {
            // InternalMyDsl.g:3496:2: ( ruleArrayType )
            // InternalMyDsl.g:3497:3: ruleArrayType
            {
             before(grammarAccess.getRuleAccess().getUrlArrayTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getUrlArrayTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__UrlAssignment_1"


    // $ANTLR start "rule__Condition__ExpressionAssignment_2"
    // InternalMyDsl.g:3506:1: rule__Condition__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Condition__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3510:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3511:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3511:2: ( ruleExpression )
            // InternalMyDsl.g:3512:3: ruleExpression
            {
             before(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Condition__ExpressionAssignment_2"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalMyDsl.g:3521:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3525:1: ( ( ruleAnd ) )
            // InternalMyDsl.g:3526:2: ( ruleAnd )
            {
            // InternalMyDsl.g:3526:2: ( ruleAnd )
            // InternalMyDsl.g:3527:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalMyDsl.g:3536:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3540:1: ( ( ruleEquality ) )
            // InternalMyDsl.g:3541:2: ( ruleEquality )
            {
            // InternalMyDsl.g:3541:2: ( ruleEquality )
            // InternalMyDsl.g:3542:3: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // InternalMyDsl.g:3551:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3555:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:3556:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:3556:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalMyDsl.g:3557:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalMyDsl.g:3558:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalMyDsl.g:3558:4: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalMyDsl.g:3566:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3570:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:3571:2: ( ruleComparison )
            {
            // InternalMyDsl.g:3571:2: ( ruleComparison )
            // InternalMyDsl.g:3572:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // InternalMyDsl.g:3581:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3585:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:3586:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:3586:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalMyDsl.g:3587:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalMyDsl.g:3588:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalMyDsl.g:3588:4: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalMyDsl.g:3596:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3600:1: ( ( rulePlusOrMinus ) )
            // InternalMyDsl.g:3601:2: ( rulePlusOrMinus )
            {
            // InternalMyDsl.g:3601:2: ( rulePlusOrMinus )
            // InternalMyDsl.g:3602:3: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalMyDsl.g:3611:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3615:1: ( ( ruleMulOrDiv ) )
            // InternalMyDsl.g:3616:2: ( ruleMulOrDiv )
            {
            // InternalMyDsl.g:3616:2: ( ruleMulOrDiv )
            // InternalMyDsl.g:3617:3: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_0_1"
    // InternalMyDsl.g:3626:1: rule__MulOrDiv__OpAssignment_1_0_1 : ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3630:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) )
            // InternalMyDsl.g:3631:2: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            {
            // InternalMyDsl.g:3631:2: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            // InternalMyDsl.g:3632:3: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 
            // InternalMyDsl.g:3633:3: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            // InternalMyDsl.g:3633:4: rule__MulOrDiv__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAlternatives_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_0_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_1"
    // InternalMyDsl.g:3641:1: rule__MulOrDiv__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3645:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:3646:2: ( rulePrimary )
            {
            // InternalMyDsl.g:3646:2: ( rulePrimary )
            // InternalMyDsl.g:3647:3: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_1"


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalMyDsl.g:3656:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3660:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:3661:2: ( rulePrimary )
            {
            // InternalMyDsl.g:3661:2: ( rulePrimary )
            // InternalMyDsl.g:3662:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalMyDsl.g:3671:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3675:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3676:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3676:2: ( RULE_INT )
            // InternalMyDsl.g:3677:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalMyDsl.g:3686:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3690:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3691:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3691:2: ( RULE_STRING )
            // InternalMyDsl.g:3692:3: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalMyDsl.g:3701:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3705:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // InternalMyDsl.g:3706:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // InternalMyDsl.g:3706:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // InternalMyDsl.g:3707:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // InternalMyDsl.g:3708:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // InternalMyDsl.g:3708:4: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_3_1"
    // InternalMyDsl.g:3716:1: rule__Atomic__ValueAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3720:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:3721:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:3721:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:3722:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAtomicAccess().getValueAttributeCrossReference_3_1_0()); 
            // InternalMyDsl.g:3723:3: ( ruleQualifiedName )
            // InternalMyDsl.g:3724:4: ruleQualifiedName
            {
             before(grammarAccess.getAtomicAccess().getValueAttributeQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getValueAttributeQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getValueAttributeCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000088000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040001870L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001860L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004206000070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000780002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002040000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000002L});

}