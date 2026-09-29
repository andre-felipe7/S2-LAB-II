import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor da soma (S): ");
        int s = ler.nextInt();
        
        System.out.print("Digite o valor inicial do intervalo (A): ");
        int a = ler.nextInt();
        
        System.out.print("Digite o valor final do intervalo (B): ");
        int b = ler.nextInt();
        
        int quantidade = 0;
        
        for (int i = a; i <= b; i++) {
            int numero = i;
            int somaDigitos = 0;
            
            while (numero > 0) {
                somaDigitos += numero % 10;
                numero /= 10;
            }
            
            if (somaDigitos == s) {
                quantidade++;
            }
        }
        
        System.out.println("Quantidade de numeros encontrados: " + quantidade);
    }
}