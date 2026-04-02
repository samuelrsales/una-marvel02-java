# MarvelSwitch

Exemplo simples em Java para comparar duas formas de usar `switch`:

- a sintaxe tradicional com `case`, `break` e atribuicao manual
- a sintaxe moderna com `switch expression` e operador `->`

O projeto usa diferentes fases da personagem Wanda Maximoff para demonstrar como cada abordagem produz uma descricao de status a partir de um valor textual.

## Objetivo

Este projeto foi feito para estudo de estrutura de controle em Java. A ideia central e mostrar, na pratica, a diferenca entre:

- `switch` classico, mais verboso e baseado em blocos
- `switch expression`, mais direto e adequado para atribuicao de valores

## Arquivos do projeto

- `MarvelSwitch.java`: implementa a versao moderna com `switch expression`
- `WandaSwitchAntigo.java`: implementa a versao tradicional com `switch`
- `LICENSE`: licenca do repositorio

## O que cada classe faz

### `MarvelSwitch`

Define a fase atual da Wanda na variavel `faseWanda` e usa `switch` com `->` para retornar uma descricao diretamente para a variavel `status`.

Pontos principais:

- codigo mais enxuto
- nao exige `break`
- facilita atribuicao direta de resultado

### `WandaSwitchAntigo`

Define a fase da Wanda e usa o modelo classico de `switch`, com atribuicao dentro de cada `case` e uso de `break` para impedir a continuidade da execucao.

Pontos principais:

- mostra a sintaxe tradicional
- evidencia a necessidade de `break`
- serve como comparacao direta com a abordagem moderna

## Requisitos

- JDK 14 ou superior para executar `switch expression`
- terminal com `javac` e `java` disponiveis no `PATH`

Para confirmar a instalacao do Java:

```bash
javac -version
java -version
```

## Como compilar

No diretorio do projeto, execute:

```bash
javac MarvelSwitch.java WandaSwitchAntigo.java
```

Isso ira gerar os arquivos `.class` correspondentes.

## Como executar

Para executar a versao moderna:

```bash
java MarvelSwitch
```

Para executar a versao tradicional:

```bash
java WandaSwitchAntigo
```

## Saida esperada

Com os valores atuais definidos no codigo:

### `MarvelSwitch`

```text
Status da Wanda: Poder maximo: Manipulacao da magia do caos e do Darkhold.
```

### `WandaSwitchAntigo`

```text
Status: Criacao do Hex e vida suburbana.
```

## Conceitos demonstrados

- uso de `switch` com `String`
- diferenca entre `switch` statement e `switch expression`
- controle de fluxo com `break`
- atribuicao de valores com estruturas condicionais
