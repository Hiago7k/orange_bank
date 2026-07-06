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


        Scanner teclado = new Scanner(System.in);
        System.out.println("Operações");
        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Tranferir valor");
        System.out.println("4- Sair");

        System.out.println("Digite a opção desejada:");
        int opcao = teclado.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Consultando saldo");
                System.out.println(saldo);
                break;
            case 2:
                System.out.println("Receber valor");
                break;
            case 3:
                System.out.println("Enviando valor...");
                break;
            case 4:
                System.out.println("Volte logo");
                break;
            default:
                System.out.println("Opcção invalida");
                break;
        }

    }
}