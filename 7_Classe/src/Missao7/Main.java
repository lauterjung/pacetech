package Missao7;

import java.util.Scanner;


public class Main {
            
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // 1) Criando instâncias
        System.out.println("1) Criando instâncias");      
        System.out.println("Informe o nome do primeiro empregado: ");
        String nome1 = scan.next();
        System.out.println("Informe o sobrenome do primeiro empregado: ");
        String sobrenome1 = scan.next();
        System.out.println("Informe o salário anual do primeiro empregado: ");
        double salario1 = scan.nextDouble();
        Empregado empregado1 = new Empregado(nome1, sobrenome1, salario1);
        
        System.out.println("Informe o nome do segundo empregado: ");
        String nome2 = scan.next();
        System.out.println("Informe o sobrenome do segundo empregado: ");
        String sobrenome2 = scan.next();
        System.out.println("Informe o salário anual do segundo empregado: ");
        double salario2 = scan.nextDouble();
        Empregado empregado2 = new Empregado(nome2, sobrenome2, salario2);
        System.out.println();
        
        // 2) Exibindo salário
        System.out.println("2) Exibindo salário");
        empregado1.exibirSalario();
        empregado2.exibirSalario();
        System.out.println();
        
        // 3) Aumento de 10%               
        System.out.println("3) Aumento de 10%");
        empregado1.aumentarSalario();
        empregado2.aumentarSalario();
        System.out.println();
        empregado1.exibirSalario();
        empregado2.exibirSalario();
        scan.next();
    }
    
}
