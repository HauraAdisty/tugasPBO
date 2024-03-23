/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Lenovo
 */
public class Tugas1 {
    public static void main(String[] args) {
        int a, b;

        for (a= 0; a <= 3; a++) {
            for (b = 3; b>= a; b--) {
                System.out.print(" ");
            }

            for (b = 1; b <= a * 2 - 1; b++) {

                System.out.print("*");
            }
            System.out.println();
  
}
    }
}
