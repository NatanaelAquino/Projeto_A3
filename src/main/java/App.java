package main.java;
import java.util.Scanner;

import main.java.DAO.UsuarioDAO;
import main.java.entities.User;
import main.java.utils.CliUtils;

public class App {
    public static void main(String[] args) throws Exception {


        User user = new User();

        user.setName("Natanel");
        user.setEMAIL("sdadas");
        user.setRegistro(13212);
        user.setLogin(12332);
        user.setSenha("fasddasd");

        new UsuarioDAO().cadastrarUsuario(user);
        }

}
