# Java para a OBI

Use esta apostila junto com os [exercícios](exercicios.md). No primeiro dia, pratique as seções 1 a 4. No segundo, vá até a seção 7. No terceiro, use a seção 8 para somas de intervalos. Consulte a seção 9 antes de submeter.

## 1. Estrutura de um programa

Salve este exemplo como `Main.java` para rodar localmente. Para submeter, use o nome de arquivo e de classe indicado na questão.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        System.out.println(a + b);
    }
}
```

Com a entrada `3 8`, a saída é `11`. Você também pode digitar um número por linha.

- `import` permite usar a classe `Scanner` pelo nome curto.
- `class Main` define a classe. Uma classe pública precisa ter o mesmo nome do arquivo.
- `main` é onde a execução começa. `void` indica que o método não devolve um valor.
- Chaves delimitam blocos. Declarações, atribuições e chamadas como `println` terminam com ponto e vírgula.
- `//` inicia um comentário de uma linha. `/* ... */` delimita um comentário de várias linhas.
- Java distingue maiúsculas de minúsculas. `String` e `string` são nomes diferentes.

```powershell
javac Main.java
"3 8" | java Main
```

## 2. Como declarar e mudar valores

O padrão é `tipo nome = valor;`. Declare uma vez e use o nome para ler ou alterar o valor.

```java
int pontos = 10;
pontos = pontos + 5;      // pontos agora vale 15
pontos += 2;             // 17
pontos++;                // 18
final int LIMITE = 100;  // constante
```

| Tipo | Exemplo | Uso |
|---|---|---|
| `int` | `int n = 42;` | Inteiros de −2³¹ até 2³¹−1 |
| `long` | `long total = 3_000_000_000L;` | Inteiros de −2⁶³ até 2⁶³−1 |
| `double` | `double media = 7.5;` | Valores com parte decimal |
| `boolean` | `boolean achou = false;` | Verdadeiro ou falso |
| `char` | `char letra = 'A';` | Um caractere simples, com aspas simples |
| `String` | `String nome = "Ana";` | Texto, com aspas duplas |

Uma variável local precisa receber um valor antes de ser lida. Uma variável declarada dentro de um bloco só existe naquele bloco. O índice declarado em `for (int i = 0; ...)` fica disponível dentro do laço.

### Operadores e conversões

| Sintaxe | Significado |
|---|---|
| `+ - * / %` | Soma, diferença, produto, divisão e resto |
| `= += -= *= /=` | Atribuição e atualização |
| `== != < <= > >=` | Comparações que resultam em `boolean` |
| `&&`, `\|\|`, `!` | E, ou, negação |
| `condicao ? a : b` | Escolhe `a` se a condição for verdadeira, ou `b` caso contrário |

```java
int quociente = 7 / 2;           // 3
double metade = 7 / 2.0;         // 3.5
int resto = 7 % 2;               // 1
int truncado = (int) 3.9;        // 3
int numero = Integer.parseInt("42");
long produto = 1L * 100_000 * 100_000; // 10.000.000.000
int maior = Math.max(12, 8);     // 12
```

Em um produto de dois `int`, a operação acontece em `int`, mesmo se o resultado for atribuído a um `long`. Converta um dos operandos antes de multiplicar. Para ordenar ou comparar inteiros, prefira `Integer.compare(a, b)` a `a - b`, que pode estourar.

## 3. Como pegar valores da entrada

Adicione `import java.util.Scanner;` no topo e crie um único leitor dentro de `main`.

```java
Scanner entrada = new Scanner(System.in);
int idade = entrada.nextInt();
long populacao = entrada.nextLong();
String palavra = entrada.next();
char inicial = palavra.charAt(0);
```

A entrada `15 3000000000 Ana` fornece `15`, `3000000000`, `"Ana"` e `'A'`. Esses métodos leem tokens separados por espaços, tabulações ou quebras de linha.

| Quero ler | Método |
|---|---|
| Inteiro | `nextInt()` |
| Inteiro grande | `nextLong()` |
| Decimal | `nextDouble()` |
| Uma palavra | `next()` |
| Uma linha inteira | `nextLine()` |
| Vários valores até acabar a entrada | `while (entrada.hasNextInt()) { ... }` |

Para decimais com ponto, adicione `import java.util.Locale;` e chame `entrada.useLocale(Locale.US);` antes de ler.

Se o enunciado dá um inteiro sozinho na primeira linha e um texto na segunda:

```java
int n = entrada.nextInt();
entrada.nextLine();                // consome o resto da primeira linha
String frase = entrada.nextLine(); // lê a segunda linha com espaços
```

Se o texto estiver na mesma linha do inteiro, a primeira chamada a `nextLine()` já devolve esse texto, incluindo o espaço separador.

### Como imprimir

```java
System.out.println(42);           // 42 e quebra de linha
System.out.print("3 ");           // sem quebra de linha
System.out.println(8);            // completa a linha "3 8"
System.out.printf(Locale.US, "%.2f%n", 3.5); // 3.50
```

Em uma submissão, imprima só o que o enunciado pede. Para muitas respostas, use `StringBuilder` e imprima uma vez ao final.

## 4. Condições e laços

```java
int nota = 7;
if (nota >= 7) {
    System.out.println("Aprovado");
} else if (nota >= 5) {
    System.out.println("Recuperacao");
} else {
    System.out.println("Reprovado");
}
```

```java
int soma = 0;
for (int i = 1; i <= 5; i++) { // início, condição, avanço
    soma += i;
}

int faltam = 3;
while (faltam > 0) {
    faltam--;
}

for (int i = 0; i < 10; i++) {
    if (i == 8) {
        break;             // sai do laço
    }
    if (i % 2 != 0) {
        continue;          // pula o restante desta iteração
    }
    System.out.println(i); // 0, 2, 4, 6, um por linha
}
```

Em `a && b`, Java só avalia `b` se `a` for verdadeiro. Isso permite escrever `i < v.length && v[i] == alvo` quando `i` é não negativo.

## 5. Vetores, matrizes e strings

```java
int[] v = new int[3];  // começa como {0, 0, 0}
v[0] = 9;
int primeiro = v[0];
int ultimo = v[v.length - 1]; // se o vetor tiver pelo menos um elemento

int[] dados = {9, -2, 4};
for (int i = 0; i < dados.length; i++) {
    System.out.println(dados[i]);
}
for (int valor : dados) { // quando você só precisa do valor
    System.out.println(valor);
}
```

### Ler N números e guardar no vetor

```java
int n = entrada.nextInt();
int[] valores = new int[n];
for (int i = 0; i < n; i++) {
    valores[i] = entrada.nextInt();
}
int primeiraPosicao = valores[0]; // quando n > 0
int posicaoDoEnunciado = 2;
int valorNaPosicao = valores[posicaoDoEnunciado - 1]; // quando n >= 2
```

Se a entrada for `3 8 4 9`, o vetor fica `[8, 4, 9]` e o valor da posição 2 do enunciado é `4`.

Para ler uma matriz com `linhas` e `colunas` já conhecidas:

```java
int[][] grade = new int[linhas][colunas];
for (int i = 0; i < linhas; i++) {
    for (int j = 0; j < colunas; j++) {
        grade[i][j] = entrada.nextInt();
    }
}
```

```java
String texto = "banana";
int tamanho = texto.length();     // 6
char letra = texto.charAt(0);      // 'b'
String pedaco = texto.substring(1, 4); // "ana", fim excluído
boolean igual = texto.equals("banana");
boolean temAna = texto.contains("ana");
int posicao = texto.indexOf('n');  // 2; devolve -1 se não encontrar
```

Use `v.length` para vetor, `texto.length()` para string e `lista.size()` para coleção. Compare o conteúdo de strings com `.equals()`. Para letras de `a` a `z`, `letra - 'a'` produz um índice de 0 a 25.

## 6. Métodos

Declare métodos dentro da classe, fora de `main`. Use `static` para chamar diretamente a partir do `main`.

```java
static int contarPares(int[] valores) {
    int quantidade = 0;
    for (int valor : valores) {
        if (valor % 2 == 0) {
            quantidade++;
        }
    }
    return quantidade;
}
```

No `main`, chame com `int resposta = contarPares(new int[]{2, 7, 4});`. O tipo antes do nome é o tipo retornado. Um método `void` executa ações sem retornar um valor. Se um método alterar uma posição do vetor recebido, o chamador verá essa alteração.

## 7. Biblioteca que vale decorar

Adicione os imports correspondentes, como `import java.util.Arrays;`. Nas coleções genéricas, escreva `Integer` ou `Long` para números inteiros.

```java
int[] v = {7, 2, 4};
Arrays.sort(v);                            // {2, 4, 7}
int indice = Arrays.binarySearch(v, 4);    // 1; negativo se ausente
Arrays.fill(v, -1);                        // {-1, -1, -1}

ArrayList<Integer> lista = new ArrayList<>();
lista.add(10);
lista.add(20);
int item = lista.get(0);                   // 10
lista.set(0, 30);
lista.sort(null);                          // ordem crescente

HashSet<Integer> vistos = new HashSet<>();
vistos.add(8);
boolean repetido = vistos.contains(8);

HashMap<Integer, Integer> frequencia = new HashMap<>();
int valor = 8;
frequencia.put(valor, frequencia.getOrDefault(valor, 0) + 1);

ArrayDeque<Integer> fila = new ArrayDeque<>();
fila.addLast(10);
fila.addLast(20);
int primeiro = fila.removeFirst();         // 10

ArrayDeque<Integer> pilha = new ArrayDeque<>();
pilha.push(10);
pilha.push(20);
int topo = pilha.pop();                    // 20

PriorityQueue<Integer> menores = new PriorityQueue<>();
menores.add(20);
menores.add(10);
int menor = menores.remove();              // 10
```

Use `isEmpty()` antes de remover se a coleção puder estar vazia. Para desempatar, faça a comparação explicitamente. `HashMap` e `HashSet` não garantem a ordem de iteração.

## 8. Padrões de prova

| Quando a questão pede… | Experimente… | Custo |
|---|---|---|
| Maior valor ou contagem | Percorrer uma vez, atualizando a resposta | O(N) |
| Frequência com valores de 0 a 100 | `int[] cont = new int[101];` e `cont[x]++;` | O(N + 101) |
| Mediana | Ordenar e acessar `v[v.length / 2]` se N for ímpar | O(N log N) |
| Muitas somas em intervalos fixos | Pré-calcular prefixos | O(N + Q) |
| Descobrir se um valor já apareceu | Guardar valores em `HashSet` | O(N) em média |

Com N = Q = 100.000, somar todos os valores de cada consulta pode chegar a 10 bilhões de operações. Para uma consulta com posições de 1 a N, use:

```java
long[] prefixo = new long[n + 1];
for (int i = 1; i <= n; i++) {
    prefixo[i] = prefixo[i - 1] + entrada.nextInt();
}
long soma = prefixo[r] - prefixo[l - 1];
```

`prefixo[0]` vale zero. Em `[2, -1, 4]`, os prefixos são `[0, 2, 1, 5]`. A soma de 2 até 3 é `5 - 2 = 3`. Veja o [programa completo com leitura rápida](../solucoes/SomasIntervalos.java).

## 9. Antes de submeter

1. Rode o exemplo da questão.
2. Crie um caso mínimo, um caso de empate e um caso no limite dos valores, se forem possíveis.
3. Confira se o enunciado numera as posições a partir de 1 e se o seu vetor começa em 0.
4. Estime o maior valor de uma soma ou produto antes de escolher entre `int` e `long`.
5. Confira nome da classe e do arquivo, formato da saída e ausência de mensagens de depuração.

| Sintoma | O que verificar |
|---|---|
| `cannot find symbol` | Nome digitado, escopo e imports |
| `ArrayIndexOutOfBoundsException` | Se o índice está entre 0 e `length - 1` |
| `InputMismatchException` | Se o leitor espera o tipo correto e se um inteiro cabe no tipo |
| Linha vazia após `nextInt()` | Se `nextLine()` está lendo o fim da linha anterior |
| Resposta errada | Empate, negativos, limites inclusivos e overflow |
| Tempo excedido | Complexidade, volume de entrada e quantidade de chamadas de impressão |

Volte aos [exercícios](exercicios.md) e tente reescrever cada solução de memória depois de entender o gabarito.
