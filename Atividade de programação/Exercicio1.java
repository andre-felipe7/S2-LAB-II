import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
        int[] idade = new int [3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a idade " + (i + 1));
            idade[i] = ler.nextInt();
            
            if (idade[i] <= 5) {
                System.out.println("Idade minima > 5, idade maxima < 100, digite outra:");
                idade[i] = ler.nextInt();
            } else if (idade[i] >= 100) {
                System.out.println("Idade maxima < 100, idade minima > 5, digite outra:");
                idade[i] = ler.nextInt();
            }
        }
        if ((idade[0] >= idade[1] && idade[0] <= idade[2]) || (idade[0] <= idade[1] && idade[0] >= idade[2])) {
            System.out.println("A idade de Camile e: " + idade[0]);
        } else if ((idade[1] >= idade[0] && idade[1] <= idade[2]) || (idade[1] <= idade[0] && idade[1] >= idade[2])) {
            System.out.println("A idade de Camile e: " + idade[1]);
        } else {
            System.out.println("A idade de Camile e: " + idade[2]);
        }
    }
}