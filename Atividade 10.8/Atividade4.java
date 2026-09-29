import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[][] original = {
            { 1,  2,  3,  4,  5},
            { 6,  7,  8,  9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        int[][] rotacionada = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                rotacionada[j][4 - i] = original[i][j];
            }
        }

        System.out.println("Matriz original");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(original[i][j]); 
            }
        }

        System.out.println("\nMatriz rotacionada");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(rotacionada[i][j]);
            }
        }
        
    }
    
}