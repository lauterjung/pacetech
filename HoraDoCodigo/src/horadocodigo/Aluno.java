package horadocodigo;


public class Aluno {

    private String nome;
    private String matricula;
    private double notaProva;
    private double notaTrabalho;
    private double media;
    
    public Aluno(){
    }
    
    public Aluno(String nome, String matricula, double notaProva, double notaTrabalho) {
        this.nome = nome;
        this.matricula = matricula;
        
        if (notaProva < 0) {
            this.notaProva = 0.0;
        } else {
            this.notaProva = notaProva;
        }
        
        if (notaTrabalho < 0) {
            this.notaTrabalho = 0.0;
        } else {
            this.notaTrabalho = notaTrabalho;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(double notaProva) {
        if (notaProva < 0) {
            this.notaProva = 0.0;
        } else {
            this.notaProva = notaProva;
        }
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        if (notaTrabalho < 0) {
            this.notaTrabalho = 0.0;
        } else {
            this.notaTrabalho = notaTrabalho;
        }
    }
        
    public void calcularMedia(){
        media = (this.notaProva+this.notaTrabalho)/2;
        System.out.printf("A média de %s é de %.2f.\n", this.nome, media);
    }
    
    public double getMedia() {
        return (this.notaProva+this.notaTrabalho)/2;
    }
        
}
