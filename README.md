# MarvelSwitch

Projeto educativo em Java que contrasta a sintaxe clássica do switch com o novo switch expression introduzido nas versões recentes da linguagem, usando a jornada da Wanda Maximoff como pano de fundo narrativo.

## ?? Visão geral
- MarvelSwitch.java usa o novo *switch expression* (setas ->) para associar cada fase da Wanda a uma descrição breve e imprimir o resultado em uma linha.
- WandaSwitchAntigo.java mantém a forma tradicional do switch, incluindo os blocos case com reak, para ilustrar o funcionamento antigo dessa estrutura de controle.

## ?? Pré-requisitos
1. JDK 17 ou superior (necessário para switch expressions).
2. Variável JAVA_HOME configurada e caminho (PATH) apontando para javac e java.

## ?? Como executar
1. Compile os dois arquivos (ou apenas o que deseja testar):
   `
   javac MarvelSwitch.java WandaSwitchAntigo.java
   `
2. Execute a classe desejada:
   `
   java MarvelSwitch
   java WandaSwitchAntigo
   `
3. Cada execução exibirá o status correspondente à fase atual da Wanda.

## ?? Resultado esperado
- MarvelSwitch mostra: Status da Wanda: Poder máximo: Manipulação da magia do caos e do Darkhold.
- WandaSwitchAntigo mostra: Status: Criação do Hex e vida suburbana.

## ?? Estrutura do projeto
- MarvelSwitch.java: versão moderna com switch expression.
- WandaSwitchAntigo.java: versão clássica com switch.
- LICENSE: termos de uso do projeto.
- README.md: este documento.

## ? Próximos passos sugeridos
1. Adicione mais fases e descrições, talvez lendo entradas do usuário.
2. Transforme esse experimento em um conjunto de testes unitários para comparar as saídas.
