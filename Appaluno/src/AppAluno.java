/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Eduardo Dias
 */
public class AppAluno {// declaração e início da classe

public static void main (String[] args){// método inicial da App


Aluno aluno1 = new Aluno(); // Criação ou instanciação do objeto aluno1

Aluno aluno2 = new Aluno(); // Criação ou instanciação do objeto aluno2

Aluno aluno3 = new Aluno(); // Criação ou instanciação do objeto aluno3

//definindo valores para os atributos do aluno1

aluno1.setMatricula( "1001" );

aluno1.setNome( "Andre" );

aluno1.setCr( 6.7 ) ;

//definindo valores para os atributos do aluno2

aluno2.setMatricula( "1002" );

aluno2.setNome( "Maria" );

aluno2.setCr( 7.5 );

//definindo valores para os atributos do aluno3

aluno3.setMatricula( "" ); // valor vazio, não será atribuído

aluno3.setNome( "" ); // valor vazio, não será atribuído

aluno3.setCr( 12 ); // valor do CR inválido, não será atribuído

//exibindo os valores dos atributos de cada aluno:

aluno1.imprimir();

aluno2.imprimir();

aluno3.imprimir();

}

}


