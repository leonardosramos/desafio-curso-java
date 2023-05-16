import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double saldo = 2500.0;
        double valorRecebido = 0;
        int opcao = 0;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("");
        System.out.println("Nome:              Leonardo Ramos");
        System.out.println("Tipo conta:        Corrente");
        System.out.println("Saldo inicial:     R$ 2500,00");
        System.out.println("************************************");

        while (opcao != 4){
            System.out.println("");
            System.out.println("Operações:");
            System.out.println("");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.println("Digite a opção desejada:");
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("Seu saldo é de: R$ "+saldo);
            } else if (opcao == 2) {
                System.out.println("Quanto deseja receber?");
                valorRecebido = leitura.nextDouble();
                saldo = valorRecebido + saldo;

            } else if (opcao == 3) {
                System.out.println("Quanto deseja transferir?");
                valorRecebido = leitura.nextDouble();
                if (saldo < valorRecebido){
                    System.out.println("Saldo insuficiente.");
                }else {
                    saldo = saldo - valorRecebido;
                    System.out.println("Transferencia realizada!");
                }
            } else if (opcao == 4) {
                System.out.println("Sessão encerrada.");
                break;
            } else {
                System.out.println("Opção inválida!");

            }
        }


    }
}
