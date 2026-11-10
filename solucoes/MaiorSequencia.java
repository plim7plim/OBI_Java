import java.util.Scanner;

public class MaiorSequencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int anterior = entrada.nextInt();
        int atual = 1;
        int maior = 1;

        for (int i = 1; i < n; i++) {
            int valor = entrada.nextInt();
            if (valor == anterior) {
                atual++;
            } else {
                atual = 1;
            }
            maior = Math.max(maior, atual);
            anterior = valor;
        }

        System.out.println(maior);
    }
}
