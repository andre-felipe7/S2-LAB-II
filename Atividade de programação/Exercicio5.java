import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o numero, distancia (m) e velocidade (km/h) da 1ª charrete:");
        int n1 = ler.nextInt();
        double d1 = ler.nextDouble();
        double v1 = ler.nextDouble();
        
        System.out.println("Digite o numero, distancia (m) e velocidade (km/h) da 2ª charrete:");
        int n2 = ler.nextInt();
        double d2 = ler.nextDouble();
        double v2 = ler.nextDouble();

        double tempo1 = d1 / v1;
        double tempo2 = d2 / v2;

        if (tempo1 < tempo2) {
            System.out.println("Charrete vencedora: " + n1);
        } else {
            System.out.println("Charrete vencedora: " + n2);
        }
    }
}