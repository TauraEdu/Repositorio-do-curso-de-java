/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploestacio;

import java.util.Scanner;

/**
 *
 * @author Eduardo Dias
 */
public class ExemploEstacio {


            public static void main(String[]args){
                //TODO Auto-generated method stub
                Scanner sc =new Scanner(System.in);
                double media, nota1, nota2;
                System.out.println("Digite a nota 1:");
                nota1= Double.parseDouble(sc.nextLine());
                System.out.println("Digite a nota 2;");
                nota2 = Double.parseDouble(sc.nextLine());
                media = (nota1 + nota2)/2.0; 
                System.out.println("Asua média é:" + media);
                sc.close();
            }
        } 
    