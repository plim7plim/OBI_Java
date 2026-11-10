import java.util.Scanner;

// Valores comentados para a entrada do exercício: 6 / -3 -3 -1 -2 0 0
public class Recordes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();        // n = 6
        int maior = entrada.nextInt();    // maior = -3
        int recordes = 1;                 // recordes = 1, a primeira sempre conta

        for (int i = 1; i < n; i++) {
            int temperatura = entrada.nextInt(); // -3, -1, -2, 0, 0
            if (temperatura > maior) {
                maior = temperatura;      // maior: -1 (i = 2), 0 (i = 4)
                recordes++;               // recordes: 2 (i = 2), 3 (i = 4)
            }
        }

        System.out.println(recordes);     // imprime 3
    }
}
