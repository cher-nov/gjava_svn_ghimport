// $ANTLR 3.0.1 /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g 2008-07-23 23:19:42

/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.sgcl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class sgclLexer extends Lexer {
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int DEC=31;
    public static final int T74=74;
    public static final int LT=14;
    public static final int T77=77;
    public static final int MOEQUAL=20;
    public static final int T78=78;
    public static final int DCOMMENT=47;
    public static final int MOD=8;
    public static final int STRCONTENT=41;
    public static final int DCMTB=28;
    public static final int BLKEND=24;
    public static final int DCMTE=29;
    public static final int GTE=11;
    public static final int CHAR=38;
    public static final int PLEQUAL=16;
    public static final int SLCOMMENT=45;
    public static final int FLOAT=36;
    public static final int AND=22;
    public static final int EOF=-1;
    public static final int LTE=13;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int TYPE=33;
    public static final int T62=62;
    public static final int WORD=32;
    public static final int T63=63;
    public static final int T64=64;
    public static final int INC=30;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int BLKBEG=23;
    public static final int CMTEND=27;
    public static final int EQUAL=9;
    public static final int DIEQUAL=19;
    public static final int DOUBLE=35;
    public static final int PLUS=4;
    public static final int DIGIT=40;
    public static final int EQUAL2=10;
    public static final int MLCOMMENT=46;
    public static final int T61=61;
    public static final int T60=60;
    public static final int INTEGER=34;
    public static final int NEQUAL=15;
    public static final int CMTBEG=26;
    public static final int CHRCONTENT=42;
    public static final int T49=49;
    public static final int WHITESPACE=43;
    public static final int T48=48;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int Tokens=79;
    public static final int LINE=44;
    public static final int ALPHA=39;
    public static final int MIEQUAL=17;
    public static final int MUEQUAL=18;
    public static final int CMTSL=25;
    public static final int T50=50;
    public static final int OR=21;
    public static final int T59=59;
    public static final int GT=12;
    public static final int DIV=7;
    public static final int T52=52;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int STRING=37;
    public static final int T57=57;
    public sgclLexer() {;} 
    public sgclLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g"; }

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:15:6: ( '+' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:15:8: '+'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:16:7: ( '-' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:16:9: '-'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:17:6: ( '*' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:17:8: '*'
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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:18:5: ( '/' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:18:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIV

    // $ANTLR start MOD
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:19:5: ( '%' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:19:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOD

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:20:7: ( '=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:20:9: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start EQUAL2
    public final void mEQUAL2() throws RecognitionException {
        try {
            int _type = EQUAL2;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:21:8: ( '==' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:21:10: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL2

    // $ANTLR start GTE
    public final void mGTE() throws RecognitionException {
        try {
            int _type = GTE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:22:5: ( '>=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:22:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GTE

    // $ANTLR start GT
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:23:4: ( '>' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:23:6: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GT

    // $ANTLR start LTE
    public final void mLTE() throws RecognitionException {
        try {
            int _type = LTE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:24:5: ( '<=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:24:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LTE

    // $ANTLR start LT
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:25:4: ( '<' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:25:6: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LT

    // $ANTLR start NEQUAL
    public final void mNEQUAL() throws RecognitionException {
        try {
            int _type = NEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:26:8: ( '!=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:26:10: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NEQUAL

    // $ANTLR start PLEQUAL
    public final void mPLEQUAL() throws RecognitionException {
        try {
            int _type = PLEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:27:9: ( '+=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:27:11: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLEQUAL

    // $ANTLR start MIEQUAL
    public final void mMIEQUAL() throws RecognitionException {
        try {
            int _type = MIEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:28:9: ( '-=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:28:11: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MIEQUAL

    // $ANTLR start MUEQUAL
    public final void mMUEQUAL() throws RecognitionException {
        try {
            int _type = MUEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:29:9: ( '*=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:29:11: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MUEQUAL

    // $ANTLR start DIEQUAL
    public final void mDIEQUAL() throws RecognitionException {
        try {
            int _type = DIEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:30:9: ( '/=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:30:11: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIEQUAL

    // $ANTLR start MOEQUAL
    public final void mMOEQUAL() throws RecognitionException {
        try {
            int _type = MOEQUAL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:31:9: ( '%=' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:31:11: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MOEQUAL

    // $ANTLR start OR
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:32:4: ( '||' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:32:6: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OR

    // $ANTLR start AND
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:33:5: ( '&&' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:33:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end AND

    // $ANTLR start BLKBEG
    public final void mBLKBEG() throws RecognitionException {
        try {
            int _type = BLKBEG;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:34:8: ( '{' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:34:10: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BLKBEG

    // $ANTLR start BLKEND
    public final void mBLKEND() throws RecognitionException {
        try {
            int _type = BLKEND;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:35:8: ( '}' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:35:10: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end BLKEND

    // $ANTLR start CMTSL
    public final void mCMTSL() throws RecognitionException {
        try {
            int _type = CMTSL;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:36:7: ( '//' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:36:9: '//'
            {
            match("//"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CMTSL

    // $ANTLR start CMTBEG
    public final void mCMTBEG() throws RecognitionException {
        try {
            int _type = CMTBEG;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:37:8: ( '/*' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:37:10: '/*'
            {
            match("/*"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CMTBEG

    // $ANTLR start CMTEND
    public final void mCMTEND() throws RecognitionException {
        try {
            int _type = CMTEND;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:38:8: ( '*/' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:38:10: '*/'
            {
            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CMTEND

    // $ANTLR start DCMTB
    public final void mDCMTB() throws RecognitionException {
        try {
            int _type = DCMTB;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:39:7: ( '/+' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:39:9: '/+'
            {
            match("/+"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DCMTB

    // $ANTLR start DCMTE
    public final void mDCMTE() throws RecognitionException {
        try {
            int _type = DCMTE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:7: ( '+/' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:40:9: '+/'
            {
            match("+/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DCMTE

    // $ANTLR start INC
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:41:5: ( '++' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:41:7: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INC

    // $ANTLR start DEC
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:5: ( '--' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:42:7: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DEC

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:43:5: ( 'using' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:43:7: 'using'
            {
            match("using"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:5: ( '.' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:44:7: '.'
            {
            match('.'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:5: ( ';' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:45:7: ';'
            {
            match(';'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:5: ( 'partial' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:46:7: 'partial'
            {
            match("partial"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:47:5: ( 'class' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:47:7: 'class'
            {
            match("class"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:5: ( 'extends' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:48:7: 'extends'
            {
            match("extends"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:49:5: ( ',' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:49:7: ','
            {
            match(','); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:5: ( 'static' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:50:7: 'static'
            {
            match("static"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:5: ( 'final' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:51:7: 'final'
            {
            match("final"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:5: ( 'this' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:52:7: 'this'
            {
            match("this"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:5: ( '(' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:53:7: '('
            {
            match('('); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:5: ( ')' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:54:7: ')'
            {
            match(')'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:5: ( 'super' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:55:7: 'super'
            {
            match("super"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:5: ( 'null' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:56:7: 'null'
            {
            match("null"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:5: ( 'continue' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:57:7: 'continue'
            {
            match("continue"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:5: ( 'break' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:58:7: 'break'
            {
            match("break"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:59:5: ( 'return' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:59:7: 'return'
            {
            match("return"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:5: ( 'if' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:60:7: 'if'
            {
            match("if"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:5: ( 'else' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:61:7: 'else'
            {
            match("else"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:5: ( 'while' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:62:7: 'while'
            {
            match("while"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:63:5: ( 'do' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:63:7: 'do'
            {
            match("do"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:5: ( 'for' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:64:7: 'for'
            {
            match("for"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:5: ( 'switch' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:65:7: 'switch'
            {
            match("switch"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:5: ( 'case' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:66:7: 'case'
            {
            match("case"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:5: ( ':' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:67:7: ':'
            {
            match(':'); 

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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:5: ( 'default' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:68:7: 'default'
            {
            match("default"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:5: ( 'true' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:69:7: 'true'
            {
            match("true"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:5: ( 'false' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:70:7: 'false'
            {
            match("false"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:5: ( 'public' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:71:7: 'public'
            {
            match("public"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:5: ( 'protected' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:72:7: 'protected'
            {
            match("protected"); 


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
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:5: ( 'private' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:73:7: 'private'
            {
            match("private"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start WORD
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:136:6: ( ALPHA ( ALPHA | DIGIT )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:136:8: ALPHA ( ALPHA | DIGIT )*
            {
            mALPHA(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:136:14: ( ALPHA | DIGIT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
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
            	    break loop1;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WORD

    // $ANTLR start TYPE
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:6: ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD ( '<' TYPE ( ',' TYPE )* '>' )? ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 'i':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='n') ) {
                    int LA4_8 = input.LA(3);

                    if ( (LA4_8=='t') ) {
                        alt4=1;
                    }
                    else {
                        alt4=7;}
                }
                else {
                    alt4=7;}
                }
                break;
            case 'f':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='l') ) {
                    int LA4_9 = input.LA(3);

                    if ( (LA4_9=='o') ) {
                        int LA4_15 = input.LA(4);

                        if ( (LA4_15=='a') ) {
                            int LA4_20 = input.LA(5);

                            if ( (LA4_20=='t') ) {
                                alt4=2;
                            }
                            else {
                                alt4=7;}
                        }
                        else {
                            alt4=7;}
                    }
                    else {
                        alt4=7;}
                }
                else {
                    alt4=7;}
                }
                break;
            case 'd':
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3=='o') ) {
                    int LA4_10 = input.LA(3);

                    if ( (LA4_10=='u') ) {
                        int LA4_16 = input.LA(4);

                        if ( (LA4_16=='b') ) {
                            int LA4_21 = input.LA(5);

                            if ( (LA4_21=='l') ) {
                                int LA4_26 = input.LA(6);

                                if ( (LA4_26=='e') ) {
                                    alt4=3;
                                }
                                else {
                                    alt4=7;}
                            }
                            else {
                                alt4=7;}
                        }
                        else {
                            alt4=7;}
                    }
                    else {
                        alt4=7;}
                }
                else {
                    alt4=7;}
                }
                break;
            case 'b':
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4=='o') ) {
                    int LA4_11 = input.LA(3);

                    if ( (LA4_11=='o') ) {
                        int LA4_17 = input.LA(4);

                        if ( (LA4_17=='l') ) {
                            int LA4_22 = input.LA(5);

                            if ( (LA4_22=='e') ) {
                                int LA4_27 = input.LA(6);

                                if ( (LA4_27=='a') ) {
                                    int LA4_30 = input.LA(7);

                                    if ( (LA4_30=='n') ) {
                                        alt4=4;
                                    }
                                    else {
                                        alt4=7;}
                                }
                                else {
                                    alt4=7;}
                            }
                            else {
                                alt4=7;}
                        }
                        else {
                            alt4=7;}
                    }
                    else {
                        alt4=7;}
                }
                else {
                    alt4=7;}
                }
                break;
            case 'c':
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5=='h') ) {
                    int LA4_12 = input.LA(3);

                    if ( (LA4_12=='a') ) {
                        int LA4_18 = input.LA(4);

                        if ( (LA4_18=='r') ) {
                            alt4=5;
                        }
                        else {
                            alt4=7;}
                    }
                    else {
                        alt4=7;}
                }
                else {
                    alt4=7;}
                }
                break;
            case 's':
                {
                int LA4_6 = input.LA(2);

                if ( (LA4_6=='t') ) {
                    int LA4_13 = input.LA(3);

                    if ( (LA4_13=='r') ) {
                        int LA4_19 = input.LA(4);

                        if ( (LA4_19=='i') ) {
                            int LA4_24 = input.LA(5);

                            if ( (LA4_24=='n') ) {
                                int LA4_28 = input.LA(6);

                                if ( (LA4_28=='g') ) {
                                    alt4=6;
                                }
                                else {
                                    alt4=7;}
                            }
                            else {
                                alt4=7;}
                        }
                        else {
                            alt4=7;}
                    }
                    else {
                        alt4=7;}
                }
                else {
                    alt4=7;}
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'e':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("137:1: TYPE : ( 'int' | 'float' | 'double' | 'boolean' | 'char' | 'string' | ( WORD ( '<' TYPE ( ',' TYPE )* '>' )? ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:8: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:16: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:26: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:37: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:49: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 6 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:58: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 7 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:69: ( WORD ( '<' TYPE ( ',' TYPE )* '>' )? )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:69: ( WORD ( '<' TYPE ( ',' TYPE )* '>' )? )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:70: WORD ( '<' TYPE ( ',' TYPE )* '>' )?
                    {
                    mWORD(); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:75: ( '<' TYPE ( ',' TYPE )* '>' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='<') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:76: '<' TYPE ( ',' TYPE )* '>'
                            {
                            match('<'); 
                            mTYPE(); 
                            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:86: ( ',' TYPE )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( (LA2_0==',') ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:137:87: ',' TYPE
                            	    {
                            	    match(','); 
                            	    mTYPE(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);

                            match('>'); 

                            }
                            break;

                    }


                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end TYPE

    // $ANTLR start INTEGER
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:139:9: ( ( '-' )? ( DIGIT )+ )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:139:11: ( '-' )? ( DIGIT )+
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:139:11: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:139:11: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:139:16: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:139:17: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INTEGER

    // $ANTLR start DOUBLE
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:9: ( ( '-' )? ( DIGIT )* '.' ( DIGIT )+ )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:11: ( '-' )? ( DIGIT )* '.' ( DIGIT )+
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:11: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='-') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:11: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:16: ( DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:17: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('.'); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:29: ( DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:140:30: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DOUBLE

    // $ANTLR start FLOAT
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:7: ( ( INTEGER | DOUBLE ) ( 'f' | 'F' ) )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:9: ( INTEGER | DOUBLE ) ( 'f' | 'F' )
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:9: ( INTEGER | DOUBLE )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:10: INTEGER
                    {
                    mINTEGER(); 

                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:141:18: DOUBLE
                    {
                    mDOUBLE(); 

                    }
                    break;

            }

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
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
    // $ANTLR end FLOAT

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:8: ( ( '\"' ( STRCONTENT )* '\"' ) | ( '@' '\"' ( options {greedy=false; } : ( . )* ) '\"' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='@') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("142:1: STRING : ( ( '\"' ( STRCONTENT )* '\"' ) | ( '@' '\"' ( options {greedy=false; } : ( . )* ) '\"' ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:10: ( '\"' ( STRCONTENT )* '\"' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:10: ( '\"' ( STRCONTENT )* '\"' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:11: '\"' ( STRCONTENT )* '\"'
                    {
                    match('\"'); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:15: ( STRCONTENT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='\uFFFE')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:15: STRCONTENT
                    	    {
                    	    mSTRCONTENT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:34: ( '@' '\"' ( options {greedy=false; } : ( . )* ) '\"' )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:34: ( '@' '\"' ( options {greedy=false; } : ( . )* ) '\"' )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:35: '@' '\"' ( options {greedy=false; } : ( . )* ) '\"'
                    {
                    match('@'); 
                    match('\"'); 
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:43: ( options {greedy=false; } : ( . )* )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:68: ( . )*
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:68: ( . )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\"') ) {
                            alt12=2;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='\uFFFE')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:142:68: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }

                    match('\"'); 

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start CHAR
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:6: ( '\\'' ( CHRCONTENT )* '\\'' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:8: '\\'' ( CHRCONTENT )* '\\''
            {
            match('\''); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:13: ( CHRCONTENT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='\uFFFE')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:143:13: CHRCONTENT
            	    {
            	    mCHRCONTENT(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHAR

    // $ANTLR start WHITESPACE
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:146:2: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:146:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:146:4: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||(LA15_0>='\f' && LA15_0<='\r')||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHITESPACE

    // $ANTLR start SLCOMMENT
    public final void mSLCOMMENT() throws RecognitionException {
        try {
            int _type = SLCOMMENT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:148:2: ( CMTSL (~ LINE )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:148:4: CMTSL (~ LINE )*
            {
            mCMTSL(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:148:10: (~ LINE )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFE')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:148:11: ~ LINE
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='\uFFFE') ) {
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
            	    break loop16;
                }
            } while (true);

             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SLCOMMENT

    // $ANTLR start MLCOMMENT
    public final void mMLCOMMENT() throws RecognitionException {
        try {
            int _type = MLCOMMENT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:150:2: ( CMTBEG ( options {greedy=false; } : ( . )* ) CMTEND )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:150:4: CMTBEG ( options {greedy=false; } : ( . )* ) CMTEND
            {
            mCMTBEG(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:150:11: ( options {greedy=false; } : ( . )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:150:36: ( . )*
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:150:36: ( . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFE')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFE')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:150:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            mCMTEND(); 
             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MLCOMMENT

    // $ANTLR start DCOMMENT
    public final void mDCOMMENT() throws RecognitionException {
        try {
            int _type = DCOMMENT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:151:9: ( DCMTB ( options {greedy=false; } : ( . )* ) ( DCOMMENT ( options {greedy=false; } : ( . )* ) )* DCMTE )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:151:11: DCMTB ( options {greedy=false; } : ( . )* ) ( DCOMMENT ( options {greedy=false; } : ( . )* ) )* DCMTE
            {
            mDCMTB(); 
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:152:3: ( options {greedy=false; } : ( . )* )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:152:28: ( . )*
            {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:152:28: ( . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='/') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='+') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='*')||(LA18_1>=',' && LA18_1<='\uFFFE')) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0=='+') ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_2>='\u0000' && LA18_2<='.')||(LA18_2>='0' && LA18_2<='\uFFFE')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<='*')||(LA18_0>=',' && LA18_0<='.')||(LA18_0>='0' && LA18_0<='\uFFFE')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:152:28: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:153:3: ( DCOMMENT ( options {greedy=false; } : ( . )* ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='/') ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:153:4: DCOMMENT ( options {greedy=false; } : ( . )* )
            	    {
            	    mDCOMMENT(); 
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:154:3: ( options {greedy=false; } : ( . )* )
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:154:28: ( . )*
            	    {
            	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:154:28: ( . )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0=='+') ) {
            	            int LA19_1 = input.LA(2);

            	            if ( (LA19_1=='/') ) {
            	                alt19=2;
            	            }
            	            else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFE')) ) {
            	                alt19=1;
            	            }


            	        }
            	        else if ( (LA19_0=='/') ) {
            	            int LA19_2 = input.LA(2);

            	            if ( (LA19_2=='+') ) {
            	                alt19=2;
            	            }
            	            else if ( ((LA19_2>='\u0000' && LA19_2<='*')||(LA19_2>=',' && LA19_2<='\uFFFE')) ) {
            	                alt19=1;
            	            }


            	        }
            	        else if ( ((LA19_0>='\u0000' && LA19_0<='*')||(LA19_0>=',' && LA19_0<='.')||(LA19_0>='0' && LA19_0<='\uFFFE')) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:154:28: .
            	    	    {
            	    	    matchAny(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            mDCMTE(); 
             channel = HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DCOMMENT

    // $ANTLR start LINE
    public final void mLINE() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:156:15: ( '\\r' | '\\n' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end LINE

    // $ANTLR start STRCONTENT
    public final void mSTRCONTENT() throws RecognitionException {
        try {
            int _type = STRCONTENT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:158:2: ( (~ ( '\"' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' )
            int alt21=5;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='!')||(LA21_0>='#' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFE')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\\':
                    {
                    alt21=2;
                    }
                    break;
                case 't':
                    {
                    alt21=5;
                    }
                    break;
                case 'n':
                    {
                    alt21=4;
                    }
                    break;
                case '\"':
                    {
                    alt21=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("157:1: STRCONTENT : ( (~ ( '\"' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 21, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("157:1: STRCONTENT : ( (~ ( '\"' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:158:4: (~ ( '\"' | '\\\\' | '\\n' ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:158:4: (~ ( '\"' | '\\\\' | '\\n' ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:158:5: ~ ( '\"' | '\\\\' | '\\n' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:158:23: '\\\\\\\\'
                    {
                    match("\\\\"); 


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:158:30: '\\\\\"'
                    {
                    match("\\\""); 


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:158:36: '\\\\n'
                    {
                    match("\\n"); 


                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:158:42: '\\\\t'
                    {
                    match("\\t"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRCONTENT

    // $ANTLR start CHRCONTENT
    public final void mCHRCONTENT() throws RecognitionException {
        try {
            int _type = CHRCONTENT;
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:160:2: ( (~ ( '\\'' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' )
            int alt22=5;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFE')) ) {
                alt22=1;
            }
            else if ( (LA22_0=='\\') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    alt22=4;
                    }
                    break;
                case '\"':
                    {
                    alt22=3;
                    }
                    break;
                case 't':
                    {
                    alt22=5;
                    }
                    break;
                case '\\':
                    {
                    alt22=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("159:1: CHRCONTENT : ( (~ ( '\\'' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 22, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("159:1: CHRCONTENT : ( (~ ( '\\'' | '\\\\' | '\\n' ) ) | '\\\\\\\\' | '\\\\\"' | '\\\\n' | '\\\\t' );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:160:4: (~ ( '\\'' | '\\\\' | '\\n' ) )
                    {
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:160:4: (~ ( '\\'' | '\\\\' | '\\n' ) )
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:160:5: ~ ( '\\'' | '\\\\' | '\\n' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }


                    }
                    break;
                case 2 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:160:24: '\\\\\\\\'
                    {
                    match("\\\\"); 


                    }
                    break;
                case 3 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:160:31: '\\\\\"'
                    {
                    match("\\\""); 


                    }
                    break;
                case 4 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:160:37: '\\\\n'
                    {
                    match("\\n"); 


                    }
                    break;
                case 5 :
                    // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:160:43: '\\\\t'
                    {
                    match("\\t"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHRCONTENT

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:163:2: ( '0' .. '9' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:163:4: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start ALPHA
    public final void mALPHA() throws RecognitionException {
        try {
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:166:2: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end ALPHA

    public void mTokens() throws RecognitionException {
        // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:8: ( PLUS | MINUS | MULT | DIV | MOD | EQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | OR | AND | BLKBEG | BLKEND | CMTSL | CMTBEG | CMTEND | DCMTB | DCMTE | INC | DEC | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | WORD | TYPE | INTEGER | DOUBLE | FLOAT | STRING | CHAR | WHITESPACE | SLCOMMENT | MLCOMMENT | DCOMMENT | STRCONTENT | CHRCONTENT )
        int alt23=72;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:30: MOD
                {
                mMOD(); 

                }
                break;
            case 6 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:34: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 7 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:40: EQUAL2
                {
                mEQUAL2(); 

                }
                break;
            case 8 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:47: GTE
                {
                mGTE(); 

                }
                break;
            case 9 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:51: GT
                {
                mGT(); 

                }
                break;
            case 10 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:54: LTE
                {
                mLTE(); 

                }
                break;
            case 11 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:58: LT
                {
                mLT(); 

                }
                break;
            case 12 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:61: NEQUAL
                {
                mNEQUAL(); 

                }
                break;
            case 13 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:68: PLEQUAL
                {
                mPLEQUAL(); 

                }
                break;
            case 14 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:76: MIEQUAL
                {
                mMIEQUAL(); 

                }
                break;
            case 15 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:84: MUEQUAL
                {
                mMUEQUAL(); 

                }
                break;
            case 16 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:92: DIEQUAL
                {
                mDIEQUAL(); 

                }
                break;
            case 17 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:100: MOEQUAL
                {
                mMOEQUAL(); 

                }
                break;
            case 18 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:108: OR
                {
                mOR(); 

                }
                break;
            case 19 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:111: AND
                {
                mAND(); 

                }
                break;
            case 20 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:115: BLKBEG
                {
                mBLKBEG(); 

                }
                break;
            case 21 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:122: BLKEND
                {
                mBLKEND(); 

                }
                break;
            case 22 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:129: CMTSL
                {
                mCMTSL(); 

                }
                break;
            case 23 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:135: CMTBEG
                {
                mCMTBEG(); 

                }
                break;
            case 24 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:142: CMTEND
                {
                mCMTEND(); 

                }
                break;
            case 25 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:149: DCMTB
                {
                mDCMTB(); 

                }
                break;
            case 26 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:155: DCMTE
                {
                mDCMTE(); 

                }
                break;
            case 27 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:161: INC
                {
                mINC(); 

                }
                break;
            case 28 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:165: DEC
                {
                mDEC(); 

                }
                break;
            case 29 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:169: T48
                {
                mT48(); 

                }
                break;
            case 30 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:173: T49
                {
                mT49(); 

                }
                break;
            case 31 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:177: T50
                {
                mT50(); 

                }
                break;
            case 32 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:181: T51
                {
                mT51(); 

                }
                break;
            case 33 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:185: T52
                {
                mT52(); 

                }
                break;
            case 34 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:189: T53
                {
                mT53(); 

                }
                break;
            case 35 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:193: T54
                {
                mT54(); 

                }
                break;
            case 36 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:197: T55
                {
                mT55(); 

                }
                break;
            case 37 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:201: T56
                {
                mT56(); 

                }
                break;
            case 38 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:205: T57
                {
                mT57(); 

                }
                break;
            case 39 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:209: T58
                {
                mT58(); 

                }
                break;
            case 40 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:213: T59
                {
                mT59(); 

                }
                break;
            case 41 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:217: T60
                {
                mT60(); 

                }
                break;
            case 42 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:221: T61
                {
                mT61(); 

                }
                break;
            case 43 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:225: T62
                {
                mT62(); 

                }
                break;
            case 44 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:229: T63
                {
                mT63(); 

                }
                break;
            case 45 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:233: T64
                {
                mT64(); 

                }
                break;
            case 46 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:237: T65
                {
                mT65(); 

                }
                break;
            case 47 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:241: T66
                {
                mT66(); 

                }
                break;
            case 48 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:245: T67
                {
                mT67(); 

                }
                break;
            case 49 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:249: T68
                {
                mT68(); 

                }
                break;
            case 50 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:253: T69
                {
                mT69(); 

                }
                break;
            case 51 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:257: T70
                {
                mT70(); 

                }
                break;
            case 52 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:261: T71
                {
                mT71(); 

                }
                break;
            case 53 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:265: T72
                {
                mT72(); 

                }
                break;
            case 54 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:269: T73
                {
                mT73(); 

                }
                break;
            case 55 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:273: T74
                {
                mT74(); 

                }
                break;
            case 56 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:277: T75
                {
                mT75(); 

                }
                break;
            case 57 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:281: T76
                {
                mT76(); 

                }
                break;
            case 58 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:285: T77
                {
                mT77(); 

                }
                break;
            case 59 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:289: T78
                {
                mT78(); 

                }
                break;
            case 60 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:293: WORD
                {
                mWORD(); 

                }
                break;
            case 61 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:298: TYPE
                {
                mTYPE(); 

                }
                break;
            case 62 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:303: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 63 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:311: DOUBLE
                {
                mDOUBLE(); 

                }
                break;
            case 64 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:318: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 65 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:324: STRING
                {
                mSTRING(); 

                }
                break;
            case 66 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:331: CHAR
                {
                mCHAR(); 

                }
                break;
            case 67 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:336: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 68 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:347: SLCOMMENT
                {
                mSLCOMMENT(); 

                }
                break;
            case 69 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:357: MLCOMMENT
                {
                mMLCOMMENT(); 

                }
                break;
            case 70 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:367: DCOMMENT
                {
                mDCOMMENT(); 

                }
                break;
            case 71 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:376: STRCONTENT
                {
                mSTRCONTENT(); 

                }
                break;
            case 72 :
                // /home/luis/NetBeansProjects/SGCL/src/org/gcreator/sgcl/sgcl.g:1:387: CHRCONTENT
                {
                mCHRCONTENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA10_eotS =
        "\5\uffff";
    static final String DFA10_eofS =
        "\5\uffff";
    static final String DFA10_minS =
        "\1\55\2\56\2\uffff";
    static final String DFA10_maxS =
        "\2\71\1\146\2\uffff";
    static final String DFA10_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA10_specialS =
        "\5\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2",
            "\1\3\1\uffff\12\2\14\uffff\1\4\37\uffff\1\4",
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
            return "141:9: ( INTEGER | DOUBLE )";
        }
    }
    static final String DFA23_eotS =
        "\1\uffff\1\55\1\62\1\65\1\72\1\74\1\76\1\100\1\102\3\104\2\uffff"+
        "\1\112\1\115\1\uffff\3\112\1\uffff\3\112\2\uffff\6\112\1\uffff\1"+
        "\112\1\157\1\162\2\104\12\uffff\1\157\5\uffff\1\170\1\172\1\174"+
        "\20\uffff\1\112\1\uffff\1\112\2\uffff\1\177\1\uffff\11\112\1\uffff"+
        "\11\112\2\uffff\4\112\1\u0098\2\112\1\u009c\1\112\20\uffff\1\112"+
        "\1\uffff\17\112\1\u00ae\10\112\1\uffff\3\112\1\uffff\7\112\1\u00c0"+
        "\3\112\1\u00c3\5\112\1\uffff\2\112\1\u00cb\1\u00cc\1\u00cd\6\112"+
        "\1\u00d4\4\112\1\u00d9\1\uffff\2\112\1\uffff\3\112\1\u00df\1\u00e0"+
        "\1\112\1\u00e1\3\uffff\1\u00e2\2\112\1\u00e5\2\112\1\uffff\1\112"+
        "\1\u00e9\2\112\1\uffff\2\112\1\u00ee\1\112\1\u00ef\4\uffff\1\112"+
        "\1\u00f1\1\uffff\2\112\1\u00f3\1\uffff\1\u00f4\2\112\1\u00f7\2\uffff"+
        "\1\112\1\uffff\1\u00f8\2\uffff\1\112\1\u00fa\2\uffff\1\u00fb\2\uffff";
    static final String DFA23_eofS =
        "\u00fc\uffff";
    static final String DFA23_minS =
        "\1\0\1\53\1\55\1\57\1\52\5\75\1\174\1\46\2\uffff\2\60\1\uffff\3"+
        "\60\1\uffff\3\60\2\uffff\6\60\1\uffff\1\60\1\56\1\0\1\42\1\0\3\uffff"+
        "\1\42\6\uffff\1\56\1\60\4\uffff\3\0\20\uffff\1\60\1\uffff\1\60\2"+
        "\uffff\1\60\1\uffff\11\60\1\uffff\11\60\2\uffff\11\60\20\uffff\1"+
        "\60\1\uffff\30\60\1\uffff\3\60\1\uffff\21\60\1\uffff\21\60\1\uffff"+
        "\2\60\1\uffff\7\60\3\uffff\6\60\1\uffff\4\60\1\uffff\5\60\4\uffff"+
        "\2\60\1\uffff\3\60\1\uffff\4\60\2\uffff\1\60\1\uffff\1\60\2\uffff"+
        "\2\60\2\uffff\1\60\2\uffff";
    static final String DFA23_maxS =
        "\1\ufffe\11\75\1\174\1\46\2\uffff\1\172\1\71\1\uffff\3\172\1\uffff"+
        "\3\172\2\uffff\6\172\1\uffff\1\172\1\146\1\ufffe\1\42\1\ufffe\3"+
        "\uffff\1\164\6\uffff\1\146\1\71\4\uffff\3\ufffe\20\uffff\1\172\1"+
        "\uffff\1\172\2\uffff\1\146\1\uffff\11\172\1\uffff\11\172\2\uffff"+
        "\11\172\20\uffff\1\172\1\uffff\30\172\1\uffff\3\172\1\uffff\21\172"+
        "\1\uffff\21\172\1\uffff\2\172\1\uffff\7\172\3\uffff\6\172\1\uffff"+
        "\4\172\1\uffff\5\172\4\uffff\2\172\1\uffff\3\172\1\uffff\4\172\2"+
        "\uffff\1\172\1\uffff\1\172\2\uffff\2\172\2\uffff\1\172\2\uffff";
    static final String DFA23_acceptS =
        "\14\uffff\1\24\1\25\2\uffff\1\37\3\uffff\1\43\3\uffff\1\47\1\50"+
        "\6\uffff\1\65\5\uffff\2\103\1\107\1\uffff\1\32\1\33\1\15\1\1\1\34"+
        "\1\16\2\uffff\1\2\1\17\1\30\1\3\3\uffff\1\20\1\4\1\21\1\5\1\7\1"+
        "\6\1\10\1\11\1\12\1\13\1\14\1\107\1\22\1\23\1\24\1\25\1\uffff\1"+
        "\74\1\uffff\1\75\1\36\1\uffff\1\37\11\uffff\1\43\11\uffff\1\47\1"+
        "\50\11\uffff\1\65\1\76\1\100\1\101\1\110\1\102\4\107\1\31\1\106"+
        "\1\27\1\105\1\26\1\104\1\uffff\1\77\30\uffff\1\56\3\uffff\1\61\21"+
        "\uffff\1\62\21\uffff\1\64\2\uffff\1\57\7\uffff\1\46\1\67\1\52\6"+
        "\uffff\1\35\4\uffff\1\41\5\uffff\1\51\1\45\1\70\1\54\2\uffff\1\60"+
        "\3\uffff\1\71\4\uffff\1\44\1\63\1\uffff\1\55\1\uffff\1\40\1\73\2"+
        "\uffff\1\42\1\66\1\uffff\1\53\1\72";
    static final String DFA23_specialS =
        "\u00fc\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\50\1\46\1\47\1\50\2\46\22\50\1\46\1\11\1\43\2\50\1\5\1\13"+
            "\1\45\1\30\1\31\1\3\1\1\1\24\1\2\1\17\1\4\12\42\1\40\1\20\1"+
            "\10\1\6\1\7\1\50\1\44\32\41\1\50\1\51\2\50\1\41\1\50\1\41\1"+
            "\33\1\22\1\37\1\23\1\26\2\41\1\35\4\41\1\32\1\41\1\21\1\41\1"+
            "\34\1\25\1\27\1\16\1\41\1\36\3\41\1\14\1\12\1\15\uff81\50",
            "\1\53\3\uffff\1\52\15\uffff\1\54",
            "\1\56\1\61\1\uffff\12\60\3\uffff\1\57",
            "\1\64\15\uffff\1\63",
            "\1\67\1\66\3\uffff\1\70\15\uffff\1\71",
            "\1\73",
            "\1\75",
            "\1\77",
            "\1\101",
            "\1\103",
            "\1\105",
            "\1\106",
            "",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\22"+
            "\113\1\111\7\113",
            "\12\116",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\120\20\113\1\122\2\113\1\121\5\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\124\6\113\1\126\3\113\1\123\2\113\1\125\13\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\130\13\113\1\127\2\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\132\1\134\1\113\1\133\3\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\140\7\113\1\135\2\113\1\137\2\113\1\136\13\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\7"+
            "\113\1\141\11\113\1\142\10\113",
            "",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\24"+
            "\113\1\145\5\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\16"+
            "\113\1\147\2\113\1\146\10\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\150\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\5"+
            "\113\1\151\7\113\1\152\14\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\7"+
            "\113\1\153\22\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\155\11\113\1\154\13\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\1\61\1\uffff\12\60\14\uffff\1\160\37\uffff\1\160",
            "\12\161\1\uffff\ufff4\161",
            "\1\161",
            "\12\163\1\uffff\ufff4\163",
            "",
            "",
            "",
            "\1\167\71\uffff\1\166\21\uffff\1\165\5\uffff\1\164",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\61\1\uffff\12\60\14\uffff\1\160\37\uffff\1\160",
            "\12\116",
            "",
            "",
            "",
            "",
            "\uffff\171",
            "\uffff\173",
            "\12\175\1\uffff\2\175\1\uffff\ufff1\175",
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
            "",
            "",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\10"+
            "\113\1\176\21\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            "",
            "\12\116\14\uffff\1\160\37\uffff\1\160",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\21"+
            "\113\1\u0080\10\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\113\1\u0081\30\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\10"+
            "\113\1\u0082\5\113\1\u0083\13\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\u0084\31\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\22"+
            "\113\1\u0085\7\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\15"+
            "\113\1\u0086\14\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\u0087\31\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u0088\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\22"+
            "\113\1\u0089\7\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\u008a\20\113\1\u008b\10\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\10"+
            "\113\1\u008c\21\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\17"+
            "\113\1\u008d\12\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\15"+
            "\113\1\u008e\14\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\21"+
            "\113\1\u008f\10\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\16"+
            "\113\1\u0090\13\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\u0091\16\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\10"+
            "\113\1\u0092\21\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\24"+
            "\113\1\u0093\5\113",
            "",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\u0094\16\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u0095\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\16"+
            "\113\1\u0096\13\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u0097\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u0099\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\10"+
            "\113\1\u009a\21\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\24"+
            "\113\1\u009b\5\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\5"+
            "\113\1\u009d\24\113",
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
            "",
            "",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\15"+
            "\113\1\u009e\14\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u009f\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\u00a0\16\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\25"+
            "\113\1\u00a1\4\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u00a2\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\22"+
            "\113\1\u00a3\7\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00a4\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u00a5\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\21"+
            "\113\1\u00a6\10\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00a7\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00a8\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u00a9\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\10"+
            "\113\1\u00aa\21\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u00ab\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00ac\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\u00ad\31\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\u00af\31\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\22"+
            "\113\1\u00b0\7\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\22"+
            "\113\1\u00b1\7\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00b2\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\u00b3\16\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\u00b4\31\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\u00b5\16\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\24"+
            "\113\1\u00b6\5\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\u00b7\16\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\113\1\u00b8\30\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\u00b9\31\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\6"+
            "\113\1\u00ba\23\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\10"+
            "\113\1\u00bb\21\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\10"+
            "\113\1\u00bc\21\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\u00bd\31\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00be\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\22"+
            "\113\1\u00bf\7\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\10"+
            "\113\1\u00c1\21\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\15"+
            "\113\1\u00c2\14\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\10"+
            "\113\1\u00c4\21\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\15"+
            "\113\1\u00c5\14\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\2"+
            "\113\1\u00c6\27\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\21"+
            "\113\1\u00c7\10\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\u00c8\16\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u00c9\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00ca\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\12"+
            "\113\1\u00ce\17\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00cf\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\21"+
            "\113\1\u00d0\10\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00d1\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\u00d2\16\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\24"+
            "\113\1\u00d3\5\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\u00d5\31\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\2"+
            "\113\1\u00d6\27\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u00d7\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\2"+
            "\113\1\u00d8\27\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\15"+
            "\113\1\u00da\14\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\3"+
            "\113\1\u00db\26\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\2"+
            "\113\1\u00dc\27\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\6"+
            "\113\1\u00dd\23\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\7"+
            "\113\1\u00de\22\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            "",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\1"+
            "\u00e3\31\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\15"+
            "\113\1\u00e4\14\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00e6\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\u00e7\16\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\13"+
            "\113\1\u00e8\16\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00ea\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u00eb\6\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\24"+
            "\113\1\u00ec\5\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\22"+
            "\113\1\u00ed\7\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            "",
            "",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\15"+
            "\113\1\u00f0\14\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\23"+
            "\113\1\u00f2\6\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00f5\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\4"+
            "\113\1\u00f6\25\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\3"+
            "\113\1\u00f9\26\113",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            "",
            "\12\113\2\uffff\1\114\4\uffff\32\113\4\uffff\1\113\1\uffff\32"+
            "\113",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | MOD | EQUAL | EQUAL2 | GTE | GT | LTE | LT | NEQUAL | PLEQUAL | MIEQUAL | MUEQUAL | DIEQUAL | MOEQUAL | OR | AND | BLKBEG | BLKEND | CMTSL | CMTBEG | CMTEND | DCMTB | DCMTE | INC | DEC | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | WORD | TYPE | INTEGER | DOUBLE | FLOAT | STRING | CHAR | WHITESPACE | SLCOMMENT | MLCOMMENT | DCOMMENT | STRCONTENT | CHRCONTENT );";
        }
    }
 

}