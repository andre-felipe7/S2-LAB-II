import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
        char[] resultados = new char[6];
        int vitorias = 0;
        
        System.out.println("Digite os resultados dos 6 jogos (V para Vitoria, P para Perda):");
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Jogo " + (i + 1) + ": ");
            resultados[i] = ler.next().charAt(0);
            
            if (resultados[i] == 'V' || resultados[i] == 'v') {
                vitorias++;
            }
        }
        
        System.out.print("Grupo do participante: ");
        if (vitorias == 5 || vitorias == 6) {
            System.out.println(1);
        } else if (vitorias == 3 || vitorias == 4) {
            System.out.println(2);
        } else if (vitorias == 1 || vitorias == 2) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}