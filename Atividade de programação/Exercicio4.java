import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor de N para o duplo-N: ");
        int n = ler.nextInt();
        
        int totalPecas = ((n + 1) * (n + 2)) / 2;
        
        System.out.println("Total de pecas no jogo duplo-" + n + ": " + totalPecas);
    }
}