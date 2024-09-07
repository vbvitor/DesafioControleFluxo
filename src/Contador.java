import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {    	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro parâmetro...");
        int parametroUm = scanner.nextInt();
        
        System.out.println("Insira o segundo parâmetro...");
        int parametroDois = scanner.nextInt();

        try {
            if(parametroUm > parametroDois) {
                throw new ParametrosInvalidosException(" ");
            
            }

            int contagem = parametroDois - parametroUm;

            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);

            }
        } catch (ParametrosInvalidosException e) {
                 System.out.println("Atenção! O Segundo parâmetro deve ser maior que o primeiro.");
        
        
        }
    }

    }