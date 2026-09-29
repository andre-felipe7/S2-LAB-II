import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = Scanner.nextInt();
            }
        }

        boolean ehMagica = true;

        boolean numerosValidos = true;
        int[] contagem = new int[10];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = matriz[i][j];
                if (valor < 1 || valor > 9) {
                    numerosValidos = false;
                } else {
                    contagem[valor]++;
                }
            }
        }

        for (int num = 1; num <= 9; num++) {
            if (contagem[num] != 1) {
                numerosValidos = false;
                break;
            }
        }

        if (!numerosValidos) {
            System.out.println("Condição nao atendida");
            ehMagica = false;
        }

        int[] somaLinhas = new int[3];
        int[] somaColunas = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }

        int somaDiagPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int somaDiagSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];

        if (somaLinhas[0] != somaLinhas[1] || somaLinhas[1] != somaLinhas[2]) {
            System.out.println("Condição nao atendida");
            ehMagica = false;
        }

        if (somaColunas[0] != somaColunas[1] || somaColunas[1] != somaColunas[2]) {
            System.out.println("Condição nao atendida");
            ehMagica = false;
        }

        if (somaDiagPrincipal != somaDiagSecundaria) {
            System.out.println("Condição nao atendida");
            ehMagica = false;
        }

        if (ehMagica) {
            if (somaLinhas[0] != somaColunas[0] || somaLinhas[0] != somaDiagPrincipal) {
                System.out.println("Condiçao nao atendida");
                ehMagica = false;
            }
        }

        if (ehMagica) {
            System.out.println("A matriz e magica");
        } else {
            System.out.println("A matriz nao e magica.");
        }

    }
}