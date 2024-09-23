import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {

    public static int numeroAleatorio4(){
        Random aleatorio4 = new Random();
        return aleatorio4.nextInt(9000) + 1000;
    }
    public static int numeroAleatorio8(){
        Random aleatorio8 = new Random();
        return aleatorio8.nextInt(9000000) + 1000000;
    }

    public static void main(String[] args) {

        int numConta = numeroAleatorio8();
        int agencia = numeroAleatorio4();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá seja bem vindo ao banco do desenvolvedor!");
        System.out.println("Gostaria de criar uma conta no nosso banco ?");
        System.out.println("Digite Sim ou Não: ");
        String resposta = scanner.nextLine();


        boolean simNao = false;
        if (resposta.equalsIgnoreCase("sim")) {
            simNao = true;

        } else if (resposta.equalsIgnoreCase("não")) {
            simNao = false;

        } else {
            System.out.println("Entrada invalida. Por favor digite 'sim' ou 'não' ");

        }while (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("não"));

        if (simNao != false){

            System.out.println("Informe seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Informe seu numero de RG: ");
            String rg = scanner.nextLine();

            System.out.println("Informe seu numero de CPF: ");
            String cpf = scanner.nextLine();

            System.out.println("Informe seu CEP: ");
            String cep = scanner.nextLine();

            System.out.println("informe sua renda mensal: ");
            Double renda = scanner.nextDouble();

            System.out.println("Digite o quanto você deseja depositar: ");
            int deposito = scanner.nextInt();

            System.out.println("Meus parabens sua conta foi criada com sucesso no banco do desenvolvedor");

            System.out.println("Olá " +nome + " Boas vindas ao banco do desenvolvedor sua agencia é " + agencia + "é seu numero de conta é " + numConta );

            System.out.println("Atualmente você tem " + deposito + " para sacar.");

        } else{
        }
    }

}
