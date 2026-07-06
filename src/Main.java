import java.util.Scanner;

class Main{
    static void main() {
        String nome = "Hiago Mendes";
        String tipoConta = "Corrente";
        Double saldo = 2000.00;

        System.out.println("***************************");
        System.out.println("------- Orange Bank -------");
        System.out.println("***************************");

        System.out.println("-----------------------------");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome:" + "           " + nome);
        System.out.println("Tipo da Conta:" + "  " + tipoConta);
        System.out.println("Saldo Atual:" + "    R$ " + saldo);
        System.out.println("-----------------------------");
        System.out.println();

        int opcao = 0;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Operações");
            System.out.println();

            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Tranferir valor");
            System.out.println("4- Sair");
            System.out.println();

            System.out.println("Digite a opção desejada:");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Consultando saldo");
                    System.out.println(saldo);
                    break;

                case 2:
                    System.out.println("Informe o valor de deposito: ");
                    double dep = teclado.nextDouble();
                    saldo = saldo + dep;
                    System.out.println("Valor atualizado " + saldo);
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja transferir");
                    double valorTranferencia = teclado.nextDouble();
                    if (valorTranferencia > saldo) {
                        System.out.println("Valor indisponível para envio!");
                        System.out.println("Atualmente você possui: " + saldo);
                    } else {
                        saldo = saldo - valorTranferencia;
                        System.out.println("Transferencia de " + valorTranferencia + " realizada com sucesso");
                        System.out.println("O valor atualizado do seu saldo é de: " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Volte logo");
                    break;
                default:
                    System.out.println("Opcção invalida");
                    break;

            }
        }while (opcao != 4 );
    }
}