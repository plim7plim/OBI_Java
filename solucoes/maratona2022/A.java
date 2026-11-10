import java.util.Scanner;

// Problema A — Achando os Monótonos Não-Triviais Maximais
// Valores comentados para a entrada: 10 / aababaaabb
public class A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();      // n = 10
        String s = entrada.next();      // s = "aababaaabb"

        long resposta = 0;
        int inicio = 0;
        while (inicio < n) {
            int fim = inicio;
            while (fim < n && s.charAt(fim) == s.charAt(inicio)) {
                fim++;
            }
            int tamanho = fim - inicio; // blocos: aa(2) b(1) a(1) b(1) aaa(3) bb(2)
            if (s.charAt(inicio) == 'a' && tamanho >= 2) {
                resposta += tamanho;    // resposta: 2, depois 5
            }
            inicio = fim;               // pula para o próximo bloco
        }

        System.out.println(resposta);   // imprime 5
    }
}
