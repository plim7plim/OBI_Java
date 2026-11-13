# Guia da prova da OBI

Este guia cobre as regras e a estratégia da prova. A linguagem está na [apostila de Java](java.md). As regras abaixo vêm do regulamento e da folha de instruções de um caderno oficial (links no fim). Elas podem mudar de um ano para o outro, então leia a folha de instruções do seu caderno no começo da prova.

## 1. Como é a prova

| | Fase 1 (Local) | Fase 2 (Estadual) | Fase 3 (Nacional) |
|---|---|---|---|
| Onde | Na sua escola | Na sua escola | Em uma sede indicada pela OBI |
| Duração em 2026 | 2 horas | 3 horas | 4 horas (5 no Sênior) |

- A prova é individual, em um computador sem acesso à Internet.
- **Não pode consultar nada:** nem Internet, nem livros, nem anotações. A apostila fica em casa, então o que está nela precisa estar na cabeça.
- Pode levar lápis, caneta, borracha, régua e papel de rascunho. Calculadora não pode.
- As linguagens aceitas são C, C++, Java e Python. O Java da correção é o JDK 14 ou superior.
- Para passar de fase, você precisa de pelo menos um terço dos pontos da prova e de ficar entre os melhores da sua escola (fase 1) ou do seu estado (fase 2).

## 2. Nome do arquivo e da classe

Cada tarefa traz, logo abaixo do título, o nome que o arquivo deve ter:

```
Ogro
Nome do arquivo: ogro.c, ogro.cpp, ogro.java, ogro.js ou ogro.py
```

Em Java, isso significa três coisas:

1. O arquivo se chama `ogro.java`.
2. A classe principal se chama `ogro`, igual ao arquivo e **toda em minúsculas**.
3. O arquivo não tem a linha `package`.

```java
import java.util.Scanner;

public class ogro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int e = entrada.nextInt();
        int d = entrada.nextInt();
        if (e > d) {
            System.out.println(e + d);
        } else {
            System.out.println(2 * (d - e));
        }
    }
}
```

Em casa a apostila usa `Main` por costume. Na prova, troque `Main` pelo nome da tarefa antes de qualquer outra coisa. Uma tarefa nova pede um arquivo novo com o nome dela.

## 3. Entrada e saída

A correção é feita por um programa que compara a sua saída com a esperada, caractere por caractere.

- Leia da entrada padrão e escreva na saída padrão, com `Scanner`, `BufferedReader` e `System.out`. Não abra arquivos.
- Não imprima frases como "Digite o número:". Imprima só o que a seção **Saída** do enunciado pede.
- Siga o formato exato: maiúsculas e minúsculas, espaços, uma resposta por linha.
- Apague as impressões de teste antes de submeter.
- Não use janelas, menus nem comandos para limpar a tela.

## 4. Pontuação

- Todas as tarefas valem o mesmo: de 0 a 100 pontos cada.
- Os pontos de uma tarefa são divididos em **subtarefas**. Cada subtarefa é um grupo de testes com um limite mais apertado, por exemplo "N ≤ 10" valendo 20 pontos e "sem restrições adicionais" valendo 80.
- Você ganha os pontos de uma subtarefa quando acerta os testes dela. Não precisa resolver as subtarefas em ordem.
- Você pode submeter até 50 vezes por tarefa. Vale a melhor pontuação de cada subtarefa entre todas as suas submissões, então uma submissão pior nunca tira pontos.
- A subtarefa 1 costuma ser só os exemplos do enunciado e vale 0 pontos. Ela serve para conferir o formato da saída.

O que fazer com isso:

- Leia a seção **Informações sobre a pontuação** de cada tarefa. Ela diz quanto vale uma solução simples.
- Uma solução lenta mas correta já ganha as subtarefas de N pequeno. Submeta essa versão primeiro e melhore depois.
- Se a tarefa inteira parecer difícil, resolva só o caso especial de uma subtarefa. Pontos parciais em várias tarefas somam mais que uma tarefa perfeita.

## 5. Tempo e memória

- A solução também precisa ser rápida. O teste do ambiente de prova usa limite de 1 segundo e 1 GB de memória.
- Olhe o maior N nas **Restrições** e confira na [seção 20 da apostila](java.md#20-quanto-cabe-no-tempo) se o seu custo cabe.
- Com entrada grande, leia com `BufferedReader` e imprima com `StringBuilder` ([seção 9 da apostila](java.md#9-entrada-grande)).
- Se a soma ou o produto puder passar de 2 bilhões, use `long` ([seção 11 da apostila](java.md#11-números-grandes-e-contas-úteis)).

## 6. O ambiente de prova

Se a sua escola usar o editor online da OBI, ele tem três botões:

| Botão | O que faz |
|---|---|
| **Executar** | Roda no seu computador. **Não funciona para Java.** |
| **Testar** | Envia o código ao servidor com a entrada que você digitou no painel Entrada. Funciona para Java e usa os mesmos limites da correção. |
| **Submeter** | Envia para correção de verdade. O resultado aparece no painel Saída. |

- Em Java, o seu ciclo é: digitar o exemplo no painel Entrada, **Testar**, comparar com a saída do enunciado, **Submeter**.
- O Testar pode demorar quando há fila. Não deixe para testar tudo nos últimos minutos.
- O botão **Salvar** guarda até 5 cópias do código por tarefa. Salve antes de fazer uma mudança grande.
- A lista de submissões de cada tarefa fica na aba Prova, em "Submissões da tarefa".

## 7. Roteiro durante a prova

1. **Primeiros 10 minutos:** leia todas as tarefas. Elas não estão em ordem de dificuldade. Marque a mais fácil.
2. **Para cada tarefa, no papel:** escreva o que entra, o que sai e o maior N. Faça o primeiro exemplo à mão até entender por que a resposta é aquela.
3. **Escreva a solução mais simples que funciona.** Crie o arquivo já com o nome certo.
4. **Teste** com os exemplos do enunciado e com um caso mínimo que você inventou (N = 1, valores iguais, valor no limite).
5. **Submeta** e veja quais subtarefas passaram.
6. **Passou tudo:** vá para a próxima tarefa. **Passou parte:** anote os pontos e decida se vale melhorar agora ou depois.
7. **Travou por 20 minutos:** troque de tarefa. Volte no fim com a cabeça fresca.
8. **Últimos 10 minutos:** não comece nada novo. Confira se a melhor versão de cada tarefa foi submetida.

Quando a resposta sai errada, confira nesta ordem: nome da classe, formato da saída, posições que começam em 1 no enunciado e em 0 no vetor, empates, `int` que deveria ser `long`. A tabela de sintomas está na [seção 21 da apostila](java.md#21-antes-de-submeter).

## 8. Como treinar na reta final

- Resolva provas antigas do seu nível em https://olimpiada.ic.unicamp.br/pratique/. Cada tarefa tem um campo para enviar o arquivo e receber a correção automática.
- Faça pelo menos uma prova inteira com cronômetro, sem apostila e sem Internet, com a duração da sua fase.
- Depois de cada tarefa, anote a ideia, o custo e o caso que você esqueceu de testar.
- Treine sempre com o nome de arquivo e de classe da tarefa, em minúsculas, para virar hábito.
- Refaça de memória o modelo de leitura rápida da [seção 9 da apostila](java.md#9-entrada-grande) até sair sem olhar.

## 9. Na véspera

- [ ] Sei criar do zero um arquivo com `public class nomedatarefa` e o `main`.
- [ ] Sei ler inteiros, uma palavra e uma linha inteira.
- [ ] Sei ler N valores para um vetor e uma matriz.
- [ ] Sei ordenar um vetor e contar frequências.
- [ ] Sei quando trocar `int` por `long`.
- [ ] Sei escrever o modelo com `BufferedReader` sem consultar.
- [ ] Separei lápis, borracha e papel de rascunho.

## Fontes

- [Regulamento da OBI](https://olimpiada.ic.unicamp.br/info/regulamento/): fases, linguagens, material permitido, versão do Java e pontuação.
- [Caderno de tarefas, Programação Nível 1, Fase 1, junho de 2024](https://olimpiada.ic.unicamp.br/static/extras/obi2024/provas/ProvaOBI2024_f1p1.pdf): folha de instruções com a regra do nome do arquivo e da classe, o limite de 50 submissões e as subtarefas.
- [Datas importantes](https://olimpiada.ic.unicamp.br/calendario/datas_importantes): duração de cada fase.
- [Ajuda do editor de provas](https://editor.provas.ic.unicamp.br/faq): botões Executar, Testar, Submeter e Salvar.
