/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dagiac;

public class DaGiac {
    private int canhA;
    private int canhB;
    private int canhC;

    public DaGiac() {
    }
    public DaGiac(int canhA, int canhB, int canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public int getCanhA() {
        return canhA;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public int getCanhB() {
        return canhB;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public int getCanhC() {
        return canhC;
    }

    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }

    public double chuVi(double canhA, double canhB , double canhC){
        return 0;
    }

   
    @Override
    public String toString() {
        return  "canh A : " + canhA + "\ncanh B :" + canhB + "\ncanh C :" + canhC ;
    }
    
}
