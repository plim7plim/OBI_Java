import java.util.Scanner;

// Problema I — Interceptando Informações
// Valores comentados para a entrada: 0 0 1 9 0 1 0 1
public class I {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean falhou = false;
        for (int i = 0; i < 8; i++) {
            int bit = entrada.nextInt(); // 0, 0, 1, 9, 0, 1, 0, 1
            if (bit == 9) {
                falhou = true;           // vira true no 4º valor
            }
        }
        System.out.println(falhou ? "F" : "S"); // imprime F
    }
}
