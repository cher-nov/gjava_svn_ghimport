// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g 2008-12-23 15:06:18

package org.dolphin.parser;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class gscriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRAC", "RBRAC", "EQUALS", "EQUALS2", "NOT_EQUALS", "GT", "GTE", "LT", "LTE", "COMMENT1", "JAVACODE", "WORD", "NUMBER", "HEXNUMBER", "STRING", "DECIMAL", "STUPIDDECIMAL", "OIVAR", "GLOBALVAR", "DIGIT", "LETTER", "WHITESPACE", "COMMENT", "ML_COMMENT", "STRING_DOUBLE", "STRING_SINGLE", "';'", "'public'", "'private'", "'var'", "'final'", "'static'", "','", "'begin'", "'end'", "'globalvar'", "'return'", "'exit'", "'if'", "'then'", "'else'", "'elsif'", "'not'", "'!'", "'|'", "'&'", "'^'", "'<<'", "'>>'", "'div'", "'mod'", "'~'", "'&&'", "'and'", "'||'", "'or'", "'^^'", "'xor'", "':='", "'<>'", "'repeat'", "'break'", "'continue'", "'do'", "'until'", "'while'", "'for'", "'switch'", "'case'", "'default'", "':'", "'with'", "'+='", "'-='", "'*='", "'/='", "'|='", "'&='", "'^='", "'.'", "'['", "']'"
    };
    public static final int COMMENT1=19;
    public static final int LT=17;
    public static final int EQUALS2=13;
    public static final int LETTER=30;
    public static final int GTE=16;
    public static final int STUPIDDECIMAL=26;
    public static final int NUMBER=22;
    public static final int WHITESPACE=31;
    public static final int EQUALS=12;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int EOF=-1;
    public static final int NOT_EQUALS=14;
    public static final int LTE=18;
    public static final int LBRAC=10;
    public static final int LPAREN=8;
    public static final int WORD=21;
    public static final int ML_COMMENT=33;
    public static final int RPAREN=9;
    public static final int DECIMAL=25;
    public static final int RBRAC=11;
    public static final int GT=15;
    public static final int STRING_DOUBLE=34;
    public static final int GLOBALVAR=28;
    public static final int PLUS=4;
    public static final int STRING_SINGLE=35;
    public static final int DIGIT=29;
    public static final int DIV=7;
    public static final int COMMENT=32;
    public static final int OIVAR=27;
    public static final int JAVACODE=20;
    public static final int STRING=24;
    public static final int HEXNUMBER=23;

        public gscriptParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[166+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g"; }

    
    public org.dolphin.parser.PlatformCore pc = new org.dolphin.parser.PlatformCore();
    
    public void setPlatform(PlatformCore p)
    {
    pc = p;
    }
    
    public void emitErrorMessage(String msg) {
            pc.showError(msg);
    	}
    



    // $ANTLR start classes
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:55:1: classes : ( (f= method | m= field ) ( ';' )* )* ;
    public final void classes() throws RecognitionException {
        int classes_StartIndex = input.index();
        String f = null;

        String m = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:1: ( ( (f= method | m= field ) ( ';' )* )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:3: ( (f= method | m= field ) ( ';' )* )*
            {
            if ( backtracking==0 ) {
              pc.returncode ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:24: ( (f= method | m= field ) ( ';' )* )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WORD||(LA3_0>=37 && LA3_0<=41)||LA3_0==45) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:25: (f= method | m= field ) ( ';' )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:25: (f= method | m= field )
            	    int alt1=2;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 40:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 41:
            	                {
            	                int LA1_29 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 29, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 40:
            	                {
            	                int LA1_30 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 30, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	            case 45:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA1_32 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 32, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 8, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 41:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
            	                {
            	                int LA1_34 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 34, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA1_35 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 35, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	            case 45:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 9, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 39:
            	        case 45:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_11 = input.LA(3);

            	            if ( (LA1_11==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_11==WORD||(LA1_11>=OIVAR && LA1_11<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 11, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("56:25: (f= method | m= field )", 1, 1, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 38:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 40:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 41:
            	                {
            	                int LA1_40 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 40, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 40:
            	                {
            	                int LA1_41 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 41, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	            case 45:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA1_43 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 43, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 13, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 41:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
            	                {
            	                int LA1_45 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 45, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA1_46 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 46, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	            case 45:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 14, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_15 = input.LA(3);

            	            if ( (LA1_15==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_15==WORD||(LA1_15>=OIVAR && LA1_15<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 15, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 39:
            	        case 45:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("56:25: (f= method | m= field )", 1, 2, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 40:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 41:
            	            {
            	            switch ( input.LA(3) ) {
            	            case 40:
            	                {
            	                int LA1_51 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 51, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA1_52 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 52, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 39:
            	            case 45:
            	                {
            	                alt1=2;
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 18, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 40:
            	            {
            	            int LA1_19 = input.LA(3);

            	            if ( (LA1_19==WORD) ) {
            	                int LA1_55 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 55, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_19==39||LA1_19==45) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 19, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 39:
            	        case 45:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_21 = input.LA(3);

            	            if ( (LA1_21==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_21==WORD||(LA1_21>=OIVAR && LA1_21<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 21, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("56:25: (f= method | m= field )", 1, 3, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case 41:
            	        {
            	        switch ( input.LA(2) ) {
            	        case 40:
            	            {
            	            int LA1_23 = input.LA(3);

            	            if ( (LA1_23==WORD) ) {
            	                int LA1_60 = input.LA(4);

            	                if ( (synpred1()) ) {
            	                    alt1=1;
            	                }
            	                else if ( (true) ) {
            	                    alt1=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return ;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("56:25: (f= method | m= field )", 1, 60, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( (LA1_23==39||LA1_23==45) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 23, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case WORD:
            	            {
            	            int LA1_24 = input.LA(3);

            	            if ( (LA1_24==LPAREN) ) {
            	                alt1=1;
            	            }
            	            else if ( (LA1_24==WORD||(LA1_24>=OIVAR && LA1_24<=GLOBALVAR)) ) {
            	                alt1=2;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("56:25: (f= method | m= field )", 1, 24, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case 39:
            	        case 45:
            	            {
            	            alt1=2;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("56:25: (f= method | m= field )", 1, 4, input);

            	            throw nvae;
            	        }

            	        }
            	        break;
            	    case WORD:
            	        {
            	        int LA1_5 = input.LA(2);

            	        if ( (LA1_5==LPAREN) ) {
            	            alt1=1;
            	        }
            	        else if ( (LA1_5==WORD||(LA1_5>=OIVAR && LA1_5<=GLOBALVAR)) ) {
            	            alt1=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("56:25: (f= method | m= field )", 1, 5, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 39:
            	    case 45:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("56:25: (f= method | m= field )", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:26: f= method
            	            {
            	            pushFollow(FOLLOW_method_in_classes196);
            	            f=method();
            	            _fsp--;
            	            if (failed) return ;
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + f;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:71: m= field
            	            {
            	            pushFollow(FOLLOW_field_in_classes201);
            	            m=field();
            	            _fsp--;
            	            if (failed) return ;
            	            if ( backtracking==0 ) {
            	              pc.returncode += "\n " + m;
            	            }

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:116: ( ';' )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==36) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:117: ';'
            	    	    {
            	    	    match(input,36,FOLLOW_36_in_classes206); if (failed) return ;
            	    	    if ( backtracking==0 ) {
            	    	      System.out.println(";");
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, classes_StartIndex); }
        }
        return ;
    }
    // $ANTLR end classes


    // $ANTLR start code
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:59:1: code : ( (s= statement )* ) ;
    public final void code() throws RecognitionException {
        int code_StartIndex = input.index();
        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:1: ( ( (s= statement )* ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:3: ( (s= statement )* )
            {
            if ( backtracking==0 ) {
               pc.returncode ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:25: ( (s= statement )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:26: (s= statement )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:26: (s= statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==LBRAC||(LA4_0>=JAVACODE && LA4_0<=WORD)||(LA4_0>=OIVAR && LA4_0<=GLOBALVAR)||LA4_0==36||LA4_0==39||LA4_0==43||(LA4_0>=45 && LA4_0<=48)||(LA4_0>=70 && LA4_0<=73)||(LA4_0>=75 && LA4_0<=77)||LA4_0==81) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:60:27: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_code227);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return ;
            	    if ( backtracking==0 ) {
            	      pc.returncode += "\n " + s;
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, code_StartIndex); }
        }
        return ;
    }
    // $ANTLR end code


    // $ANTLR start statement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:63:1: statement returns [String value] : (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )* ;
    public final String statement() throws RecognitionException {
        String value = null;
        int statement_StartIndex = input.index();
        String java = null;

        String b = null;

        varstatement_return v = null;

        String r = null;

        String e = null;

        String ifs = null;

        String rep = null;

        String dos = null;

        String wh = null;

        String con = null;

        String br = null;

        String fors = null;

        String sw = null;

        String wit = null;

        String fun2 = null;

        String ass = null;

        String fun = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:1: ( (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:3: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' ) ( ';' )*
            {
            if ( backtracking==0 ) {
              value = "";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )
            int alt5=18;
            switch ( input.LA(1) ) {
            case JAVACODE:
                {
                alt5=1;
                }
                break;
            case LBRAC:
            case 43:
                {
                alt5=2;
                }
                break;
            case 39:
            case 45:
                {
                alt5=3;
                }
                break;
            case WORD:
                {
                switch ( input.LA(2) ) {
                case LPAREN:
                    {
                    alt5=17;
                    }
                    break;
                case EQUALS:
                case 68:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                    {
                    alt5=16;
                    }
                    break;
                case WORD:
                case OIVAR:
                case GLOBALVAR:
                    {
                    alt5=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("64:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 4, input);

                    throw nvae;
                }

                }
                break;
            case 46:
                {
                alt5=4;
                }
                break;
            case 47:
                {
                alt5=5;
                }
                break;
            case 48:
                {
                alt5=6;
                }
                break;
            case 70:
                {
                alt5=7;
                }
                break;
            case 73:
                {
                alt5=8;
                }
                break;
            case 75:
                {
                alt5=9;
                }
                break;
            case 72:
                {
                alt5=10;
                }
                break;
            case 71:
                {
                alt5=11;
                }
                break;
            case 76:
                {
                alt5=12;
                }
                break;
            case 77:
                {
                alt5=13;
                }
                break;
            case 81:
                {
                alt5=14;
                }
                break;
            case OIVAR:
                {
                int LA5_17 = input.LA(2);

                if ( (LA5_17==LPAREN) ) {
                    alt5=15;
                }
                else if ( (LA5_17==EQUALS||LA5_17==68||(LA5_17>=82 && LA5_17<=90)) ) {
                    alt5=16;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("64:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 17, input);

                    throw nvae;
                }
                }
                break;
            case GLOBALVAR:
                {
                alt5=16;
                }
                break;
            case 36:
                {
                alt5=18;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("64:19: (java= javacode | b= bstatement | v= varstatement | r= returnstatement | e= exitstatement | ifs= ifstatement | rep= repeatstatement | dos= dostatement | wh= whilestatement | con= continuestatement | br= breakstatement | fors= forstatement | sw= switchstatement | wit= withstatement | fun2= function2 | ass= assignment | fun= function | ';' )", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:20: java= javacode
                    {
                    pushFollow(FOLLOW_javacode_in_statement252);
                    java=javacode();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += java;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:58: b= bstatement
                    {
                    pushFollow(FOLLOW_bstatement_in_statement257);
                    b=bstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += b;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:92: v= varstatement
                    {
                    pushFollow(FOLLOW_varstatement_in_statement262);
                    v=varstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += v.value+";";
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:132: r= returnstatement
                    {
                    pushFollow(FOLLOW_returnstatement_in_statement267);
                    r=returnstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += r;
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:171: e= exitstatement
                    {
                    pushFollow(FOLLOW_exitstatement_in_statement272);
                    e=exitstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += e;
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:208: ifs= ifstatement
                    {
                    pushFollow(FOLLOW_ifstatement_in_statement277);
                    ifs=ifstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += ifs;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:247: rep= repeatstatement
                    {
                    pushFollow(FOLLOW_repeatstatement_in_statement282);
                    rep=repeatstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += rep;
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:290: dos= dostatement
                    {
                    pushFollow(FOLLOW_dostatement_in_statement287);
                    dos=dostatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += dos;
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:329: wh= whilestatement
                    {
                    pushFollow(FOLLOW_whilestatement_in_statement292);
                    wh=whilestatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += wh;
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:369: con= continuestatement
                    {
                    pushFollow(FOLLOW_continuestatement_in_statement297);
                    con=continuestatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += con+";";
                    }

                    }
                    break;
                case 11 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:418: br= breakstatement
                    {
                    pushFollow(FOLLOW_breakstatement_in_statement302);
                    br=breakstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += br+";";
                    }

                    }
                    break;
                case 12 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:462: fors= forstatement
                    {
                    pushFollow(FOLLOW_forstatement_in_statement307);
                    fors=forstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fors;
                    }

                    }
                    break;
                case 13 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:504: sw= switchstatement
                    {
                    pushFollow(FOLLOW_switchstatement_in_statement312);
                    sw=switchstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += sw;
                    }

                    }
                    break;
                case 14 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:545: wit= withstatement
                    {
                    pushFollow(FOLLOW_withstatement_in_statement317);
                    wit=withstatement();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += wit;
                    }

                    }
                    break;
                case 15 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:586: fun2= function2
                    {
                    pushFollow(FOLLOW_function2_in_statement322);
                    fun2=function2();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fun2+";";
                    }

                    }
                    break;
                case 16 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:629: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_statement327);
                    ass=assignment();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += ass+";";
                    }

                    }
                    break;
                case 17 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:671: fun= function
                    {
                    pushFollow(FOLLOW_function_in_statement332);
                    fun=function();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value += fun+";";
                    }

                    }
                    break;
                case 18 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:711: ';'
                    {
                    match(input,36,FOLLOW_36_in_statement335); if (failed) return value;
                    if ( backtracking==0 ) {
                      value +=";";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:731: ( ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==36) ) {
                    int LA6_20 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:732: ';'
            	    {
            	    match(input,36,FOLLOW_36_in_statement340); if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, statement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end statement


    // $ANTLR start javacode
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:67:1: javacode returns [String value] : jcode= JAVACODE ;
    public final String javacode() throws RecognitionException {
        String value = null;
        int javacode_StartIndex = input.index();
        Token jcode=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:68:1: (jcode= JAVACODE )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:68:3: jcode= JAVACODE
            {
            jcode=(Token)input.LT(1);
            match(input,JAVACODE,FOLLOW_JAVACODE_in_javacode359); if (failed) return value;
            if ( backtracking==0 ) {
              value =jcode.getText().replaceAll("@@java_Begin", "{").replaceAll("@@java_End", "}");;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, javacode_StartIndex); }
        }
        return value;
    }
    // $ANTLR end javacode


    // $ANTLR start field
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:71:1: field returns [String value] : ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement ) ;
    public final String field() throws RecognitionException {
        String value = null;
        int field_StartIndex = input.index();
        varstatement_return v = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:1: ( ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:3: ( 'public' | ( 'private' | 'var' ) )? ( 'final' )? ( 'static' )? ( 'final' )? (v= varstatement )
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:3: ( 'public' | ( 'private' | 'var' ) )?
            int alt7=3;
            switch ( input.LA(1) ) {
                case 37:
                    {
                    alt7=1;
                    }
                    break;
                case 39:
                    {
                    int LA7_2 = input.LA(2);

                    if ( ((LA7_2>=39 && LA7_2<=41)||LA7_2==45) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==WORD) ) {
                        int LA7_11 = input.LA(3);

                        if ( (LA7_11==WORD) ) {
                            int LA7_17 = input.LA(4);

                            if ( (synpred25()) ) {
                                alt7=2;
                            }
                        }
                        else if ( ((LA7_11>=OIVAR && LA7_11<=GLOBALVAR)) ) {
                            alt7=2;
                        }
                    }
                    }
                    break;
                case 38:
                    {
                    alt7=2;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:4: 'public'
                    {
                    match(input,37,FOLLOW_37_in_field377); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:34: ( 'private' | 'var' )
                    {
                    if ( (input.LA(1)>=38 && input.LA(1)<=39) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_field381);    throw mse;
                    }

                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:76: ( 'final' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==40) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred26()) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:77: 'final'
                    {
                    match(input,40,FOLLOW_40_in_field392); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:108: ( 'static' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:109: 'static'
                    {
                    match(input,41,FOLLOW_41_in_field398); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:142: ( 'final' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:143: 'final'
                    {
                    match(input,40,FOLLOW_40_in_field404); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:174: (v= varstatement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:175: v= varstatement
            {
            pushFollow(FOLLOW_varstatement_in_field412);
            v=varstatement();
            _fsp--;
            if (failed) return value;

            }

            if ( backtracking==0 ) {
              value = pc.fieldstatement(value,input.toString(v.start,v.stop));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, field_StartIndex); }
        }
        return value;
    }
    // $ANTLR end field


    // $ANTLR start method
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:75:1: method returns [String value] : ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement ;
    public final String method() throws RecognitionException {
        String value = null;
        int method_StartIndex = input.index();
        Token name=null;
        Token e=null;
        String b = null;


        String s = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:1: ( ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:3: ( 'public' | 'private' )? ( 'final' )? ( 'static' )? ( 'final' )? name= WORD '(' (e= WORD ( ( ',' ) (e= WORD )? )* )? ')' b= bstatement
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:3: ( 'public' | 'private' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==37) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:4: 'public'
                    {
                    match(input,37,FOLLOW_37_in_method434); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "public";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:33: 'private'
                    {
                    match(input,38,FOLLOW_38_in_method437); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = "private";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:66: ( 'final' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                int LA12_1 = input.LA(2);

                if ( (synpred31()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:67: 'final'
                    {
                    match(input,40,FOLLOW_40_in_method443); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:98: ( 'static' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:99: 'static'
                    {
                    match(input,41,FOLLOW_41_in_method449); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " static";
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:132: ( 'final' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:133: 'final'
                    {
                    match(input,40,FOLLOW_40_in_method455); if (failed) return value;
                    if ( backtracking==0 ) {
                      value += " final";
                    }

                    }
                    break;

            }

            name=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_method462); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_method464); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:178: (e= WORD ( ( ',' ) (e= WORD )? )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==WORD) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:179: e= WORD ( ( ',' ) (e= WORD )? )*
                    {
                    e=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_method469); if (failed) return value;
                    if ( backtracking==0 ) {
                      s = e.getText();
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:201: ( ( ',' ) (e= WORD )? )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==42) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:202: ( ',' ) (e= WORD )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:202: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:203: ','
                    	    {
                    	    match(input,42,FOLLOW_42_in_method475); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:208: (e= WORD )?
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( (LA15_0==WORD) ) {
                    	        alt15=1;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:209: e= WORD
                    	            {
                    	            e=(Token)input.LT(1);
                    	            match(input,WORD,FOLLOW_WORD_in_method481); if (failed) return value;
                    	            if ( backtracking==0 ) {
                    	              s += ", "+e.getText();
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_method490); if (failed) return value;
            pushFollow(FOLLOW_bstatement_in_method494);
            b=bstatement();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value = pc.methodstatement(value,"",name.getText(),b,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, method_StartIndex); }
        }
        return value;
    }
    // $ANTLR end method


    // $ANTLR start bstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:80:1: bstatement returns [String value] : ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) ;
    public final String bstatement() throws RecognitionException {
        String value = null;
        int bstatement_StartIndex = input.index();
        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:81:1: ( ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:81:3: ( LBRAC | 'begin' ) (s= statement )* ( RBRAC | 'end' )
            {
            if ( backtracking==0 ) {
              value = "";
            }
            if ( input.LA(1)==LBRAC||input.LA(1)==43 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement512);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:81:34: (s= statement )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==LBRAC||(LA18_0>=JAVACODE && LA18_0<=WORD)||(LA18_0>=OIVAR && LA18_0<=GLOBALVAR)||LA18_0==36||LA18_0==39||LA18_0==43||(LA18_0>=45 && LA18_0<=48)||(LA18_0>=70 && LA18_0<=73)||(LA18_0>=75 && LA18_0<=77)||LA18_0==81) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:81:35: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_bstatement521);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value +=s+"\n";
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( input.LA(1)==RBRAC||input.LA(1)==44 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_bstatement526);    throw mse;
            }

            if ( backtracking==0 ) {
              value =pc.bstatement(value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, bstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end bstatement

    public static class varstatement_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start varstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:84:1: varstatement returns [String value] : (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* ;
    public final varstatement_return varstatement() throws RecognitionException {
        varstatement_return retval = new varstatement_return();
        retval.start = input.LT(1);
        int varstatement_StartIndex = input.index();
        Token w=null;
        variable_return vari = null;

        String ass = null;

        variable_return varii = null;


        String s = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:1: ( (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:3: (w= 'var' | w= WORD | w= 'globalvar' ) (vari= variable | ass= assignment ) ( ',' (varii= variable | ass= assignment ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:3: (w= 'var' | w= WORD | w= 'globalvar' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt19=1;
                }
                break;
            case WORD:
                {
                alt19=2;
                }
                break;
            case 45:
                {
                alt19=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("85:3: (w= 'var' | w= WORD | w= 'globalvar' )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:4: w= 'var'
                    {
                    w=(Token)input.LT(1);
                    match(input,39,FOLLOW_39_in_varstatement553); if (failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:12: w= WORD
                    {
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_varstatement557); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:19: w= 'globalvar'
                    {
                    w=(Token)input.LT(1);
                    match(input,45,FOLLOW_45_in_varstatement561); if (failed) return retval;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:34: (vari= variable | ass= assignment )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==WORD||(LA20_0>=OIVAR && LA20_0<=GLOBALVAR)) ) {
                switch ( input.LA(2) ) {
                case 90:
                    {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        int LA20_46 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 46, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA20_47 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 47, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA20_48 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 48, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA20_49 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 49, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA20_50 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 50, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA20_51 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 51, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA20_52 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 52, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA20_53 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 53, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA20_54 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 54, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA20_55 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 55, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 52:
                    case 53:
                        {
                        int LA20_56 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 56, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 42:
                        {
                        int LA20_57 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 57, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 91:
                        {
                        int LA20_58 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 58, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 89:
                    {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==WORD) ) {
                        int LA20_59 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 59, input);

                            throw nvae;
                        }
                    }
                    else if ( ((LA20_3>=OIVAR && LA20_3<=GLOBALVAR)) ) {
                        int LA20_60 = input.LA(4);

                        if ( (synpred42()) ) {
                            alt20=1;
                        }
                        else if ( (true) ) {
                            alt20=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 60, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case EQUALS:
                case 68:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                    {
                    alt20=2;
                    }
                    break;
                case EOF:
                case MINUS:
                case LPAREN:
                case RPAREN:
                case LBRAC:
                case RBRAC:
                case JAVACODE:
                case WORD:
                case NUMBER:
                case HEXNUMBER:
                case STRING:
                case DECIMAL:
                case STUPIDDECIMAL:
                case OIVAR:
                case GLOBALVAR:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 50:
                case 51:
                case 52:
                case 53:
                case 61:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 81:
                    {
                    alt20=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("85:34: (vari= variable | ass= assignment )", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:35: vari= variable
                    {
                    pushFollow(FOLLOW_variable_in_varstatement567);
                    vari=variable();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      /*s = ""+vari.value;*/
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:75: ass= assignment
                    {
                    pushFollow(FOLLOW_assignment_in_varstatement573);
                    ass=assignment();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      s = ""+ass;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:112: ( ',' (varii= variable | ass= assignment ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:113: ',' (varii= variable | ass= assignment )
            	    {
            	    match(input,42,FOLLOW_42_in_varstatement579); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:117: (varii= variable | ass= assignment )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==WORD||(LA21_0>=OIVAR && LA21_0<=GLOBALVAR)) ) {
            	        switch ( input.LA(2) ) {
            	        case 90:
            	            {
            	            switch ( input.LA(3) ) {
            	            case MINUS:
            	                {
            	                int LA21_46 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 46, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 61:
            	                {
            	                int LA21_47 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 47, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case WORD:
            	                {
            	                int LA21_48 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 48, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case HEXNUMBER:
            	                {
            	                int LA21_49 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 49, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case STRING:
            	                {
            	                int LA21_50 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 50, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case NUMBER:
            	                {
            	                int LA21_51 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 51, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case OIVAR:
            	            case GLOBALVAR:
            	                {
            	                int LA21_52 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 52, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case DECIMAL:
            	                {
            	                int LA21_53 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 53, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case STUPIDDECIMAL:
            	                {
            	                int LA21_54 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 54, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case LPAREN:
            	                {
            	                int LA21_55 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 55, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 52:
            	            case 53:
            	                {
            	                int LA21_56 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 56, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 42:
            	                {
            	                int LA21_57 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 57, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case 91:
            	                {
            	                int LA21_58 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 58, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 2, input);

            	                throw nvae;
            	            }

            	            }
            	            break;
            	        case 89:
            	            {
            	            int LA21_3 = input.LA(3);

            	            if ( (LA21_3==WORD) ) {
            	                int LA21_59 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 59, input);

            	                    throw nvae;
            	                }
            	            }
            	            else if ( ((LA21_3>=OIVAR && LA21_3<=GLOBALVAR)) ) {
            	                int LA21_60 = input.LA(4);

            	                if ( (synpred43()) ) {
            	                    alt21=1;
            	                }
            	                else if ( (true) ) {
            	                    alt21=2;
            	                }
            	                else {
            	                    if (backtracking>0) {failed=true; return retval;}
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 60, input);

            	                    throw nvae;
            	                }
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 3, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case EOF:
            	        case MINUS:
            	        case LPAREN:
            	        case RPAREN:
            	        case LBRAC:
            	        case RBRAC:
            	        case JAVACODE:
            	        case WORD:
            	        case NUMBER:
            	        case HEXNUMBER:
            	        case STRING:
            	        case DECIMAL:
            	        case STUPIDDECIMAL:
            	        case OIVAR:
            	        case GLOBALVAR:
            	        case 36:
            	        case 37:
            	        case 38:
            	        case 39:
            	        case 40:
            	        case 41:
            	        case 42:
            	        case 43:
            	        case 44:
            	        case 45:
            	        case 46:
            	        case 47:
            	        case 48:
            	        case 50:
            	        case 51:
            	        case 52:
            	        case 53:
            	        case 61:
            	        case 70:
            	        case 71:
            	        case 72:
            	        case 73:
            	        case 74:
            	        case 75:
            	        case 76:
            	        case 77:
            	        case 78:
            	        case 79:
            	        case 81:
            	            {
            	            alt21=1;
            	            }
            	            break;
            	        case EQUALS:
            	        case 68:
            	        case 82:
            	        case 83:
            	        case 84:
            	        case 85:
            	        case 86:
            	        case 87:
            	        case 88:
            	            {
            	            alt21=2;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("85:117: (varii= variable | ass= assignment )", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:118: varii= variable
            	            {
            	            pushFollow(FOLLOW_variable_in_varstatement584);
            	            varii=variable();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              /*s += ", "+varii.value;*/
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:163: ass= assignment
            	            {
            	            pushFollow(FOLLOW_assignment_in_varstatement590);
            	            ass=assignment();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              s += "; "+ ass;
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( backtracking==0 ) {
              retval.value =pc.varstatement(w.getText(),s);
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, varstatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end varstatement


    // $ANTLR start returnstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:88:1: returnstatement returns [String value] : 'return' (e= expression )? ;
    public final String returnstatement() throws RecognitionException {
        String value = null;
        int returnstatement_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:89:1: ( 'return' (e= expression )? )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:89:3: 'return' (e= expression )?
            {
            match(input,46,FOLLOW_46_in_returnstatement613); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:89:12: (e= expression )?
            int alt23=2;
            switch ( input.LA(1) ) {
                case MINUS:
                    {
                    int LA23_1 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case 61:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case WORD:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case HEXNUMBER:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case STRING:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case NUMBER:
                    {
                    int LA23_6 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case OIVAR:
                    {
                    int LA23_7 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case DECIMAL:
                    {
                    int LA23_8 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case STUPIDDECIMAL:
                    {
                    int LA23_9 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case LPAREN:
                    {
                    int LA23_10 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case 52:
                case 53:
                    {
                    int LA23_11 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
                case GLOBALVAR:
                    {
                    int LA23_29 = input.LA(2);

                    if ( (synpred45()) ) {
                        alt23=1;
                    }
                    }
                    break;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:89:13: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_returnstatement618);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =e.value;
                    }

                    }
                    break;

            }

            if ( backtracking==0 ) {
              value =pc.returnstatement(value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, returnstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end returnstatement


    // $ANTLR start exitstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:92:1: exitstatement returns [String value] : 'exit' ;
    public final String exitstatement() throws RecognitionException {
        String value = null;
        int exitstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:93:1: ( 'exit' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:93:2: 'exit'
            {
            match(input,47,FOLLOW_47_in_exitstatement635); if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.exitstatement();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, exitstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end exitstatement


    // $ANTLR start ifstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:96:1: ifstatement returns [String value] : 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* ;
    public final String ifstatement() throws RecognitionException {
        String value = null;
        int ifstatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;

        String el = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:1: ( 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:4: 'if' e= expression ( 'then' )? (s= statement ) (el= elsestatement )*
            {
            if ( backtracking==0 ) {
              value = "";
            }
            match(input,48,FOLLOW_48_in_ifstatement653); if (failed) return value;
            pushFollow(FOLLOW_expression_in_ifstatement657);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:36: ( 'then' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==49) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:37: 'then'
                    {
                    match(input,49,FOLLOW_49_in_ifstatement660); if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:46: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:47: s= statement
            {
            pushFollow(FOLLOW_statement_in_ifstatement667);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:60: (el= elsestatement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==50) ) {
                    int LA25_22 = input.LA(2);

                    if ( (synpred47()) ) {
                        alt25=1;
                    }


                }
                else if ( (LA25_0==51) ) {
                    int LA25_23 = input.LA(2);

                    if ( (synpred47()) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:61: el= elsestatement
            	    {
            	    pushFollow(FOLLOW_elsestatement_in_ifstatement673);
            	    el=elsestatement();
            	    _fsp--;
            	    if (failed) return value;
            	    if ( backtracking==0 ) {
            	      value +=el;
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( backtracking==0 ) {
              value =pc.ifstatement(e.value,s,value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, ifstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end ifstatement


    // $ANTLR start elsestatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:100:1: elsestatement returns [String value] : ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) ;
    public final String elsestatement() throws RecognitionException {
        String value = null;
        int elsestatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:101:1: ( ( 'else' | ( 'elsif' e= expression ) ) (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:101:3: ( 'else' | ( 'elsif' e= expression ) ) (s= statement )
            {
            if ( backtracking==0 ) {
              value ="";
            }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:101:17: ( 'else' | ( 'elsif' e= expression ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==50) ) {
                alt26=1;
            }
            else if ( (LA26_0==51) ) {
                alt26=2;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("101:17: ( 'else' | ( 'elsif' e= expression ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:101:18: 'else'
                    {
                    match(input,50,FOLLOW_50_in_elsestatement695); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:101:25: ( 'elsif' e= expression )
                    {
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:101:25: ( 'elsif' e= expression )
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:101:26: 'elsif' e= expression
                    {
                    match(input,51,FOLLOW_51_in_elsestatement698); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_elsestatement702);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value ="if "+e.value;
                    }

                    }


                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:101:75: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:101:76: s= statement
            {
            pushFollow(FOLLOW_statement_in_elsestatement711);
            s=statement();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value +=" "+s;
            }

            }

            if ( backtracking==0 ) {
              value =pc.elsestatement(value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, elsestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end elsestatement

    public static class expression_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start expression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:105:1: expression returns [String value] : (neg= negate | r= relationalExpression | p= pexpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        String neg = null;

        String r = null;

        String p = null;

        String n = null;

        String aa = null;

        String an = null;

        String orr = null;

        String x = null;

        expression_return e = null;


        String a = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:1: ( (neg= negate | r= relationalExpression | p= pexpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression ) (aa= aexpression )* ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )
            int alt27=4;
            switch ( input.LA(1) ) {
            case MINUS:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==NUMBER) ) {
                    int LA27_12 = input.LA(3);

                    if ( (synpred49()) ) {
                        alt27=1;
                    }
                    else if ( (synpred50()) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 12, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==MINUS||LA27_1==LPAREN||LA27_1==WORD||(LA27_1>=HEXNUMBER && LA27_1<=GLOBALVAR)||(LA27_1>=52 && LA27_1<=53)||LA27_1==61) ) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case 61:
                {
                alt27=1;
                }
                break;
            case WORD:
            case NUMBER:
            case HEXNUMBER:
            case STRING:
            case DECIMAL:
            case STUPIDDECIMAL:
            case OIVAR:
            case GLOBALVAR:
                {
                alt27=2;
                }
                break;
            case LPAREN:
                {
                switch ( input.LA(2) ) {
                case MINUS:
                    {
                    switch ( input.LA(3) ) {
                    case NUMBER:
                        {
                        int LA27_84 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 84, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
                        {
                        int LA27_85 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 85, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA27_86 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 86, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA27_87 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 87, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA27_88 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 88, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA27_89 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 89, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA27_90 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 90, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA27_91 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 91, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA27_92 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 92, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA27_93 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 93, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 52:
                    case 53:
                        {
                        int LA27_94 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 94, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 23, input);

                        throw nvae;
                    }

                    }
                    break;
                case 61:
                    {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        int LA27_95 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 95, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA27_96 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 96, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA27_97 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 97, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA27_98 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 98, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA27_99 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 99, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA27_100 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 100, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA27_101 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 101, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA27_102 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 102, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA27_103 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 103, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA27_104 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 104, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 52:
                    case 53:
                        {
                        int LA27_105 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 105, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 24, input);

                        throw nvae;
                    }

                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(3) ) {
                    case 90:
                        {
                        int LA27_106 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 106, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA27_107 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 107, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EQUALS:
                    case EQUALS2:
                    case NOT_EQUALS:
                    case GT:
                    case GTE:
                    case LT:
                    case LTE:
                    case 53:
                    case 68:
                    case 69:
                        {
                        int LA27_108 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 108, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA27_109 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 109, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA27_110 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 110, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA27_111 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 111, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA27_112 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 112, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA27_113 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 113, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 89:
                        {
                        int LA27_114 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 114, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 25, input);

                        throw nvae;
                    }

                    }
                    break;
                case HEXNUMBER:
                    {
                    switch ( input.LA(3) ) {
                    case EQUALS:
                    case EQUALS2:
                    case NOT_EQUALS:
                    case GT:
                    case GTE:
                    case LT:
                    case LTE:
                    case 53:
                    case 68:
                    case 69:
                        {
                        int LA27_115 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 115, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA27_116 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 116, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA27_117 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 117, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA27_118 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 118, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA27_119 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 119, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA27_120 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 120, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 26, input);

                        throw nvae;
                    }

                    }
                    break;
                case STRING:
                    {
                    switch ( input.LA(3) ) {
                    case EQUALS:
                    case EQUALS2:
                    case NOT_EQUALS:
                    case GT:
                    case GTE:
                    case LT:
                    case LTE:
                    case 53:
                    case 68:
                    case 69:
                        {
                        int LA27_121 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 121, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA27_122 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 122, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA27_123 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 123, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA27_124 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 124, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA27_125 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 125, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA27_126 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 126, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 27, input);

                        throw nvae;
                    }

                    }
                    break;
                case NUMBER:
                    {
                    switch ( input.LA(3) ) {
                    case EQUALS:
                    case EQUALS2:
                    case NOT_EQUALS:
                    case GT:
                    case GTE:
                    case LT:
                    case LTE:
                    case 53:
                    case 68:
                    case 69:
                        {
                        int LA27_127 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 127, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA27_128 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 128, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA27_129 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 129, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA27_130 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 130, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA27_131 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 131, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA27_132 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 132, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 28, input);

                        throw nvae;
                    }

                    }
                    break;
                case OIVAR:
                case GLOBALVAR:
                    {
                    switch ( input.LA(3) ) {
                    case 90:
                        {
                        int LA27_133 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 133, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 89:
                        {
                        int LA27_134 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 134, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EQUALS:
                    case EQUALS2:
                    case NOT_EQUALS:
                    case GT:
                    case GTE:
                    case LT:
                    case LTE:
                    case 53:
                    case 68:
                    case 69:
                        {
                        int LA27_135 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 135, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA27_136 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 136, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA27_137 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 137, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA27_138 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 138, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA27_139 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 139, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA27_140 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 140, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 29, input);

                        throw nvae;
                    }

                    }
                    break;
                case DECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case EQUALS:
                    case EQUALS2:
                    case NOT_EQUALS:
                    case GT:
                    case GTE:
                    case LT:
                    case LTE:
                    case 53:
                    case 68:
                    case 69:
                        {
                        int LA27_141 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 141, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA27_142 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 142, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA27_143 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 143, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA27_144 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 144, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA27_145 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 145, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA27_146 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 146, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 30, input);

                        throw nvae;
                    }

                    }
                    break;
                case STUPIDDECIMAL:
                    {
                    switch ( input.LA(3) ) {
                    case EQUALS:
                    case EQUALS2:
                    case NOT_EQUALS:
                    case GT:
                    case GTE:
                    case LT:
                    case LTE:
                    case 53:
                    case 68:
                    case 69:
                        {
                        int LA27_147 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 147, input);

                            throw nvae;
                        }
                        }
                        break;
                    case PLUS:
                    case MINUS:
                    case MULT:
                    case DIV:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        {
                        int LA27_148 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 148, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 62:
                    case 63:
                        {
                        int LA27_149 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 149, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 64:
                    case 65:
                        {
                        int LA27_150 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 150, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 66:
                    case 67:
                        {
                        int LA27_151 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 151, input);

                            throw nvae;
                        }
                        }
                        break;
                    case RPAREN:
                        {
                        int LA27_152 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 152, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 31, input);

                        throw nvae;
                    }

                    }
                    break;
                case LPAREN:
                    {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        int LA27_153 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 153, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA27_154 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 154, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA27_155 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 155, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA27_156 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 156, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA27_157 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 157, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA27_158 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 158, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA27_159 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 159, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA27_160 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 160, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA27_161 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 161, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA27_162 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 162, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 52:
                    case 53:
                        {
                        int LA27_163 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 163, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 32, input);

                        throw nvae;
                    }

                    }
                    break;
                case 52:
                case 53:
                    {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        int LA27_164 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 164, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 61:
                        {
                        int LA27_165 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 165, input);

                            throw nvae;
                        }
                        }
                        break;
                    case WORD:
                        {
                        int LA27_166 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 166, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA27_167 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 167, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA27_168 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 168, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA27_169 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 169, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA27_170 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 170, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA27_171 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 171, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA27_172 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 172, input);

                            throw nvae;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        int LA27_173 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 173, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 52:
                    case 53:
                        {
                        int LA27_174 = input.LA(4);

                        if ( (synpred50()) ) {
                            alt27=2;
                        }
                        else if ( (synpred51()) ) {
                            alt27=3;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 174, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 33, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 10, input);

                    throw nvae;
                }

                }
                break;
            case 52:
            case 53:
                {
                alt27=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("106:4: (neg= negate | r= relationalExpression | p= pexpression | n= notexpression )", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:5: neg= negate
                    {
                    pushFollow(FOLLOW_negate_in_expression739);
                    neg=negate();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value = neg;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:38: r= relationalExpression
                    {
                    pushFollow(FOLLOW_relationalExpression_in_expression744);
                    r=relationalExpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =r;
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:80: p= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_expression749);
                    p=pexpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =p;
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:113: n= notexpression
                    {
                    pushFollow(FOLLOW_notexpression_in_expression754);
                    n=notexpression();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value =n;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:149: (aa= aexpression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==MINUS) ) {
                    int LA28_28 = input.LA(2);

                    if ( (synpred52()) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==PLUS||(LA28_0>=MULT && LA28_0<=DIV)||(LA28_0>=54 && LA28_0<=60)) ) {
                    int LA28_41 = input.LA(2);

                    if ( (synpred52()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:150: aa= aexpression
            	    {
            	    pushFollow(FOLLOW_aexpression_in_expression761);
            	    aa=aexpression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      retval.value+= " "+ aa;
            	    }

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:194: ( (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression ) )*
            loop30:
            do {
                int alt30=2;
                switch ( input.LA(1) ) {
                case 62:
                case 63:
                    {
                    int LA30_38 = input.LA(2);

                    if ( (synpred55()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 64:
                case 65:
                    {
                    int LA30_39 = input.LA(2);

                    if ( (synpred55()) ) {
                        alt30=1;
                    }


                    }
                    break;
                case 66:
                case 67:
                    {
                    int LA30_40 = input.LA(2);

                    if ( (synpred55()) ) {
                        alt30=1;
                    }


                    }
                    break;

                }

                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:195: (an= andexpression | orr= orexpression | x= xorexpression ) (e= expression )
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:195: (an= andexpression | orr= orexpression | x= xorexpression )
            	    int alt29=3;
            	    switch ( input.LA(1) ) {
            	    case 62:
            	    case 63:
            	        {
            	        alt29=1;
            	        }
            	        break;
            	    case 64:
            	    case 65:
            	        {
            	        alt29=2;
            	        }
            	        break;
            	    case 66:
            	    case 67:
            	        {
            	        alt29=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("106:195: (an= andexpression | orr= orexpression | x= xorexpression )", 29, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt29) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:196: an= andexpression
            	            {
            	            pushFollow(FOLLOW_andexpression_in_expression771);
            	            an=andexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+an;
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:238: orr= orexpression
            	            {
            	            pushFollow(FOLLOW_orexpression_in_expression776);
            	            orr=orexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+orr;
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:281: x= xorexpression
            	            {
            	            pushFollow(FOLLOW_xorexpression_in_expression781);
            	            x=xorexpression();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) {
            	              retval.value +=" "+x;
            	            }

            	            }
            	            break;

            	    }

            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:322: (e= expression )
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:323: e= expression
            	    {
            	    pushFollow(FOLLOW_expression_in_expression788);
            	    e=expression();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) {
            	      retval.value +=" ("+e.value+")";
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( backtracking==0 ) {
              retval.value =pc.expression(retval.value);
            }

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end expression


    // $ANTLR start notexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:109:1: notexpression returns [String value] : ( 'not' | '!' ) e= expression ;
    public final String notexpression() throws RecognitionException {
        String value = null;
        int notexpression_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:110:1: ( ( 'not' | '!' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:110:3: ( 'not' | '!' ) e= expression
            {
            if ( (input.LA(1)>=52 && input.LA(1)<=53) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_notexpression807);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_notexpression815);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.notexpression(e.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, notexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end notexpression


    // $ANTLR start aexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:114:1: aexpression returns [String value] : a= ( '+' | '-' | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) (e= expression ) ;
    public final String aexpression() throws RecognitionException {
        String value = null;
        int aexpression_StartIndex = input.index();
        Token a=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:115:1: (a= ( '+' | '-' | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) (e= expression ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:115:3: a= ( '+' | '-' | '*' | '/' | '|' | '&' | '^' | '<<' | '>>' | 'div' | 'mod' ) (e= expression )
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS && input.LA(1)<=DIV)||(input.LA(1)>=54 && input.LA(1)<=60) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_aexpression833);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:115:57: (e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:115:58: e= expression
            {
            pushFollow(FOLLOW_expression_in_aexpression860);
            e=expression();
            _fsp--;
            if (failed) return value;

            }

            if ( backtracking==0 ) {
              value =pc.aexpression(a.getText(),e.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, aexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end aexpression


    // $ANTLR start value
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:1: value returns [String value] : a= ( NUMBER | HEXNUMBER | STRING | variable ) ;
    public final String value() throws RecognitionException {
        String value = null;
        int value_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:30: (a= ( NUMBER | HEXNUMBER | STRING | variable ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:32: a= ( NUMBER | HEXNUMBER | STRING | variable )
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:34: ( NUMBER | HEXNUMBER | STRING | variable )
            int alt31=4;
            switch ( input.LA(1) ) {
            case NUMBER:
                {
                alt31=1;
                }
                break;
            case HEXNUMBER:
                {
                alt31=2;
                }
                break;
            case STRING:
                {
                alt31=3;
                }
                break;
            case WORD:
            case OIVAR:
            case GLOBALVAR:
                {
                alt31=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("118:34: ( NUMBER | HEXNUMBER | STRING | variable )", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:35: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_value880); if (failed) return value;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:42: HEXNUMBER
                    {
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_value882); if (failed) return value;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:52: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_value884); if (failed) return value;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:118:59: variable
                    {
                    pushFollow(FOLLOW_variable_in_value886);
                    variable();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }

            if ( backtracking==0 ) {
              value =a.getText();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, value_StartIndex); }
        }
        return value;
    }
    // $ANTLR end value


    // $ANTLR start negate
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:1: negate returns [String value] : ( '-' | '~' ) e= expression ;
    public final String negate() throws RecognitionException {
        String value = null;
        int negate_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:31: ( ( '-' | '~' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:33: ( '-' | '~' ) e= expression
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:33: ( '-' | '~' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==MINUS) ) {
                alt32=1;
            }
            else if ( (LA32_0==61) ) {
                alt32=2;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("121:33: ( '-' | '~' )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:34: '-'
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_negate903); if (failed) return value;
                    if ( backtracking==0 ) {
                      value =".negate()";
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:121:59: '~'
                    {
                    match(input,61,FOLLOW_61_in_negate906); if (failed) return value;
                    if ( backtracking==0 ) {
                      value =".bnegate()";
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_expression_in_negate912);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value = e.value+value;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, negate_StartIndex); }
        }
        return value;
    }
    // $ANTLR end negate


    // $ANTLR start pexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:125:1: pexpression returns [String value] : LPAREN e= expression RPAREN ;
    public final String pexpression() throws RecognitionException {
        String value = null;
        int pexpression_StartIndex = input.index();
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:126:1: ( LPAREN e= expression RPAREN )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:126:3: LPAREN e= expression RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_pexpression929); if (failed) return value;
            pushFollow(FOLLOW_expression_in_pexpression933);
            e=expression();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_pexpression935); if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.pexpression(e.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, pexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end pexpression


    // $ANTLR start andexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:129:1: andexpression returns [String value] : a= ( '&&' | 'and' ) ;
    public final String andexpression() throws RecognitionException {
        String value = null;
        int andexpression_StartIndex = input.index();
        Token a=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:130:1: (a= ( '&&' | 'and' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:130:3: a= ( '&&' | 'and' )
            {
            a=(Token)input.LT(1);
            if ( (input.LA(1)>=62 && input.LA(1)<=63) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_andexpression952);    throw mse;
            }

            if ( backtracking==0 ) {
              value =pc.andexpression();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, andexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end andexpression


    // $ANTLR start orexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:133:1: orexpression returns [String value] : o= ( '||' | 'or' ) ;
    public final String orexpression() throws RecognitionException {
        String value = null;
        int orexpression_StartIndex = input.index();
        Token o=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:134:1: (o= ( '||' | 'or' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:134:3: o= ( '||' | 'or' )
            {
            o=(Token)input.LT(1);
            if ( (input.LA(1)>=64 && input.LA(1)<=65) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orexpression973);    throw mse;
            }

            if ( backtracking==0 ) {
              value =pc.orexpression();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 20, orexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end orexpression


    // $ANTLR start xorexpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:137:1: xorexpression returns [String value] : x= ( '^^' | 'xor' ) ;
    public final String xorexpression() throws RecognitionException {
        String value = null;
        int xorexpression_StartIndex = input.index();
        Token x=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:138:1: (x= ( '^^' | 'xor' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:138:3: x= ( '^^' | 'xor' )
            {
            x=(Token)input.LT(1);
            if ( (input.LA(1)>=66 && input.LA(1)<=67) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_xorexpression994);    throw mse;
            }

            if ( backtracking==0 ) {
              value =pc.xorexpression();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 21, xorexpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end xorexpression


    // $ANTLR start relationalExpression
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:141:1: relationalExpression returns [String value] : (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression ) )? ;
    public final String relationalExpression() throws RecognitionException {
        String value = null;
        int relationalExpression_StartIndex = input.index();
        Token h=null;
        Token s=null;
        Token n=null;
        Token d=null;
        Token w=null;
        Token op=null;
        String f = null;

        variable_return v = null;

        String p = null;

        expression_return exp = null;


        String a = "";
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:142:3: ( (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression ) )? )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression ) (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression ) )?
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression )
            int alt33=10;
            switch ( input.LA(1) ) {
            case WORD:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==LPAREN) ) {
                    alt33=1;
                }
                else if ( (synpred79()) ) {
                    alt33=6;
                }
                else if ( (synpred82()) ) {
                    alt33=9;
                }
                else {
                    if (backtracking>0) {failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("143:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression )", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case HEXNUMBER:
                {
                alt33=2;
                }
                break;
            case STRING:
                {
                alt33=3;
                }
                break;
            case MINUS:
                {
                alt33=4;
                }
                break;
            case NUMBER:
                {
                alt33=5;
                }
                break;
            case OIVAR:
            case GLOBALVAR:
                {
                alt33=6;
                }
                break;
            case DECIMAL:
                {
                alt33=7;
                }
                break;
            case STUPIDDECIMAL:
                {
                alt33=8;
                }
                break;
            case LPAREN:
                {
                alt33=10;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("143:3: (f= function | h= HEXNUMBER | s= STRING | '-' n= NUMBER | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | p= pexpression )", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:4: f= function
                    {
                    pushFollow(FOLLOW_function_in_relationalExpression1025);
                    f=function();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = f;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:35: h= HEXNUMBER
                    {
                    h=(Token)input.LT(1);
                    match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1030); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.stringval(h.getText());
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:81: s= STRING
                    {
                    s=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_relationalExpression1036); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.stringval(s.getText().substring(1, s.getText().length()-1));
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:156: '-' n= NUMBER
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_relationalExpression1039); if (failed) return value;
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1043); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.intval(n.getText());
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:200: n= NUMBER
                    {
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1049); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.intval(n.getText());
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:239: v= variable
                    {
                    pushFollow(FOLLOW_variable_in_relationalExpression1054);
                    v=variable();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = v.value;
                    }

                    }
                    break;
                case 7 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:270: d= DECIMAL
                    {
                    d=(Token)input.LT(1);
                    match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1059); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.doubleval(d.getText());
                    }

                    }
                    break;
                case 8 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:313: d= STUPIDDECIMAL
                    {
                    d=(Token)input.LT(1);
                    match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_relationalExpression1064); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = pc.doubleval("0"+d.getText());
                    }

                    }
                    break;
                case 9 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:366: w= WORD
                    {
                    w=(Token)input.LT(1);
                    match(input,WORD,FOLLOW_WORD_in_relationalExpression1069); if (failed) return value;
                    if ( backtracking==0 ) {
                      value = w.getText();
                    }

                    }
                    break;
                case 10 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:392: p= pexpression
                    {
                    pushFollow(FOLLOW_pexpression_in_relationalExpression1074);
                    p=pexpression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = p;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:427: (op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                switch ( input.LA(2) ) {
                    case MINUS:
                        {
                        switch ( input.LA(3) ) {
                            case NUMBER:
                                {
                                int LA35_62 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case MINUS:
                                {
                                int LA35_63 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 61:
                                {
                                int LA35_64 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA35_65 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA35_66 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA35_67 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA35_68 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA35_69 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA35_70 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA35_71 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 52:
                            case 53:
                                {
                                int LA35_72 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                    case 61:
                        {
                        switch ( input.LA(3) ) {
                            case MINUS:
                                {
                                int LA35_73 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 61:
                                {
                                int LA35_74 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA35_75 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA35_76 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA35_77 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA35_78 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA35_79 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA35_80 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA35_81 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA35_82 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 52:
                            case 53:
                                {
                                int LA35_83 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                    case WORD:
                        {
                        int LA35_53 = input.LA(3);

                        if ( (synpred100()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA35_54 = input.LA(3);

                        if ( (synpred100()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA35_55 = input.LA(3);

                        if ( (synpred100()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA35_56 = input.LA(3);

                        if ( (synpred100()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA35_57 = input.LA(3);

                        if ( (synpred100()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA35_58 = input.LA(3);

                        if ( (synpred100()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA35_59 = input.LA(3);

                        if ( (synpred100()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case LPAREN:
                        {
                        switch ( input.LA(3) ) {
                            case MINUS:
                                {
                                int LA35_438 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 61:
                                {
                                int LA35_439 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA35_440 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA35_441 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA35_442 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA35_443 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA35_444 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA35_445 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA35_446 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA35_447 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 52:
                            case 53:
                                {
                                int LA35_448 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                    case 52:
                    case 53:
                        {
                        switch ( input.LA(3) ) {
                            case MINUS:
                                {
                                int LA35_449 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 61:
                                {
                                int LA35_450 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case WORD:
                                {
                                int LA35_451 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case HEXNUMBER:
                                {
                                int LA35_452 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STRING:
                                {
                                int LA35_453 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case NUMBER:
                                {
                                int LA35_454 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case OIVAR:
                            case GLOBALVAR:
                                {
                                int LA35_455 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case DECIMAL:
                                {
                                int LA35_456 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case STUPIDDECIMAL:
                                {
                                int LA35_457 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case LPAREN:
                                {
                                int LA35_458 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                            case 52:
                            case 53:
                                {
                                int LA35_459 = input.LA(4);

                                if ( (synpred100()) ) {
                                    alt35=1;
                                }
                                }
                                break;
                        }

                        }
                        break;
                }

            }
            else if ( ((LA35_0>=EQUALS && LA35_0<=LTE)||(LA35_0>=68 && LA35_0<=69)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:429: op= ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )
                    {
                    op=(Token)input.LT(1);
                    if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==53||(input.LA(1)>=68 && input.LA(1)<=69) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return value;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relationalExpression1082);    throw mse;
                    }

                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:488: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )
                    int alt34=9;
                    switch ( input.LA(1) ) {
                    case WORD:
                        {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==LPAREN) ) {
                            alt34=1;
                        }
                        else if ( (synpred96()) ) {
                            alt34=5;
                        }
                        else if ( (synpred99()) ) {
                            alt34=8;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("143:488: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case HEXNUMBER:
                        {
                        int LA34_2 = input.LA(2);

                        if ( (synpred93()) ) {
                            alt34=2;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("143:488: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STRING:
                        {
                        int LA34_3 = input.LA(2);

                        if ( (synpred94()) ) {
                            alt34=3;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("143:488: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 3, input);

                            throw nvae;
                        }
                        }
                        break;
                    case NUMBER:
                        {
                        int LA34_4 = input.LA(2);

                        if ( (synpred95()) ) {
                            alt34=4;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("143:488: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case OIVAR:
                    case GLOBALVAR:
                        {
                        int LA34_5 = input.LA(2);

                        if ( (synpred96()) ) {
                            alt34=5;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("143:488: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 5, input);

                            throw nvae;
                        }
                        }
                        break;
                    case DECIMAL:
                        {
                        int LA34_6 = input.LA(2);

                        if ( (synpred97()) ) {
                            alt34=6;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("143:488: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 6, input);

                            throw nvae;
                        }
                        }
                        break;
                    case STUPIDDECIMAL:
                        {
                        int LA34_7 = input.LA(2);

                        if ( (synpred98()) ) {
                            alt34=7;
                        }
                        else if ( (true) ) {
                            alt34=9;
                        }
                        else {
                            if (backtracking>0) {failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("143:488: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 7, input);

                            throw nvae;
                        }
                        }
                        break;
                    case MINUS:
                    case LPAREN:
                    case 52:
                    case 53:
                    case 61:
                        {
                        alt34=9;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("143:488: (f= function | h= HEXNUMBER | s= STRING | n= NUMBER | v= variable | d= DECIMAL | d= STUPIDDECIMAL | w= WORD | exp= expression )", 34, 0, input);

                        throw nvae;
                    }

                    switch (alt34) {
                        case 1 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:489: f= function
                            {
                            pushFollow(FOLLOW_function_in_relationalExpression1107);
                            f=function();
                            _fsp--;
                            if (failed) return value;
                            if ( backtracking==0 ) {
                              a = f;
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:515: h= HEXNUMBER
                            {
                            h=(Token)input.LT(1);
                            match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_relationalExpression1112); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = h.getText();
                            }

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:541: s= STRING
                            {
                            s=(Token)input.LT(1);
                            match(input,STRING,FOLLOW_STRING_in_relationalExpression1117); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = pc.stringval(s.getText().substring(1, s.getText().length()-1));
                            }

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:611: n= NUMBER
                            {
                            n=(Token)input.LT(1);
                            match(input,NUMBER,FOLLOW_NUMBER_in_relationalExpression1122); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = pc.intval(n.getText());
                            }

                            }
                            break;
                        case 5 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:645: v= variable
                            {
                            pushFollow(FOLLOW_variable_in_relationalExpression1127);
                            v=variable();
                            _fsp--;
                            if (failed) return value;
                            if ( backtracking==0 ) {
                              a = v.value;
                            }

                            }
                            break;
                        case 6 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:671: d= DECIMAL
                            {
                            d=(Token)input.LT(1);
                            match(input,DECIMAL,FOLLOW_DECIMAL_in_relationalExpression1132); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = "(new Double("+d.getText()+"))";
                            }

                            }
                            break;
                        case 7 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:715: d= STUPIDDECIMAL
                            {
                            d=(Token)input.LT(1);
                            match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_relationalExpression1137); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = "(new Double(0"+d.getText()+"))";
                            }

                            }
                            break;
                        case 8 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:766: w= WORD
                            {
                            w=(Token)input.LT(1);
                            match(input,WORD,FOLLOW_WORD_in_relationalExpression1142); if (failed) return value;
                            if ( backtracking==0 ) {
                              a = w.getText();
                            }

                            }
                            break;
                        case 9 :
                            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:787: exp= expression
                            {
                            pushFollow(FOLLOW_expression_in_relationalExpression1147);
                            exp=expression();
                            _fsp--;
                            if (failed) return value;
                            if ( backtracking==0 ) {
                              a = exp.value;
                            }

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      value =pc.relationalExpression(value,op.getText(),a);
                    }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 22, relationalExpression_StartIndex); }
        }
        return value;
    }
    // $ANTLR end relationalExpression


    // $ANTLR start repeatstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:146:1: repeatstatement returns [String value] : 'repeat' (e= expression )? (s= statement ) ( ';' )* ;
    public final String repeatstatement() throws RecognitionException {
        String value = null;
        int repeatstatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:1: ( 'repeat' (e= expression )? (s= statement ) ( ';' )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:3: 'repeat' (e= expression )? (s= statement ) ( ';' )*
            {
            match(input,70,FOLLOW_70_in_repeatstatement1170); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:12: (e= expression )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case MINUS:
                case LPAREN:
                case NUMBER:
                case HEXNUMBER:
                case STRING:
                case DECIMAL:
                case STUPIDDECIMAL:
                case 52:
                case 53:
                case 61:
                    {
                    alt36=1;
                    }
                    break;
                case WORD:
                    {
                    switch ( input.LA(2) ) {
                        case 90:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_115 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_116 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_117 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_118 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_119 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_120 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_121 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_122 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_123 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_124 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_125 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 42:
                                    {
                                    int LA36_126 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 91:
                                    {
                                    int LA36_127 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case LPAREN:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_128 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_129 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_130 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_131 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_132 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_133 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_134 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_135 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_136 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_137 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_138 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case RPAREN:
                                    {
                                    int LA36_139 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case EQUALS:
                        case 68:
                            {
                            switch ( input.LA(3) ) {
                                case WORD:
                                    {
                                    int LA36_140 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_141 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_142 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_143 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_144 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_145 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_146 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA36_147 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_148 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_149 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_150 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case LBRAC:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case JAVACODE:
                        case 36:
                        case 39:
                        case 43:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 75:
                        case 76:
                        case 77:
                        case 81:
                            {
                            alt36=1;
                            }
                            break;
                        case WORD:
                            {
                            switch ( input.LA(3) ) {
                                case 90:
                                    {
                                    int LA36_151 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_152 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 89:
                                    {
                                    int LA36_153 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_160 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                    {
                                    int LA36_173 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case GLOBALVAR:
                                    {
                                    int LA36_174 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 68:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                    {
                                    int LA36_190 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case OIVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 90:
                                    {
                                    int LA36_191 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_192 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 89:
                                    {
                                    int LA36_193 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 68:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                    {
                                    int LA36_230 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case GLOBALVAR:
                            {
                            switch ( input.LA(3) ) {
                                case 90:
                                    {
                                    int LA36_231 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 89:
                                    {
                                    int LA36_232 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case EQUALS:
                                case 68:
                                case 82:
                                case 83:
                                case 84:
                                case 85:
                                case 86:
                                case 87:
                                case 88:
                                    {
                                    int LA36_270 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 89:
                            {
                            int LA36_55 = input.LA(3);

                            if ( (LA36_55==WORD) ) {
                                int LA36_271 = input.LA(4);

                                if ( (synpred101()) ) {
                                    alt36=1;
                                }
                            }
                            else if ( ((LA36_55>=OIVAR && LA36_55<=GLOBALVAR)) ) {
                                int LA36_272 = input.LA(4);

                                if ( (synpred101()) ) {
                                    alt36=1;
                                }
                            }
                            }
                            break;
                    }

                    }
                    break;
                case OIVAR:
                    {
                    switch ( input.LA(2) ) {
                        case 90:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_273 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_274 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_275 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_276 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_277 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_278 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_279 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_280 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_281 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_282 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_283 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 42:
                                    {
                                    int LA36_284 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 91:
                                    {
                                    int LA36_285 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 89:
                            {
                            int LA36_60 = input.LA(3);

                            if ( (LA36_60==WORD) ) {
                                int LA36_286 = input.LA(4);

                                if ( (synpred101()) ) {
                                    alt36=1;
                                }
                            }
                            else if ( ((LA36_60>=OIVAR && LA36_60<=GLOBALVAR)) ) {
                                int LA36_287 = input.LA(4);

                                if ( (synpred101()) ) {
                                    alt36=1;
                                }
                            }
                            }
                            break;
                        case EQUALS:
                        case 68:
                            {
                            switch ( input.LA(3) ) {
                                case WORD:
                                    {
                                    int LA36_288 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_289 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_290 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_291 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_292 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_293 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_294 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA36_295 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_296 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_297 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_298 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case LBRAC:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case JAVACODE:
                        case WORD:
                        case OIVAR:
                        case GLOBALVAR:
                        case 36:
                        case 39:
                        case 43:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 75:
                        case 76:
                        case 77:
                        case 81:
                            {
                            alt36=1;
                            }
                            break;
                    }

                    }
                    break;
                case GLOBALVAR:
                    {
                    switch ( input.LA(2) ) {
                        case 90:
                            {
                            switch ( input.LA(3) ) {
                                case MINUS:
                                    {
                                    int LA36_299 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_300 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case WORD:
                                    {
                                    int LA36_301 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_302 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_303 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_304 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_305 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_306 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_307 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_308 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_309 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 42:
                                    {
                                    int LA36_310 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 91:
                                    {
                                    int LA36_311 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case 89:
                            {
                            int LA36_88 = input.LA(3);

                            if ( (LA36_88==WORD) ) {
                                int LA36_312 = input.LA(4);

                                if ( (synpred101()) ) {
                                    alt36=1;
                                }
                            }
                            else if ( ((LA36_88>=OIVAR && LA36_88<=GLOBALVAR)) ) {
                                int LA36_313 = input.LA(4);

                                if ( (synpred101()) ) {
                                    alt36=1;
                                }
                            }
                            }
                            break;
                        case EQUALS:
                        case 68:
                            {
                            switch ( input.LA(3) ) {
                                case WORD:
                                    {
                                    int LA36_314 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case HEXNUMBER:
                                    {
                                    int LA36_315 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STRING:
                                    {
                                    int LA36_316 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case NUMBER:
                                    {
                                    int LA36_317 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case OIVAR:
                                case GLOBALVAR:
                                    {
                                    int LA36_318 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case DECIMAL:
                                    {
                                    int LA36_319 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case STUPIDDECIMAL:
                                    {
                                    int LA36_320 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case MINUS:
                                    {
                                    int LA36_321 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 61:
                                    {
                                    int LA36_322 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case LPAREN:
                                    {
                                    int LA36_323 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                                case 52:
                                case 53:
                                    {
                                    int LA36_324 = input.LA(4);

                                    if ( (synpred101()) ) {
                                        alt36=1;
                                    }
                                    }
                                    break;
                            }

                            }
                            break;
                        case PLUS:
                        case MINUS:
                        case MULT:
                        case DIV:
                        case LBRAC:
                        case EQUALS2:
                        case NOT_EQUALS:
                        case GT:
                        case GTE:
                        case LT:
                        case LTE:
                        case JAVACODE:
                        case WORD:
                        case OIVAR:
                        case GLOBALVAR:
                        case 36:
                        case 39:
                        case 43:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 75:
                        case 76:
                        case 77:
                        case 81:
                            {
                            alt36=1;
                            }
                            break;
                    }

                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:13: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_repeatstatement1175);
                    e=expression();
                    _fsp--;
                    if (failed) return value;

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:28: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:29: s= statement
            {
            pushFollow(FOLLOW_statement_in_repeatstatement1182);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:42: ( ';' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==36) ) {
                    int LA37_1 = input.LA(2);

                    if ( (synpred102()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:43: ';'
            	    {
            	    match(input,36,FOLLOW_36_in_repeatstatement1186); if (failed) return value;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( backtracking==0 ) {
              value =pc.repeatstatement(e.value,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, repeatstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end repeatstatement


    // $ANTLR start breakstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:150:1: breakstatement returns [String value] : 'break' ;
    public final String breakstatement() throws RecognitionException {
        String value = null;
        int breakstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:151:1: ( 'break' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:151:3: 'break'
            {
            match(input,71,FOLLOW_71_in_breakstatement1204); if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.breakstatement();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, breakstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end breakstatement


    // $ANTLR start continuestatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:153:1: continuestatement returns [String value] : 'continue' ;
    public final String continuestatement() throws RecognitionException {
        String value = null;
        int continuestatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:154:1: ( 'continue' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:154:3: 'continue'
            {
            match(input,72,FOLLOW_72_in_continuestatement1219); if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.continuestatement();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 25, continuestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end continuestatement


    // $ANTLR start dostatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:157:1: dostatement returns [String value] : 'do' s= statement 'until' e= expression ;
    public final String dostatement() throws RecognitionException {
        String value = null;
        int dostatement_StartIndex = input.index();
        String s = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:158:1: ( 'do' s= statement 'until' e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:158:3: 'do' s= statement 'until' e= expression
            {
            match(input,73,FOLLOW_73_in_dostatement1234); if (failed) return value;
            pushFollow(FOLLOW_statement_in_dostatement1238);
            s=statement();
            _fsp--;
            if (failed) return value;
            match(input,74,FOLLOW_74_in_dostatement1240); if (failed) return value;
            pushFollow(FOLLOW_expression_in_dostatement1244);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.dostatement(s,e.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 26, dostatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end dostatement


    // $ANTLR start whilestatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:161:1: whilestatement returns [String value] : 'while' e= expression (s= statement ) ;
    public final String whilestatement() throws RecognitionException {
        String value = null;
        int whilestatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:162:1: ( 'while' e= expression (s= statement ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:162:3: 'while' e= expression (s= statement )
            {
            match(input,75,FOLLOW_75_in_whilestatement1259); if (failed) return value;
            pushFollow(FOLLOW_expression_in_whilestatement1263);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:162:24: (s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:162:25: s= statement
            {
            pushFollow(FOLLOW_statement_in_whilestatement1268);
            s=statement();
            _fsp--;
            if (failed) return value;

            }

            if ( backtracking==0 ) {
              value =pc.whilestatement(e.value,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, whilestatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end whilestatement


    // $ANTLR start forstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:165:1: forstatement returns [String value] : 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement ;
    public final String forstatement() throws RecognitionException {
        String value = null;
        int forstatement_StartIndex = input.index();
        String s1 = null;

        expression_return e = null;

        String s2 = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:166:1: ( 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:166:3: 'for' '(' s1= statement e= expression ( ';' )? s2= statement ')' s= statement
            {
            match(input,76,FOLLOW_76_in_forstatement1284); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_forstatement1286); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1290);
            s1=statement();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_expression_in_forstatement1294);
            e=expression();
            _fsp--;
            if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:166:39: ( ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==36) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==LBRAC||(LA38_1>=JAVACODE && LA38_1<=WORD)||(LA38_1>=OIVAR && LA38_1<=GLOBALVAR)||LA38_1==39||LA38_1==43||(LA38_1>=45 && LA38_1<=48)||(LA38_1>=70 && LA38_1<=73)||(LA38_1>=75 && LA38_1<=77)||LA38_1==81) ) {
                    alt38=1;
                }
                else if ( (LA38_1==36) ) {
                    int LA38_38 = input.LA(3);

                    if ( (synpred103()) ) {
                        alt38=1;
                    }
                }
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:166:40: ';'
                    {
                    match(input,36,FOLLOW_36_in_forstatement1297); if (failed) return value;

                    }
                    break;

            }

            pushFollow(FOLLOW_statement_in_forstatement1303);
            s2=statement();
            _fsp--;
            if (failed) return value;
            match(input,RPAREN,FOLLOW_RPAREN_in_forstatement1305); if (failed) return value;
            pushFollow(FOLLOW_statement_in_forstatement1309);
            s=statement();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.forstatement(s1,e.value,s2,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 28, forstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end forstatement


    // $ANTLR start switchstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:169:1: switchstatement returns [String value] : 'switch' ( expression ) ( '{' | 'begin' ) ( ( 'case' expression | 'default' ) ':' ( statement )* )* ( '}' | 'end' ) ;
    public final String switchstatement() throws RecognitionException {
        String value = null;
        int switchstatement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:1: ( 'switch' ( expression ) ( '{' | 'begin' ) ( ( 'case' expression | 'default' ) ':' ( statement )* )* ( '}' | 'end' ) )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:3: 'switch' ( expression ) ( '{' | 'begin' ) ( ( 'case' expression | 'default' ) ':' ( statement )* )* ( '}' | 'end' )
            {
            match(input,77,FOLLOW_77_in_switchstatement1324); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:12: ( expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:13: expression
            {
            pushFollow(FOLLOW_expression_in_switchstatement1327);
            expression();
            _fsp--;
            if (failed) return value;

            }

            if ( input.LA(1)==LBRAC||input.LA(1)==43 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1330);    throw mse;
            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:39: ( ( 'case' expression | 'default' ) ':' ( statement )* )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=78 && LA41_0<=79)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:40: ( 'case' expression | 'default' ) ':' ( statement )*
            	    {
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:40: ( 'case' expression | 'default' )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==78) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==79) ) {
            	        alt39=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return value;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("170:40: ( 'case' expression | 'default' )", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:41: 'case' expression
            	            {
            	            match(input,78,FOLLOW_78_in_switchstatement1338); if (failed) return value;
            	            pushFollow(FOLLOW_expression_in_switchstatement1340);
            	            expression();
            	            _fsp--;
            	            if (failed) return value;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:59: 'default'
            	            {
            	            match(input,79,FOLLOW_79_in_switchstatement1342); if (failed) return value;

            	            }
            	            break;

            	    }

            	    match(input,80,FOLLOW_80_in_switchstatement1346); if (failed) return value;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:75: ( statement )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==LBRAC||(LA40_0>=JAVACODE && LA40_0<=WORD)||(LA40_0>=OIVAR && LA40_0<=GLOBALVAR)||LA40_0==36||LA40_0==39||LA40_0==43||(LA40_0>=45 && LA40_0<=48)||(LA40_0>=70 && LA40_0<=73)||(LA40_0>=75 && LA40_0<=77)||LA40_0==81) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:170:76: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_switchstatement1349);
            	    	    statement();
            	    	    _fsp--;
            	    	    if (failed) return value;

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( input.LA(1)==RBRAC||input.LA(1)==44 ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_switchstatement1355);    throw mse;
            }

            if ( backtracking==0 ) {
              value ="";
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 29, switchstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end switchstatement


    // $ANTLR start withstatement
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:173:1: withstatement returns [String value] : 'with' e= expression s= statement ;
    public final String withstatement() throws RecognitionException {
        String value = null;
        int withstatement_StartIndex = input.index();
        expression_return e = null;

        String s = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:174:1: ( 'with' e= expression s= statement )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:174:3: 'with' e= expression s= statement
            {
            match(input,81,FOLLOW_81_in_withstatement1375); if (failed) return value;
            pushFollow(FOLLOW_expression_in_withstatement1380);
            e=expression();
            _fsp--;
            if (failed) return value;
            pushFollow(FOLLOW_statement_in_withstatement1385);
            s=statement();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.withstatement(e.value,s);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 30, withstatement_StartIndex); }
        }
        return value;
    }
    // $ANTLR end withstatement


    // $ANTLR start assignment
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:177:1: assignment returns [String value] : valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression ;
    public final String assignment() throws RecognitionException {
        String value = null;
        int assignment_StartIndex = input.index();
        Token op=null;
        variable_return valuee = null;

        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:178:1: (valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:178:4: valuee= variable op= ( '=' | ':=' | '+=' | '-=' | '*=' | '/=' | '|=' | '&=' | '^=' ) e= expression
            {
            pushFollow(FOLLOW_variable_in_assignment1403);
            valuee=variable();
            _fsp--;
            if (failed) return value;
            op=(Token)input.LT(1);
            if ( input.LA(1)==EQUALS||input.LA(1)==68||(input.LA(1)>=82 && input.LA(1)<=88) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment1407);    throw mse;
            }

            pushFollow(FOLLOW_expression_in_assignment1430);
            e=expression();
            _fsp--;
            if (failed) return value;
            if ( backtracking==0 ) {
              value = pc.assignmentstatement(input.toString(valuee.start,valuee.stop),op.getText(),e.value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 31, assignment_StartIndex); }
        }
        return value;
    }
    // $ANTLR end assignment

    public static class variable_return extends ParserRuleReturnScope {
        public String value;
    };

    // $ANTLR start variable
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:181:1: variable returns [String value] : (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ( '.' ( array | ( WORD ) ) )* ;
    public final variable_return variable() throws RecognitionException {
        variable_return retval = new variable_return();
        retval.start = input.LT(1);
        int variable_StartIndex = input.index();
        Token valuee=null;
        String a = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:1: ( (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ( '.' ( array | ( WORD ) ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) ) ( '.' ( array | ( WORD ) ) )*
            {
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==WORD||(LA42_0>=OIVAR && LA42_0<=GLOBALVAR)) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==90) ) {
                    alt42=1;
                }
                else if ( (LA42_1==EOF||(LA42_1>=PLUS && LA42_1<=LTE)||(LA42_1>=JAVACODE && LA42_1<=GLOBALVAR)||(LA42_1>=36 && LA42_1<=89)||LA42_1==91) ) {
                    alt42=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("182:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("182:4: (a= array | valuee= ( WORD | OIVAR | GLOBALVAR ) )", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:5: a= array
                    {
                    pushFollow(FOLLOW_array_in_variable1449);
                    a=array();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) {
                      retval.value = pc.variable(a);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:46: valuee= ( WORD | OIVAR | GLOBALVAR )
                    {
                    valuee=(Token)input.LT(1);
                    if ( input.LA(1)==WORD||(input.LA(1)>=OIVAR && input.LA(1)<=GLOBALVAR) ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_variable1454);    throw mse;
                    }

                    if ( backtracking==0 ) {
                      retval.value = pc.variable(valuee.getText());
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:115: ( '.' ( array | ( WORD ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==89) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:116: '.' ( array | ( WORD ) )
            	    {
            	    match(input,89,FOLLOW_89_in_variable1466); if (failed) return retval;
            	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:120: ( array | ( WORD ) )
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==WORD) ) {
            	        int LA43_1 = input.LA(2);

            	        if ( (LA43_1==90) ) {
            	            alt43=1;
            	        }
            	        else if ( (LA43_1==EOF||(LA43_1>=PLUS && LA43_1<=LTE)||(LA43_1>=JAVACODE && LA43_1<=GLOBALVAR)||(LA43_1>=36 && LA43_1<=89)||LA43_1==91) ) {
            	            alt43=2;
            	        }
            	        else {
            	            if (backtracking>0) {failed=true; return retval;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("182:120: ( array | ( WORD ) )", 43, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( ((LA43_0>=OIVAR && LA43_0<=GLOBALVAR)) ) {
            	        alt43=1;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("182:120: ( array | ( WORD ) )", 43, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:121: array
            	            {
            	            pushFollow(FOLLOW_array_in_variable1469);
            	            array();
            	            _fsp--;
            	            if (failed) return retval;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:127: ( WORD )
            	            {
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:127: ( WORD )
            	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:182:128: WORD
            	            {
            	            match(input,WORD,FOLLOW_WORD_in_variable1472); if (failed) return retval;

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 32, variable_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end variable


    // $ANTLR start function
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:185:1: function returns [String value] : n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function() throws RecognitionException {
        String value = null;
        int function_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:1: (n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:3: n= WORD '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            n=(Token)input.LT(1);
            match(input,WORD,FOLLOW_WORD_in_function1492); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function1494); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:14: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==MINUS||LA47_0==LPAREN||(LA47_0>=WORD && LA47_0<=GLOBALVAR)||(LA47_0>=52 && LA47_0<=53)||LA47_0==61) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:15: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function1499);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e.value;
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:49: ( ( ',' ) (e= expression )? )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==42) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:50: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:50: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:51: ','
                    	    {
                    	    match(input,42,FOLLOW_42_in_function1505); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:56: (e= expression )?
                    	    int alt45=2;
                    	    int LA45_0 = input.LA(1);

                    	    if ( (LA45_0==MINUS||LA45_0==LPAREN||(LA45_0>=WORD && LA45_0<=GLOBALVAR)||(LA45_0>=52 && LA45_0<=53)||LA45_0==61) ) {
                    	        alt45=1;
                    	    }
                    	    switch (alt45) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:186:57: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function1511);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            if ( backtracking==0 ) {
                    	              value += ", "+e.value;
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function1520); if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.functionstatement(n.getText(), value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 33, function_StartIndex); }
        }
        return value;
    }
    // $ANTLR end function


    // $ANTLR start function2
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:189:1: function2 returns [String value] : n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' ;
    public final String function2() throws RecognitionException {
        String value = null;
        int function2_StartIndex = input.index();
        Token n=null;
        expression_return e = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:2: (n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:4: n= OIVAR '(' (e= expression ( ( ',' ) (e= expression )? )* )? ')'
            {
            n=(Token)input.LT(1);
            match(input,OIVAR,FOLLOW_OIVAR_in_function21538); if (failed) return value;
            match(input,LPAREN,FOLLOW_LPAREN_in_function21540); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:16: (e= expression ( ( ',' ) (e= expression )? )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==MINUS||LA50_0==LPAREN||(LA50_0>=WORD && LA50_0<=GLOBALVAR)||(LA50_0>=52 && LA50_0<=53)||LA50_0==61) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:17: e= expression ( ( ',' ) (e= expression )? )*
                    {
                    pushFollow(FOLLOW_expression_in_function21545);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = input.toString(e.start,e.stop);
                    }
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:49: ( ( ',' ) (e= expression )? )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==42) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:50: ( ',' ) (e= expression )?
                    	    {
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:50: ( ',' )
                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:51: ','
                    	    {
                    	    match(input,42,FOLLOW_42_in_function21550); if (failed) return value;

                    	    }

                    	    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:56: (e= expression )?
                    	    int alt48=2;
                    	    int LA48_0 = input.LA(1);

                    	    if ( (LA48_0==MINUS||LA48_0==LPAREN||(LA48_0>=WORD && LA48_0<=GLOBALVAR)||(LA48_0>=52 && LA48_0<=53)||LA48_0==61) ) {
                    	        alt48=1;
                    	    }
                    	    switch (alt48) {
                    	        case 1 :
                    	            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:190:57: e= expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_function21556);
                    	            e=expression();
                    	            _fsp--;
                    	            if (failed) return value;
                    	            if ( backtracking==0 ) {
                    	              value += ", "+input.toString(e.start,e.stop);
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_function21565); if (failed) return value;
            if ( backtracking==0 ) {
              value =pc.otherclassfunctionstatement(n.getText(), value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 34, function2_StartIndex); }
        }
        return value;
    }
    // $ANTLR end function2


    // $ANTLR start array
    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:193:1: array returns [String value] : valuee= ( WORD | OIVAR | GLOBALVAR ) '[' (e= expression )? ( ',' e1= expression )? ']' ;
    public final String array() throws RecognitionException {
        String value = null;
        int array_StartIndex = input.index();
        Token valuee=null;
        expression_return e = null;

        expression_return e1 = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 35) ) { return value; }
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:3: (valuee= ( WORD | OIVAR | GLOBALVAR ) '[' (e= expression )? ( ',' e1= expression )? ']' )
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:5: valuee= ( WORD | OIVAR | GLOBALVAR ) '[' (e= expression )? ( ',' e1= expression )? ']'
            {
            valuee=(Token)input.LT(1);
            if ( input.LA(1)==WORD||(input.LA(1)>=OIVAR && input.LA(1)<=GLOBALVAR) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return value;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_array1585);    throw mse;
            }

            match(input,90,FOLLOW_90_in_array1593); if (failed) return value;
            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:39: (e= expression )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==MINUS||LA51_0==LPAREN||(LA51_0>=WORD && LA51_0<=GLOBALVAR)||(LA51_0>=52 && LA51_0<=53)||LA51_0==61) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:40: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_array1598);
                    e=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value =e.value;
                    }

                    }
                    break;

            }

            // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:73: ( ',' e1= expression )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==42) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:194:74: ',' e1= expression
                    {
                    match(input,42,FOLLOW_42_in_array1604); if (failed) return value;
                    pushFollow(FOLLOW_expression_in_array1608);
                    e1=expression();
                    _fsp--;
                    if (failed) return value;
                    if ( backtracking==0 ) {
                      value = e.value + ","+e1.value;
                    }

                    }
                    break;

            }

            match(input,91,FOLLOW_91_in_array1613); if (failed) return value;
            if ( backtracking==0 ) {
              value = pc.array(valuee.getText(),value);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 35, array_StartIndex); }
        }
        return value;
    }
    // $ANTLR end array

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:26: ( method )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:56:26: method
        {
        pushFollow(FOLLOW_method_in_synpred1196);
        method();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred22
    public final void synpred22_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:732: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:64:732: ';'
        {
        match(input,36,FOLLOW_36_in_synpred22340); if (failed) return ;

        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:34: ( ( 'private' | 'var' ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:34: ( 'private' | 'var' )
        {
        if ( (input.LA(1)>=38 && input.LA(1)<=39) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred25381);    throw mse;
        }


        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:77: ( 'final' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:72:77: 'final'
        {
        match(input,40,FOLLOW_40_in_synpred26392); if (failed) return ;

        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred31
    public final void synpred31_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:67: ( 'final' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:76:67: 'final'
        {
        match(input,40,FOLLOW_40_in_synpred31443); if (failed) return ;

        }
    }
    // $ANTLR end synpred31

    // $ANTLR start synpred42
    public final void synpred42_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:35: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:35: variable
        {
        pushFollow(FOLLOW_variable_in_synpred42567);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred42

    // $ANTLR start synpred43
    public final void synpred43_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:118: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:85:118: variable
        {
        pushFollow(FOLLOW_variable_in_synpred43584);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred43

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:89:13: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:89:13: expression
        {
        pushFollow(FOLLOW_expression_in_synpred45618);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred45

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:61: ( elsestatement )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:97:61: elsestatement
        {
        pushFollow(FOLLOW_elsestatement_in_synpred47673);
        elsestatement();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred49
    public final void synpred49_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:5: ( negate )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:5: negate
        {
        pushFollow(FOLLOW_negate_in_synpred49739);
        negate();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred49

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:38: ( relationalExpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:38: relationalExpression
        {
        pushFollow(FOLLOW_relationalExpression_in_synpred50744);
        relationalExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:80: ( pexpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:80: pexpression
        {
        pushFollow(FOLLOW_pexpression_in_synpred51749);
        pexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred52
    public final void synpred52_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:150: ( aexpression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:150: aexpression
        {
        pushFollow(FOLLOW_aexpression_in_synpred52761);
        aexpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred52

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:195: ( ( andexpression | orexpression | xorexpression ) ( expression ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:195: ( andexpression | orexpression | xorexpression ) ( expression )
        {
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:195: ( andexpression | orexpression | xorexpression )
        int alt59=3;
        switch ( input.LA(1) ) {
        case 62:
        case 63:
            {
            alt59=1;
            }
            break;
        case 64:
        case 65:
            {
            alt59=2;
            }
            break;
        case 66:
        case 67:
            {
            alt59=3;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("106:195: ( andexpression | orexpression | xorexpression )", 59, 0, input);

            throw nvae;
        }

        switch (alt59) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:196: andexpression
                {
                pushFollow(FOLLOW_andexpression_in_synpred55771);
                andexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:238: orexpression
                {
                pushFollow(FOLLOW_orexpression_in_synpred55776);
                orexpression();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:281: xorexpression
                {
                pushFollow(FOLLOW_xorexpression_in_synpred55781);
                xorexpression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:322: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:106:323: expression
        {
        pushFollow(FOLLOW_expression_in_synpred55788);
        expression();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred79
    public final void synpred79_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:239: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:239: variable
        {
        pushFollow(FOLLOW_variable_in_synpred791054);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred79

    // $ANTLR start synpred82
    public final void synpred82_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:366: ( WORD )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:366: WORD
        {
        match(input,WORD,FOLLOW_WORD_in_synpred821069); if (failed) return ;

        }
    }
    // $ANTLR end synpred82

    // $ANTLR start synpred93
    public final void synpred93_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:515: ( HEXNUMBER )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:515: HEXNUMBER
        {
        match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred931112); if (failed) return ;

        }
    }
    // $ANTLR end synpred93

    // $ANTLR start synpred94
    public final void synpred94_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:541: ( STRING )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:541: STRING
        {
        match(input,STRING,FOLLOW_STRING_in_synpred941117); if (failed) return ;

        }
    }
    // $ANTLR end synpred94

    // $ANTLR start synpred95
    public final void synpred95_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:611: ( NUMBER )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:611: NUMBER
        {
        match(input,NUMBER,FOLLOW_NUMBER_in_synpred951122); if (failed) return ;

        }
    }
    // $ANTLR end synpred95

    // $ANTLR start synpred96
    public final void synpred96_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:645: ( variable )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:645: variable
        {
        pushFollow(FOLLOW_variable_in_synpred961127);
        variable();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred96

    // $ANTLR start synpred97
    public final void synpred97_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:671: ( DECIMAL )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:671: DECIMAL
        {
        match(input,DECIMAL,FOLLOW_DECIMAL_in_synpred971132); if (failed) return ;

        }
    }
    // $ANTLR end synpred97

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:715: ( STUPIDDECIMAL )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:715: STUPIDDECIMAL
        {
        match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_synpred981137); if (failed) return ;

        }
    }
    // $ANTLR end synpred98

    // $ANTLR start synpred99
    public final void synpred99_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:766: ( WORD )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:766: WORD
        {
        match(input,WORD,FOLLOW_WORD_in_synpred991142); if (failed) return ;

        }
    }
    // $ANTLR end synpred99

    // $ANTLR start synpred100
    public final void synpred100_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:429: ( ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression ) )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:429: ( '!' | EQUALS | EQUALS2 | ':=' | NOT_EQUALS | '<>' | GT | GTE | LT | LTE ) ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )
        {
        if ( (input.LA(1)>=EQUALS && input.LA(1)<=LTE)||input.LA(1)==53||(input.LA(1)>=68 && input.LA(1)<=69) ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred1001082);    throw mse;
        }

        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:488: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )
        int alt60=9;
        switch ( input.LA(1) ) {
        case WORD:
            {
            int LA60_1 = input.LA(2);

            if ( (LA60_1==LPAREN) ) {
                alt60=1;
            }
            else if ( (synpred96()) ) {
                alt60=5;
            }
            else if ( (synpred99()) ) {
                alt60=8;
            }
            else if ( (true) ) {
                alt60=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("143:488: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 60, 1, input);

                throw nvae;
            }
            }
            break;
        case HEXNUMBER:
            {
            int LA60_2 = input.LA(2);

            if ( (synpred93()) ) {
                alt60=2;
            }
            else if ( (true) ) {
                alt60=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("143:488: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 60, 2, input);

                throw nvae;
            }
            }
            break;
        case STRING:
            {
            int LA60_3 = input.LA(2);

            if ( (synpred94()) ) {
                alt60=3;
            }
            else if ( (true) ) {
                alt60=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("143:488: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 60, 3, input);

                throw nvae;
            }
            }
            break;
        case NUMBER:
            {
            int LA60_4 = input.LA(2);

            if ( (synpred95()) ) {
                alt60=4;
            }
            else if ( (true) ) {
                alt60=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("143:488: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 60, 4, input);

                throw nvae;
            }
            }
            break;
        case OIVAR:
        case GLOBALVAR:
            {
            int LA60_5 = input.LA(2);

            if ( (synpred96()) ) {
                alt60=5;
            }
            else if ( (true) ) {
                alt60=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("143:488: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 60, 5, input);

                throw nvae;
            }
            }
            break;
        case DECIMAL:
            {
            int LA60_6 = input.LA(2);

            if ( (synpred97()) ) {
                alt60=6;
            }
            else if ( (true) ) {
                alt60=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("143:488: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 60, 6, input);

                throw nvae;
            }
            }
            break;
        case STUPIDDECIMAL:
            {
            int LA60_7 = input.LA(2);

            if ( (synpred98()) ) {
                alt60=7;
            }
            else if ( (true) ) {
                alt60=9;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("143:488: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 60, 7, input);

                throw nvae;
            }
            }
            break;
        case MINUS:
        case LPAREN:
        case 52:
        case 53:
        case 61:
            {
            alt60=9;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("143:488: ( function | HEXNUMBER | STRING | NUMBER | variable | DECIMAL | STUPIDDECIMAL | WORD | expression )", 60, 0, input);

            throw nvae;
        }

        switch (alt60) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:489: function
                {
                pushFollow(FOLLOW_function_in_synpred1001107);
                function();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:515: HEXNUMBER
                {
                match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_synpred1001112); if (failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:541: STRING
                {
                match(input,STRING,FOLLOW_STRING_in_synpred1001117); if (failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:611: NUMBER
                {
                match(input,NUMBER,FOLLOW_NUMBER_in_synpred1001122); if (failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:645: variable
                {
                pushFollow(FOLLOW_variable_in_synpred1001127);
                variable();
                _fsp--;
                if (failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:671: DECIMAL
                {
                match(input,DECIMAL,FOLLOW_DECIMAL_in_synpred1001132); if (failed) return ;

                }
                break;
            case 7 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:715: STUPIDDECIMAL
                {
                match(input,STUPIDDECIMAL,FOLLOW_STUPIDDECIMAL_in_synpred1001137); if (failed) return ;

                }
                break;
            case 8 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:766: WORD
                {
                match(input,WORD,FOLLOW_WORD_in_synpred1001142); if (failed) return ;

                }
                break;
            case 9 :
                // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:143:787: expression
                {
                pushFollow(FOLLOW_expression_in_synpred1001147);
                expression();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred100

    // $ANTLR start synpred101
    public final void synpred101_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:13: ( expression )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:13: expression
        {
        pushFollow(FOLLOW_expression_in_synpred1011175);
        expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred101

    // $ANTLR start synpred102
    public final void synpred102_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:43: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:147:43: ';'
        {
        match(input,36,FOLLOW_36_in_synpred1021186); if (failed) return ;

        }
    }
    // $ANTLR end synpred102

    // $ANTLR start synpred103
    public final void synpred103_fragment() throws RecognitionException {   
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:166:40: ( ';' )
        // C:\\Users\\Ali.Ali-Laptop\\workspace\\LGJ\\src\\org\\dolphin\\parser\\gscript.g:166:40: ';'
        {
        match(input,36,FOLLOW_36_in_synpred1031297); if (failed) return ;

        }
    }
    // $ANTLR end synpred103

    public final boolean synpred43() {
        backtracking++;
        int start = input.mark();
        try {
            synpred43_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred45() {
        backtracking++;
        int start = input.mark();
        try {
            synpred45_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred82() {
        backtracking++;
        int start = input.mark();
        try {
            synpred82_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred47() {
        backtracking++;
        int start = input.mark();
        try {
            synpred47_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred49() {
        backtracking++;
        int start = input.mark();
        try {
            synpred49_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred101() {
        backtracking++;
        int start = input.mark();
        try {
            synpred101_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred100() {
        backtracking++;
        int start = input.mark();
        try {
            synpred100_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred103() {
        backtracking++;
        int start = input.mark();
        try {
            synpred103_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred102() {
        backtracking++;
        int start = input.mark();
        try {
            synpred102_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred42() {
        backtracking++;
        int start = input.mark();
        try {
            synpred42_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred25() {
        backtracking++;
        int start = input.mark();
        try {
            synpred25_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred26() {
        backtracking++;
        int start = input.mark();
        try {
            synpred26_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred22() {
        backtracking++;
        int start = input.mark();
        try {
            synpred22_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred96() {
        backtracking++;
        int start = input.mark();
        try {
            synpred96_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred97() {
        backtracking++;
        int start = input.mark();
        try {
            synpred97_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred94() {
        backtracking++;
        int start = input.mark();
        try {
            synpred94_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred95() {
        backtracking++;
        int start = input.mark();
        try {
            synpred95_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred93() {
        backtracking++;
        int start = input.mark();
        try {
            synpred93_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred55() {
        backtracking++;
        int start = input.mark();
        try {
            synpred55_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred52() {
        backtracking++;
        int start = input.mark();
        try {
            synpred52_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred79() {
        backtracking++;
        int start = input.mark();
        try {
            synpred79_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred50() {
        backtracking++;
        int start = input.mark();
        try {
            synpred50_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred31() {
        backtracking++;
        int start = input.mark();
        try {
            synpred31_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred98() {
        backtracking++;
        int start = input.mark();
        try {
            synpred98_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred99() {
        backtracking++;
        int start = input.mark();
        try {
            synpred99_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_method_in_classes196 = new BitSet(new long[]{0x000023F000200002L});
    public static final BitSet FOLLOW_field_in_classes201 = new BitSet(new long[]{0x000023F000200002L});
    public static final BitSet FOLLOW_36_in_classes206 = new BitSet(new long[]{0x000023F000200002L});
    public static final BitSet FOLLOW_statement_in_code227 = new BitSet(new long[]{0x0001E89018300402L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_javacode_in_statement252 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_bstatement_in_statement257 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_varstatement_in_statement262 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_returnstatement_in_statement267 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_exitstatement_in_statement272 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ifstatement_in_statement277 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_repeatstatement_in_statement282 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_dostatement_in_statement287 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_whilestatement_in_statement292 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_continuestatement_in_statement297 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_breakstatement_in_statement302 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_forstatement_in_statement307 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_switchstatement_in_statement312 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_withstatement_in_statement317 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function2_in_statement322 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_assignment_in_statement327 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_function_in_statement332 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_statement335 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_statement340 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_JAVACODE_in_javacode359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_field377 = new BitSet(new long[]{0x0000238000200000L});
    public static final BitSet FOLLOW_set_in_field381 = new BitSet(new long[]{0x0000238000200000L});
    public static final BitSet FOLLOW_40_in_field392 = new BitSet(new long[]{0x0000238000200000L});
    public static final BitSet FOLLOW_41_in_field398 = new BitSet(new long[]{0x0000218000200000L});
    public static final BitSet FOLLOW_40_in_field404 = new BitSet(new long[]{0x0000208000200000L});
    public static final BitSet FOLLOW_varstatement_in_field412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_method434 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_38_in_method437 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_40_in_method443 = new BitSet(new long[]{0x0000030000200000L});
    public static final BitSet FOLLOW_41_in_method449 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_40_in_method455 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_WORD_in_method462 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_method464 = new BitSet(new long[]{0x0000000000200200L});
    public static final BitSet FOLLOW_WORD_in_method469 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_42_in_method475 = new BitSet(new long[]{0x0000040000200200L});
    public static final BitSet FOLLOW_WORD_in_method481 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_RPAREN_in_method490 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_bstatement_in_method494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_bstatement512 = new BitSet(new long[]{0x0001F89018300C00L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_bstatement521 = new BitSet(new long[]{0x0001F89018300C00L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_set_in_bstatement526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_varstatement553 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_WORD_in_varstatement557 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_45_in_varstatement561 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement567 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement573 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_varstatement579 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_variable_in_varstatement584 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_assignment_in_varstatement590 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_46_in_returnstatement613 = new BitSet(new long[]{0x203000001FE00122L});
    public static final BitSet FOLLOW_expression_in_returnstatement618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_exitstatement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ifstatement653 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_ifstatement657 = new BitSet(new long[]{0x0003E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_49_in_ifstatement660 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_ifstatement667 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_ifstatement673 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_50_in_elsestatement695 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_51_in_elsestatement698 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_elsestatement702 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_elsestatement711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negate_in_expression739 = new BitSet(new long[]{0xDFC00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_relationalExpression_in_expression744 = new BitSet(new long[]{0xDFC00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_pexpression_in_expression749 = new BitSet(new long[]{0xDFC00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_notexpression_in_expression754 = new BitSet(new long[]{0xDFC00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_aexpression_in_expression761 = new BitSet(new long[]{0xDFC00000000000F2L,0x000000000000000FL});
    public static final BitSet FOLLOW_andexpression_in_expression771 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_orexpression_in_expression776 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_xorexpression_in_expression781 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_expression788 = new BitSet(new long[]{0xC000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_set_in_notexpression807 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_notexpression815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_aexpression833 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_aexpression860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_value882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_value884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_value886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_negate903 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_61_in_negate906 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_negate912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_pexpression929 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_pexpression933 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pexpression935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_andexpression952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orexpression973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_xorexpression994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_relationalExpression1025 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1030 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1036 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_MINUS_in_relationalExpression1039 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1043 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1049 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1054 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1059 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_relationalExpression1064 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1069 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_pexpression_in_relationalExpression1074 = new BitSet(new long[]{0x002000000007F002L,0x0000000000000030L});
    public static final BitSet FOLLOW_set_in_relationalExpression1082 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_function_in_relationalExpression1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_relationalExpression1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_relationalExpression1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_relationalExpression1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_relationalExpression1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_relationalExpression1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_relationalExpression1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_relationalExpression1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_relationalExpression1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_repeatstatement1170 = new BitSet(new long[]{0x2031E8901FF00520L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_expression_in_repeatstatement1175 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_repeatstatement1182 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_repeatstatement1186 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_71_in_breakstatement1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_continuestatement1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_dostatement1234 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_dostatement1238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_dostatement1240 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_dostatement1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_whilestatement1259 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_whilestatement1263 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_whilestatement1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_forstatement1284 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_forstatement1286 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_forstatement1290 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_forstatement1294 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_36_in_forstatement1297 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_forstatement1303 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_forstatement1305 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_forstatement1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_switchstatement1324 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_switchstatement1327 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_set_in_switchstatement1330 = new BitSet(new long[]{0x0000100000000800L,0x000000000000C000L});
    public static final BitSet FOLLOW_78_in_switchstatement1338 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_switchstatement1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_79_in_switchstatement1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_switchstatement1346 = new BitSet(new long[]{0x0001F89018300C00L,0x000000000002FBC0L});
    public static final BitSet FOLLOW_statement_in_switchstatement1349 = new BitSet(new long[]{0x0001F89018300C00L,0x000000000002FBC0L});
    public static final BitSet FOLLOW_set_in_switchstatement1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_withstatement1375 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_withstatement1380 = new BitSet(new long[]{0x0001E89018300400L,0x0000000000023BC0L});
    public static final BitSet FOLLOW_statement_in_withstatement1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_assignment1403 = new BitSet(new long[]{0x0000000000001000L,0x0000000001FC0010L});
    public static final BitSet FOLLOW_set_in_assignment1407 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_assignment1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_variable1449 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_set_in_variable1454 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_variable1466 = new BitSet(new long[]{0x0000000018200000L});
    public static final BitSet FOLLOW_array_in_variable1469 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_WORD_in_variable1472 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_WORD_in_function1492 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function1494 = new BitSet(new long[]{0x203000001FE00320L});
    public static final BitSet FOLLOW_expression_in_function1499 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_42_in_function1505 = new BitSet(new long[]{0x203004001FE00320L});
    public static final BitSet FOLLOW_expression_in_function1511 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OIVAR_in_function21538 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_LPAREN_in_function21540 = new BitSet(new long[]{0x203000001FE00320L});
    public static final BitSet FOLLOW_expression_in_function21545 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_42_in_function21550 = new BitSet(new long[]{0x203004001FE00320L});
    public static final BitSet FOLLOW_expression_in_function21556 = new BitSet(new long[]{0x0000040000000200L});
    public static final BitSet FOLLOW_RPAREN_in_function21565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_array1585 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_array1593 = new BitSet(new long[]{0x203004001FE00120L,0x0000000008000000L});
    public static final BitSet FOLLOW_expression_in_array1598 = new BitSet(new long[]{0x0000040000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_42_in_array1604 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_array1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_array1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_synpred1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred22340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred25381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred26392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred31443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred42567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred43584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred45618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsestatement_in_synpred47673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_negate_in_synpred49739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_synpred50744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpression_in_synpred51749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aexpression_in_synpred52761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andexpression_in_synpred55771 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_orexpression_in_synpred55776 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_xorexpression_in_synpred55781 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_expression_in_synpred55788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred791054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred821069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred931112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred941117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred951122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred961127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_synpred971132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_synpred981137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred991142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred1001082 = new BitSet(new long[]{0x203000001FE00120L});
    public static final BitSet FOLLOW_function_in_synpred1001107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_synpred1001112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_synpred1001117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_synpred1001122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred1001127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_in_synpred1001132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STUPIDDECIMAL_in_synpred1001137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_synpred1001142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred1001147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred1011175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred1021186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred1031297 = new BitSet(new long[]{0x0000000000000002L});

}