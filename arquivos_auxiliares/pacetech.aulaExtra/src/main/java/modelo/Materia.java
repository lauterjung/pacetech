/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Renan Miguel
 */
public class Materia {

    private String nome;
    private Integer duracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Materia{" + "nome=" + nome + ", duracao=" + duracao + '}';
    }

    public Materia(String nome, Integer duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public Materia() {
    }

}
