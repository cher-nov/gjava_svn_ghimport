// $ANTLR 3.0.1 C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g 2008-01-04 21:15:51

package org.gcreator.plugins.platform;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class gscriptLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int COMMENT1=19;
    public static final int T74=74;
    public static final int LT=17;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int LETTER=29;
    public static final int GTE=16;
    public static final int EQUALS=12;
    public static final int EOF=-1;
    public static final int LTE=18;
    public static final int NOT_EQUALS=14;
    public static final int T72=72;
    public static final int T71=71;
    public static final int LPAREN=8;
    public static final int T70=70;
    public static final int T62=62;
    public static final int WORD=21;
    public static final int T63=63;
    public static final int ML_COMMENT=32;
    public static final int T64=64;
    public static final int RPAREN=9;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RBRAC=11;
    public static final int DOC_COMMENT=20;
    public static final int GLOBALVAR=27;
    public static final int PLUS=4;
    public static final int T38=38;
    public static final int T37=37;
    public static final int DIGIT=28;
    public static final int T39=39;
    public static final int COMMENT=31;
    public static final int OIVAR=26;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T61=61;
    public static final int HEXNUMBER=23;
    public static final int T60=60;
    public static final int EQUALS2=13;
    public static final int NUMBER=22;
    public static final int T49=49;
    public static final int WHITESPACE=30;
    public static final int T48=48;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int T43=43;
    public static final int Tokens=89;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int LBRAC=10;
    public static final int T46=46;
    public static final int T45=45;
    public static final int T44=44;
    public static final int T88=88;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T87=87;
    public static final int T50=50;
    public static final int DECIMAL=25;
    public static final int T59=59;
    public static final int GT=15;
    public static final int STRING_DOUBLE=33;
    public static final int STRING_SINGLE=34;
    public static final int DIV=7;
    public static final int T81=81;
    public static final int T52=52;
    public static final int T80=80;
    public static final int T51=51;
    public static final int T83=83;
    public static final int T54=54;
    public static final int T82=82;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int STRING=24;
    public static final int T57=57;
    public gscriptLexer() {;} 
    public gscriptLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g"; }

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:6:6: ( '+' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:6:8: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:7:7: ( '-' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:7:9: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start MULT
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:8:6: ( '*' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:8:8: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MULT

    // $ANTLR start DIV
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:9:5: ( '/' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:9:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:10:8: ( '(' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:10:10: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:11:8: ( ')' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:11:10: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LBRAC
    public final void mLBRAC() throws RecognitionException {
        try {
            int _type = LBRAC;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:12:7: ( '{' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:12:9: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LBRAC

    // $ANTLR start RBRAC
    public final void mRBRAC() throws RecognitionException {
        try {
            int _type = RBRAC;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:13:7: ( '}' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:13:9: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RBRAC

    // $ANTLR start EQUALS
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:14:8: ( '=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:14:10: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUALS

    // $ANTLR start EQUALS2
    public final void mEQUALS2() throws RecognitionException {
        try {
            int _type = EQUALS2;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:15:9: ( '==' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:15:11: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUALS2

    // $ANTLR start NOT_EQUALS
    public final void mNOT_EQUALS() throws RecognitionException {
        try {
            int _type = NOT_EQUALS;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:16:12: ( '!=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:16:14: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT_EQUALS

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:17:4: ( '>' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:17:6: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start GTE
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:18:5: ( '>=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:18:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GTE

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:19:4: ( '<' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:19:6: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start LTE
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:20:5: ( '<=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:20:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LTE

    // $ANTLR start COMMENT1
    public final void mCOMMENT1() throws RecognitionException {
        try {
            int _type = COMMENT1;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:21:10: ( '//' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:21:12: '//'
            {
            match("//"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT1

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:22:5: ( ';' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:22:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:23:5: ( 'public' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:23:7: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:24:5: ( 'private' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:24:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:25:5: ( 'var' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:25:7: 'var'
            {
            match("var"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:26:5: ( 'final' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:26:7: 'final'
            {
            match("final"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:27:5: ( 'static' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:27:7: 'static'
            {
            match("static"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:28:5: ( ',' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:28:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:29:5: ( 'begin' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:29:7: 'begin'
            {
            match("begin"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:30:5: ( 'end' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:30:7: 'end'
            {
            match("end"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:31:5: ( 'globalvar' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:31:7: 'globalvar'
            {
            match("globalvar"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:32:5: ( 'return' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:32:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:33:5: ( 'exit' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:33:7: 'exit'
            {
            match("exit"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:34:5: ( 'if' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:34:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:35:5: ( 'then' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:35:7: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:36:5: ( 'else' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:36:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:37:5: ( 'elsif' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:37:7: 'elsif'
            {
            match("elsif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:38:5: ( 'not' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:38:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:39:5: ( '!' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:39:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:40:5: ( '|' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:40:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:41:5: ( '&' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:41:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:42:5: ( '^' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:42:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:43:5: ( '<<' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:43:7: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:44:5: ( '>>' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:44:7: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:45:5: ( 'div' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:45:7: 'div'
            {
            match("div"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:46:5: ( 'mod' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:46:7: 'mod'
            {
            match("mod"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:47:5: ( '&&' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:47:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:48:5: ( 'and' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:48:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:49:5: ( '||' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:49:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:50:5: ( 'or' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:50:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:51:5: ( '^^' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:51:7: '^^'
            {
            match("^^"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:52:5: ( 'xor' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:52:7: 'xor'
            {
            match("xor"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:5: ( ':=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:53:7: ':='
            {
            match(":="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:54:5: ( 'repeat' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:54:7: 'repeat'
            {
            match("repeat"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:55:5: ( 'break' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:55:7: 'break'
            {
            match("break"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:56:5: ( 'continue' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:56:7: 'continue'
            {
            match("continue"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:5: ( 'do' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:57:7: 'do'
            {
            match("do"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:58:5: ( 'until' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:58:7: 'until'
            {
            match("until"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:5: ( 'while' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:59:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:60:5: ( 'for' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:60:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:5: ( 'switch' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:61:7: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:62:5: ( 'case' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:62:7: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:5: ( 'default' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:63:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:64:5: ( ':' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:64:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:5: ( 'with' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:65:7: 'with'
            {
            match("with"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:5: ( '+=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:66:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:5: ( '-=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:67:7: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:68:5: ( '*=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:68:7: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:5: ( '/=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:69:7: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:5: ( '|=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:70:7: '|='
            {
            match("|="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:71:5: ( '&=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:71:7: '&='
            {
            match("&="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:72:5: ( '^=' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:72:7: '^='
            {
            match("^="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:5: ( '.' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:73:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:74:5: ( '[' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:74:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:5: ( ']' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:75:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:201:8: ( ( DIGIT )+ )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:201:10: ( DIGIT )+
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:201:10: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:201:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start HEXNUMBER
    public final void mHEXNUMBER() throws RecognitionException {
        try {
            int _type = HEXNUMBER;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:204:1: ( '$' ( DIGIT | LETTER )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:204:3: '$' ( DIGIT | LETTER )*
            {
            match('$'); 
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:204:7: ( DIGIT | LETTER )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HEXNUMBER

    // $ANTLR start GLOBALVAR
    public final void mGLOBALVAR() throws RecognitionException {
        try {
            int _type = GLOBALVAR;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:208:1: ( 'global' '.' WORD )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:208:3: 'global' '.' WORD
            {
            match("global"); 

            match('.'); 
            mWORD(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GLOBALVAR

    // $ANTLR start OIVAR
    public final void mOIVAR() throws RecognitionException {
        try {
            int _type = OIVAR;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:210:7: ( WORD '.' WORD )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:210:9: WORD '.' WORD
            {
            mWORD(); 
            match('.'); 
            mWORD(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OIVAR

    // $ANTLR start DECIMAL
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:212:9: ( NUMBER '.' NUMBER )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:212:11: NUMBER '.' NUMBER
            {
            mNUMBER(); 
            match('.'); 
            mNUMBER(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DECIMAL

    // $ANTLR start WHITESPACE
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:214:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' | '#define' WORD )+ )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:214:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' | '#define' WORD )+
            {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:214:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' | '#define' WORD )+
            int cnt3=0;
            loop3:
            do {
                int alt3=7;
                switch ( input.LA(1) ) {
                case '\t':
                    {
                    alt3=1;
                    }
                    break;
                case ' ':
                    {
                    alt3=2;
                    }
                    break;
                case '\r':
                    {
                    alt3=3;
                    }
                    break;
                case '\n':
                    {
                    alt3=4;
                    }
                    break;
                case '\f':
                    {
                    alt3=5;
                    }
                    break;
                case '#':
                    {
                    alt3=6;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:214:16: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:214:23: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:214:29: '\\r'
            	    {
            	    match('\r'); 

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:214:36: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;
            	case 5 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:214:42: '\\u000C'
            	    {
            	    match('\f'); 

            	    }
            	    break;
            	case 6 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:214:52: '#define' WORD
            	    {
            	    match("#define"); 

            	    mWORD(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHITESPACE

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:216:16: ( '0' .. '9' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:216:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start WORD
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:219:1: ( LETTER ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:219:3: LETTER ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            mLETTER(); 
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:219:10: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WORD

    // $ANTLR start LETTER
    public final void mLETTER() throws RecognitionException {
        try {
            int _type = LETTER;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:222:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:222:10: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LETTER

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:227:3: ( COMMENT1 (~ ( '\\n' | '\\r' ) )* )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:227:5: COMMENT1 (~ ( '\\n' | '\\r' ) )*
            {
            mCOMMENT1(); 
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:227:14: (~ ( '\\n' | '\\r' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:227:15: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             channel=HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start ML_COMMENT
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:233:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:233:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:233:14: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFE')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:233:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ML_COMMENT

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:236:8: ( STRING_DOUBLE | STRING_SINGLE )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("236:1: STRING : ( STRING_DOUBLE | STRING_SINGLE );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:236:10: STRING_DOUBLE
                    {
                    mSTRING_DOUBLE(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:236:24: STRING_SINGLE
                    {
                    mSTRING_SINGLE(); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start STRING_DOUBLE
    public final void mSTRING_DOUBLE() throws RecognitionException {
        try {
            int _type = STRING_DOUBLE;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:240:3: ( '\"' ( '\"' '\"' | ~ ( '\"' ) )* ( '\"' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:240:5: '\"' ( '\"' '\"' | ~ ( '\"' ) )* ( '\"' )
            {
            match('\"'); 
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:241:5: ( '\"' '\"' | ~ ( '\"' ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\"') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='\"') ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='\uFFFE')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:241:7: '\"' '\"'
            	    {
            	    match('\"'); 
            	    match('\"'); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:242:7: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:244:5: ( '\"' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:244:7: '\"'
            {
            match('\"'); 

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING_DOUBLE

    // $ANTLR start STRING_SINGLE
    public final void mSTRING_SINGLE() throws RecognitionException {
        try {
            int _type = STRING_SINGLE;
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:249:5: ( '\\'' ( '\\'' '\\'' | ~ ( '\\'' ) )* ( '\\'' ) )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:249:7: '\\'' ( '\\'' '\\'' | ~ ( '\\'' ) )* ( '\\'' )
            {
            match('\''); 
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:250:5: ( '\\'' '\\'' | ~ ( '\\'' ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\'') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='\'') ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='\uFFFE')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:250:7: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:251:7: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:253:5: ( '\\'' )
            // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:253:7: '\\''
            {
            match('\''); 

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING_SINGLE

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:8: ( PLUS | MINUS | MULT | DIV | LPAREN | RPAREN | LBRAC | RBRAC | EQUALS | EQUALS2 | NOT_EQUALS | GT | GTE | LT | LTE | COMMENT1 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | NUMBER | HEXNUMBER | GLOBALVAR | OIVAR | DECIMAL | WHITESPACE | WORD | LETTER | COMMENT | ML_COMMENT | STRING | STRING_DOUBLE | STRING_SINGLE )
        int alt10=83;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:30: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 6 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:37: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 7 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:44: LBRAC
                {
                mLBRAC(); 

                }
                break;
            case 8 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:50: RBRAC
                {
                mRBRAC(); 

                }
                break;
            case 9 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:56: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 10 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:63: EQUALS2
                {
                mEQUALS2(); 

                }
                break;
            case 11 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:71: NOT_EQUALS
                {
                mNOT_EQUALS(); 

                }
                break;
            case 12 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:82: GT
                {
                mGT(); 

                }
                break;
            case 13 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:85: GTE
                {
                mGTE(); 

                }
                break;
            case 14 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:89: LT
                {
                mLT(); 

                }
                break;
            case 15 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:92: LTE
                {
                mLTE(); 

                }
                break;
            case 16 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:96: COMMENT1
                {
                mCOMMENT1(); 

                }
                break;
            case 17 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:105: T35
                {
                mT35(); 

                }
                break;
            case 18 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:109: T36
                {
                mT36(); 

                }
                break;
            case 19 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:113: T37
                {
                mT37(); 

                }
                break;
            case 20 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:117: T38
                {
                mT38(); 

                }
                break;
            case 21 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:121: T39
                {
                mT39(); 

                }
                break;
            case 22 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:125: T40
                {
                mT40(); 

                }
                break;
            case 23 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:129: T41
                {
                mT41(); 

                }
                break;
            case 24 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:133: T42
                {
                mT42(); 

                }
                break;
            case 25 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:137: T43
                {
                mT43(); 

                }
                break;
            case 26 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:141: T44
                {
                mT44(); 

                }
                break;
            case 27 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:145: T45
                {
                mT45(); 

                }
                break;
            case 28 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:149: T46
                {
                mT46(); 

                }
                break;
            case 29 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:153: T47
                {
                mT47(); 

                }
                break;
            case 30 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:157: T48
                {
                mT48(); 

                }
                break;
            case 31 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:161: T49
                {
                mT49(); 

                }
                break;
            case 32 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:165: T50
                {
                mT50(); 

                }
                break;
            case 33 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:169: T51
                {
                mT51(); 

                }
                break;
            case 34 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:173: T52
                {
                mT52(); 

                }
                break;
            case 35 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:177: T53
                {
                mT53(); 

                }
                break;
            case 36 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:181: T54
                {
                mT54(); 

                }
                break;
            case 37 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:185: T55
                {
                mT55(); 

                }
                break;
            case 38 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:189: T56
                {
                mT56(); 

                }
                break;
            case 39 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:193: T57
                {
                mT57(); 

                }
                break;
            case 40 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:197: T58
                {
                mT58(); 

                }
                break;
            case 41 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:201: T59
                {
                mT59(); 

                }
                break;
            case 42 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:205: T60
                {
                mT60(); 

                }
                break;
            case 43 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:209: T61
                {
                mT61(); 

                }
                break;
            case 44 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:213: T62
                {
                mT62(); 

                }
                break;
            case 45 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:217: T63
                {
                mT63(); 

                }
                break;
            case 46 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:221: T64
                {
                mT64(); 

                }
                break;
            case 47 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:225: T65
                {
                mT65(); 

                }
                break;
            case 48 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:229: T66
                {
                mT66(); 

                }
                break;
            case 49 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:233: T67
                {
                mT67(); 

                }
                break;
            case 50 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:237: T68
                {
                mT68(); 

                }
                break;
            case 51 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:241: T69
                {
                mT69(); 

                }
                break;
            case 52 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:245: T70
                {
                mT70(); 

                }
                break;
            case 53 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:249: T71
                {
                mT71(); 

                }
                break;
            case 54 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:253: T72
                {
                mT72(); 

                }
                break;
            case 55 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:257: T73
                {
                mT73(); 

                }
                break;
            case 56 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:261: T74
                {
                mT74(); 

                }
                break;
            case 57 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:265: T75
                {
                mT75(); 

                }
                break;
            case 58 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:269: T76
                {
                mT76(); 

                }
                break;
            case 59 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:273: T77
                {
                mT77(); 

                }
                break;
            case 60 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:277: T78
                {
                mT78(); 

                }
                break;
            case 61 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:281: T79
                {
                mT79(); 

                }
                break;
            case 62 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:285: T80
                {
                mT80(); 

                }
                break;
            case 63 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:289: T81
                {
                mT81(); 

                }
                break;
            case 64 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:293: T82
                {
                mT82(); 

                }
                break;
            case 65 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:297: T83
                {
                mT83(); 

                }
                break;
            case 66 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:301: T84
                {
                mT84(); 

                }
                break;
            case 67 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:305: T85
                {
                mT85(); 

                }
                break;
            case 68 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:309: T86
                {
                mT86(); 

                }
                break;
            case 69 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:313: T87
                {
                mT87(); 

                }
                break;
            case 70 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:317: T88
                {
                mT88(); 

                }
                break;
            case 71 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:321: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 72 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:328: HEXNUMBER
                {
                mHEXNUMBER(); 

                }
                break;
            case 73 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:338: GLOBALVAR
                {
                mGLOBALVAR(); 

                }
                break;
            case 74 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:348: OIVAR
                {
                mOIVAR(); 

                }
                break;
            case 75 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:354: DECIMAL
                {
                mDECIMAL(); 

                }
                break;
            case 76 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:362: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 77 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:373: WORD
                {
                mWORD(); 

                }
                break;
            case 78 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:378: LETTER
                {
                mLETTER(); 

                }
                break;
            case 79 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:385: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 80 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:393: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 81 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:404: STRING
                {
                mSTRING(); 

                }
                break;
            case 82 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:411: STRING_DOUBLE
                {
                mSTRING_DOUBLE(); 

                }
                break;
            case 83 :
                // C:\\Users\\Ali.Ali-Laptop\\Documents\\NetBeansProjects\\G-Creator\\Aurora\\src\\org\\gcreator\\plugins\\platform\\gscript.g:1:425: STRING_SINGLE
                {
                mSTRING_SINGLE(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\1\60\1\62\1\64\1\70\4\uffff\1\72\1\74\1\77\1\102\1\uffff"+
        "\4\105\1\uffff\7\105\1\131\1\134\1\137\5\105\1\150\3\105\3\uffff"+
        "\1\156\1\uffff\1\105\11\uffff\1\164\15\uffff\2\105\1\uffff\1\105"+
        "\1\uffff\14\105\1\u0085\2\105\11\uffff\1\105\1\u0089\3\105\1\u008d"+
        "\1\105\2\uffff\5\105\2\uffff\1\u0095\1\uffff\1\u0095\3\uffff\2\105"+
        "\1\u0099\1\u009a\7\105\1\u00a3\3\105\1\uffff\1\105\1\u00a8\1\u00a9"+
        "\1\uffff\1\105\1\u00ab\1\u00ac\1\uffff\1\u00ad\5\105\3\uffff\2\105"+
        "\2\uffff\5\105\1\u00ba\1\105\1\u00bc\1\uffff\3\105\1\u00c0\2\uffff"+
        "\1\105\3\uffff\1\105\1\u00c3\2\105\1\u00c6\2\105\1\u00c9\2\105\1"+
        "\u00cc\1\u00cd\1\uffff\1\u00ce\1\uffff\3\105\1\uffff\2\105\1\uffff"+
        "\1\u00d4\1\u00d5\1\uffff\1\105\1\u00d7\1\uffff\1\u00d8\1\u00d9\3"+
        "\uffff\1\105\1\u00dc\1\u00dd\2\105\2\uffff\1\u00e0\3\uffff\1\105"+
        "\3\uffff\1\u00e3\1\105\1\uffff\1\105\1\u00e6\1\uffff\1\u00e8\1\u00e9"+
        "\1\uffff\1\u00e6\2\uffff";
    static final String DFA10_eofS =
        "\u00ea\uffff";
    static final String DFA10_minS =
        "\1\11\3\75\1\52\4\uffff\3\75\1\74\1\uffff\4\56\1\uffff\7\56\1\75"+
        "\1\46\1\75\5\56\1\75\3\56\3\uffff\1\56\1\uffff\1\56\1\uffff\2\0"+
        "\6\uffff\1\0\15\uffff\2\56\1\uffff\1\56\1\uffff\17\56\11\uffff\7"+
        "\56\2\uffff\5\56\2\uffff\1\42\1\0\1\47\1\0\2\uffff\17\56\1\uffff"+
        "\3\56\1\uffff\3\56\1\uffff\6\56\1\0\1\uffff\1\0\2\56\2\uffff\10"+
        "\56\1\uffff\4\56\2\uffff\1\56\3\uffff\14\56\1\uffff\1\56\1\uffff"+
        "\3\56\1\uffff\2\56\1\uffff\2\56\1\uffff\2\56\1\uffff\2\56\3\uffff"+
        "\5\56\2\uffff\1\56\3\uffff\1\56\1\101\2\uffff\2\56\1\uffff\1\56"+
        "\1\60\1\uffff\2\56\1\uffff\1\60\2\uffff";
    static final String DFA10_maxS =
        "\1\175\4\75\4\uffff\2\75\1\76\1\75\1\uffff\4\172\1\uffff\7\172\1"+
        "\174\1\75\1\136\5\172\1\75\3\172\3\uffff\1\71\1\uffff\1\172\1\uffff"+
        "\2\ufffe\6\uffff\1\ufffe\15\uffff\2\172\1\uffff\1\172\1\uffff\17"+
        "\172\11\uffff\7\172\2\uffff\5\172\2\uffff\1\42\1\ufffe\1\47\1\ufffe"+
        "\2\uffff\17\172\1\uffff\3\172\1\uffff\3\172\1\uffff\6\172\1\ufffe"+
        "\1\uffff\1\ufffe\2\172\2\uffff\10\172\1\uffff\4\172\2\uffff\1\172"+
        "\3\uffff\14\172\1\uffff\1\172\1\uffff\3\172\1\uffff\2\172\1\uffff"+
        "\2\172\1\uffff\2\172\1\uffff\2\172\3\uffff\5\172\2\uffff\1\172\3"+
        "\uffff\2\172\2\uffff\2\172\1\uffff\2\172\1\uffff\2\172\1\uffff\1"+
        "\172\2\uffff";
    static final String DFA10_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\4\uffff\1\21\4\uffff\1\27\23\uffff\1\104"+
        "\1\105\1\106\1\uffff\1\110\1\uffff\1\114\2\uffff\1\75\1\1\1\76\1"+
        "\2\1\77\1\3\1\uffff\1\100\1\120\1\4\1\12\1\11\1\13\1\42\1\47\1\15"+
        "\1\14\1\46\1\17\1\16\2\uffff\1\115\1\uffff\1\112\17\uffff\1\54\1"+
        "\101\1\43\1\52\1\102\1\44\1\56\1\103\1\45\7\uffff\1\60\1\73\5\uffff"+
        "\1\107\1\113\4\uffff\1\20\1\117\17\uffff\1\35\3\uffff\1\64\3\uffff"+
        "\1\55\7\uffff\1\121\3\uffff\1\24\1\67\10\uffff\1\31\4\uffff\1\41"+
        "\1\50\1\uffff\1\51\1\53\1\57\14\uffff\1\34\1\uffff\1\37\3\uffff"+
        "\1\36\2\uffff\1\71\2\uffff\1\74\2\uffff\1\25\2\uffff\1\62\1\30\1"+
        "\40\5\uffff\1\65\1\66\1\uffff\1\22\1\70\1\26\2\uffff\1\33\1\61\2"+
        "\uffff\1\23\2\uffff\1\72\2\uffff\1\111\1\uffff\1\63\1\32";
    static final String DFA10_specialS =
        "\u00ea\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\54\1\uffff\2\54\22\uffff\1\54\1\12\1\55\1\54\1\52\1\uffff"+
            "\1\33\1\56\1\5\1\6\1\3\1\1\1\22\1\2\1\46\1\4\12\51\1\42\1\15"+
            "\1\14\1\11\1\13\2\uffff\32\53\1\47\1\uffff\1\50\1\34\2\uffff"+
            "\1\37\1\23\1\43\1\35\1\24\1\20\1\25\1\53\1\27\3\53\1\36\1\31"+
            "\1\40\1\16\1\53\1\26\1\21\1\30\1\44\1\17\1\45\1\41\2\53\1\7"+
            "\1\32\1\10",
            "\1\57",
            "\1\61",
            "\1\63",
            "\1\67\4\uffff\1\65\15\uffff\1\66",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\73",
            "\1\76\1\75",
            "\1\100\1\101",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\21"+
            "\106\1\103\2\106\1\104\5\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\110\31\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\10"+
            "\106\1\112\5\106\1\111\13\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\114\2\106\1\113\3\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\116\14\106\1\115\10\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\13"+
            "\106\1\120\1\106\1\121\11\106\1\117\2\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\13"+
            "\106\1\122\16\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\123\25\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\5"+
            "\106\1\124\24\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\7"+
            "\106\1\125\22\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\16"+
            "\106\1\126\13\106",
            "\1\130\76\uffff\1\127",
            "\1\132\26\uffff\1\133",
            "\1\136\40\uffff\1\135",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\142\3\106\1\140\5\106\1\141\13\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\16"+
            "\106\1\143\13\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\15"+
            "\106\1\144\14\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\21"+
            "\106\1\145\10\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\16"+
            "\106\1\146\13\106",
            "\1\147",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\152\15\106\1\151\13\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\15"+
            "\106\1\153\14\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\7"+
            "\106\1\154\1\155\21\106",
            "",
            "",
            "",
            "\1\157\1\uffff\12\51",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "\42\161\1\160\uffdc\161",
            "\47\163\1\162\uffd7\163",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\165\1\uffff\2\165\1\uffff\ufff1\165",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\10"+
            "\106\1\166\21\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\106\1\167\30\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\21"+
            "\106\1\170\10\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\21"+
            "\106\1\171\10\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\15"+
            "\106\1\172\14\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\10"+
            "\106\1\173\21\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\174\31\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\175\25\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\6"+
            "\106\1\176\23\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\10"+
            "\106\1\177\21\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\22"+
            "\106\1\u0080\7\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\3"+
            "\106\1\u0081\26\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\16"+
            "\106\1\u0082\13\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\17"+
            "\106\1\u0084\3\106\1\u0083\6\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\u0086\25\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\u0087\6\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\25"+
            "\106\1\u0088\4\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\5"+
            "\106\1\u008a\24\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\3"+
            "\106\1\u008b\26\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\3"+
            "\106\1\u008c\26\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\21"+
            "\106\1\u008e\10\106",
            "",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\15"+
            "\106\1\u008f\14\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\22"+
            "\106\1\u0090\7\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\u0091\6\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\10"+
            "\106\1\u0092\21\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\u0093\6\106",
            "",
            "",
            "\1\u0094",
            "\42\161\1\160\uffdc\161",
            "\1\u0096",
            "\47\163\1\162\uffd7\163",
            "",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\25"+
            "\106\1\u0097\4\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\13"+
            "\106\1\u0098\16\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\u009b\31\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\u009c\6\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\u009d\6\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\u009e\31\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\10"+
            "\106\1\u009f\21\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\u00a0\6\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\u00a2\3\106\1\u00a1\21\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\106\1\u00a4\30\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\24"+
            "\106\1\u00a5\5\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\u00a6\25\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\15"+
            "\106\1\u00a7\14\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\u00aa\31\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\u00ae\6\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\u00af\25\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\10"+
            "\106\1\u00b0\21\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\13"+
            "\106\1\u00b1\16\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\7"+
            "\106\1\u00b2\22\106",
            "\42\161\1\160\uffdc\161",
            "",
            "\47\163\1\162\uffd7\163",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\u00b3\31\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\10"+
            "\106\1\u00b4\21\106",
            "",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\13"+
            "\106\1\u00b5\16\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\2"+
            "\106\1\u00b6\27\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\10"+
            "\106\1\u00b7\21\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\12"+
            "\106\1\u00b8\17\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\15"+
            "\106\1\u00b9\14\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\5"+
            "\106\1\u00bb\24\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\u00bd\31\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\21"+
            "\106\1\u00be\10\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\u00bf\31\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\24"+
            "\106\1\u00c1\5\106",
            "",
            "",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\10"+
            "\106\1\u00c2\21\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\13"+
            "\106\1\u00c4\16\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\u00c5\25\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\u00c7\6\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\2"+
            "\106\1\u00c8\27\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\7"+
            "\106\1\u00ca\22\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\2"+
            "\106\1\u00cb\27\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\13"+
            "\106\1\u00cf\16\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\15"+
            "\106\1\u00d0\14\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\u00d1\6\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\13"+
            "\106\1\u00d2\16\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\15"+
            "\106\1\u00d3\14\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\u00d6\25\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "",
            "",
            "\1\u00db\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff"+
            "\25\106\1\u00da\4\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\23"+
            "\106\1\u00de\6\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\24"+
            "\106\1\u00df\5\106",
            "",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\1"+
            "\u00e1\31\106",
            "\32\u00e2\6\uffff\32\u00e2",
            "",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\4"+
            "\106\1\u00e4\25\106",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\21"+
            "\106\1\u00e5\10\106",
            "\12\u00e7\7\uffff\32\u00e7\4\uffff\1\u00e7\1\uffff\32\u00e7",
            "",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "\1\107\1\uffff\12\106\7\uffff\32\106\4\uffff\1\106\1\uffff\32"+
            "\106",
            "",
            "\12\u00e7\7\uffff\32\u00e7\4\uffff\1\u00e7\1\uffff\32\u00e7",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | LPAREN | RPAREN | LBRAC | RBRAC | EQUALS | EQUALS2 | NOT_EQUALS | GT | GTE | LT | LTE | COMMENT1 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | NUMBER | HEXNUMBER | GLOBALVAR | OIVAR | DECIMAL | WHITESPACE | WORD | LETTER | COMMENT | ML_COMMENT | STRING | STRING_DOUBLE | STRING_SINGLE );";
        }
    }
 

}