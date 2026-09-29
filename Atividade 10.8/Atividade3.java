import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] numeros = {12, 5, 8, 2, 7, 5, 4, 3, 4, 5, 8, 6, 2, 9, 10};
        
        int[] diferentes = new int[15];
        int Diferentes = 0;

        for (int i = 0; i < 15; i++) {

            boolean repetido = false;

            for (int j = 0; j < Diferentes; j++) {
                if (numeros[i] == diferentes[j]) {
                    repetido = true;
                }
            }

            if (repetido == false) {
                diferentes[Diferentes] = numeros[i];
                Diferentes++; 
            }
        }

        System.out.print("Saida: ");
        for (int i = 0; i < Diferentes; i++) {
            System.out.print(diferentes[i] + " ");
        }

        System.out.println("\nValores diferentes encontrados: " + Diferentes);
    }
}
