import java.util.Scanner;

public class Recordes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int maior = entrada.nextInt();
        int recordes = 1;

        for (int i = 1; i < n; i++) {
            int temperatura = entrada.nextInt();
            if (temperatura > maior) {
                maior = temperatura;
                recordes++;
            }
        }

        System.out.println(recordes);
    }
}
