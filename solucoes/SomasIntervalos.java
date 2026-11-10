import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.IOException;

public class SomasIntervalos {
    public static void main(String[] args) throws IOException {
        BufferedInputStream entrada = new BufferedInputStream(System.in);
        int n = lerInt(entrada);
        int consultas = lerInt(entrada);

        long[] prefixo = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixo[i] = prefixo[i - 1] + lerInt(entrada);
        }

        StringBuilder saida = new StringBuilder();
        for (int i = 0; i < consultas; i++) {
            int esquerda = lerInt(entrada);
            int direita = lerInt(entrada);
            saida.append(prefixo[direita] - prefixo[esquerda - 1]).append('\n');
        }
        System.out.print(saida);
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
        while (caractere >= '0' && caractere <= '9') {
            valor = valor * 10 + caractere - '0';
            caractere = entrada.read();
        }
        return (int) (negativo ? -valor : valor);
    }
}
