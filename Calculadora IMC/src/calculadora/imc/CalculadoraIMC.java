/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.imc;

/**
 *
 * @author Eduardo Dias
 */
import java.util.Scanner;
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        double imc, peso, altura;
        System.out.println("Digite seu peso:");
        peso =Double.parseDouble(sc.nextLine());
        System.out.println("Digite sua altura:");
        altura = Double.parseDouble(sc.nextLine());
        imc = peso / (altura * altura);
        System.out.println("O seu IMC é:" + imc );
        sc.close();
        
        
    }
    
}
i