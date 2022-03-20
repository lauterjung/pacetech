package Missao7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    List<Empregado> listaEmpregados = new ArrayList();

    public void open() {
        System.out.println("Operações\r\n"
                + "		\r\n"
                + "Inserção\r\n"
                + "(a) Empregado\r\n"
                + "		\r\n"
                + "Exibição\r\n"
                + "(b) Nomes\r\n"
                + "(c) Salários\r\n"
                + "		\r\n"
                + "Modificação\r\n"
                + "(d) Nomes\r\n"
                + "(e) Salários\r\n"
                + "		\r\n"
                + "Outros\r\n"
                + "(g) Sair\r\n"
                + "		\r\n"
                + "Digite a tecla correspondente de qual operação você deseja realizar");

        String userInput = scan.next().toLowerCase();

        switch (userInput) {
            case "a":
                inserirEmpregado();
                break;
            case "b":
                exibirNomes();
                break;
            case "c":
                exibirSalarios();
                break;
            case "d":
                modificarNome();
                break;
            case "e":
                exibirNomes();
                break;
            case "q": {
                System.out.println("Boa estadia!");
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

    public void modificarNome() {
        System.out.println("Para quem você deseja modificar o nome?");
    }

    public void inserirEmpregado() {
        String novaInsercao;
        do {
            Empregado empregado = new Empregado();
            System.out.println("Informe o nome do empregado: ");
            empregado.setNome(scan.next());
            System.out.println("Informe o sobrenome do empregado: ");
            empregado.setSobrenome(scan.next());
            System.out.println("Informe o salário do empregado: ");
            empregado.setSalario(scan.nextDouble());
            listaEmpregados.add(empregado);
            System.out.println("Digite 's' para uma nova inserção");
            novaInsercao = scan.next().toLowerCase();
        } while (novaInsercao.equals("s"));

    }

    public void exibirNomes() {
        if (listaEmpregados == null || listaEmpregados.isEmpty()) {
            System.out.println("A lista de empregados está vazia.");
        }
        for (int i = 0; i < listaEmpregados.size(); i++) {
            System.out.printf("%d) Nome completo: %s %s\n", i+1, listaEmpregados.get(i).getNome(), listaEmpregados.get(i).getSobrenome());
        }
    }
    
    public void exibirSalarios() {
        if (listaEmpregados == null || listaEmpregados.isEmpty()) {
            System.out.println("A lista de empregados está vazia.");
        }
        for (int i = 0; i < listaEmpregados.size(); i++) {
            System.out.printf("%d) %s %s: %.2f\n", i+1, listaEmpregados.get(i).getNome(), listaEmpregados.get(i).getSobrenome(), listaEmpregados.get(i).getSalario());
        }
    }

}
