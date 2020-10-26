package par_ou_impar;
import java.util.Scanner;

public class Par_ou_Impar {
    public static void main(String[] args) {
        Scanner entrada;
        int num;
        
        entrada = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        num = entrada.nextInt();
        
        if (num % 2==0) {
            System.out.println("Seu número é par");
        } 
        else {
            System.out.println("seu número é ímpar");
        
        }
      }
    }
    
