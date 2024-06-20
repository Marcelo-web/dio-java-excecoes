# Entendendo sobre tratamento de exceções.

Guia de estudo sobre exceções na linguagem Java.

<p align="center">
 <img alt="GitHub Top Language" src="https://img.shields.io/github/languages/top/Marcelo-web/dio-java-excecoes" />
</p>

### Exceção

- É lançada quando existe um fluxo inesperado da aplicação devido a alguma inconsistência.

- Pode ser tratada de forma a exibir uma mensagem ao usuário, não interrompendo a execução da aplicação.

- Podem ocorrer exceções de negócio, parametrizações, entradas inválidas, tentativas de conexões com o banco de dados que não são bem sucedidas, tentativa de leitura de arquivos, entre outras.

### Tratamento

- A instrução TRY permite que um bloco de código seja testado a erros, enquanto está sendo executado.

- A instrução CATCH define um bloco de código que é executado caso ocorra um erro no bloco try.

- A instrução FINALLY define um bloco de código que é executado independente de ter havido um erro ou não.

### Hierarquia de exceções

- A linguagem Java dispõe de uma variedade de classes que representam exceções.

- As classes são organizadas em hierarquia denominada ckecked (checadas) ou unchecked (não-checadas).

🔹**Exceções checadas:**  relacionadas à classe *Exception*.  São aquelas que o compilador obriga o programador a tratar ou lançar. Isso significa que o código que pode gerar uma exceção checada deve estar dentro de um bloco try-catch ou deve declarar que pode lançar essa exceção usando a palavra-chave "throws". 

- *Exemplos de exceções checadas*:

☑️ FileNotFoundException: lançada quando um arquivo especificado não é encontrado.

☑️ IOException: representa exceções de entrada e saída, como problemas ao ler ou gravar arquivos.

☑️ SQLException: representa exceções que podem ocorrer ao interagir com bancos de dados por meio de JDBC (Java Database Connectivity).

🔸**Exceções não-checadas**: também conhecidas como *RuntimeExceptions*, são exceções que o compilador não obriga o programador a tratar ou lançar. Elas geralmente representam erros no código que podem ser evitados com uma boa prática de programação, como divisão por zero, acesso a índices inválidos em arrays, entre outros.

- *Exemplos de exceções não checadas:*

◻️ NullPointerException: ocorre quando um objeto é referenciado, mas está nulo.

◻️ ArrayIndexOutOfBoundsException: ocorre quando se tenta acessar um índice inválido de um array.

◻️ ArithmeticException: ocorre quando ocorre uma exceção matemática, como uma divisão por zero.

◻️ ClassCastException: ocorre quando se tenta realizar uma conversão de tipo incompatível.

◻️ IllegalArgumentException: ocorre quando se passa um argumento inválido para um método.

### Representação gráfica

![diagrama_excecoes](https://github.com/Marcelo-web/dio-java-excecoes/assets/64988565/ae592039-15ef-4523-b411-bba33a1412e0)

- A classe Throwable é a raiz da hierarquia de exceções e erros.

- Abaixo da classe Throwable, temos a subclasse classe Error(classe-filha). Os erros representam problemas mais graves, como falta de memória ou falhas no sistema. Normalmente, não é recomendado capturar erros com blocos try-catch, pois eles geralmente indicam problemas irrecuperáveis.

- Em seguida, temos no mesmo nível de hierarquia da classe Error, a classe Exception que, da mesma forma, também herda de Throwable. As exceções que herdam de Exception são chamadas de exceções checadas (checked exceptions). Essas exceções devem ser tratadas explicitamente pelo programador usando blocos try-catch ou declarando-as na assinatura do método.

- A classe Exception tem uma subclasse chamada RuntimeException.
