package main.java;
import javax.swing.SwingUtilities;

import main.java.entities.GUI.TelaLogin;
public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaLogin telaLogin = new TelaLogin();
            telaLogin.setVisible(true);
        });
    }
}
