/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import javax.swing.JOptionPane;
import modelo.Aluno;
import modelo.Materia;
import modelo.Professor;

/**
 *
 * @author Renan Miguel
 */
public class Apurador {
    
    public static void main(String[] args) {
        
        Professor professor = new Professor();
        
        professor.setNome(JOptionPane.showInputDialog("Informe o nome do professor: "));
        professor.setSobrenome(JOptionPane.showInputDialog("Informe o sobrenome do professor: "));
        professor.setEmail(JOptionPane.showInputDialog("Informe o e-mail do professor: "));
        
        Materia materia = new Materia();
        
        materia.setNome(JOptionPane.showInputDialog("Informe qual é a matéria deste professor: "));
        materia.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Informe qual é a duração desta matéria: ")));
        
        professor.setMateria(materia);
        
        System.out.println(professor.toString());
        
        Aluno aluno = new Aluno();
        
        aluno.setNome(JOptionPane.showInputDialog("Informe o nome do aluno: "));
        aluno.setSobrenome(JOptionPane.showInputDialog("Informe o sobrenome do aluno: "));
        aluno.setEmail(JOptionPane.showInputDialog("Informe o e-mail do aluno: "));
        
        aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe qual é a matricula desta aluno: ")));
        
        aluno.setNotaB1(Float.parseFloat(JOptionPane.showInputDialog("Informe qual é a nota do bimestre 1:")));
        aluno.setNotaB2(Float.parseFloat(JOptionPane.showInputDialog("Informe qual é a nota do bimestre 2:")));
        aluno.setNotaB3(Float.parseFloat(JOptionPane.showInputDialog("Informe qual é a nota do bimestre 3:")));
        aluno.setNotaB4(Float.parseFloat(JOptionPane.showInputDialog("Informe qual é a nota do bimestre 4:")));
        
        System.out.println(aluno.toString());
        
        StringBuilder mensagemFinal = new StringBuilder();                
                
        mensagemFinal.append("O professor " + professor.getNome() + " " + professor.getSobrenome());
        mensagemFinal.append("\n da matéria " + professor.getMateria().getNome());
        mensagemFinal.append("\n atribuiu para o aluno " + aluno.getNome() + " " + aluno.getSobrenome());
        mensagemFinal.append("\n" + aluno.getNotaB1() + " nota do bimestre 1");
        mensagemFinal.append("\n" + aluno.getNotaB2() + " nota do bimestre 2");
        mensagemFinal.append("\n" + aluno.getNotaB3() + " nota do bimestre 3");
        mensagemFinal.append("\n" + aluno.getNotaB4() + " nota do bimestre 4");
        mensagemFinal.append("\nMédia: " + aluno.mediaAluno());
        
        /* IF SUBSTITUIDO PELO OPERADOR TERNÁRIO ABAIXO
        if(aluno.mediaAluno() >= 5){
            mensagemFinal.append("\nO aluno esta aprovado");
        } else {
            mensagemFinal.append("\nO aluno esta reprovado");
        }
        */
        
        mensagemFinal.append("\nO aluno esta: " + (aluno.mediaAluno() >= 5 ? "APROVADO" : "REPROVADO"));
          
        JOptionPane.showMessageDialog(null, mensagemFinal);
        
        
    }
    
}
