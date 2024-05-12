package main.java.GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame implements ActionListener {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoLogin;

    public TelaLogin() {
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(3, 2));

        JLabel labelUsuario = new JLabel("Usuário:");
        campoUsuario = new JTextField();
        JLabel labelSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField();
        botaoLogin = new JButton("Login");

        botaoLogin.addActionListener(this);

        painel.add(labelUsuario);
        painel.add(campoUsuario);
        painel.add(labelSenha);
        painel.add(campoSenha);
        painel.add(new JLabel()); 
        painel.add(botaoLogin);

        add(painel);
    }

    public void actionPerformed(ActionEvent e) {
        String usuario = campoUsuario.getText();
        String senha = new String(campoSenha.getPassword());

        if (usuario.equals("123") && senha.equals("123")) {
            Telaopcoes telaOpcoes = new Telaopcoes();
            telaOpcoes.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Login falhou. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
