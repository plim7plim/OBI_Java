import java.util.Scanner;

// Problema D — Deslocando Partículas
// Cada ativação "corta pela metade". Depois de k ativações, x termina com N-1-k zeros em binário.
// Então k = N - 1 - (zeros no fim de x).
// Entrada de exemplo: 4 12 4
public class D {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();                                   // n = 4
        int x = entrada.nextInt();                                   // x = 12 (1100 em binário)
        int zerosNoFim = Integer.numberOfTrailingZeros(x);           // 2
        System.out.println(n - 1 - zerosNoFim);                      // 4 - 1 - 2 = 1
    }
}
