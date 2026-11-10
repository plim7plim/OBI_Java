import java.util.Scanner;

public class Frequencias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int[] contagem = new int[101];

        for (int i = 0; i < n; i++) {
            int valor = entrada.nextInt();
            contagem[valor]++;
        }

        int resposta = 0;
        for (int valor = 1; valor < contagem.length; valor++) {
            // Se houver empate, mantemos o menor valor.
            if (contagem[valor] > contagem[resposta]) {
                resposta = valor;
            }
        }

        System.out.println(resposta);
    }
}
