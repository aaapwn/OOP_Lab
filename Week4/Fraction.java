/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author armmy
// */

public class Fraction {
    public int topN;
    public int btmN;
//    public static void main(String[] args) {
//        Fraction f1 = new Fraction();
//        f1.topN = 2;
//        f1.btmN = 5;
//        Fraction f2 = new Fraction();
//        f2.topN = 3;
//        f2.btmN = 7;
//        System.out.println("before : " + f1.toFraction());
//        System.out.println("before : " + f1.toFloat());
//        f1.addFraction(f2);
//        System.out.println("after : " + f1.toFraction());
//        System.out.println("after : " + f1.toFloat());
//    }
    public String toFraction() {
        return topN+"/"+btmN;
    }
    public String toFloat() {
        double ftop = topN, fbtm = btmN;
        double fFloat = ftop/fbtm;
        String sFloat = String.valueOf(fFloat);
        return sFloat;
    }
    public void addFraction(Fraction f) {
        if (btmN == f.btmN) {
            topN = topN+f.btmN;
        }else {
            topN = topN*f.btmN+f.topN*btmN;
            btmN = btmN*f.btmN;
        }
    }
    public boolean myEquals(Fraction x) {
        double fTopS = topN, fBtmS = btmN, fTopX = x.topN, fBtmX = x.btmN;
        double fFloatS = fTopS/fBtmS, fFloatX = fTopX/fBtmX;
        return fFloatS == fFloatX;
    }
    public void LowestTermFrac() {
        int gcd = 1;
        int max;
        if (topN <= btmN) {
            max = btmN;
        }else {
            max = topN;
        }
        for (int i = max; i > 0; i--) {
            if (topN % i == 0 && btmN % i == 0) {
                gcd = i;
                break;
            }
        }
        topN /= gcd;
        btmN /= gcd;
    }
}
