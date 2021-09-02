/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dagiac;

public class TamGiac extends DaGiac{

    public TamGiac() {
    }
    public TamGiac(int canhA, int canhB, int canhC) {
        super(canhA, canhB, canhC);
    }    
    public static boolean tinhHopLe(int canhA, int canhB,int canhC){
        if(canhA+canhB > canhC && canhB+canhC > canhA && canhA+canhC > canhB){
            return true;
        }
        return false;
    }
    public double dienTich(double canhA, double canhB, double canhC){
        double p = (canhA+canhB+canhC)/2;
        double s = Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
        return s;
    }   
    @Override
    public double chuVi(double canhA, double canhB , double canhC){
        double p = (canhA+canhB+canhC)/2;
        return p;
    }
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }   
}
