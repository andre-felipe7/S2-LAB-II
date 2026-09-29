import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] original = {45, 12, 89, 3, 27, 64, 18, 92, 5, 33, 71, 10, 50, 8, 41, 99, 15, 2, 77, 20};

        int[] ordenado = new int[20];
        for (int i = 0; i < 20; i++) {
            ordenado[i] = original[i];
        }

        int comparacoes = 0;
        int trocas = 0;

        for (int i = 0; i < 20 - 1; i++) {
            for (int j = 0; j < 20 - 1 - i; j++) {
                comparacoes++;
                
                if (ordenado[j] > ordenado[j + 1]) {
                    int aux = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = aux;
                    
                    trocas++;
                }
            }
        }
        double mediana = (ordenado[9] + ordenado[10]) / 2.0;

        System.out.print("Vetor Original: ");
        for (int num : original) {
            System.out.print(num);
        }

        System.out.print("Vetor Ordenado: ");
        for (int num : ordenado) {
            System.out.print(num);
        }

        System.out.println("Quantidade de comparaçoes: " + comparacoes);
        System.out.println("Quantidade de trocas: " + trocas);
        System.out.println("Mediana: " + mediana);
        
    }
    
}