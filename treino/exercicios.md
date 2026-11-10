# Exercícios

Em todos os exercícios, leia da entrada padrão e imprima apenas a resposta.

## Dia 1 — Recordes

Leia N (1 a 10.000) e N temperaturas inteiras entre -1.000 e 1.000. Conte quantas são estritamente maiores que todas as anteriores. A primeira sempre conta.

- Entrada: N = 6, temperaturas = -3 -3 -1 -2 0 0. Saída: 3.
- Teste também uma temperatura só e uma lista com todos os valores iguais.
- Dica: guarde o maior valor visto até agora.
- [Gabarito em Java](../solucoes/Recordes.java)

## Dia 1 — Maior sequência

Leia N (1 a 10.000) e N inteiros. Imprima o comprimento do maior trecho consecutivo em que todos os valores são iguais.

- Entrada: N = 7, valores = 4 4 2 4 4 4 2. Saída: 3.
- Teste também uma lista em que o maior trecho termina no último elemento.
- Dica: acompanhe o tamanho do trecho atual e o maior tamanho encontrado.

- [Gabarito em Java](../solucoes/MaiorSequencia.java)

## Dia 2 — Mediana

Leia N (ímpar, de 1 a 10.000) e N inteiros. Imprima o valor que fica no meio depois de ordenar os números em ordem crescente.

- Entrada: N = 5, valores = 9 -2 9 1 3. Saída: 3.
- Dica: depois de ordenar, qual é o índice do meio se o primeiro é zero?

- [Gabarito em Java](../solucoes/Mediana.java)

## Dia 2 — Frequências

Leia N (1 a 10.000) e N inteiros entre 0 e 100. Imprima o valor que mais aparece. Em caso de empate, imprima o menor.

- Entrada: N = 6, valores = 3 1 3 1 5 0. Saída: 1.
- Dica: use o próprio valor como índice de um vetor de contadores.

- [Gabarito em Java](../solucoes/Frequencias.java)

## Dia 3 — Somas de intervalos

Leia N e Q (cada um de 1 a 100.000), depois N inteiros entre -1.000.000.000 e 1.000.000.000. Em seguida, leia Q pares L e R (1 ≤ L ≤ R ≤ N). Para cada par, imprima a soma dos valores entre as posições L e R, inclusive, em uma linha.

```
Entrada
5 3
2 -1 4 3 2
1 3
2 5
4 4

Saída
5
8
3
```

- Dica: calcule uma vez a soma dos primeiros i elementos para cada i. Use long para as somas.
- Teste um intervalo que começa em 1 e outro que contém dois valores de 1.000.000.000 seguidos de mais um positivo.
- [Gabarito em Java](../solucoes/SomasIntervalos.java)
