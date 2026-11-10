import java.util.Scanner;
import java.util.Locale; //converter decimal do jeito correto pra não dar conflito

public class praticando {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        System.out.println(a + b);//calculadora simples nojenta

        int pontos = 10; //começam valendo 10
        pontos = pontos + 10; //recebe ele mesmo + 10 agora valem 20
        pontos -= 8; //valem 12
        pontos ++; //valem 13
        System.out.println("pontos: " +pontos);

        System.out.println("byte:   " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short:  " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("int:    " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long:   " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
        System.out.println("float:  " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
        System.out.println("char:   " + (int) Character.MIN_VALUE + " a " + (int) Character.MAX_VALUE);

        int soma = 0;
        for (int i = 0;i<10; i++){
            soma++;
            System.out.println(soma);
        } //estrutura simples do array


        System.out.println(42);                       // 42 e quebra de linha
        System.out.print("3 ");                       // sem quebra de linha
        System.out.println(8);                        // completa a linha "3 8"
        System.out.printf(Locale.US, "%.2f%n", 3.5);  // 3.50 e quebra de linha


        int nota = 1;

        if (nota==10){ //não existe === pq é fortemente tipada
            System.out.println("Pabens paçou ");
        }else if(nota >= 7 & nota< 10){
            System.out.println("Passsou ");
        }else{
            System.out.println("reprovado");
        }


    }
}
