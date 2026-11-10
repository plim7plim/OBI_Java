import java.util.Arrays;
import java.util.Scanner;

// Valores comentados para a entrada do exercício: 5 / 9 -2 9 1 3
public class Mediana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();         // n = 5
        int[] valores = new int[n];

        for (int i = 0; i < n; i++) {
            valores[i] = entrada.nextInt();
        }
        // valores = [9, -2, 9, 1, 3]

        Arrays.sort(valores);              // valores = [-2, 1, 3, 9, 9]
        System.out.println(valores[n / 2]); // n / 2 = 2, imprime 3
    }
}
