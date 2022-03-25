/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import modelo.Pessoa;

/**
 *
 * @author Renan Miguel
 */
public class PessoaTeste {
    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Renan");
        pessoa.setSobrenome("Miguel");
        pessoa.setEmail("rennalnx@gmail.com");
        
        System.out.println(pessoa.toString());
                
                
        
    }
    
}
