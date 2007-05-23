/**
 * Functions.java Provides GML like functions for java!
 * @author G-Java development team (http://www.g-java.com)
 * @version 1.0
 */
package org.gjava.runner;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import javax.swing.*;

import java.util.*;
import org.openide.util.Exceptions;



/**
 * Functions provides GML like functions for java!
 * @author G-Java development team
 * @version 1.0
 */
public class Functions {
    
    private static Clipboard systemClipboard;
    
    
    
    private static Image backImage;
    
    
    
    private static Calendar then;
    
    private static final int dateConvert = 86400000;
    
    /**
     * This is run at the start of the game.
     */
    static {
        Setup_Functions();
        // load_image();
    }
    
    /**
     * <h2>Math Functions</h2>
     * The following functions exist that deal with real numbers. All of these functions require the G-Java api functions. These functions mainly deal with doubles, for more math functions for other data types such as float look into java.lang.Math. Although the G-java API provides more functions for math than java.lang.Math!<br>
     * <br>
     * To use:<br>
     * Functions.math.functionname(args);<br>
     * <br>
     * The code completion in the java editor will bring up a list of functions as soon as you type the "." in math, if not you can manually call code completion using Ctrl+Space.<br>
     * <br>
     * Example:<br>
     * <code>int randomnumber = Functions.math.random(10); //Random number between 0 and 10</code>
     */
    public static class math{
        
        /**
         * The mathematical constant PI to 17 decimal places
         *  @since 2.0
         */
        public static double PI = 3.14159265516355584;
        
        /**
         * The mathematical constant E, the base of the natural logarithms
         */
        public static double E = Math.E;
        
        /**
         * Returns the cube root of a double value. For positive finite x, cbrt(-x) == -cbrt(x); that is, the cube root of a negative value is the negative of the cube root of that value's magnitude.
         *
         * @param x
         * @return
         */
        public static double cbrt(double x){
            return Math.cbrt(x);
        }
        
        /**
         * Returns a random real number between 0 and x. The number is always smaller than x.
         * @param x
         * @return
         */
        public static double random(double x){return Math.random()*x;}
        /**
         * Returns the absolute value of x.
         * @param x
         * @return
         */
        public static double abs(double x){return Math.abs(x);}
        /**
         * Returns the sign of x (-1, 0 or 1).
         * @param x
         * @return
         */
        public static double sign(double x){return (x<0?-1:(x>0?1:0));}
        /**
         * Returns x rounded to the nearest integer.
         * @param x
         * @return
         */
        public static double round(double x){return Math.round(x);}
        
        /**
         * Returns the floor of x, that is, x rounded down to an integer.
         * @param x
         * @return
         */
        public static double floor(double x){return Math.floor(x);}
        /**
         * Returns the ceiling of x, that is, x rounded up to an integer.
         * @param x
         * @return
         */
        public static double ceil(double x){return Math.ceil(x);}
        /**
         * Returns the fractional part of x, that is, the part behind the decimal dot.
         * @param x
         * @return the fractional part of x, that is, the part behind the decimal dot.
         */
        public static double frac(double x){return x-Math.floor(x);}
        /**
         * Returns the square root of x. x must be non-negative.
         * @param x
         * @return the square root of x. x must be non-negative.
         */
        public static double sqrt(double x){return Math.sqrt(x);}
        /**
         * Returns x*x.
         * @param x
         * @return x*x.
         */
        public static double sqr(double x){return x*x;}
        
        /**
         * Returns x to the power n.
         * @param x
         * @param n
         * @return
         */
        public static double power(double x,double n){return Math.pow(x,n);}
        /**
         * Returns e to the power x.
         * @param x
         * @return
         */
        public static double exp(double x){return Math.log(x)/Math.log(Math.E);}
        /**
         * Returns the natural logarithm of x.
         * @param x
         * @return
         */
        public static double ln(double x){return 0;}
        /**
         * Returns the log base 2 of x.
         * @param x
         * @return
         */
        public static double log2(double x){return Math.log(x)/Math.log(2);}
        /**
         * Returns the log base 10 of x.
         * @param x
         * @return
         */
        public static double log10(double x){return Math.log(x);}
        /**
         * Returns the log base n of x.
         * @param n
         * @param x
         * @return
         */
        public static double logn(double n,double x){return Math.log(x)/Math.log(n);}
        /**
         * Returns the sine of x (x in radians).
         * @param x
         * @return
         */
        public static double sin(double x){return Math.sin(x);}
        
        /**
         * Returns the signum function of the argument; zero if the argument is zero, 1.0 if the argument is greater than zero, -1.0 if the argument is less than zero.
         * @param x
         * @return
         */
        public static double signum(double x) {
            return Math.signum(x);
        }
        /**
         * Returns the hyperbolic sine of x
         * @param x
         * @return
         */
        public static double sinh(double x) {
            return Math.sinh(x);
        }
        /**
         * Returns the cosine of x (x in radians).
         * @param x
         * @return
         */
        public static double cos(double x){return Math.cos(x);}
        /**
         * Returns the hyperbolic cosine of x.
         * @param x
         * @return
         */
        public static double cosh(double x) {
            return Math.cosh(x);
        }
        
        /**
         * Returns ex -1.
         * @param x
         * @return
         */
        public static double expm1(double x) {
            return Math.expm1(x);
        }
        
        /**
         * Returns sqrt(x*x +y*y) without intermediate overflow or underflow.
         * @param x
         * @param y
         * @return
         */
        public static double hypot(double x,double y) {
            return Math.hypot(x, x);
        }
        /**
         * Returns the size of an ulp of the argument.
         * @param x
         * @return
         */
        public static double ulp(double x) {
            return Math.ulp(x);
        }
        
        /**
         * Returns the hyperbolic tangent of x
         * @param x
         * @return
         */
        public static double tanh(double x) {
            return Math.tanh(x);
        }
        
        /**
         * Returns the tangent of x (x in radians).
         * @param x
         * @return
         */
        public static double tan(double x){return Math.tan(x);}
        /**
         * Returns the inverse sine of x.
         * @param x
         * @return
         */
        public static double arcsin(double x){return Math.asin(x);}
        /**
         * Returns the inverse cosine of x.
         * @param x
         * @return
         */
        public static double arccos(double x){return Math.acos(x);}
        /**
         * Returns the inverse tangent of x.
         * @param x
         * @return
         */
        public static double arctan(double x){return Math.atan(x);}
        /**
         * Calculates arctan(Y/X), and returns an angle in the correct quadrant.
         * @param y
         * @param x
         * @return
         */
        public static double arctan2(double y,double x){return Math.atan2(y,x);}
        /**
         * Converts degrees to radians.
         * @param x degrees to convert
         * @return radians double value
         */
        public static double degtorad(double x){return Math.toRadians(x);}
        /**
         * Converts radians to degrees.
         * @param x radians to convert
         * @return degrees double value
         */
        public static double radtodeg(double x){return Math.toDegrees(x);}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @return
         */
        public static double min(double v1,double v2){return Math.min(v1,v2);}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @return
         */
        public static double min(double v1,double v2,double v3) {
            return min(v3,min(v1,v2));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4) {
            return min(v4,min(v3,min(v1,v2)));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4,double v5) {
            return min(v5,min(v4,min(v3,min(v1,v2))));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @param v6
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6) {
            return min(v6,min(v5,min(v4,min(v3,min(v1,v2)))));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @param v6
         * @param v7
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7) {
            return min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @param v6
         * @param v7
         * @param v8
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8) {
            return min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))));}
        /**
         * Returns the minimum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @param v3
         * @param v4
         * @param v5
         * @param v6
         * @param v7
         * @param v8
         * @param v9
         * @return
         */
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9) {
            return min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va) {
            return min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb) {
            return min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc) {
            return min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd) {
            return min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve) {
            return min(ve,min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf) {
            return min(vf,min(ve,min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2))))))))))))));}
        public static double min(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf,double vg) {
            return min(vg,min(vf,min(ve,min(vd,min(vc,min(vb,min(va,min(v9,min(v8,min(v7,min(v6,min(v5,min(v4,min(v3,min(v1,v2)))))))))))))));}
        /**
         * Returns the maximum of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @return
         */
        public static double max(double v1,double v2){return Math.max(v1,v2);}
        public static double max(double v1,double v2,double v3) {
            return max(v3,max(v1,v2));}
        public static double max(double v1,double v2,double v3,double v4) {
            return max(v4,max(v3,max(v1,v2)));}
        public static double max(double v1,double v2,double v3,double v4,double v5) {
            return max(v5,max(v4,max(v3,max(v1,v2))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6) {
            return max(v6,max(v5,max(v4,max(v3,max(v1,v2)))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7) {
            return max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8) {
            return max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9) {
            return max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va) {
            return max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb) {
            return max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc) {
            return max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd) {
            return max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve) {
            return max(ve,max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf) {
            return max(vf,max(ve,max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2))))))))))))));}
        public static double max(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf,double vg) {
            return max(vg,max(vf,max(ve,max(vd,max(vc,max(vb,max(va,max(v9,max(v8,max(v7,max(v6,max(v5,max(v4,max(v3,max(v1,v2)))))))))))))));}
        /**
         * Returns the average of the values. The function can have up to 16 arguments.
         * @param v1
         * @param v2
         * @return
         */
        public static double mean(double v1,double v2){return (v1+v2)/2;}
        public static double mean(double v1,double v2,double v3) {
            return (v1+v2+v3)/3;}
        public static double mean(double v1,double v2,double v3,double v4) {
            return (v1+v2+v3+v4)/4;}
        public static double mean(double v1,double v2,double v3,double v4,double v5) {
            return (v1+v2+v3+v4+v5)/5;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6) {
            return (v1+v2+v3+v4+v5+v6)/6;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7) {
            return (v1+v2+v3+v4+v5+v6+v7)/7;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8) {
            return (v1+v2+v3+v4+v5+v6+v7+v8)/8;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9) {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9)/9;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va) {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va)/10;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb) {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb)/11;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc) {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb+vc)/12;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd) {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb+vc+vd)/13;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve) {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb+vc+vd+ve)/14;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf) {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb+vc+vd+ve+vf)/15;}
        public static double mean(double v1,double v2,double v3,double v4,double v5,double v6,double v7,double v8,double v9,double va,double vb,double vc,double vd,double ve,double vf,double vg) {
            return (v1+v2+v3+v4+v5+v6+v7+v8+v9+va+vb+vc+vd+ve+vf+vg)/16;}
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a){
            return a;
        }
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b){
            if(a<b){
                return a;
            } else{
                return b;
            }
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c){
            double[] x = new double[] {a, b, c};
            Arrays.sort(x);
            return x[1];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d){
            double[] x = new double[] {a, b, c, d};
            Arrays.sort(x);
            return x[1];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e){
            double[] x = new double[] {a, b, c, d, e};
            Arrays.sort(x);
            return x[2];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f){
            double[] x = new double[] {a, b, c, d, e, f};
            Arrays.sort(x);
            return x[2];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g){
            double[] x = new double[] {a, b, c, d, e, f, g};
            Arrays.sort(x);
            return x[3];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h){
            double[] x = new double[] {a, b, c, d, e, f, g , h};
            Arrays.sort(x);
            return x[3];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i};
            Arrays.sort(x);
            return x[4];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j};
            Arrays.sort(x);
            return x[4];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k};
            Arrays.sort(x);
            return x[5];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l};
            Arrays.sort(x);
            return x[5];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m};
            Arrays.sort(x);
            return x[6];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n};
            Arrays.sort(x);
            return x[6];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o};
            Arrays.sort(x);
            return x[7];
        }
        
        /**
         * Returns the median of the values, that is, the middle value. (When the number of arguments is even, the smaller of the two middle values is returned.) The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
            Arrays.sort(x);
            return x[7];
        }
        
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a){
            return a;
        }
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b){
            return (a+b)/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c){
            double[] x = new double[] {a, b, c};
            Arrays.sort(x);
            return x[1];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d){
            double[] x = new double[] {a, b, c, d};
            Arrays.sort(x);
            return (x[1]+x[2])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e){
            double[] x = new double[] {a, b, c, d, e};
            Arrays.sort(x);
            return x[2];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f){
            double[] x = new double[] {a, b, c, d, e, f};
            Arrays.sort(x);
            return (x[2]+x[3])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g){
            double[] x = new double[] {a, b, c, d, e, f, g};
            Arrays.sort(x);
            return x[3];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h){
            double[] x = new double[] {a, b, c, d, e, f, g , h};
            Arrays.sort(x);
            return (x[3]+x[4])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i};
            Arrays.sort(x);
            return x[4];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j};
            Arrays.sort(x);
            return (x[4]+x[5])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k};
            Arrays.sort(x);
            return x[5];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l};
            Arrays.sort(x);
            return (x[5]+x[6])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m};
            Arrays.sort(x);
            return x[6];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n};
            Arrays.sort(x);
            return (x[6]+x[7])/2;
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @param b
         * @param c
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o};
            Arrays.sort(x);
            return x[7];
        }
        
        /**
         * Returns the true median of the values (based on mean rather than min), that is, the middle value. The function can have up to 16 arguments. They must all be real values.
         * @param a
         * @param b
         * @param c
         * @param d
         * @param e
         * @param f
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public double EGML_true_median(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j, double k, double l, double m, double n, double o, double p){
            double[] x = new double[] {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
            Arrays.sort(x);
            return (x[7]+x[8])/2;
        }
        
        
        /**
         * Returns the distance between point (x1,y1) and point (x2,y2).
         * @param x1
         * @param y1
         * @param x2
         * @param y2
         * @return
         */
        public static double point_distance(double x1,double y1,double x2,double y2){return Math.sqrt(sqr(x2-x1)+sqr(y2-y1));}
        /**
         * Returns the direction from point (x1,y1) toward point (x2,y2) in degrees.
         * @param x1
         * @param y1
         * @param x2
         * @param y2
         * @return
         */
        public static double point_direction(double x1,double y1,double x2,double y2) {
            if (y1<y2&&x1==x2)
                return 90;
            else if (y1>y2&&x1==x2)
                return 270;
            double basic = Math.atan((y1-y2)/(x1-x2));
            if (x1<x2&&y1>y2)
                return basic;
            else if (x1>x2&&y1>y2)
                return 90+basic;
            else if (x1>x2&&y1<y2)
                return basic-180;
            else
                return 360+basic;
        }
        
        /**
         * Always returns true, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_string(String a){ return true; }
        
        /**
         * Always returns false, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_string(double a){ return false; }
        /**
         * Always returns false, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_string(boolean a){ return false; }
        
        /**
         * Always returns false, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_real(String a){ return false; }
        /**
         * Always returns true, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_real(double a){ return true; }
        /**
         * Always returns true, used for compatibility with GM.
         * @param a
         * @return
         * @since 2.0
         * @author luiscubal
         */
        public static boolean is_real(boolean a){ return false; }
        
        
        /**
         * Returns the horizontal x-component of the vector determined by the indicated length and direction.
         * @param len
         * @param dir
         * @return length
         * @author ChIkEn AtE mY dOnUtS
         */
        public static double lengthdir_x(double len, double dir){
            return len * cos(dir);
        }
        /**
         * Returns the vertical y-component of the vector determined by the indicated length and direction.
         * @param len
         * @param dir
         * @return
         * @author ChIkEn AtE mY dOnUtS
         */
        public static double lengthdir_y(double len,double dir){
            return len * sin(dir);
        }
    }
    
    /**
     * <h2>String Functions</h2>
     * <p>The following functions deal with characters and string. </p>
     * <p>To use:<br>
     * Functions.string.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after string, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * String ascivalue = Functions.string.chr(40);</p>
     */
    public static class string{
        // String functions
        /**
         * Returns a string containing the character with asci code val.
         * @param v
         * @return
         */
        public static String chr(double v) {
            return "" + (char) (int) v;
        }
        
        /**
         *  Returns the asci code of the first character in str.
         * @param s
         * @return
         */
        public static double ord(String s) {
            return (int) s.charAt(0);
        }
        
        /**
         * Turns str into a real number. str can contain a minus sign, a decimal dot and even an exponential part.
         * @param s
         * @return
         */
        public static double real(String s) {
            return Double.parseDouble(s);
        }
        
        /**
         * Turns the real value into a string using a standard format (no decimal places when it is an integer, and two decimal places otherwise).
         * @param v
         * @return
         */
        public static String string(double v) {
            return "" + v;
        }
        
        /**
         * Turns val into a string using your own format: tot indicates the total number of places and dec indicated the number of decimal places.
         * @param v
         * @param t
         * @param d
         * @return
         */
        public static String string_format(double v,double t,double d) {
            String form = "";
            for (int i = 0; i < (int) t; i++)
                form += "0";
            if (d > 0) {
                form += ".";
                for (int i = 0; i < (int) d; i++)
                    form += "0";
            }
            DecimalFormat df = new DecimalFormat(form);
            return df.format(v,new StringBuffer(),null).toString();
        }
        
        /**
         * Returns the number of characters in the string.
         * @param s
         * @return
         */
        public static double string_length(String s) {
            return s.length();
        }
        
        /**
         * Returns the position of substr in str (0=no occurrence).
         * @param sub
         * @param s
         * @return
         */
        public static double string_pos(String sub,String s) {
            return (s.indexOf(sub) != -1 ? s.indexOf(sub) : 0);
        }
        
        /**
         * Returns a substring of str, starting at position index, and of length count.
         * @param s
         * @param i
         * @param c
         * @return
         */
        public static String string_copy(String s,double i,double c) {
            return s.substring((int) i,(int) (i + c));
        }
        
        /**
         * Returns the character in str at position index.
         * @param s
         * @param i
         * @return
         */
        public static String string_char_at(String s,double i) {
            return "" + s.charAt((int) i);
        }
        
        /**
         * Returns a copy of str with the part removed that starts at position index and has length count.
         * @param s
         * @param i
         * @param c
         * @return
         */
        public static String string_delete(String s,double i,double c) {
            return s.substring(0,(int) i) + s.substring((int) (i + c));
        }
        
        /**
         * Returns a copy of str with substr added at position index.
         * @param sub
         * @param s
         * @param i
         * @return
         */
        public static String string_insert(String sub,String s,double i) {
            return s.substring(0,(int) i) + sub + s.substring((int) i + 1);
        }
        
        /**
         * Returns a copy of str with the first occurrence of substr replaced by newstr.
         * @param s
         * @param sub
         * @param n
         * @return
         */
        public static String string_replace(String s,String sub,String n) {
            return s.replaceFirst(sub,n);
        }
        
        /**
         * Returns a copy of str with all occurrences of substr replaced by newstr.
         * @param s
         * @param sub
         * @param n
         * @return
         */
        public static String string_replace_all(String s,String sub,String n) {
            return s.replaceAll(sub,n);
        }
        
        /**
         * Returns the number of occurrences of substr in str.
         * @param sub
         * @param s
         * @return
         */
        public static double string_count(String sub,String s) {
            int c = 0;
            for (c = 0; s.indexOf(sub) != -1; c++)
                s.replaceFirst(sub,"");
            return c;
        }
        
        /**
         * Returns a lowercase copy of str.
         * @param s
         * @return
         */
        public static String string_lower(String s) {
            return s.toLowerCase();
        }
        
        /**
         * Returns an uppercase copy of str.
         * @param s
         * @return
         */
        public static String string_upper(String s) {
            return s.toUpperCase();
        }
        
        /**
         * Returns a string consisting of count copies of str.
         * @param s
         * @param c
         * @return
         */
        public static String string_repeat(String s,double c) {
            for (int i = 0; i < c - 1; i++)
                s += s;
            return s;
        }
        
        /**
         * Returns a string that only contains the letters in str.
         * @param s
         * @return
         */
        public static String string_letters(String s) {
            for (int i = 0; i < s.length(); i++)
                if (((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90)
                || ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122)) {
                } else {
                s.replaceFirst(s.charAt(i) + "","");
                i--;
                }
            return s;
        }
        
        /**
         * Returns a string that only contains the digits in str.
         * @param s
         * @return
         */
        public static String string_digits(String s) {
            for (int i = 0; i < s.length(); i++)
                if ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57) {
                } else {
                s.replaceFirst(s.charAt(i) + "","");
                i--;
                }
            return s;
        }
        
        /**
         * Returns a string that contains the letters and digits in str.
         * @param s
         * @return
         */
        public static String string_lettersdigits(String s) {
            for (int i = 0; i < s.length(); i++)
                if (((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90)
                || ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122)
                || ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)) {
                } else {
                s.replaceFirst(s.charAt(i) + "","");
                i--;
                }
            Functions i = new Functions();
            
            return s;
        }
        
    }
    
    /**
     * <h2>Date Functions</h2>
     * <p>In G-Java there are a number of functions to deal with dates and time. A date-time combination is stored in a real number. The integral part of a date-time value is the number of days that have passed since 12/30/1899. The fractional part of the date-time value is fraction of a 24 hour day that has elapsed. </p>
     * <p>To use:
     * Functions.date.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; in date, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:
     * double datetime = Functions.date.date_current_datetime();</p>
     */
    public static class date{
        // the date functions/methods
        /**
         * Returns the date-time value that corresponds to the current moment.
         * @return
         */
        public static double date_current_datetime() {
            Calendar now = Calendar.getInstance();
            long milis = now.getTime().getTime() - then.getTime().getTime();
            // convert milis to days
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns the date-time value that corresponds to the current date only (ignoring the time).
         * @return
         */
        public static double date_current_date() {
            Calendar now = Calendar.getInstance();
            now.set(Calendar.HOUR_OF_DAY,0);
            now.set(Calendar.MINUTE,0);
            now.set(Calendar.SECOND,0);
            long milis = now.getTime().getTime() - then.getTime().getTime();
            // convert milis to days
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns the date-time value that corresponds to the current time only (ignoring the date).
         * @return
         */
        public static double date_current_time() {
            Calendar now = Calendar.getInstance();
            now.set(Calendar.YEAR,then.get(Calendar.YEAR));
            now.set(Calendar.MONTH,then.get(Calendar.MONTH));
            now.set(Calendar.DATE,then.get(Calendar.DATE));
            long milis = now.getTime().getTime() - then.getTime().getTime();
            // convert milis to days
            return milis / (double) dateConvert;
        }
        
        /**
         * Creates a date-time value corresponding to the indicated date and time.
         * @param y
         * @param m
         * @param d
         * @param h
         * @param min
         * @param s
         * @return
         */
        public static double date_create_datetime(double y,double m,double d,double h,double min,double s) {
            Calendar nDate = Calendar.getInstance();
            nDate.set((int) y,(int) m - 1,(int) d,(int) h,(int) min,(int) s);
            long milis = nDate.getTime().getTime() - then.getTime().getTime();
            return milis / (double) dateConvert;
        }
        
        /**
         * Creates a date-time value corresponding to the indicated date.
         * @param y
         * @param m
         * @param d
         * @return
         */
        public static double date_create_date(double y,double m,double d) {
            Calendar nDate = Calendar.getInstance();
            nDate.set((int) y,(int) m,(int) d,0,0,0);
            long milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Creates a date-time value corresponding to the indicated time.
         * @param h
         * @param m
         * @param s
         * @return
         */
        public static double date_create_time(double h,double m,double s) {
            Calendar nDate = Calendar.getInstance();
            nDate.set(then.get(Calendar.YEAR),then.get(Calendar.MONTH),then.get(Calendar.DATE),(int) h,(int) m,
                    (int) s);
            long milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns whether the indicated date and time are valid.
         * @param y
         * @param m
         * @param d
         * @param h
         * @param min
         * @param s
         * @return
         */
        public static double date_valid_datetime(double y,double m,double d,double h,double min,double s) {
            if (y <= 0 || y >= 10000 || y - Math.floor(y) != 0) return 0;
            if (m <= 0 || m >= 13 || m - Math.floor(m) != 0) return 0;
            if (d - Math.floor(d) != 0) return 0;
            if (d <= 0 || d >= 29) if (m == 2 && y % 4 != 0)
                return 0;
            else if ((m == 4 || m == 6 || m == 9 || m == 11) && d >= 31)
                return 0;
            else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d >= 32) return 0;
            if (h < 0 || h >= 24 || h - Math.floor(h) != 0) return 0;
            if (min < 0 || min >= 60 || min - Math.floor(min) != 0) return 0;
            if (s < 0 || s >= 60 || s - Math.floor(s) != 0) return 0;
            return 1;
        }
        
        /**
         * Returns whether the indicated date is valid.
         * @param y
         * @param m
         * @param d
         * @return
         */
        public static double date_valid_date(double y,double m,double d) {
            if (y <= 0 || y >= 10000 || y - Math.floor(y) != 0) return 0;
            if (m <= 0 || m >= 13 || m - Math.floor(m) != 0) return 0;
            if (d - Math.floor(d) != 0) return 0;
            if (d <= 0 || d >= 29) if (m == 2 && y % 4 != 0)
                return 0;
            else if ((m == 4 || m == 6 || m == 9 || m == 11) && d >= 31)
                return 0;
            else if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d >= 32) return 0;
            return 1;
        }
        
        /**
         * Returns whether the indicated time is valid.
         * @param h
         * @param m
         * @param s
         * @return
         */
        public static double date_valid_time(double h,double m,double s) {
            if (h < 0 || h >= 24 || h - Math.floor(h) != 0) return 0;
            if (m < 0 || m >= 60 || m - Math.floor(m) != 0) return 0;
            if (s < 0 || s >= 60 || s - Math.floor(s) != 0) return 0;
            return 1;
        }
        
        /**
         * Returns a new date that is amount years after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_year(double d,double a) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.YEAR,nDate.get(Calendar.YEAR) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount months after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_month(double d,double a) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.MONTH,nDate.get(Calendar.MONTH) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount weeks after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_week(double d,double a) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.DATE,nDate.get(Calendar.DATE) + 7 * (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount days after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_day(double d,double a) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.DATE,nDate.get(Calendar.DATE) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount hours after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_hour(double d,double a) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.HOUR_OF_DAY,nDate.get(Calendar.HOUR_OF_DAY) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount minutes after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_minute(double d,double a) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.MINUTE,nDate.get(Calendar.MINUTE) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns a new date that is amount seconds after the indicated date. amount must be an integer number.
         * @param d
         * @param a
         * @return
         */
        public static double date_inc_second(double d,double a) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            nDate.set(Calendar.SECOND,nDate.get(Calendar.SECOND) + (int) a);
            milis = nDate.getTime().getTime() - then.getTime().getTime();
            ;
            return milis / (double) dateConvert;
        }
        
        /**
         * Returns the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_year(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.YEAR);
        }
        
        /**
         * Returns the month corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_month(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.MONTH);
        }
        
        /**
         * Returns the week of the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_week(double d) // Figure out week
        {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.DATE);
        }
        
        /**
         * Returns the day of the month corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_day(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.DATE);
        }
        
        /**
         * Returns the hour corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_hour(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.HOUR_OF_DAY);
        }
        
        /**
         * Returns the minute corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_minute(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.MINUTE);
        }
        
        /**
         * Returns the second corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_second(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.SECOND);
        }
        
        /**
         * Returns the day of the week corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_weekday(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.DAY_OF_WEEK);
        }
        
        /**
         * Returns the day of the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_day_of_year(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            int fin = 0;
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.get(Calendar.DAY_OF_YEAR);
        }
        
        /**
         * Returns the hour of the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_hour_of_year(double d) {
            int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            int fin = 0;
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
            for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++)
                fin += days[i];
            int date = nDate.get(Calendar.DATE) + fin - 1;
            return nDate.get(Calendar.HOUR_OF_DAY) + date * 24;
        }
        
        /**
         * Returns the minute of the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_minute_of_year(double d) {
            int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            int fin = 0;
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
            for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++)
                fin += days[i];
            int date = nDate.get(Calendar.DATE) + fin - 1;
            int hour = nDate.get(Calendar.HOUR_OF_DAY) - 1 + date * 24;
            return nDate.get(Calendar.MINUTE) + hour * 60;
        }
        
        /**
         * Returns the second of the year corresponding to the date.
         * @param d
         * @return
         */
        public static double date_get_second_of_year(double d) {
            int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            int fin = 0;
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
            for (int i = 0; i < nDate.get(Calendar.MONTH) - 2; i++)
                fin += days[i];
            int date = nDate.get(Calendar.DATE) + fin - 1;
            int hour = nDate.get(Calendar.HOUR_OF_DAY) - 1 + date * 24;
            int min = nDate.get(Calendar.MINUTE) - 1 + hour * 60;
            return nDate.get(Calendar.SECOND) + min * 60;
        }
        
        /**
         * Returns the number of years between the two dates. It reports incomplete years as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_year_span(double d1,double d2) {
            return d1 * 365.25 - d2 * 365.25;
        }
        
        /**
         * Returns the number of months between the two dates. It reports incomplete months as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_month_span(double d1,double d2) {
            return date_get_month(d1) - date_get_month(d2);
        }
        
        /**
         * Returns the number of weeks between the two dates. It reports incomplete weeks as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_week_span(double d1,double d2) {
            return date_get_week(d1) - date_get_week(d2);
        }
        
        /**
         * Returns the number of days between the two dates. It reports incomplete days as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_day_span(double d1,double d2) {
            return date_get_day(d1) - date_get_day(d2);
        }
        
        /**
         * Returns the number of hours between the two dates. It reports incomplete hours as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_hour_span(double d1,double d2) {
            return date_get_hour(d1) - date_get_hour(d2);
        }
        
        /**
         * Returns the number of minutes between the two dates. It reports incomplete minutes as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_minute_span(double d1,double d2) {
            return date_get_minute(d1) - date_get_minute(d2);
        }
        
        /**
         * Returns the number of seconds between the two dates. It reports incomplete seconds as a fraction.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_second_span(double d1,double d2) {
            return date_get_second(d1) - date_get_second(d2);
        }
        
        /**
         * Compares the two date-time values. Returns -1, 0, or 1 depending on whether the first is smaller, equal, or larger than the second value.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_compare_datetime(double d1,double d2) {
            return (d1 > d2 ? 1 : (d1 < d2 ? -1 : 0));
        }
        
        /**
         * Compares the two date-time values only taking the date part into account. Returns -1, 0, or 1 depending on whether the first is smaller, equal, or larger than the second value.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_compare_date(double d1,double d2) {
            return (Math.floor(d1) > Math.floor(d2) ? 1 : (Math.floor(d1) < Math.floor(d2) ? -1 : 0));
        }
        
        /**
         * Compares the two date-time values only taking the time part into account. Returns -1, 0, or 1 depending on whether the first is smaller, equal, or larger than the second value.
         * @param d1
         * @param d2
         * @return
         */
        public static double date_compare_time(double d1,double d2) {
            return (Functions.math.frac(d1) > Functions.math.frac(d2) ? 1 : (Functions.math.frac(d1) < Functions.math.frac(d2) ? -1 : 0));
        }
        
        /**
         * Returns the date part of the indicated date-time value, setting the time part to 0.
         * @param d
         * @return
         */
        public static double date_date_of(double d) {
            return Math.floor(d);
        }
        
        /**
         * Returns the time part of the indicated date-time value, setting the date part to 0.
         * @param d
         * @return
         */
        public static double date_time_of(double d) {
            return Functions.math.frac(d);
        }
        
        /**
         * Returns a string indicating the given date and time in the default format for the system.
         * @param d
         * @return
         */
        public static String date_datetime_string(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.toString();
        }
        
        /**
         * Returns a string indicating the given date in the default format for the system.
         * @param d
         * @return
         */
        public static String date_date_string(double d) {
            long milis = (int) (Math.floor(d) * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return nDate.toString();
        }
        
        /**
         * Returns a string indicating the given time in the default format for the system.
         * @param d
         * @return
         */
        public static String date_time_string(double d) {
            long milis = (int) (Functions.math.frac(d) * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(milis);
            return nDate.toString();
        }
        
        /**
         * Returns the number of days in the month indicated by the date-time value.
         * @param d
         * @return
         */
        public static double date_days_in_month(double d) {
            int[] days = { 31,28,31,30,31,30,31,31,30,31,30,31 };
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            if (nDate.get(Calendar.YEAR) % 4 == 0) days[1] = 29;
            return days[nDate.get(Calendar.MONTH) - 1];
        }
        
        /**
         * Returns the number of days in the year indicated by the date-time value.
         * @param d
         * @return
         */
        public static double date_days_in_year(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            if (nDate.get(Calendar.YEAR) % 4 == 0)
                return 366;
            else
                return 365;
        }
        
        /**
         * Returns whether the year indicated by the date-time value is a leap year.
         * @param d
         * @return
         */
        public static double date_leap_year(double d) {
            long milis = (int) (d * dateConvert);
            long time = then.getTime().getTime();
            Calendar nDate = Calendar.getInstance();
            nDate.setTimeInMillis(time + milis);
            return (nDate.get(Calendar.YEAR) % 4 == 0 ? 1 : 0);
        }
        
        /**
         * Returns whether the indicated date-time value is on today.
         * @param d
         * @return
         */
        public static double date_is_today(double d) {
            return (date_current_date() == date_date_of(d) ? 1 : 0);
        }
        
    }
    
    /**
     * <h2>Clipboard Functions</h2>
     * <p>The following functions deal with the clipboard for storing text. </p>
     * <p>   To use:<br>
     * Functions.clipboard.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after clipboard, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * String ctext = Functions.clipboard.clipboard_get_text();</p>
     */
    public static class clipboard{
        
        /**
         * Returns whether there is any text on the clipboard.
         * @return
         */
        public static double clipboard_has_text() {
            Transferable clipboardContents = systemClipboard.getContents(null);
            return (clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor) ? 1 : 0);
        }
        
        /**
         * Returns the current text on the clipboard.
         * @return
         */
        public static String clipboard_get_text() {
            Transferable clipboardContents = systemClipboard.getContents(null);
            if (clipboardContents == null) {
                return "";
            } else
                try {
                    if (clipboardContents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                        String returnText = (String) clipboardContents.getTransferData(DataFlavor.stringFlavor);
                        return returnText;
                    }
                } catch (UnsupportedFlavorException ufe) {
                } catch (IOException ioe) {
                }
            return "";
        }
        
        /**
         * Sets the string str on the clipboard.
         * @param s
         * @return
         */
        public static double clipboard_set_text(String s) {
            Transferable transferableText = new StringSelection(s);
            systemClipboard.setContents(transferableText,null);
            return 0;
        }
        
        
    }
    
    /**
     * <h2> Move Functions</h2>
     * <p>There are a large number of functions available that help you in defining your motions in the G-Java API: </p>
     * <p>To use:<br>
     * Functions.move.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after move, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * if (Functions.move.place_free(10,10))<br>
     * {<br>
     * //do some code<br>
     * } </p>
     */
    public static class move{
        
        /**
         * Sets the motion with the given speed in direction dir.
         * @param applies The actor to use
         * @param dir The direction
         * @param speed The speed
         * @author TGMG
         * @since 2.0
         */
        public static void motion_set(Actor applies, double dir, double speed) {
            applies.hspeed = -speed;
            applies.vspeed = speed * Math.sin(dir * (Math.PI/180));
        }
        
        /**
         * Adds the motion to the current motion (as a vector addition).
         * @param applies The actor to use
         * @param dir The direction
         * @param speed The speed
         * @author TGMG
         * @since 2.0
         */
        public static void motion_add(Actor applies, double dir, double speed) {
            applies.hspeed =  applies.hspeed-speed;
            applies.vspeed =  applies.vspeed + speed * Math.sin(dir * (Math.PI/180));
        }
        
        /**
         * Returns whether the instance placed at position (x,y) meets nobody. So this function takes also non-solid instances into account.
         * @param x
         * @param y
         * @return true if place is empty, false otherwise
         */
        public static boolean place_empty(double x,double y) {
            int jii = 0;
            while (jii < basicgame.Current_room.instances.size()) {
                Actor dt = (Actor) basicgame.Current_room.instances.get(jii);
                Rectangle thisBounds = dt.getBounds( dt.x, dt.y);
                
                if (thisBounds.contains(x,y)) {
                    return false;
                } else {
                    jii++;
                }
            }
            return true;
        }
        
        /**
         * Returns whether the instance placed at position(x,y) is collision-free. This is typically used as a check before actually moving to the new position.
         * @param x
         * @param y
         * @return true if place is collision-free, false otherwise
         */
        public static boolean place_free(double x,double y) {
            int jii = 0;
            while (jii < basicgame.Current_room.instances.size()) {
                Actor dt = (Actor) basicgame.Current_room.instances.get(jii);
                Rectangle thisBounds = dt.getBounds((int) dt.x,(int) dt.y);
                
                if ((thisBounds.contains(x,y)) && (dt.solid)) {
                    return false;
                } else {
                    jii++;
                }
            }
            return true;
        }
        
        /**
         * Returns whether the instance placed at position (x,y) meets the other actor.
         * @param x
         * @param y
         * @param other
         * @return
         */
        public static boolean place_meeting(double x, double y, Actor other) {
            int jii = 0;
            while (jii < basicgame.Current_room.instances.size()) {
                Actor dt = (Actor) basicgame.Current_room.instances.get(jii);
                if (dt.equals(other)){
                    Rectangle thisBounds = dt.getBounds((int) dt.x,(int) dt.y);
                    
                    if ((thisBounds.contains(x,y))) {
                        return true;
                    } else {
                        jii++;
                    }
                }
            }
            return false;
        }
        
        /**
         * Returns whether the instance is aligned with the snapping values.
         * @param instance
         * @param hsnap
         * @param vsnap
         * @return
         */
        public static boolean place_snapped(Actor instance, double hsnap,double vsnap) {
            if ((instance.x % hsnap ==0) && (instance.y % vsnap==0))
                return true;
            else
                return false;
        }
        
        /**
         * Moves the instance to a free random, snapped position, like the corresponding action.
         * @param instance
         * @param snaphor
         * @param snapver
         */
        public static void move_random(Actor instance, double snaphor,double snapver) {
            int xx = (int) Functions.math.random(basicgame.Current_room.get_width());
            int yy = (int)Functions.math.random(basicgame.Current_room.get_height());
            
            if (!(snaphor == 0))
                xx = (int)(xx/snaphor * Functions.math.round(snaphor));
            if (!(snaphor == 0))
                yy = (int)(yy/snaphor * Functions.math.round(snapver));
            while (!Functions.move.place_free(xx,yy)) {
                xx = (int)Functions.math.random(basicgame.Current_room.get_width());
                yy = (int)Functions.math.random(basicgame.Current_room.get_height());
                if (!(snaphor == 0))
                    xx = (int)(xx/snaphor * Functions.math.round(snaphor));
                if (!(snaphor == 0))
                    yy = (int)(yy/snaphor * Functions.math.round(snapver));
            }
            instance.x = xx;
            instance.y = yy;
        }
        
        
        /**
         * Snaps the instance, like the corresponding action.
         * @param instance
         * @param hsnap
         * @param vsnap
         */
        public static void move_snap(Actor instance, double snaphor,double snapver) {
            instance.x = instance.x/snaphor * Functions.math.round(snaphor);
            instance.y = instance.y/snapver * Functions.math.round(snapver);
        }
        
        /**
         * Wraps the instance when it has left the room to the other side. hor indicates whether to wrap horizontaly and vert indicates whether to wrap vertically. margin indicates how far the origin of the instance must be outside the room before the wrap happens. So it is a margin around the room. You typically use this function in the Outside event.
         * @param instance
         * @param hor
         * @param vert
         * @param margin
         */
        public static void move_wrap(Actor instance, boolean hor, boolean vert, double margin) {
            //TODO move_wrap
        }
        
        /**
         * Moves the instances with speed sp toward position (x,y).
         * @param instance
         * @param x
         * @param y
         * @param speed
         */
        public static void move_towards_point(Actor instance, double x, double y, double speed) {
            //TODO move_towards_point
        }
        
    }
    
    /**
     * <h2>Instances</h2>
     * <p>In the game, the basic units are the instances of the different actors. During   game play you can change a number of aspects of these instances. Also you can   create new instances and destroy instances.
     * <p>To use:<br>
     * Functions.instance.&lt;functionname&gt;(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after instance, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     *
     */
    public static class instance{
        /**
         * Number of instances that currently exist in the room.
         * @return
         */
        public static int instance_count() {
            return basicgame.Current_room.instances.size();
        }
        
        /**
         * The Actor object of the particular instance. Here n is the number of instance.
         * @param id
         * @return
         */
        public static Actor instance_actor(int id) {
            return (Actor)basicgame.Current_room.instances.get(id);
        }
        
        
        
    }
    
    /**
     * <h2>The Display Functions</h2>
     * <p>The display represents the whole area on the monitor. It has a size (typically   1024x768, or 1280x1024), a color depth, that is, the number of bits that are   used to represent a single pixel (typically 16 = High Color or 32 = Full Color)   and a refresh frequency, that is, the number of times per second the display is   refreshed (typically between 60 and 120). These settings can normally be changed   though the display properties. For games though, in particular when they run in   full-screen mode, it is important to be able to change these settings. All these   settings can be initialized for the game in the <strong>Project Settings</strong>. For use   during game play the following functions exist. Note though that changing the   settings during game play will result in a time delay as things has to be   rebuilt.</p>
     * <p>To use:<br>
     * Functions.display.<strong>&lt;functionname&gt;</strong>(args);</p>
     * <p>The code completion in the java editor will bring up a list of functions as soon as you type the &quot;.&quot; after display, if not you can manually call code completion using Ctrl+Space.</p>
     * <p>Example:<br>
     * double w = Functions.display.<strong>display_get_width()</strong>;</p>
     */
    public static class display{
        static GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        static GraphicsDevice gs = ge.getDefaultScreenDevice();
        static DisplayMode dm = gs.getDisplayMode();
        static DisplayMode original = gs.getDisplayMode();
        
        /**
         * Returns the width of the display in pixels.
         * @return width of the display in pixels.
         * @since 2.0
         */
        public static double display_get_width() {
            return Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        }
        /**
         * Returns the height of the display in pixels.
         * @return
         * @since 2.0
         */
        public static double display_get_height() {
            return Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        }
        
        /**
         * Returns the color depth in bits.
         * @return the color depth in bits.
         * @since 2.0
         */
        public static int display_get_colordepth() {
            // Get number of colors
            int bitDepth = dm.getBitDepth();
            if (bitDepth == DisplayMode.BIT_DEPTH_MULTI) {
                // Multiple bit depths are supported in this display mode
                return 0;
            } else {
                return (int)Math.pow(2, bitDepth);
            }
        }
        
        /**
         * Returns the refresh frequency of the display.
         * @return
         * @since 2.0
         */
        public static int display_get_frequency() {
            // Get refresh rate in Hz
            return dm.getRefreshRate();
        }
        
        /**
         * Sets the width and height of the display in pixels. Returns whether this was successful. (Realize that only certain combinations are allowed.)
         * @param w
         * @param h
         * @return whether this was successful
         * @since 2.0
         */
        public static boolean display_set_size(int w,int h) {
            DisplayMode displayMode = new DisplayMode(
                    w, h, display_get_colordepth(), display_get_frequency());
            try {
                gs.setDisplayMode(displayMode);
                return true;
            } catch (Throwable e) {
                // Desired display mode is not supported; leave full-screen mode
                return false;
            }
        }
        
        /**
         * Sets the color depth. In general only 16 and 32 are allowed values. Returns whether successful.
         * @param coldepth
         * @return whether this was successful
         * @since 2.0
         */
        public static boolean display_set_colordepth(int coldepth) {
            DisplayMode displayMode = new DisplayMode(
                    (int)display_get_width(), (int)display_get_height(), coldepth, display_get_frequency());
            try {
                gs.setDisplayMode(displayMode);
                return true;
            } catch (Throwable e) {
                // Desired display mode is not supported; leave full-screen mode
                return false;
            }
        }
        
        /**
         * Sets the refresh frequency for the display. Only few frequencies are allowed. Typically you could set this to 60 with a same room speed to get smooth 60 frames per second motion. Returns whether successful.
         * @param frequency
         * @return whether this was successful
         * @since 2.0
         */
        public static boolean display_set_frequency(double frequency) {
            DisplayMode displayMode = new DisplayMode(
                    (int)display_get_width(), (int)display_get_height(), display_get_colordepth(), (int)frequency);
            try {
                gs.setDisplayMode(displayMode);
                return true;
            } catch (Throwable e) {
                // Desired display mode is not supported; leave full-screen mode
                return false;
            }
        }
        
        /**
         * Sets all at once. Returns whether successful.
         * @param w
         * @param h
         * @param frequency
         * @param coldepth
         * @return whether successful.
         * @since 2.0
         */
        public static boolean display_set_all(double w,double h,double frequency,double coldepth) {
            DisplayMode displayMode = new DisplayMode(
                    (int)w, (int)h, (int)coldepth, (int)frequency);
            try {
                gs.setDisplayMode(displayMode);
                return true;
            } catch (Throwable e) {
                // Desired display mode is not supported
                return false;
            }
        }
        
        /**
         * Tests whether the indicated settings are allowed. It does not change the settings. Returns whether the settings are allowed.
         * @param w
         * @param h
         * @param frequency
         * @param coldepth
         * @return whether the settings are allowed.
         * @since 2.0
         */
        public static boolean display_test_all(double w,double h,double frequency,double coldepth) {
            DisplayMode displayMode = new DisplayMode(
                    (int)w, (int)h, (int)coldepth, (int)frequency);
            try {
                DisplayMode backup = gs.getDisplayMode();
                gs.setDisplayMode(displayMode);
                gs.setDisplayMode(backup);
                return true;
            } catch (Throwable e) {
                // Desired display mode is not supported
                
                return false;
            }
        }
        
        /**
         * Resets the display settings to the ones when the program was started.
         * @since 2.0
         */
        public static void display_reset() {
            gs.setDisplayMode(original);
            
        }
        
        /**
         * Returns the x-coordinate of the mouse on the display.<br>
         * <b>Warning: uses java 1.5, remove if need lower java version!</b>
         * @return the x-coordinate of the mouse on the display.
         * @since 2.0
         */
        public static double display_mouse_get_x() {
            return MouseInfo.getPointerInfo().getLocation().getX();
        }
        
        /**
         * Returns the y-coordinate of the mouse on the display.
         * <b>Warning: uses java 1.5, remove if need lower java version!</b>
         * @return
         * @since 2.0
         */
        public static double display_mouse_get_y() {
            return MouseInfo.getPointerInfo().getLocation().getY();
        }
        
        /**
         * Sets the position of the mouse on the display to the indicated values.
         * @param x
         * @param y
         * @since 2.0
         */
        public static void display_mouse_set(double x,double y) {
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.mouseMove((int) x, (int) y);
            } catch (AWTException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        
    }
    
    /**
     *
     */
    public static class draw_shapes{
        
        /**
         * Clears the entire room in the given color (no alpha blending).
         * @param col Color to clear the room to
         */
        public static void draw_clear(Color col){
            if (basicgame.Current_room.graphics != null) {
                basicgame.Current_room.graphics.setColor( col );
                basicgame.Current_room.graphics.fillRect( 0, 0, basicgame.Current_room.width, basicgame.Current_room.height );
            }
            
            
        }
    }
    
    /**
     * Other important aspects of many games are the score, the health, and the number of lives. G-java keeps track of the score in a global variable score and the number of lives in a global variable lives. You can change the score by simply changing the value of this variable. The same applies to health and lives. If lives is larger than 0 and becomes smaller than or equal to 0 the no-more-lives event is performed for all instances. If you don't want to show the score and lives in the caption, set the variable show_score, etc., to false. Also you can change the caption. For more complicated games best display the score yourself.
     * @since 2.0
     * @author TGMG
     */
    public static class score{
        /**
         *  The game score, Starts at 0
         * @since 2.0
         */
        public static int score = 0;
        
        /**
         * Whether to show the score in the window caption.
         * @since 2.0
         */
        public static boolean show_score = true;
        /**
         * Whether to show the number of lives in the window caption.
         * @since 2.0
         */
        public static boolean show_lives = false;
        /**
         * Whether to show the health in the window caption.
         * @since 2.0
         */
        public static boolean show_health = false;
        
        /**
         * The Game lives, default 5
         *  @since 2.0
         */
        public static int lives = 5;
        
        /**
         * The game health, starts at 100
         *  @since 2.0
         */
        public static int health = 100;
        
        /**
         * The score caption
         * @since 2.0
         */
        public static String score_caption = "score:";
        /**
         * The lives caption
         * @since 2.0
         */
        public static String lives_caption = "lives:";
        
        /**
         * The health caption
         * @since 2.0
         */
        public static String health_caption = "health:";
    }
    
    /**
     * Here are some variables and functions that deal with errors.
     */
    public static class debug{
        /**
         * Indicates whether an error has occurred, either true or false
         */
        public static boolean   error_occurred;
        /**
         * String indicating the last error message
         */
        public static String error_last="";
        
        /**
         * Just for compatibility with gm! Don't use!
         * @deprecated Just for compatibility with gm
         * @param str
         */
        public static void show_debug_message(String str) {
            System.out.println(str);
        }
    }
    
    /**
     * These functions will give you information about a sprite
     */
    public static class resources_sprite{
        /**
         * Just for compatibility with gm! Don't use!
         * @deprecated Just for compatibility with gm
         * @param ind
         * @return
         */
        public static boolean sprite_exists(sprite ind) {
            return true;
        }
        
        
        /**
         * Returns the name of the sprite.
         * @param ind
         * @return
         */
        public static String sprite_get_name(sprite ind) {
            return "";
        }
        /**
         * Returns the number of subimages of the sprite.
         * @param ind
         * @return
         */
        public static int sprite_get_number(sprite ind){
            return ind.subimages;
        }
        /**
         * Returns the width of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_width(sprite ind){
            return ind.sprite_width;
        }
        /**
         * Returns the height of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_height(sprite ind){
            return ind.sprite_height;
        }
        
        /**
         * Returns whether the sprite with the given index is transparent.
         * @param ind
         * @return
         */
        public static boolean sprite_get_transparent(sprite ind){
            return (ind.Transparent == 1);
        }
        /**
         * Not used for G-Java!
         * @deprecated does nothing, used for GM compatibility
         * @param ind
         * @return false
         */
        public static boolean sprite_get_smooth(sprite ind){
            return false;
        }
        /**
         * Returns the x-offset of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_xoffset(sprite ind){
            return ind.sprite_xoffset;
        }
        /**
         * Returns the y-offset of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_yoffset(sprite ind){
            return ind.sprite_yoffset;
        }
        /**
         * Returns the left side of the bounding box of the sprite with the given index.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_left(sprite ind){
            return ind.BBLeft;
        }
        /**
         * Returns the right side of the bounding box of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_right(sprite ind){
            return ind.BBRight;
        }
        
        /**
         * Returns the top side of the bounding box of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_top(sprite ind){
            return ind.BBTop;
        }
        /**
         * Returns the bottom side of the bounding box of the sprite.
         * @param ind
         * @return
         */
        public static double sprite_get_bbox_bottom(sprite ind){
            return ind.BBBottom;
        }
        /**
         * Not used in G-Java.
         * @deprecated Only used for GM compatibility
         * @param ind
         * @return 2
         */
        public static int sprite_get_bbox_mode(sprite ind){
            return 2;
        }
        /**
         * @deprecated Not used in G-java, for compatibility with GM
         * @param ind
         * @return false
         */
        public static boolean sprite_get_precise(sprite ind) {
            return false;
        }
        
        /**
         * @deprecated Not used in G-java, for compatibility with GM
         * @param ind
         * @return false
         */
        public static boolean sprite_get_preload(sprite ind) {
            return false;
        }
        
        
    }
    
    /**
     * These functions will give you information about a sound
     */
    public static class resources_sound{
        /**
         * Returns whether a sound exists.
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return true
         */
        public static boolean  sound_exists(sound ind) {
            return true;
        }
        /**
         * Returns the name of the sound.
         * @param ind
         * @return
         */
        public static String sound_get_name(sound ind) {
            return ind.sound_name;
        }
        /**
         * Not used for G-java!
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return 0
         */
        public static int sound_get_kind(sound ind) {
            return 0;
        }
        /**
         * Not used for G-Java!
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         * @return false
         */
        public static boolean sound_get_preload(sound ind) {
            return false;
        }
        
        /**
         * Not needed for G-java, Does nothing
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         */
        public static void sound_discard(sound ind) {
        }
        
        /**
         * Not needed for G-java, Does nothing
         * @deprecated Used for compatibility with GM Only!
         * @param ind
         */
        public static void sound_restore(sound ind) {
        }
    }
    
    
    public static class resources_font{
        /**
         *
         * @param ind
         * @return
         */
        public static boolean font_exists(font ind) {
            return true;
        }
        /**
         * Returns the name of the font.
         * @param ind
         * @return
         */
        public static String font_get_name(font ind) {
            return ind.fontname;
        }
        /**
         * Returns the fontname of the font.
         * @param ind
         * @return
         */
      public static String  font_get_fontname(font ind) {
            return ind.fname;
        }
        /**
         * Returns whether the font is bold.
         * @param ind
         * @return
         */
       public static boolean font_get_bold(font ind) {
            return ind.font.isBold();
        }
        /**
         * Returns whether the font is italic.
         * @param ind
         * @return
         */
     public static boolean font_get_italic(font ind) {
            return ind.font.isItalic();
        }
        
    }
    
    /**
     * These are functions to ensure compatibility with GM4.
     * @deprecated No need to use these functions unless you are used to gm4!
     */
    public static class GM4 {
        /**
         * Only here to to ensure compatibility with GM4
         * @deprecated use Functions.math.min instead
         * @param a
         * @param b
         * @param c
         * @return the minimum of the 3 values
         * @author luiscubal
         */
        public static double min3(double a, double b, double c){
            return Functions.math.min(a,b,c);
        }
        
        /**
         * Only here to to ensure compatibility with GM4
         * @deprecated use Functions.math.max instead
         * @param a
         * @param b
         * @param c
         * @return the max of the 3 values
         * @author luiscubal
         */
        public static double max3(double a, double b, double c){
            return Functions.math.max(a,b,c);
        }
        
        /**
         * Only here to to ensure compatibility with GM4
         * @deprecated use Functions.math.mean instead
         * @param a
         * @param b
         * @param c
         * @return the mean of the 3 values
         * @author luiscubal
         */
        public static double mean3(double a, double b, double c){
            return Functions.math.mean(a,b,c);
        }
    }
    
    /**
     *
     * @param savFilename The filename of the save file to save to
     */
    public static void game_save(String savFilename) {
        
        // File savefile = (File)getClass().getResourceAsStream(savFilename);
        // File savefile = new File((String)(getClass().getResource(savFilename)));
        // OutputStream os = new OutputStream();
        // RandomAccessFile((File)savefile,)
    }
    
    /**
     * Load game from file
     * @param savFilename The filename of the save file to load from
     */
    public static void game_load(String savFilename) {
        
    }
    
    /**
     *
     * @param actor
     * @return number of a certain actor as int
     */
    public static int action_get_number(Actor actor) {
        // get the number of instances as a value
        int no_of_instances = 0;
        int jii = 0;
        while (jii < basicgame.Current_room.instances.size()) {
            Actor dt = (Actor) basicgame.Current_room.instances.get(jii);
            if (dt.equals(actor)) {
                // add onto the number of instances
                no_of_instances = no_of_instances + 1;
                
            }
            jii++;
        }
        return no_of_instances;
    }
    
        /*
         * public static int min(int... args) { int mini = 0; mini = args[0]; for (int i = 0; i < args.length; i++) {
         * mini = Math.min(mini,args[i]); } return mini; }
         */// Can't be used below 1.5 :(
        /*
         * public static int max(int... args) { int maxi = 0; maxi = args[0]; for (int i = 0; i < args.length; i++) {
         * maxi = Math.max(maxi,args[i]); } return maxi; }
         */
    
    /**
     *
     */
    public static void end_game() {
        // end the game
        if (basicgame.Runningas == "Application") {
            // close the application
            System.exit(0);
        } else {
            // close the applet
            if (basicgame.Runningas == "EApplet") {
                basicgame.Eapplet.stop();
            } else {
                load_Rooms.remove_room(basicgame.Current_room.id);
            }
        }
        
    }
    
    /**
     *
     */
    //    public void load_image() {
    //        backImage = new ImageIcon(getClass().getResource("dialog.png")).getImage();
    //
    //    }
    
    /**
     * Tell the UIManager to use the platform look and feel
     */
    public void set_native() {
        try {
            // Tell the UIManager to use the platform look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // Do nothing
        }
    }
    
    /**
     * @deprecated Does nothing
     * @param message
     * @return
     */
    public static boolean action_if_question(String message) {
        // return true if the answer is yes
        //MessageBox box = new MessageBox();
        /* boolean iii = *///box.action_if_question(message);
        
        return true;
        
    }
    
    /**
     *
     * @param str
     */
    public static void show_message(String str) {
        // show a message
        
        // pause the room
        basicgame.Current_room.Paused = true;
        
        // show the message box
        // Room.center(messagebox);
        // JPanel messagepanel = new messagepanel(str);
        // JButton Ok = new JButton("OK");
        // messagebox.add(new Button("OK"), new Rectangle(0,4,1,1));
        // messagepanel.add_OK();
        // Ok.setLocation(150,90);
        // messagebox = load_Rooms.Room;
        // messagebox.getContentPane().add(BorderLayout.CENTER, messagepanel);
        // messagebox.show();
        
        MessageBox.show_message(str);
        basicgame.Current_room.Paused = false;
    }
    
    /**
     *
     * @param url
     */
    public static void openURL(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Mac OS")) {
                Class fileMgr = Class.forName("com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL",new Class[] { String.class });
                openURL.invoke(null,new Object[] { url });
            } else if (osName.startsWith("Windows"))
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            else { // assume Unix or Linux
                String[] browsers = { "firefox","opera","konqueror","epiphany","mozilla","netscape" };
                String browser = null;
                for (int count = 0; count < browsers.length && browser == null; count++)
                    if (Runtime.getRuntime().exec(new String[] { "which",browsers[count] }).waitFor() == 0)
                        browser = browsers[count];
                if (browser == null)
                    throw new Exception("Could not find web browser");
                else
                    Runtime.getRuntime().exec(new String[] { browser,url });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error attempting to launch web browser:\n"
                    + e.getLocalizedMessage());
        }
    }
    
    private static void Setup_Functions() {
        // in some initializing method or constructor
        then = Calendar.getInstance();
        // Time used by GM to base the datetime off of
        then.set(1899,11,29,22,59,34);
        
        // setup clipboard
        if (basicgame.Runningas != "EApplet") systemClipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        
    }
}
