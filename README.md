# OBI em Java — 4 dias

Material de treino para a modalidade Programação da [OBI](https://olimpiada.ic.unicamp.br/) usando Java: uma apostila da linguagem, um guia das regras da prova e exercícios com gabarito comentado.

## Por onde começar

1. Leia as seções 1 a 8 da [apostila de Java](treino/java.md). Elas cobrem declarações, entrada e saída, laços, vetores, strings, métodos e coleções.
2. Leia o [guia da prova](treino/guia-obi.md): nome do arquivo e da classe, pontuação por subtarefas e roteiro para o dia.
3. Faça os [exercícios](treino/exercicios.md) na ordem do plano abaixo. Tente cada questão antes de abrir o gabarito.
4. Estude as seções 9 a 21 da apostila conforme os exercícios pedirem: leitura rápida, ordenação com critério, busca binária, mapas, grafos, programação dinâmica e o checklist de submissão.

## Plano de 4 dias

| Dia | Exercícios | Meta |
|---|---|---|
| 1 | [Recordes](treino/exercicios.md#dia-1--recordes) e [Maior sequência](treino/exercicios.md#dia-1--maior-sequência) | Ler a entrada e resolver cada questão em uma passada |
| 2 | [Mediana](treino/exercicios.md#dia-2--mediana) e [Frequências](treino/exercicios.md#dia-2--frequências) | Praticar ordenação, vetores e contagem |
| 3 | [Somas de intervalos](treino/exercicios.md#dia-3--somas-de-intervalos) | Comparar uma solução direta com soma de prefixos |
| 4 | [Maratona 2022](treino/exercicios.md#dia-4--maratona-2022): problemas I, A, J, E, D e F | Resolver problemas reais de prova, do mais fácil ao mais difícil |

Depois de cada tentativa, anote a ideia, a complexidade e um caso que você esqueceu de testar.

Para o simulado, escolha um caderno em https://olimpiada.ic.unicamp.br/pratique/ e siga a seção 8 do guia da prova.

## O que há no repositório

| Caminho | Conteúdo |
|---|---|
| [`treino/java.md`](treino/java.md) | Apostila de Java com só o que cai na OBI, em 21 seções |
| [`apostila-java-obi.pdf`](apostila-java-obi.pdf) | A mesma apostila em PDF, para imprimir ou ler sem Internet |
| [`treino/guia-obi.md`](treino/guia-obi.md) | Regras, pontuação, ambiente de prova e estratégia |
| [`treino/exercicios.md`](treino/exercicios.md) | Enunciados dos 4 dias, com exemplo, dica e link do gabarito |
| [`solucoes/`](solucoes) | Gabaritos dos dias 1 a 3, um arquivo por exercício |
| [`solucoes/maratona2022/`](solucoes/maratona2022) | Gabaritos do dia 4, nomeados pela letra do problema |
| [`solucoes/praticando.java`](solucoes/praticando.java) | Rascunho para experimentar a sintaxe da apostila |

Os gabaritos trazem, em comentários, os valores de cada variável para a entrada de exemplo do exercício.

## Rodar localmente

Você precisa de um JDK 11 ou superior no PATH. Confira com `java -version`. Se o comando não existir, instale um JDK, por exemplo com `winget install EclipseAdoptium.Temurin.21.JDK`, e abra um terminal novo.

Execute os comandos da raiz do repositório, no PowerShell. A entrada vai pelo pipe, e `` `n `` é uma quebra de linha:

```powershell
"6`n-3 -3 -1 -2 0 0" | java solucoes/Recordes.java
```

A saída esperada é `3`. O comando usa o modo de execução de arquivo-fonte do Java, que compila e roda em um passo. Cada solução é independente.

Para uma entrada com várias linhas, salve-a em um arquivo e envie o conteúdo:

```powershell
Get-Content entrada.txt | java solucoes/SomasIntervalos.java
```

Para a sua própria tentativa, crie um arquivo em qualquer pasta e rode do mesmo jeito:

```powershell
"6`n-3 -3 -1 -2 0 0" | java MinhaTentativa.java
```

## Na prova

Os gabaritos usam nomes como `Recordes` para facilitar a leitura. Ao submeter na OBI, o arquivo e a classe levam o nome da tarefa em minúsculas, como `ogro.java` com `public class ogro`, e o arquivo não tem a linha `package`. Os detalhes estão na [seção 2 do guia da prova](treino/guia-obi.md#2-nome-do-arquivo-e-da-classe).
