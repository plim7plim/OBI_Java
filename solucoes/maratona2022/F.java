import java.util.HashMap;
import java.util.Scanner;

// Problema F — Forca Multidimensional
// Ideia: troque o '*' de cada palavra por cada letra de 'a' a 'z' e conte
// quantas palavras do tabuleiro combinam com o resultado.
// Entrada de exemplo: 5 4 / rat* ru*d rot* r*ta r*ta
public class F {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int c = entrada.nextInt();
        String[] palavras = new String[n];
        HashMap<String, Integer> quantas = new HashMap<>();
        for (int i = 0; i < n; i++) {
            palavras[i] = entrada.next();
            quantas.put(palavras[i], quantas.getOrDefault(palavras[i], 0) + 1);
        }
        // quantas = {rat*=1, ru*d=1, rot*=1, r*ta=2}

        String melhor = "";
        int melhorConta = 0;

        for (String palavra : palavras) {
            for (char letra = 'a'; letra <= 'z'; letra++) {
                String p = palavra.replace('*', letra);          // ex.: "rata"

                // p combina com cada palavra igual a p com uma letra virada '*'
                int conta = 0;
                for (int j = 0; j < c; j++) {
                    String comEstrela = p.substring(0, j) + "*" + p.substring(j + 1);
                    conta += quantas.getOrDefault(comEstrela, 0);
                }
                // "rata": "rat*" (1) + "r*ta" (2) = 3

                if (conta > melhorConta || (conta == melhorConta && p.compareTo(melhor) < 0)) {
                    melhor = p;
                    melhorConta = conta;
                }
            }
        }

        System.out.println(melhor + " " + melhorConta);        // imprime "rata 3"
    }
}
