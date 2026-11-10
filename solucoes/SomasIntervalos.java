import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;

// Valores comentados para a entrada do exercício:
// 5 3 / 2 -1 4 3 2 / 1 3 / 2 5 / 4 4
public class SomasIntervalos {
    public static void main(String[] args) throws IOException {
        BufferedInputStream entrada = new BufferedInputStream(System.in);
        int n = lerInt(entrada);          // n = 5
        int consultas = lerInt(entrada);  // consultas = 3

        long[] prefixo = new long[n + 1]; // [0, 0, 0, 0, 0, 0]
        for (int i = 1; i <= n; i++) {
            prefixo[i] = prefixo[i - 1] + lerInt(entrada); // lê 2, -1, 4, 3, 2
        }
        // prefixo = [0, 2, 1, 5, 8, 10]

        StringBuilder saida = new StringBuilder();
        for (int i = 0; i < consultas; i++) {
            int esquerda = lerInt(entrada); // 1, 2, 4
            int direita = lerInt(entrada);  // 3, 5, 4
            saida.append(prefixo[direita] - prefixo[esquerda - 1]).append('\n');
            // 5 - 0 = 5, 10 - 2 = 8, 8 - 5 = 3
        }
        System.out.print(saida);          // imprime 5, 8 e 3, um por linha
    }

    // Lê um inteiro com sinal opcional em uma entrada válida de competição.
    static int lerInt(BufferedInputStream entrada) throws IOException {
        int caractere = entrada.read();
        while (caractere != -1 && caractere <= ' ') {
            caractere = entrada.read();
        }
        if (caractere == -1) {
            throw new EOFException("Fim da entrada antes do próximo inteiro");
        }

        boolean negativo = caractere == '-';
        if (negativo || caractere == '+') {
            caractere = entrada.read();
        }

        // Acumula em long para comportar o módulo de Integer.MIN_VALUE.
        long valor = 0;
        // Para o texto "-12": negativo = true; valor passa por 1 e 12; retorna -12.
        while (caractere >= '0' && caractere <= '9') {
            valor = valor * 10 + caractere - '0';
            caractere = entrada.read();
        }
        return (int) (negativo ? -valor : valor);
    }
}
