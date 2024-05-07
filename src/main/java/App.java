package main.java;

import java.util.Scanner;

import main.java.DAO.UsuarioDAO;
import main.java.entities.User;
import main.java.utils.CliUtils;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        boolean f = true;

        while (f) {

            CliUtils.clear();
            System.out.println("Opção: ");
            System.out.println("1 - Cadastro ");
            System.out.println("2 - Sair ");
            int op = sc.nextInt();

            switch (op) {
                case 1:

                    CliUtils.clear();

                    System.out.println("Digite seu nome: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("Digite seu senha: ");
                    String senha = sc.nextLine();
                    System.out.println("Digite seu EMAIL: ");
                    String EMAIL = sc.nextLine();
                    System.out.println("Digite seu Registro: ");
                    int registro = sc.nextInt();
                    User user = new User(name, senha, EMAIL, registro);
                    new UsuarioDAO().cadastrarUsuario(user);
                    break;
                case 2:
                    f = false;
                    break;
                default:
                    break;
            }

        }

    }
}
