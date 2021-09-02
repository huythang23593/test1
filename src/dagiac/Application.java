/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dagiac;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so canh  : ");
        int socanh = Integer.parseInt(sc.nextLine());
        int[] array = new int[socanh];

        System.out.print("Nhap canh A : ");
        int canhA = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap canh B : ");
        int canhB = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap canh C : ");
        int canhC = Integer.parseInt(sc.nextLine());
        array[0] = canhA;
        array[1] = canhB;
        array[2] = canhC;
        DaGiac d = new DaGiac();

        if (socanh > 3) {
            System.out.println("ERROR : Đây không phải hình tam giác");
        } else if (TamGiac.tinhHopLe(canhA, canhB, canhC) == false) {
            System.out.println("ERROR : Đây không phải hình tam giác");
        } else {
            TamGiac tg = new TamGiac(canhA, canhB, canhC);
            d = tg;
            System.out.println(d.toString() + "\nChu Vi :" + d.chuVi(canhA, canhB, canhC) + "\nDien Tich:" + tg.dienTich(canhA, canhB, canhC));
        }
    }
}
