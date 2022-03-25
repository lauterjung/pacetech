package teste;


import modelo.Materia;
import modelo.Professor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renan Miguel
 */
public class ProfessorTeste {
 
    public static void main(String[] args) {
        
        Materia materia = new Materia("Informática", 200);
        
        Professor professor = new Professor();
        
        professor.setNome("Bruno");
        professor.setSobrenome("Silva");
        professor.setEmail("bruno@pacetech.com.br");
        
        professor.setMateria(materia);
        
        System.out.println(professor.toString());
                
        
    }
    
}
