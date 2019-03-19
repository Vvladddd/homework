/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import java.util.Scanner;

/**
 *
 * @author Solovey
 */
public class Operations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduceti doua numere");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        int dif = num1 - num2;
        int product = num1 * num2;
        int average = (num1 + num2)/2;
        int remainder = num1 % num2;
        System.out.println("Suma =" +suma);
        System.out.println("Diferenta = " +dif);
        System.out.println("Produsul = " +product);
        System.out.println("Average = " +average);
        System.out.println("Remainder = " +remainder);
    }
    
}
