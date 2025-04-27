/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testefunction;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Testefunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("N1");
        int n1 = sc.nextInt();
        
        System.out.print("N2");
        int n2 = sc.nextInt();
        
        System.out.print("SOMA = "+soma(n1,n2));
        
        
    }
    public static int soma(int n1, int n2){
        return n1 * n2;
    }
}
