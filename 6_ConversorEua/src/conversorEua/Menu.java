package conversorEua;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);
    
    public void open() {
        System.out.println("Opera��es de Convers�o\r\n" + 
        		"		\r\n" + 
        		"Temperatura\r\n" + 
        		"(a) Celsius (�C) para Fahrenheit (�F)\r\n" + 
        		"(b) Fahrenheit (�F) para Celsius (�C)\r\n" + 
        		"		\r\n" + 
        		"Moeda\r\n" + 
        		"(c) Real para D�lar\r\n" + 
        		"(d) D�lar para Real\r\n" + 
        		"		\r\n" + 
        		"Outros\r\n" + 
        		"(q) Sair\r\n" + 
        		"		\r\n" + 
        		"Digite a tecla correspondente de qual opera��o voc� deseja realizar");
        
        String userInput = scan.next().toLowerCase();
                
        switch(userInput){
        case "a":
        	celsiusToFahrenheit();
        break;
        case "b": 
        	fahrenheitToCelsius();
        break;
        case "c":
        	realToDolar();
        break;
        case "d":
        	dolarToReal();
        break;
        case "q": {
            System.out.println("Boa estadia!");
			scan.close();
            System.exit(0);
            }
        break;
        default: {
        	System.out.println("N�o entendi a opera��o.");              
        }
		}
  
		newOperation();
	}

    public void newOperation() {
        String newOperation;
        do {
            System.out.println("\nDeseja fazer nova opera��o? (s/n)");
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

    public void celsiusToFahrenheit() {
        System.out.println("Informe a temperatura (�C):");
        double tempCelsius = scan.nextDouble();
        double tempFahrenheit = tempCelsius*1.8+32;
        System.out.printf("%.2f �C equivalem � %.2f �F", tempCelsius, tempFahrenheit);
    }
    
    public void fahrenheitToCelsius() {
        System.out.println("Informe a temperatura (�F):");
        double tempFahrenheit = scan.nextDouble();
        double tempCelsius = (tempFahrenheit-32)/1.8;
        System.out.printf("%.2f �F equivalem � %.2f �C", tempFahrenheit, tempCelsius);
    }
    
    public void realToDolar() {
        System.out.println("Informe a cota��o do d�lar:");
        double cotacaoDolar = scan.nextDouble();
        System.out.println("Informe o valor (em reais) a ser convertido:");
        double valorReal = scan.nextDouble();
        double valorDolar = valorReal/cotacaoDolar;
        System.out.printf("%.2f reais equivalem � %.2f d�lares", valorReal, valorDolar);
    }
    
    public void dolarToReal() {
        System.out.println("Informe a cota��o do d�lar:");
        double cotacaoDolar = scan.nextDouble();      
        System.out.println("Informe o valor (em d�lares) a ser convertido:");
        double valorDolar = scan.nextDouble();
        double valorReal = valorDolar*cotacaoDolar;
        System.out.printf("%.2f d�lares equivalem � %.2f reais", valorDolar, valorReal);
    }

}

