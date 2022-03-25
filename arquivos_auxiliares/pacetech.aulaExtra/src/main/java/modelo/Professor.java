/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Renan Miguel
 */
public class Professor extends Pessoa {

    private Materia materia;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Professor(String nome, String sobrenome, String email) {
        super(nome, sobrenome, email);
    }

    public Professor() {
    }

    @Override
    public String toString() {
        return "Professor{Pessoa=" + super.toString() + ", materia=" + materia + '}';
    }

}
