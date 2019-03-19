/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farenheit.celsius;

import java.util.Scanner;

/**
 *
 * @author Solovey
 */
public class FarenheitCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduceti nr de grade dupa scara farenheit ");
        Scanner sc = new Scanner(System.in);
        int F_Grade = sc.nextInt();
        double C_Grade = (5 * (F_Grade - 32)) / 9;
        System.out.println(F_Grade + " de grade in Farenheit vor fi egale cu " + C_Grade + " de grade in Celsius");

    }

}
