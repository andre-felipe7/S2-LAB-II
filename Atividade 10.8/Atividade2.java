import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int soma = 0, dif1 = 0, dif2 = 0;
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j ) {
                    System.out.println("A diagonal principal e: " + matriz[i][j]);
                    soma += matriz[i][j];
                    dif1 += matriz[i][j];
                }
                
                 
            }
        }
        
        System.out.println("\n"); 
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i + j == 3) {
                    System.out.println("A diagonal secundaria e: " + matriz[i][j]);
                    soma += matriz[i][j];
                    dif2 += matriz[i][j];
                }
            }
        }
       
         System.out.println("\nA soma das diagonais: " + soma);
         
         if (dif1 - dif2 == 0) {
             System.out.println("As duas somas são iguais.");
         } else if (dif1 > dif2) {
             System.out.println("A soma da diagonal principal e maior");
         } else {
             System.out.println("A soma da diagonal secundaria e maior");
         }
    }
    
}
