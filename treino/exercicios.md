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

## Dia 4 — Maratona 2022, problema I

Leia 8 números, cada um 0, 1 ou 9. Imprima `S` se nenhum for 9, ou `F` se algum for 9.

- Entrada: 0 0 1 9 0 1 0 1. Saída: F.
- [Gabarito em Java](../solucoes/maratona2022/I.java)

## Dia 4 — Maratona 2022, problema A

Leia N e uma palavra só com `a` e `b`. Some o tamanho dos blocos de `a` seguidos que têm 2 letras ou mais.

- Entrada: N = 10, palavra = aababaaabb. Saída: 5 (blocos `aa` e `aaa`).
- Dica: é parecido com Maior sequência.
- [Gabarito em Java](../solucoes/maratona2022/A.java)

## Dia 4 — Maratona 2022, problema J

Jogo de 23: cada jogador soma as próprias 2 cartas e as cartas da mesa. Cartas 11, 12 e 13 valem 10, e cada carta tem 4 cópias. Imprima a menor carta que faz Maria vencer na próxima rodada, ou -1. Maria vence se chegar a 23, ou se João passar de 23 e ela ficar abaixo.

- Entrada: N = 2, João = 8 4, Maria = 4 1, mesa = 4 4. Saída: 5.
- [Gabarito em Java](../solucoes/maratona2022/J.java)

## Dia 4 — Maratona 2022, problema E

Balões em fila com alturas H. Uma flecha estoura um balão da sua altura e desce 1. Imprima o menor número de flechas.

- Entrada: N = 5, alturas = 3 2 1 5 4. Saída: 2.
- Dica: guarde quantas flechas estão voando em cada altura.
- [Gabarito em Java](../solucoes/maratona2022/E.java)

## Dia 4 — Maratona 2022, problema D

Leia N, x e y. Imprima quantas ativações levam a partícula até (x, y).

- Entrada: 4 12 4. Saída: 1.
- Dica: olhe quantos zeros x tem no fim, em binário.
- [Gabarito em Java](../solucoes/maratona2022/D.java)

## Dia 4 — Maratona 2022, problema F

N palavras de tamanho C, cada uma com um `*`. Ache a palavra sem `*` que combina com mais palavras. Em caso de empate, imprima a menor em ordem alfabética.

- Entrada: rat\* ru\*d rot\* r\*ta r\*ta. Saída: rata 3.
- Dica: troque o `*` por cada letra de `a` a `z` e conte com um `HashMap`.
- [Gabarito em Java](../solucoes/maratona2022/F.java)
