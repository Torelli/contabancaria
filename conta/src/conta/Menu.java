package conta;

import conta.util.Colors;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option;

        while(true) {
            System.out.println(Colors.TEXT_YELLOW + Colors.ANSI_BLACK_BACKGROUND
                            + "*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                BANCO DO BRAZIL COM Z                ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Criar Conta                          ");
            System.out.println("            2 - Listar todas as Contas               ");
            System.out.println("            3 - Buscar Conta por Numero              ");
            System.out.println("            4 - Atualizar Dados da Conta             ");
            System.out.println("            5 - Apagar Conta                         ");
            System.out.println("            6 - Sacar                                ");
            System.out.println("            7 - Depositar                            ");
            System.out.println("            8 - Transferir valores entre Contas      ");
            System.out.println("            9 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("Entre com a opção desejada:                          ");
            System.out.println("                                                     ");

            option = input.nextInt();

            if(option == 9) {
                System.out.println("\nBanco do Brazil com Z - O seu futuro começa aqui!");
                about();
                input.close();
                System.exit(0);
            }

            switch (option) {
                case 1:
                    System.out.println("Criar Conta \n\n");

                    break;
                case 2:
                    System.out.println("Listar todas as Contas \n\n");

                    break;
                case 3:
                    System.out.println("Consultar dados da Conta - por número\n\n");

                    break;
                case 4:
                    System.out.println("Atualizar dados da conta\n\n");

                    break;
                case 5:
                    System.out.println("Apagar a Conta\n\n");

                    break;
                case 6:
                    System.out.println("Saque\n\n");

                    break;
                case 7:
                    System.out.println("Depósito\n\n");

                    break;
                case 8:
                    System.out.println("Transferência entre Contas\n\n");

                    break;
                default:
                    System.out.printf("\nOpção Inválida!\n");
                    break;
            }
        }
    }

    public static void about() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por Giovanni Torelli Leite Walter");
        System.out.println("Email - giovanni.walter@outlook.com");
        System.out.println("https://github.com/Torelli");
        System.out.println("*********************************************************");
    }
}
