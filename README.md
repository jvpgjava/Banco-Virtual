# Banco Virtual

Objetivo do Código
O programa simula as operações básicas de uma conta bancária, permitindo ao usuário consultar o saldo, transferir valores para outra conta, receber valores na conta e sair do programa.

Estrutura do Código
Variáveis Iniciais:
nome: Armazena o nome do cliente.
tipoConta: Indica o tipo de conta (no exemplo, é uma conta corrente).
saldo: Representa o saldo inicial da conta (inicializado com 2500.00).
opcao: Guarda a opção escolhida pelo usuário no menu.
Impressão dos Dados Iniciais:

Imprime na tela os dados iniciais do cliente como nome, tipo de conta e saldo.
Menu de Opções:

Utiliza um texto formatado em forma de text block (introduzido no Java 15) para exibir as opções disponíveis ao usuário. As opções são:
Consultar saldos.
Transferir valor.
Receber valor.
Sair.
Loop Principal (while):

Executa um loop enquanto o usuário não escolher a opção "4 - Sair".
A cada iteração do loop, exibe o menu, lê a opção escolhida pelo usuário e executa a ação correspondente.
Ações Baseadas na Opção Escolhida:

Opção 1 - Consultar saldos:
Simplesmente imprime o saldo atual na tela.

Opção 2 - Transferir valor:
Pede ao usuário para inserir o valor a ser transferido.
Verifica se o saldo é suficiente para a transferência.
Caso positivo, subtrai o valor do saldo e exibe o novo saldo.
Caso contrário, informa que não há saldo suficiente.

Opção 3 - Receber valor:
Pede ao usuário para inserir o valor a ser recebido.
Adiciona o valor ao saldo e exibe o novo saldo.
Opção Inválida:
Se o usuário escolher uma opção inválida (diferente de 1, 2, 3 ou 4), exibe uma mensagem de "Opção inválida!".

Encerramento do Programa:
Quando o usuário escolhe a opção "4 - Sair", o loop é interrompido e o programa termina.

Como Usar o Código
Para usar o código:
Compilação e Execução:
Copie o código fornecido para um arquivo Java com o nome contaBancaria.java (ou outro nome de sua escolha).
Abra um terminal (ou prompt de comando) e navegue até o diretório onde o arquivo está localizado.
Compile o código digitando javac contaBancaria.java.
Execute o programa compilado com java contaBancaria.

Operações no Programa:
Após executar, siga as instruções impressas no console.
Escolha uma das opções digitando o número correspondente e pressionando Enter.
Siga as instruções adicionais para cada opção (por exemplo, inserir valores para transferência ou recebimento).

Finalização:
Para sair do programa, escolha a opção "4 - Sair".


Tecnologias usadas:

<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/>
