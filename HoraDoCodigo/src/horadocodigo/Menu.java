package horadocodigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    List<Aluno> listaAlunos = new ArrayList();
    
    public void open() {
        System.out.println("Operações\r\n"
                + "		\r\n"
                + "Inserção\r\n"
                + "(a) Aluno\r\n"
                + "		\r\n"
                + "Exibição\r\n"
                + "(b) Nomes\r\n"
                + "(c) Médias\r\n"
                + "		\r\n"
                + "Outros\r\n"
                + "(g) Sair\r\n"
                + "		\r\n"
                + "Digite a tecla correspondente de qual operação você deseja realizar");

        String userInput = scan.next().toLowerCase();

        switch (userInput) {
            case "a":
                inserirAluno();
                break;
            case "b":
                exibirNomes();
                break;
            case "c":
                exibirMedias();
                break;
            case "q": {
                scan.close();
                System.exit(0);
            }
            break;
            default: {
                System.out.println("Não entendi a operação.");
            }
        }
        newOperation();
    }

    public void newOperation() {
        String newOperation;
        do {
            System.out.println("\nDeseja fazer nova operação? (s/n)");
            newOperation = scan.next().toLowerCase();
        } while (!newOperation.equals("s") && !newOperation.equals("n"));

        if (newOperation.equals("s")) {
            open();
        } else if (newOperation.equals("n")) {
            System.out.println("Boa estadia!");
            scan.close();
            System.exit(0);
        }
    }

    public void inserirAluno() {
        String novaInsercao;
        do {
            Aluno aluno = new Aluno();
            System.out.println("Informe o nome do aluno: ");
            aluno.setNome(scan.next());
            System.out.println("Informe a matrícula do aluno: ");
            aluno.setMatricula(scan.next());
            System.out.println("Informe a nota de prova do aluno: ");
            aluno.setNotaProva(scan.nextDouble());
            System.out.println("Informe a nota de trabalho do aluno: ");
            aluno.setNotaTrabalho(scan.nextDouble());
            listaAlunos.add(aluno);

            System.out.println("Digite 's' para uma nova inserção");
            novaInsercao = scan.next().toLowerCase();
        } while (novaInsercao.equals("s"));

    }
    
    public void exibirNomes() {
        if (listaAlunos == null || listaAlunos.isEmpty()) {
            System.out.println("A lista de alunos está vazia.");
        }
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.printf("%d) Nome: %s \n", i+1, listaAlunos.get(i).getNome());
        }
    }
    
    public void exibirMedias() {
        if (listaAlunos == null || listaAlunos.isEmpty()) {
            System.out.println("A lista de alunos está vazia.");
        }
        for (int i = 0; i < listaAlunos.size(); i++) {
            System.out.printf("%d) %s: Média %.2f.\n", i + 1, listaAlunos.get(i).getNome(), listaAlunos.get(i).getMedia());
        }
    }

}
