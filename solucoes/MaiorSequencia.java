import java.util.Scanner;

// Valores comentados para a entrada do exercício: 7 / 4 4 2 4 4 4 2
public class MaiorSequencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();         // n = 7
        int anterior = entrada.nextInt();  // anterior = 4
        int atual = 1;                     // tamanho do trecho atual
        int maior = 1;                     // maior trecho visto

        for (int i = 1; i < n; i++) {
            int valor = entrada.nextInt(); // 4, 2, 4, 4, 4, 2
            if (valor == anterior) {
                atual++;
            } else {
                atual = 1;
            }
            // atual: 2, 1, 1, 2, 3, 1
            maior = Math.max(maior, atual);
            // maior: 2, 2, 2, 2, 3, 3
            anterior = valor;
        }

        System.out.println(maior);         // imprime 3
    }
}
