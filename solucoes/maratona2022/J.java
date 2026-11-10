import java.util.Scanner;

// Problema J — Jogando 23
// Cada carta (1 a 13) tem 4 cópias. Cartas 11, 12 e 13 valem 10.
// Maria vence se chegar a 23, ou se João passar de 23 e ela ficar abaixo.
// Entrada de exemplo: 2 / 8 4 / 4 1 / 4 4
public class J {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int[] usadas = new int[14];
        int joao = 0, maria = 0;

        for (int i = 0; i < 2; i++) {          // cartas de João: 8, 4
            int c = entrada.nextInt();
            usadas[c]++;
            joao += Math.min(c, 10);
        }
        for (int i = 0; i < 2; i++) {          // cartas de Maria: 4, 1
            int c = entrada.nextInt();
            usadas[c]++;
            maria += Math.min(c, 10);
        }
        for (int i = 0; i < n; i++) {          // cartas da mesa: 4, 4 (contam para os dois)
            int c = entrada.nextInt();
            usadas[c]++;
            joao += Math.min(c, 10);
            maria += Math.min(c, 10);
        }
        // joao = 20, maria = 13

        for (int c = 1; c <= 13; c++) {
            if (usadas[c] == 4) continue;      // o 4 acabou
            int j = joao + Math.min(c, 10);
            int m = maria + Math.min(c, 10);
            if (m == 23 || (j > 23 && m < 23)) {
                System.out.println(c);         // imprime 5
                return;
            }
        }
        System.out.println(-1);
    }
}
