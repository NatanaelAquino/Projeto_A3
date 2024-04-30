package main.java;
import java.util.Scanner;
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
