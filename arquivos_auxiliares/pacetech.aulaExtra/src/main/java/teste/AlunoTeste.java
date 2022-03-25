/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import modelo.Aluno;

/**
 *
 * @author Renan Miguel
 */
public class AlunoTeste {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        aluno.setNome("Renan");
        aluno.setSobrenome("Miguel");
        aluno.setEmail("renan@pacetech.com.br");
        
        aluno.setMatricula(1234);
        aluno.setNotaB1(10f);
        aluno.setNotaB2(2f);
        aluno.setNotaB3(5f);
        aluno.setNotaB4(7f);
        
        System.out.println(aluno.toString());
        System.out.println("E a média dele é: " + aluno.mediaAluno());
        
        
    }
            
            
            
            
    
}
