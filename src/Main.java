import concretas.BancoUsuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BancoUsuario bu = new BancoUsuario();

        while (true) {
            System.out.println("== Bem-vindo ao Jaoboxd ==");
            System.out.println("1. Fazer registro");
            System.out.println("2. Fazer login");
            System.out.println("3. Sair");
            System.out.print("Selecione uma das opções: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1){
                System.out.println("== Bem-vindo ao registro ==");
                System.out.println("Informe seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Informe a senha: ");
                String senha = sc.nextLine();
                bu.registrar(nome, senha);

            } else if (opcao == 2){
                System.out.println("== Bem-vindo ao login ==");
                System.out.println("Informe seu nome: ");
                String nome = sc.nextLine();
                System.out.println("Informe sua senha: ");
                String senha = sc.nextLine();
                if (bu.login(nome,senha)){
                    menuOpcoes(sc);
                    break;
                }

            }

        }
    }
    public static void menuOpcoes(Scanner sc){
        System.out.println("Bem vindo ao segundo menu!");
        sc.nextLine();
    }
}