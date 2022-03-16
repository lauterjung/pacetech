package conversorEua;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);
    
    public void open() {
        System.out.println("Operações de Conversão\r\n" + 
        		"		\r\n" + 
        		"Temperatura\r\n" + 
        		"(a) Celsius (°C) para Fahrenheit (°F)\r\n" + 
        		"(b) Fahrenheit (°F) para Celsius (°C)\r\n" + 
        		"		\r\n" + 
        		"Moeda\r\n" + 
        		"(c) Real para Dólar\r\n" + 
        		"(d) Dólar para Real\r\n" + 
        		"		\r\n" + 
        		"Outros\r\n" + 
        		"(q) Sair\r\n" + 
        		"		\r\n" + 
        		"Digite a tecla correspondente de qual operação você deseja realizar");
        
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

    public void celsiusToFahrenheit() {
        System.out.println("Informe a temperatura (°C):");
        double tempCelsius = scan.nextDouble();
        double tempFahrenheit = tempCelsius*1.8+32;
        System.out.printf("%.2f °C equivalem à %.2f °F", tempCelsius, tempFahrenheit);
    }
    
    public void fahrenheitToCelsius() {
        System.out.println("Informe a temperatura (°F):");
        double tempFahrenheit = scan.nextDouble();
        double tempCelsius = (tempFahrenheit-32)/1.8;
        System.out.printf("%.2f °F equivalem à %.2f °C", tempFahrenheit, tempCelsius);
    }
    
    public void realToDolar() {
        System.out.println("Informe a cotação do dólar:");
        double cotacaoDolar = scan.nextDouble();
        System.out.println("Informe o valor (em reais) a ser convertido:");
        double valorReal = scan.nextDouble();
        double valorDolar = valorReal/cotacaoDolar;
        System.out.printf("%.2f reais equivalem à %.2f dólares", valorReal, valorDolar);
    }
    
    public void dolarToReal() {
        System.out.println("Informe a cotação do dólar:");
        double cotacaoDolar = scan.nextDouble();      
        System.out.println("Informe o valor (em dólares) a ser convertido:");
        double valorDolar = scan.nextDouble();
        double valorReal = valorDolar*cotacaoDolar;
        System.out.printf("%.2f dólares equivalem à %.2f reais", valorDolar, valorReal);
    }

}

