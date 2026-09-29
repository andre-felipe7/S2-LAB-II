import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        char[][] tabuleiro = new char[8][8];
        boolean[][] gabaritoNavios = new boolean[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = '~';
            }
        }

        System.out.println("Cadastro dos navios");
        int naviosCadastrados = 0;
        while (naviosCadastrados < 5) {
            System.out.println("Cadastrando Navio " + (naviosCadastrados + 1) + ":");
            System.out.print("Linha (0 a 7): ");
            int l = Scanner.nextInt();
            System.out.print("Coluna (0 a 7): ");
            int c = Scanner.nextInt();

            if (l < 0 || l >= 8 || c < 0 || c >= 8) {
                System.out.println("Posicao fora do tabuleiro");
            } else if (gabaritoNavios[l][c]) {
                System.out.println("Ja existe um navio nessa posicao\n");
            } else {
                gabaritoNavios[l][c] = true;
                naviosCadastrados++;
                System.out.println("Navio posicionado");
            }
        }

        System.out.println("Inicio de jogo");
        int disparosRestantes = 15;
        int acertos = 0;
        int erros = 0;
        int disparosRepetidos = 0;

        while (disparosRestantes > 0 && acertos < 5) {
            System.out.println("Disparos restantes: " + disparosRestantes);
            
            System.out.print("Linha do disparo (0 a 7): ");
            int l = Scanner.nextInt();
            System.out.print("Coluna do disparo (0 a 7): ");
            int c = Scanner.nextInt();

            if (l < 0 || l >= 8 || c < 0 || c >= 8) {
                System.out.println("Disparo fora do tabuleiro");
                continue;
            }

            if (tabuleiro[l][c] == 'X' || tabuleiro[l][c] == 'o') {
                System.out.println("Voce ja disparou nessa posicao");
                disparosRepetidos++;
            } else if (gabaritoNavios[l][c]) {
                System.out.println("Voce atingiu um navio!");
                tabuleiro[l][c] = 'X';
                acertos++;
                disparosRestantes--;
            } else {
                System.out.println("Erou");
                tabuleiro[l][c] = 'o';
                erros++;
                disparosRestantes--;
            }
        }

        System.out.println("Fim do jogo");
        if (acertos == 5) {
            System.out.println("Voce destruiu todosnavios");
        } else {
            System.out.println("Fim dos disparos");
        }

        System.out.println("Estatisticas da partida");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
        System.out.println("Disparos repetidos: " + disparosRepetidos);

    }
}