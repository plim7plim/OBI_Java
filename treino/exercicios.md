# Exercícios

Em todos os exercícios, leia da entrada padrão e imprima apenas a resposta.

Para cada exercício:

1. Leia o enunciado e refaça o exemplo à mão.
2. Escreva a sua solução sem abrir o gabarito.
3. Rode com o exemplo e com os casos da linha **Teste também**. O [README](../README.md#rodar-localmente) mostra como rodar.
4. Só então compare com o gabarito. Ele traz, em comentários, o valor de cada variável para a entrada de exemplo.

| Dia | Exercício | Técnica | Apostila |
|---|---|---|---|
| 1 | [Recordes](#dia-1--recordes) | Uma passada guardando o maior | [Seção 4](java.md#4-condições-e-laços) |
| 1 | [Maior sequência](#dia-1--maior-sequência) | Uma passada com contador de trecho | [Seção 4](java.md#4-condições-e-laços) |
| 2 | [Mediana](#dia-2--mediana) | Ordenação | [Seção 7](java.md#7-biblioteca-que-vale-decorar) |
| 2 | [Frequências](#dia-2--frequências) | Vetor de contadores | [Seção 8](java.md#8-padrões-de-prova) |
| 3 | [Somas de intervalos](#dia-3--somas-de-intervalos) | Soma de prefixos e leitura rápida | [Seções 8](java.md#8-padrões-de-prova) e [9](java.md#9-entrada-grande) |
| 4 | [Problema I](#problema-i--interceptando-informações) | Uma passada | [Seção 4](java.md#4-condições-e-laços) |
| 4 | [Problema A](#problema-a--achando-os-monótonos-não-triviais-maximais) | Blocos de letras iguais | [Seção 10](java.md#10-strings-e-letras) |
| 4 | [Problema J](#problema-j--jogando-23) | Simulação com contagem | [Seção 8](java.md#8-padrões-de-prova) |
| 4 | [Problema E](#problema-e--estourando-balões) | Guloso com vetor de contadores | [Seção 19](java.md#19-guloso) |
| 4 | [Problema D](#problema-d--deslocando-partículas) | Padrão em binário | [Seção 11](java.md#11-números-grandes-e-contas-úteis) |
| 4 | [Problema F](#problema-f--forca-multidimensional) | Contagem com `HashMap` | [Seção 7](java.md#7-biblioteca-que-vale-decorar) |

## Dia 1 — Recordes

Leia N (1 a 10.000) e N temperaturas inteiras entre -1.000 e 1.000. Conte quantas são estritamente maiores que todas as anteriores. A primeira sempre conta.

```
Entrada
6
-3 -3 -1 -2 0 0

Saída
3
```

- **Teste também:** uma temperatura só, e uma lista com todos os valores iguais.
- **Dica:** guarde o maior valor visto até agora.
- [Gabarito em Java](../solucoes/Recordes.java)

## Dia 1 — Maior sequência

Leia N (1 a 10.000) e N inteiros. Imprima o comprimento do maior trecho consecutivo em que todos os valores são iguais.

```
Entrada
7
4 4 2 4 4 4 2

Saída
3
```

- **Teste também:** uma lista em que o maior trecho termina no último elemento.
- **Dica:** acompanhe o tamanho do trecho atual e o maior tamanho encontrado.
- [Gabarito em Java](../solucoes/MaiorSequencia.java)

## Dia 2 — Mediana

Leia N (ímpar, de 1 a 10.000) e N inteiros. Imprima o valor que fica no meio depois de ordenar os números em ordem crescente.

```
Entrada
5
9 -2 9 1 3

Saída
3
```

- **Teste também:** N = 1.
- **Dica:** depois de ordenar, qual é o índice do meio se o primeiro é zero?
- [Gabarito em Java](../solucoes/Mediana.java)

## Dia 2 — Frequências

Leia N (1 a 10.000) e N inteiros entre 0 e 100. Imprima o valor que mais aparece. Em caso de empate, imprima o menor.

```
Entrada
6
3 1 3 1 5 0

Saída
1
```

- **Teste também:** uma lista só com o valor 100, e uma em que todos os valores aparecem uma vez.
- **Dica:** use o próprio valor como índice de um vetor de contadores.
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

- **Teste também:** um intervalo que começa em 1, e outro que contém dois valores de 1.000.000.000 seguidos de mais um positivo.
- **Dica:** calcule uma vez a soma dos primeiros i elementos para cada i. Use `long` para as somas.
- **Compare:** escreva primeiro a versão direta, que soma de L até R a cada consulta. Com N = Q = 100.000 ela pode chegar a 10 bilhões de operações, e a soma de prefixos faz o mesmo em O(N + Q).
- [Gabarito em Java](../solucoes/SomasIntervalos.java)

## Dia 4 — Maratona 2022

Os seis problemas abaixo são da primeira fase da XXVII Maratona de Programação, de 2022. Os enunciados aqui estão resumidos. O texto completo, com limites e mais exemplos, está no [caderno de problemas oficial](https://maratona.sbc.org.br/hist/2022/primfase22/). Eles estão em ordem de dificuldade, não em ordem alfabética.

### Problema I — Interceptando Informações

Leia 8 números, cada um 0, 1 ou 9. Imprima `S` se nenhum for 9, ou `F` se algum for 9.

```
Entrada
0 0 1 9 0 1 0 1

Saída
F
```

- [Gabarito em Java](../solucoes/maratona2022/I.java)

### Problema A — Achando os Monótonos Não-Triviais Maximais

Leia N e uma palavra de N letras, só com `a` e `b`. Some o tamanho dos blocos de `a` seguidos que têm 2 letras ou mais.

```
Entrada
10
aababaaabb

Saída
5
```

Os blocos que contam são `aa` e `aaa`.

- **Dica:** é parecido com Maior sequência.
- [Gabarito em Java](../solucoes/maratona2022/A.java)

### Problema J — Jogando 23

João e Maria somam, cada um, as próprias 2 cartas e todas as cartas da mesa. As cartas vão de 1 a 13, as cartas 11, 12 e 13 valem 10 pontos, e cada carta tem 4 cópias no baralho. A próxima carta virada na mesa conta para os dois. Maria vence se chegar a 23, ou se João passar de 23 e ela ficar abaixo. Imprima a menor carta ainda disponível que faz Maria vencer na próxima rodada, ou -1 se não houver.

A entrada traz N, as 2 cartas de João, as 2 cartas de Maria e as N cartas da mesa.

```
Entrada
2
8 4
4 1
4 4

Saída
5
```

João tem 20 pontos e Maria tem 13. Com um 4, João faria 24 e Maria venceria, mas as quatro cópias do 4 já saíram. Com um 5, João faz 25 e Maria fica em 18.

- **Dica:** conte quantas cópias de cada carta já apareceram e teste as cartas de 1 a 13 em ordem.
- [Gabarito em Java](../solucoes/maratona2022/J.java)

### Problema E — Estourando Balões

Há N balões em fila, da esquerda para a direita, com alturas H. Uma flecha é lançada da esquerda em uma altura à sua escolha. Quando ela estoura um balão, continua voando uma altura abaixo. Imprima o menor número de flechas que estoura todos os balões.

```
Entrada
5
3 2 1 5 4

Saída
2
```

Uma flecha na altura 3 estoura os balões 3, 2 e 1. Outra na altura 5 estoura o 5 e o 4.

- **Dica:** guarde quantas flechas estão voando em cada altura.
- [Gabarito em Java](../solucoes/maratona2022/E.java)

### Problema D — Deslocando Partículas

Uma partícula começa no centro de um quadrado de lado 2^N, na posição (2^(N-1), 2^(N-1)). Cada ativação leva a partícula até o ponto médio entre ela e um dos quatro cantos do quadrado. Leia N, x e y e imprima quantas ativações levam a partícula até (x, y).

```
Entrada
4 12 4

Saída
1
```

O quadrado tem lado 16 e a partícula começa em (8, 8). O ponto médio entre (8, 8) e o canto (16, 0) é (12, 4).

- **Dica:** olhe quantos zeros x tem no fim, em binário.
- [Gabarito em Java](../solucoes/maratona2022/D.java)

### Problema F — Forca Multidimensional

Leia N e C, depois N palavras de tamanho C. Cada palavra tem exatamente um `*`, que combina com qualquer letra. Ache a palavra sem `*` que combina com mais palavras da entrada e imprima essa palavra e a quantidade. Em caso de empate, imprima a menor em ordem alfabética.

```
Entrada
5 4
rat*
ru*d
rot*
r*ta
r*ta

Saída
rata 3
```

`rata` combina com `rat*` e com as duas `r*ta`.

- **Dica:** troque o `*` por cada letra de `a` a `z` e conte com um `HashMap`.
- [Gabarito em Java](../solucoes/maratona2022/F.java)
