package main.java;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        boolean f = true;


        System.out.print("Registro: ");
        int rg = sc.nextInt();
        System.out.print("Senha: ");
        sc.nextLine();
        String senha = sc.nextLine();


        if(rg == 123 && senha.equals("aa1")){
            while (f){
                System.out.println("Opção: ");
                System.out.println("1 - Cadastro ");
                System.out.println("2 - Sair ");

    
    
                int op = sc.nextInt();
                switch (op) {
                    case 1:
                        
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
}
