import java.util.Scanner; //Scanner importado

//Transferir, receber e consultar saldo, simulação de um Banco Virtual

public class contaBancaria {
    public static void main(String[] args) {
        String nome = "João Vitor";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;
        
        System.out.println("**********************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Inicial: " + saldo);
        System.out.println("\n*********************");

        //text block
        String menu = """
                ** Digite uma opção **
                1 - Consultar saldos
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);
        
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor a ser recebido ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}