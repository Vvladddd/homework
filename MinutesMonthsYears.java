/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutes.months.years;

import java.util.Scanner;

/**
 *
 * @author Solovey
 */
public class MinutesMonthsYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduceti numarul de minute ");
        Scanner sc = new Scanner(System.in);
        int minute = sc.nextInt();
        int luni = minute*1000/10080/4345;
	   int zile = minute/1440;
        System.out.println("in " +minute + " minute se contin " +zile + " zile sau "+luni + "  luni, sau " + ani + " ani");
            }

}
