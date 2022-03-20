package Missao7;

public class Empregado {

    private String nome;
    private String sobrenome;
    private double salario;
    
    //public Empregado() {
    //}
    
    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salario < 0) {
            System.out.println("O salário não pode ser negativo. Foi definido 0.0 como padrão");
            this.salario = 0.0;
        } else {
            this.salario = salario;
        }     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("O salário não pode ser negativo. Foi definido 0.0 como padrão");
            this.salario = 0.0;
        } else {
            this.salario = salario;
        }
    }
    
    public void exibirSalario(){
        System.out.printf("O salário de %s %s é de %.2f.\n", this.nome, this.sobrenome, this.salario);
    }
    
    public void aumentarSalario(){
        this.salario = this.salario * 1.1;
        System.out.printf("Aumento de 10%% aplicado para %s %s.\n", this.nome, this.sobrenome);
    }
    
}

