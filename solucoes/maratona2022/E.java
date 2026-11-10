import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Problema E — Estourando Balões
// Entrada de exemplo: 5 / 3 2 1 5 4
public class E {
    public static void main(String[] args) throws Exception {
        // BufferedReader é mais rápido que Scanner para muitos números
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(leitor.readLine().trim());     // n = 5
        StringTokenizer partes = new StringTokenizer(leitor.readLine());

        int[] flechas = new int[1_000_002]; // flechas[h] = flechas voando na altura h
        int resposta = 0;

        for (int i = 0; i < n; i++) {
            int h = Integer.parseInt(partes.nextToken());       // 3, 2, 1, 5, 4
            if (flechas[h] > 0) {
                flechas[h]--;      // já tem flecha nessa altura
            } else {
                resposta++;        // precisa de flecha nova (balões 3 e 5)
            }
            flechas[h - 1]++;      // a flecha continua uma altura abaixo
        }

        System.out.println(resposta);                           // imprime 2
    }
}
