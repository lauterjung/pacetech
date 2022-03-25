/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Renan Miguel
 */
public class Aluno extends Pessoa {
    
    private Integer matricula;
    
    private Float notaB1;
    private Float notaB2;
    private Float notaB3;
    private Float notaB4;

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Float getNotaB1() {
        return notaB1;
    }

    public void setNotaB1(Float notaB1) {
        this.notaB1 = notaB1;
    }

    public Float getNotaB2() {
        return notaB2;
    }

    public void setNotaB2(Float notaB2) {
        this.notaB2 = notaB2;
    }

    public Float getNotaB3() {
        return notaB3;
    }

    public void setNotaB3(Float notaB3) {
        this.notaB3 = notaB3;
    }

    public Float getNotaB4() {
        return notaB4;
    }

    public void setNotaB4(Float notaB4) {
        this.notaB4 = notaB4;
    }

    public Aluno() {
    }

    public Aluno(Integer matricula, Float notaB1, Float notaB2, Float notaB3, Float notaB4, String nome, String sobrenome, String email) {
        super(nome, sobrenome, email);
        this.matricula = matricula;
        this.notaB1 = notaB1;
        this.notaB2 = notaB2;
        this.notaB3 = notaB3;
        this.notaB4 = notaB4;
    }
    
    public Float mediaAluno(){
        return (this.notaB1 + this.notaB2 + this.notaB3 + this.notaB4) / 4;
    }

    @Override
    public String toString() {
        return "Aluno{Pessoa=" + super.toString() + "matricula=" + matricula + ", notaB1=" + notaB1 + ", notaB2=" + notaB2 + ", notaB3=" + notaB3 + ", notaB4=" + notaB4 + '}';
    }
    
    

    
    
    
    
}
