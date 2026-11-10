import java.util.Arrays;
import java.util.Scanner;

public class Mediana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int[] valores = new int[n];

        for (int i = 0; i < n; i++) {
            valores[i] = entrada.nextInt();
        }

        Arrays.sort(valores);
        System.out.println(valores[n / 2]);
    }
}
