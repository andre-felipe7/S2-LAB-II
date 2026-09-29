import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int qtdalu1 = 0, qtdalu2 = 0;
        double mediaT = 0, Mnota = 0, mnota = 0, soma = 0;
        double[] notas = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Qual a nota numero " + (i + 1) + ":");
            notas[i] = ler.nextDouble();

            soma += notas[i];

            if (i == 0) { 
                Mnota = notas[i];
                mnota = notas[i];
            } 
            if (notas[i] > Mnota) Mnota = notas[i];
            if (notas[i] < mnota) mnota = notas[i];
            

            if (notas[i] >= 7) {
                qtdalu1++; 
            }
        }

        mediaT = soma / 10;

        for (int i = 0; i < 10; i++) {
            if (notas[i] < mediaT) {
                qtdalu2++;
            }
        }

        System.out.println("RESULTADOS");
        System.out.println("Media da turma: " + mediaT);
        System.out.println("Maior nota: " + Mnota);
        System.out.println("Menor nota: " + mnota);
        System.out.println("Alunos com nota >= 7: " + qtdalu1);
        System.out.println("Alunos abaixo da media: " + qtdalu2);
    }
}