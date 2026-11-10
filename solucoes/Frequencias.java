import java.util.Scanner;

// Valores comentados para a entrada do exercício: 6 / 3 1 3 1 5 0
public class Frequencias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();         // n = 6
        int[] contagem = new int[101];     // índices de 0 a 100, todos 0

        for (int i = 0; i < n; i++) {
            int valor = entrada.nextInt(); // 3, 1, 3, 1, 5, 0
            contagem[valor]++;
        }
        // contagem[0] = 1, contagem[1] = 2, contagem[3] = 2, contagem[5] = 1

        int resposta = 0;                  // começa no valor 0, que aparece 1 vez
        for (int valor = 1; valor < contagem.length; valor++) {
            // Se houver empate, mantemos o menor valor.
            if (contagem[valor] > contagem[resposta]) {
                resposta = valor;          // vira 1 (2 > 1); em 3, 2 > 2 é falso
            }
        }

        System.out.println(resposta);      // imprime 1
    }
}
