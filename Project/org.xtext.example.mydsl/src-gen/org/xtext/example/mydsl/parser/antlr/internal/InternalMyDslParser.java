package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#'", "'SERVER'", "'->'", "':'", "'true'", "'false'", "'-'", "'@'", "'get'", "'put'", "'post'", "'delete'", "'REQUIRE'", "'('", "')'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'*'", "'/'", "'!'", "'True'", "'False'", "'.'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_members_0_0= ruleMember ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_members_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_members_0_0= ruleMember ) )* )
            // InternalMyDsl.g:78:2: ( (lv_members_0_0= ruleMember ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_members_0_0= ruleMember ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_members_0_0= ruleMember )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_members_0_0= ruleMember )
            	    // InternalMyDsl.g:80:4: lv_members_0_0= ruleMember
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getMembersMemberParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_members_0_0=ruleMember();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"members",
            	    					lv_members_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Member");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMember"
    // InternalMyDsl.g:100:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalMyDsl.g:100:47: (iv_ruleMember= ruleMember EOF )
            // InternalMyDsl.g:101:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
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
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMyDsl.g:107:1: ruleMember returns [EObject current=null] : (this_ServerEntity_0= ruleServerEntity | this_MemberEntity_1= ruleMemberEntity | this_Verb_2= ruleVerb ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_ServerEntity_0 = null;

        EObject this_MemberEntity_1 = null;

        EObject this_Verb_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (this_ServerEntity_0= ruleServerEntity | this_MemberEntity_1= ruleMemberEntity | this_Verb_2= ruleVerb ) )
            // InternalMyDsl.g:114:2: (this_ServerEntity_0= ruleServerEntity | this_MemberEntity_1= ruleMemberEntity | this_Verb_2= ruleVerb )
            {
            // InternalMyDsl.g:114:2: (this_ServerEntity_0= ruleServerEntity | this_MemberEntity_1= ruleMemberEntity | this_Verb_2= ruleVerb )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==EOF||LA2_3==11||LA2_3==13||LA2_3==18) ) {
                        alt2=2;
                    }
                    else if ( (LA2_3==12) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==18) ) {
                alt2=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: this_ServerEntity_0= ruleServerEntity
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getServerEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServerEntity_0=ruleServerEntity();

                    state._fsp--;


                    			current = this_ServerEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:124:3: this_MemberEntity_1= ruleMemberEntity
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getMemberEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MemberEntity_1=ruleMemberEntity();

                    state._fsp--;


                    			current = this_MemberEntity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:133:3: this_Verb_2= ruleVerb
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getVerbParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Verb_2=ruleVerb();

                    state._fsp--;


                    			current = this_Verb_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleServerEntity"
    // InternalMyDsl.g:145:1: entryRuleServerEntity returns [EObject current=null] : iv_ruleServerEntity= ruleServerEntity EOF ;
    public final EObject entryRuleServerEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServerEntity = null;


        try {
            // InternalMyDsl.g:145:53: (iv_ruleServerEntity= ruleServerEntity EOF )
            // InternalMyDsl.g:146:2: iv_ruleServerEntity= ruleServerEntity EOF
            {
             newCompositeNode(grammarAccess.getServerEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServerEntity=ruleServerEntity();

            state._fsp--;

             current =iv_ruleServerEntity; 
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
    // $ANTLR end "entryRuleServerEntity"


    // $ANTLR start "ruleServerEntity"
    // InternalMyDsl.g:152:1: ruleServerEntity returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ( (lv_is_2_0= ruleIsServer ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ) ;
    public final EObject ruleServerEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_is_2_0 = null;

        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:158:2: ( (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ( (lv_is_2_0= ruleIsServer ) ) ( (lv_attributes_3_0= ruleAttribute ) )* ) )
            // InternalMyDsl.g:159:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ( (lv_is_2_0= ruleIsServer ) ) ( (lv_attributes_3_0= ruleAttribute ) )* )
            {
            // InternalMyDsl.g:159:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ( (lv_is_2_0= ruleIsServer ) ) ( (lv_attributes_3_0= ruleAttribute ) )* )
            // InternalMyDsl.g:160:3: otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ( (lv_is_2_0= ruleIsServer ) ) ( (lv_attributes_3_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getServerEntityAccess().getNumberSignKeyword_0());
            		
            // InternalMyDsl.g:164:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:165:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:165:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:166:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServerEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:182:3: ( (lv_is_2_0= ruleIsServer ) )
            // InternalMyDsl.g:183:4: (lv_is_2_0= ruleIsServer )
            {
            // InternalMyDsl.g:183:4: (lv_is_2_0= ruleIsServer )
            // InternalMyDsl.g:184:5: lv_is_2_0= ruleIsServer
            {

            					newCompositeNode(grammarAccess.getServerEntityAccess().getIsIsServerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_is_2_0=ruleIsServer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerEntityRule());
            					}
            					set(
            						current,
            						"is",
            						lv_is_2_0,
            						"org.xtext.example.mydsl.MyDsl.IsServer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:201:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:202:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:202:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalMyDsl.g:203:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getServerEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServerEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleServerEntity"


    // $ANTLR start "entryRuleIsServer"
    // InternalMyDsl.g:224:1: entryRuleIsServer returns [EObject current=null] : iv_ruleIsServer= ruleIsServer EOF ;
    public final EObject entryRuleIsServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsServer = null;


        try {
            // InternalMyDsl.g:224:49: (iv_ruleIsServer= ruleIsServer EOF )
            // InternalMyDsl.g:225:2: iv_ruleIsServer= ruleIsServer EOF
            {
             newCompositeNode(grammarAccess.getIsServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsServer=ruleIsServer();

            state._fsp--;

             current =iv_ruleIsServer; 
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
    // $ANTLR end "entryRuleIsServer"


    // $ANTLR start "ruleIsServer"
    // InternalMyDsl.g:231:1: ruleIsServer returns [EObject current=null] : ( (lv_value_0_0= 'SERVER' ) ) ;
    public final EObject ruleIsServer() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:237:2: ( ( (lv_value_0_0= 'SERVER' ) ) )
            // InternalMyDsl.g:238:2: ( (lv_value_0_0= 'SERVER' ) )
            {
            // InternalMyDsl.g:238:2: ( (lv_value_0_0= 'SERVER' ) )
            // InternalMyDsl.g:239:3: (lv_value_0_0= 'SERVER' )
            {
            // InternalMyDsl.g:239:3: (lv_value_0_0= 'SERVER' )
            // InternalMyDsl.g:240:4: lv_value_0_0= 'SERVER'
            {
            lv_value_0_0=(Token)match(input,12,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIsServerAccess().getValueSERVERKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIsServerRule());
            				}
            				setWithLastConsumed(current, "value", lv_value_0_0, "SERVER");
            			

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
    // $ANTLR end "ruleIsServer"


    // $ANTLR start "entryRuleMemberEntity"
    // InternalMyDsl.g:255:1: entryRuleMemberEntity returns [EObject current=null] : iv_ruleMemberEntity= ruleMemberEntity EOF ;
    public final EObject entryRuleMemberEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberEntity = null;


        try {
            // InternalMyDsl.g:255:53: (iv_ruleMemberEntity= ruleMemberEntity EOF )
            // InternalMyDsl.g:256:2: iv_ruleMemberEntity= ruleMemberEntity EOF
            {
             newCompositeNode(grammarAccess.getMemberEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemberEntity=ruleMemberEntity();

            state._fsp--;

             current =iv_ruleMemberEntity; 
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
    // $ANTLR end "entryRuleMemberEntity"


    // $ANTLR start "ruleMemberEntity"
    // InternalMyDsl.g:262:1: ruleMemberEntity returns [EObject current=null] : (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ) ;
    public final EObject ruleMemberEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:268:2: ( (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ) )
            // InternalMyDsl.g:269:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* )
            {
            // InternalMyDsl.g:269:2: (otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* )
            // InternalMyDsl.g:270:3: otherlv_0= '#' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMemberEntityAccess().getNumberSignKeyword_0());
            		
            // InternalMyDsl.g:274:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:275:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:275:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:276:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMemberEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMemberEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:292:3: ( (lv_attributes_2_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:293:4: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:293:4: (lv_attributes_2_0= ruleAttribute )
            	    // InternalMyDsl.g:294:5: lv_attributes_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getMemberEntityAccess().getAttributesAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemberEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleMemberEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:315:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:315:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:316:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:322:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleValueType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:328:2: ( (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleValueType ) ) ) )
            // InternalMyDsl.g:329:2: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleValueType ) ) )
            {
            // InternalMyDsl.g:329:2: (otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleValueType ) ) )
            // InternalMyDsl.g:330:3: otherlv_0= '->' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_value_3_0= ruleValueType ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getHyphenMinusGreaterThanSignKeyword_0());
            		
            // InternalMyDsl.g:334:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:335:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:335:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:336:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:356:3: ( (lv_value_3_0= ruleValueType ) )
            // InternalMyDsl.g:357:4: (lv_value_3_0= ruleValueType )
            {
            // InternalMyDsl.g:357:4: (lv_value_3_0= ruleValueType )
            // InternalMyDsl.g:358:5: lv_value_3_0= ruleValueType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getValueValueTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleValueType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.xtext.example.mydsl.MyDsl.ValueType");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleValueType"
    // InternalMyDsl.g:379:1: entryRuleValueType returns [EObject current=null] : iv_ruleValueType= ruleValueType EOF ;
    public final EObject entryRuleValueType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueType = null;


        try {
            // InternalMyDsl.g:379:50: (iv_ruleValueType= ruleValueType EOF )
            // InternalMyDsl.g:380:2: iv_ruleValueType= ruleValueType EOF
            {
             newCompositeNode(grammarAccess.getValueTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueType=ruleValueType();

            state._fsp--;

             current =iv_ruleValueType; 
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
    // $ANTLR end "entryRuleValueType"


    // $ANTLR start "ruleValueType"
    // InternalMyDsl.g:386:1: ruleValueType returns [EObject current=null] : ( (lv_elementType_0_0= ruleElementType ) ) ;
    public final EObject ruleValueType() throws RecognitionException {
        EObject current = null;

        EObject lv_elementType_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:392:2: ( ( (lv_elementType_0_0= ruleElementType ) ) )
            // InternalMyDsl.g:393:2: ( (lv_elementType_0_0= ruleElementType ) )
            {
            // InternalMyDsl.g:393:2: ( (lv_elementType_0_0= ruleElementType ) )
            // InternalMyDsl.g:394:3: (lv_elementType_0_0= ruleElementType )
            {
            // InternalMyDsl.g:394:3: (lv_elementType_0_0= ruleElementType )
            // InternalMyDsl.g:395:4: lv_elementType_0_0= ruleElementType
            {

            				newCompositeNode(grammarAccess.getValueTypeAccess().getElementTypeElementTypeParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_elementType_0_0=ruleElementType();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getValueTypeRule());
            				}
            				set(
            					current,
            					"elementType",
            					lv_elementType_0_0,
            					"org.xtext.example.mydsl.MyDsl.ElementType");
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
    // $ANTLR end "ruleValueType"


    // $ANTLR start "entryRuleElementType"
    // InternalMyDsl.g:415:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // InternalMyDsl.g:415:52: (iv_ruleElementType= ruleElementType EOF )
            // InternalMyDsl.g:416:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // InternalMyDsl.g:422:1: ruleElementType returns [EObject current=null] : (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType | this_ArrayType_2= ruleArrayType ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        EObject this_BasicType_0 = null;

        EObject this_EntityType_1 = null;

        EObject this_ArrayType_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:428:2: ( (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType | this_ArrayType_2= ruleArrayType ) )
            // InternalMyDsl.g:429:2: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType | this_ArrayType_2= ruleArrayType )
            {
            // InternalMyDsl.g:429:2: (this_BasicType_0= ruleBasicType | this_EntityType_1= ruleEntityType | this_ArrayType_2= ruleArrayType )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 15:
            case 16:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 17:
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
                    // InternalMyDsl.g:430:3: this_BasicType_0= ruleBasicType
                    {

                    			newCompositeNode(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;


                    			current = this_BasicType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:439:3: this_EntityType_1= ruleEntityType
                    {

                    			newCompositeNode(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityType_1=ruleEntityType();

                    state._fsp--;


                    			current = this_EntityType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:448:3: this_ArrayType_2= ruleArrayType
                    {

                    			newCompositeNode(grammarAccess.getElementTypeAccess().getArrayTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayType_2=ruleArrayType();

                    state._fsp--;


                    			current = this_ArrayType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleEntityType"
    // InternalMyDsl.g:460:1: entryRuleEntityType returns [EObject current=null] : iv_ruleEntityType= ruleEntityType EOF ;
    public final EObject entryRuleEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityType = null;


        try {
            // InternalMyDsl.g:460:51: (iv_ruleEntityType= ruleEntityType EOF )
            // InternalMyDsl.g:461:2: iv_ruleEntityType= ruleEntityType EOF
            {
             newCompositeNode(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityType=ruleEntityType();

            state._fsp--;

             current =iv_ruleEntityType; 
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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalMyDsl.g:467:1: ruleEntityType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleEntityType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:473:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyDsl.g:474:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyDsl.g:474:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:475:3: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:475:3: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:476:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEntityTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getEntityTypeAccess().getEntityEntityCrossReference_0());
            			

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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleBasicType"
    // InternalMyDsl.g:490:1: entryRuleBasicType returns [EObject current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final EObject entryRuleBasicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicType = null;


        try {
            // InternalMyDsl.g:490:50: (iv_ruleBasicType= ruleBasicType EOF )
            // InternalMyDsl.g:491:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType; 
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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // InternalMyDsl.g:497:1: ruleBasicType returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) ) ;
    public final EObject ruleBasicType() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:503:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) ) )
            // InternalMyDsl.g:504:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) )
            {
            // InternalMyDsl.g:504:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case 15:
            case 16:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:505:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:505:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMyDsl.g:506:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:506:4: ()
                    // InternalMyDsl.g:507:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getIntTypeAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:513:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMyDsl.g:514:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:514:5: (lv_value_1_0= RULE_INT )
                    // InternalMyDsl.g:515:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getBasicTypeAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:533:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalMyDsl.g:533:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalMyDsl.g:534:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:534:4: ()
                    // InternalMyDsl.g:535:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getStringTypeAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:541:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:542:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:542:5: (lv_value_3_0= RULE_STRING )
                    // InternalMyDsl.g:543:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getBasicTypeAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBasicTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:561:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalMyDsl.g:561:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalMyDsl.g:562:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalMyDsl.g:562:4: ()
                    // InternalMyDsl.g:563:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getBasicTypeAccess().getBoolTypeAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:569:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalMyDsl.g:570:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalMyDsl.g:570:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalMyDsl.g:571:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalMyDsl.g:571:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==16) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:572:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,15,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getBasicTypeAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBasicTypeRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:583:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,16,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getBasicTypeAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBasicTypeRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleArrayType"
    // InternalMyDsl.g:601:1: entryRuleArrayType returns [EObject current=null] : iv_ruleArrayType= ruleArrayType EOF ;
    public final EObject entryRuleArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayType = null;


        try {
            // InternalMyDsl.g:601:50: (iv_ruleArrayType= ruleArrayType EOF )
            // InternalMyDsl.g:602:2: iv_ruleArrayType= ruleArrayType EOF
            {
             newCompositeNode(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayType=ruleArrayType();

            state._fsp--;

             current =iv_ruleArrayType; 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalMyDsl.g:608:1: ruleArrayType returns [EObject current=null] : ( (lv_arrayElements_0_0= ruleArrayElement ) )+ ;
    public final EObject ruleArrayType() throws RecognitionException {
        EObject current = null;

        EObject lv_arrayElements_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:614:2: ( ( (lv_arrayElements_0_0= ruleArrayElement ) )+ )
            // InternalMyDsl.g:615:2: ( (lv_arrayElements_0_0= ruleArrayElement ) )+
            {
            // InternalMyDsl.g:615:2: ( (lv_arrayElements_0_0= ruleArrayElement ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:616:3: (lv_arrayElements_0_0= ruleArrayElement )
            	    {
            	    // InternalMyDsl.g:616:3: (lv_arrayElements_0_0= ruleArrayElement )
            	    // InternalMyDsl.g:617:4: lv_arrayElements_0_0= ruleArrayElement
            	    {

            	    				newCompositeNode(grammarAccess.getArrayTypeAccess().getArrayElementsArrayElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_9);
            	    lv_arrayElements_0_0=ruleArrayElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getArrayTypeRule());
            	    				}
            	    				add(
            	    					current,
            	    					"arrayElements",
            	    					lv_arrayElements_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.ArrayElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


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
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleArrayElement"
    // InternalMyDsl.g:637:1: entryRuleArrayElement returns [EObject current=null] : iv_ruleArrayElement= ruleArrayElement EOF ;
    public final EObject entryRuleArrayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayElement = null;


        try {
            // InternalMyDsl.g:637:53: (iv_ruleArrayElement= ruleArrayElement EOF )
            // InternalMyDsl.g:638:2: iv_ruleArrayElement= ruleArrayElement EOF
            {
             newCompositeNode(grammarAccess.getArrayElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayElement=ruleArrayElement();

            state._fsp--;

             current =iv_ruleArrayElement; 
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
    // $ANTLR end "entryRuleArrayElement"


    // $ANTLR start "ruleArrayElement"
    // InternalMyDsl.g:644:1: ruleArrayElement returns [EObject current=null] : (otherlv_0= '-' ( (lv_value_1_0= ruleBasicType ) ) ) ;
    public final EObject ruleArrayElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:650:2: ( (otherlv_0= '-' ( (lv_value_1_0= ruleBasicType ) ) ) )
            // InternalMyDsl.g:651:2: (otherlv_0= '-' ( (lv_value_1_0= ruleBasicType ) ) )
            {
            // InternalMyDsl.g:651:2: (otherlv_0= '-' ( (lv_value_1_0= ruleBasicType ) ) )
            // InternalMyDsl.g:652:3: otherlv_0= '-' ( (lv_value_1_0= ruleBasicType ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayElementAccess().getHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:656:3: ( (lv_value_1_0= ruleBasicType ) )
            // InternalMyDsl.g:657:4: (lv_value_1_0= ruleBasicType )
            {
            // InternalMyDsl.g:657:4: (lv_value_1_0= ruleBasicType )
            // InternalMyDsl.g:658:5: lv_value_1_0= ruleBasicType
            {

            					newCompositeNode(grammarAccess.getArrayElementAccess().getValueBasicTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleBasicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArrayElementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl.MyDsl.BasicType");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleArrayElement"


    // $ANTLR start "entryRuleVerb"
    // InternalMyDsl.g:679:1: entryRuleVerb returns [EObject current=null] : iv_ruleVerb= ruleVerb EOF ;
    public final EObject entryRuleVerb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerb = null;


        try {
            // InternalMyDsl.g:679:45: (iv_ruleVerb= ruleVerb EOF )
            // InternalMyDsl.g:680:2: iv_ruleVerb= ruleVerb EOF
            {
             newCompositeNode(grammarAccess.getVerbRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerb=ruleVerb();

            state._fsp--;

             current =iv_ruleVerb; 
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
    // $ANTLR end "entryRuleVerb"


    // $ANTLR start "ruleVerb"
    // InternalMyDsl.g:686:1: ruleVerb returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_verb_1_1= 'get' | lv_verb_1_2= 'put' | lv_verb_1_3= 'post' | lv_verb_1_4= 'delete' ) ) ) ( (lv_qa_2_0= ruleQualifiedName ) ) ( (lv_rules_3_0= ruleRule ) ) ) ;
    public final EObject ruleVerb() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_verb_1_1=null;
        Token lv_verb_1_2=null;
        Token lv_verb_1_3=null;
        Token lv_verb_1_4=null;
        AntlrDatatypeRuleToken lv_qa_2_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:692:2: ( (otherlv_0= '@' ( ( (lv_verb_1_1= 'get' | lv_verb_1_2= 'put' | lv_verb_1_3= 'post' | lv_verb_1_4= 'delete' ) ) ) ( (lv_qa_2_0= ruleQualifiedName ) ) ( (lv_rules_3_0= ruleRule ) ) ) )
            // InternalMyDsl.g:693:2: (otherlv_0= '@' ( ( (lv_verb_1_1= 'get' | lv_verb_1_2= 'put' | lv_verb_1_3= 'post' | lv_verb_1_4= 'delete' ) ) ) ( (lv_qa_2_0= ruleQualifiedName ) ) ( (lv_rules_3_0= ruleRule ) ) )
            {
            // InternalMyDsl.g:693:2: (otherlv_0= '@' ( ( (lv_verb_1_1= 'get' | lv_verb_1_2= 'put' | lv_verb_1_3= 'post' | lv_verb_1_4= 'delete' ) ) ) ( (lv_qa_2_0= ruleQualifiedName ) ) ( (lv_rules_3_0= ruleRule ) ) )
            // InternalMyDsl.g:694:3: otherlv_0= '@' ( ( (lv_verb_1_1= 'get' | lv_verb_1_2= 'put' | lv_verb_1_3= 'post' | lv_verb_1_4= 'delete' ) ) ) ( (lv_qa_2_0= ruleQualifiedName ) ) ( (lv_rules_3_0= ruleRule ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getVerbAccess().getCommercialAtKeyword_0());
            		
            // InternalMyDsl.g:698:3: ( ( (lv_verb_1_1= 'get' | lv_verb_1_2= 'put' | lv_verb_1_3= 'post' | lv_verb_1_4= 'delete' ) ) )
            // InternalMyDsl.g:699:4: ( (lv_verb_1_1= 'get' | lv_verb_1_2= 'put' | lv_verb_1_3= 'post' | lv_verb_1_4= 'delete' ) )
            {
            // InternalMyDsl.g:699:4: ( (lv_verb_1_1= 'get' | lv_verb_1_2= 'put' | lv_verb_1_3= 'post' | lv_verb_1_4= 'delete' ) )
            // InternalMyDsl.g:700:5: (lv_verb_1_1= 'get' | lv_verb_1_2= 'put' | lv_verb_1_3= 'post' | lv_verb_1_4= 'delete' )
            {
            // InternalMyDsl.g:700:5: (lv_verb_1_1= 'get' | lv_verb_1_2= 'put' | lv_verb_1_3= 'post' | lv_verb_1_4= 'delete' )
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
                    // InternalMyDsl.g:701:6: lv_verb_1_1= 'get'
                    {
                    lv_verb_1_1=(Token)match(input,19,FOLLOW_4); 

                    						newLeafNode(lv_verb_1_1, grammarAccess.getVerbAccess().getVerbGetKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVerbRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:712:6: lv_verb_1_2= 'put'
                    {
                    lv_verb_1_2=(Token)match(input,20,FOLLOW_4); 

                    						newLeafNode(lv_verb_1_2, grammarAccess.getVerbAccess().getVerbPutKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVerbRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:723:6: lv_verb_1_3= 'post'
                    {
                    lv_verb_1_3=(Token)match(input,21,FOLLOW_4); 

                    						newLeafNode(lv_verb_1_3, grammarAccess.getVerbAccess().getVerbPostKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVerbRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:734:6: lv_verb_1_4= 'delete'
                    {
                    lv_verb_1_4=(Token)match(input,22,FOLLOW_4); 

                    						newLeafNode(lv_verb_1_4, grammarAccess.getVerbAccess().getVerbDeleteKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVerbRule());
                    						}
                    						setWithLastConsumed(current, "verb", lv_verb_1_4, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:747:3: ( (lv_qa_2_0= ruleQualifiedName ) )
            // InternalMyDsl.g:748:4: (lv_qa_2_0= ruleQualifiedName )
            {
            // InternalMyDsl.g:748:4: (lv_qa_2_0= ruleQualifiedName )
            // InternalMyDsl.g:749:5: lv_qa_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getVerbAccess().getQaQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_qa_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerbRule());
            					}
            					set(
            						current,
            						"qa",
            						lv_qa_2_0,
            						"org.xtext.example.mydsl.MyDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:766:3: ( (lv_rules_3_0= ruleRule ) )
            // InternalMyDsl.g:767:4: (lv_rules_3_0= ruleRule )
            {
            // InternalMyDsl.g:767:4: (lv_rules_3_0= ruleRule )
            // InternalMyDsl.g:768:5: lv_rules_3_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getVerbAccess().getRulesRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_rules_3_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerbRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_3_0,
            						"org.xtext.example.mydsl.MyDsl.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleVerb"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:789:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMyDsl.g:789:45: (iv_ruleRule= ruleRule EOF )
            // InternalMyDsl.g:790:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:796:1: ruleRule returns [EObject current=null] : ( ( (lv_condition_0_0= ruleCondition ) ) ( (lv_url_1_0= ruleArrayType ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject lv_condition_0_0 = null;

        EObject lv_url_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:802:2: ( ( ( (lv_condition_0_0= ruleCondition ) ) ( (lv_url_1_0= ruleArrayType ) ) ) )
            // InternalMyDsl.g:803:2: ( ( (lv_condition_0_0= ruleCondition ) ) ( (lv_url_1_0= ruleArrayType ) ) )
            {
            // InternalMyDsl.g:803:2: ( ( (lv_condition_0_0= ruleCondition ) ) ( (lv_url_1_0= ruleArrayType ) ) )
            // InternalMyDsl.g:804:3: ( (lv_condition_0_0= ruleCondition ) ) ( (lv_url_1_0= ruleArrayType ) )
            {
            // InternalMyDsl.g:804:3: ( (lv_condition_0_0= ruleCondition ) )
            // InternalMyDsl.g:805:4: (lv_condition_0_0= ruleCondition )
            {
            // InternalMyDsl.g:805:4: (lv_condition_0_0= ruleCondition )
            // InternalMyDsl.g:806:5: lv_condition_0_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_condition_0_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_0_0,
            						"org.xtext.example.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:823:3: ( (lv_url_1_0= ruleArrayType ) )
            // InternalMyDsl.g:824:4: (lv_url_1_0= ruleArrayType )
            {
            // InternalMyDsl.g:824:4: (lv_url_1_0= ruleArrayType )
            // InternalMyDsl.g:825:5: lv_url_1_0= ruleArrayType
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getUrlArrayTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_url_1_0=ruleArrayType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.xtext.example.mydsl.MyDsl.ArrayType");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:846:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:846:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:847:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:853:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'REQUIRE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:859:2: ( (otherlv_0= 'REQUIRE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:860:2: (otherlv_0= 'REQUIRE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:860:2: (otherlv_0= 'REQUIRE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' )
            // InternalMyDsl.g:861:3: otherlv_0= 'REQUIRE' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getREQUIREKeyword_0());
            		
            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:869:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMyDsl.g:870:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMyDsl.g:870:4: (lv_expression_2_0= ruleExpression )
            // InternalMyDsl.g:871:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:896:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:896:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:897:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:903:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:909:2: (this_Or_0= ruleOr )
            // InternalMyDsl.g:910:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalMyDsl.g:921:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalMyDsl.g:921:43: (iv_ruleOr= ruleOr EOF )
            // InternalMyDsl.g:922:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMyDsl.g:928:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:934:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalMyDsl.g:935:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalMyDsl.g:935:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalMyDsl.g:936:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:944:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:945:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalMyDsl.g:945:4: ()
            	    // InternalMyDsl.g:946:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:956:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalMyDsl.g:957:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalMyDsl.g:957:5: (lv_right_3_0= ruleAnd )
            	    // InternalMyDsl.g:958:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMyDsl.g:980:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalMyDsl.g:980:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalMyDsl.g:981:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMyDsl.g:987:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:993:2: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalMyDsl.g:994:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalMyDsl.g:994:2: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalMyDsl.g:995:3: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1003:3: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1004:4: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalMyDsl.g:1004:4: ()
            	    // InternalMyDsl.g:1005:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:1015:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalMyDsl.g:1016:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalMyDsl.g:1016:5: (lv_right_3_0= ruleEquality )
            	    // InternalMyDsl.g:1017:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMyDsl.g:1039:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalMyDsl.g:1039:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalMyDsl.g:1040:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMyDsl.g:1046:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1052:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalMyDsl.g:1053:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalMyDsl.g:1053:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalMyDsl.g:1054:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1062:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=28 && LA13_0<=29)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1063:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalMyDsl.g:1063:4: ()
            	    // InternalMyDsl.g:1064:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:1070:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalMyDsl.g:1071:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalMyDsl.g:1071:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalMyDsl.g:1072:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalMyDsl.g:1072:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==28) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==29) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalMyDsl.g:1073:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,28,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1084:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMyDsl.g:1097:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalMyDsl.g:1098:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalMyDsl.g:1098:5: (lv_right_3_0= ruleComparison )
            	    // InternalMyDsl.g:1099:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMyDsl.g:1121:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMyDsl.g:1121:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMyDsl.g:1122:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMyDsl.g:1128:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1134:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalMyDsl.g:1135:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalMyDsl.g:1135:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalMyDsl.g:1136:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1144:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=30 && LA15_0<=33)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1145:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalMyDsl.g:1145:4: ()
            	    // InternalMyDsl.g:1146:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:1152:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalMyDsl.g:1153:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalMyDsl.g:1153:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalMyDsl.g:1154:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalMyDsl.g:1154:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt14=4;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // InternalMyDsl.g:1155:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,30,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1166:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,31,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:1177:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,32,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalMyDsl.g:1188:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,33,FOLLOW_14); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMyDsl.g:1201:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalMyDsl.g:1202:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalMyDsl.g:1202:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalMyDsl.g:1203:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMyDsl.g:1225:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMyDsl.g:1225:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMyDsl.g:1226:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMyDsl.g:1232:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1238:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalMyDsl.g:1239:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalMyDsl.g:1239:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalMyDsl.g:1240:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1248:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==17||LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1249:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalMyDsl.g:1249:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==34) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==17) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalMyDsl.g:1250:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMyDsl.g:1250:5: ( () otherlv_2= '+' )
            	            // InternalMyDsl.g:1251:6: () otherlv_2= '+'
            	            {
            	            // InternalMyDsl.g:1251:6: ()
            	            // InternalMyDsl.g:1252:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,34,FOLLOW_14); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1264:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMyDsl.g:1264:5: ( () otherlv_4= '-' )
            	            // InternalMyDsl.g:1265:6: () otherlv_4= '-'
            	            {
            	            // InternalMyDsl.g:1265:6: ()
            	            // InternalMyDsl.g:1266:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,17,FOLLOW_14); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1278:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalMyDsl.g:1279:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalMyDsl.g:1279:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalMyDsl.g:1280:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMyDsl.g:1302:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalMyDsl.g:1302:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalMyDsl.g:1303:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMyDsl.g:1309:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1315:2: ( (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMyDsl.g:1316:2: (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMyDsl.g:1316:2: (this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMyDsl.g:1317:3: this_Primary_0= rulePrimary ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:1325:3: ( ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=35 && LA19_0<=36)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1326:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMyDsl.g:1326:4: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) )
            	    // InternalMyDsl.g:1327:5: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    {
            	    // InternalMyDsl.g:1327:5: ()
            	    // InternalMyDsl.g:1328:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMyDsl.g:1334:5: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalMyDsl.g:1335:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalMyDsl.g:1335:6: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalMyDsl.g:1336:7: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalMyDsl.g:1336:7: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==35) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==36) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalMyDsl.g:1337:8: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,35,FOLLOW_14); 

            	            								newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMulOrDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1348:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,36,FOLLOW_14); 

            	            								newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getMulOrDivRule());
            	            								}
            	            								setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalMyDsl.g:1362:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMyDsl.g:1363:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMyDsl.g:1363:5: (lv_right_3_0= rulePrimary )
            	    // InternalMyDsl.g:1364:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:1386:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMyDsl.g:1386:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMyDsl.g:1387:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:1393:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1399:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalMyDsl.g:1400:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalMyDsl.g:1400:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt20=1;
                }
                break;
            case 37:
                {
                alt20=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 38:
            case 39:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1401:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalMyDsl.g:1401:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalMyDsl.g:1402:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_15);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1420:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // InternalMyDsl.g:1420:3: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // InternalMyDsl.g:1421:4: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // InternalMyDsl.g:1421:4: ()
                    // InternalMyDsl.g:1422:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalMyDsl.g:1432:4: ( (lv_expression_5_0= rulePrimary ) )
                    // InternalMyDsl.g:1433:5: (lv_expression_5_0= rulePrimary )
                    {
                    // InternalMyDsl.g:1433:5: (lv_expression_5_0= rulePrimary )
                    // InternalMyDsl.g:1434:6: lv_expression_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1453:3: this_Atomic_6= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalMyDsl.g:1465:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalMyDsl.g:1465:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalMyDsl.g:1466:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMyDsl.g:1472:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'True' | lv_value_5_2= 'False' ) ) ) ) | ( () ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1478:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'True' | lv_value_5_2= 'False' ) ) ) ) | ( () ( ( ruleQualifiedName ) ) ) ) )
            // InternalMyDsl.g:1479:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'True' | lv_value_5_2= 'False' ) ) ) ) | ( () ( ( ruleQualifiedName ) ) ) )
            {
            // InternalMyDsl.g:1479:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'True' | lv_value_5_2= 'False' ) ) ) ) | ( () ( ( ruleQualifiedName ) ) ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt22=1;
                }
                break;
            case RULE_STRING:
                {
                alt22=2;
                }
                break;
            case 38:
            case 39:
                {
                alt22=3;
                }
                break;
            case RULE_ID:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1480:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:1480:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMyDsl.g:1481:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:1481:4: ()
                    // InternalMyDsl.g:1482:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1488:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMyDsl.g:1489:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1489:5: (lv_value_1_0= RULE_INT )
                    // InternalMyDsl.g:1490:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1508:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalMyDsl.g:1508:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalMyDsl.g:1509:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:1509:4: ()
                    // InternalMyDsl.g:1510:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1516:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalMyDsl.g:1517:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:1517:5: (lv_value_3_0= RULE_STRING )
                    // InternalMyDsl.g:1518:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1536:3: ( () ( ( (lv_value_5_1= 'True' | lv_value_5_2= 'False' ) ) ) )
                    {
                    // InternalMyDsl.g:1536:3: ( () ( ( (lv_value_5_1= 'True' | lv_value_5_2= 'False' ) ) ) )
                    // InternalMyDsl.g:1537:4: () ( ( (lv_value_5_1= 'True' | lv_value_5_2= 'False' ) ) )
                    {
                    // InternalMyDsl.g:1537:4: ()
                    // InternalMyDsl.g:1538:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1544:4: ( ( (lv_value_5_1= 'True' | lv_value_5_2= 'False' ) ) )
                    // InternalMyDsl.g:1545:5: ( (lv_value_5_1= 'True' | lv_value_5_2= 'False' ) )
                    {
                    // InternalMyDsl.g:1545:5: ( (lv_value_5_1= 'True' | lv_value_5_2= 'False' ) )
                    // InternalMyDsl.g:1546:6: (lv_value_5_1= 'True' | lv_value_5_2= 'False' )
                    {
                    // InternalMyDsl.g:1546:6: (lv_value_5_1= 'True' | lv_value_5_2= 'False' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==38) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==39) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyDsl.g:1547:7: lv_value_5_1= 'True'
                            {
                            lv_value_5_1=(Token)match(input,38,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1558:7: lv_value_5_2= 'False'
                            {
                            lv_value_5_2=(Token)match(input,39,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1573:3: ( () ( ( ruleQualifiedName ) ) )
                    {
                    // InternalMyDsl.g:1573:3: ( () ( ( ruleQualifiedName ) ) )
                    // InternalMyDsl.g:1574:4: () ( ( ruleQualifiedName ) )
                    {
                    // InternalMyDsl.g:1574:4: ()
                    // InternalMyDsl.g:1575:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getVariableConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1581:4: ( ( ruleQualifiedName ) )
                    // InternalMyDsl.g:1582:5: ( ruleQualifiedName )
                    {
                    // InternalMyDsl.g:1582:5: ( ruleQualifiedName )
                    // InternalMyDsl.g:1583:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAtomicAccess().getValueAttributeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMyDsl.g:1602:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMyDsl.g:1602:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMyDsl.g:1603:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMyDsl.g:1609:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1615:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMyDsl.g:1616:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMyDsl.g:1616:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMyDsl.g:1617:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMyDsl.g:1624:3: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1625:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,40,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000038072L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000E001000070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400020002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000002L});

}