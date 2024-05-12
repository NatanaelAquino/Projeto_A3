package main.java.entities.GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class TelaAlterarDados extends JFrame {
    private JTextField campoNome;
    private JTextField campoSobrenome;
    private JTextField campoEmail;
    private JButton botaoSalvar;
    private JButton botaoVoltar;

    public TelaAlterarDados() {
        setTitle("Alterar Dados");
        setSize(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(4, 2));

        JLabel labelNome = new JLabel("Nome:");
        campoNome = new JTextField();
        JLabel labelSobrenome = new JLabel("Sobrenome:");
        campoSobrenome = new JTextField();
        JLabel labelEmail = new JLabel("E-mail:");
        campoEmail = new JTextField();
        botaoSalvar = new JButton("Salvar");
        botaoVoltar = new JButton("Voltar");

        botaoSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(TelaAlterarDados.this, "Dados salvos com sucesso!");
            }
        });

        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Telaopcoes telaOpcoes = new Telaopcoes();
                telaOpcoes.setVisible(true);
            }
        });

        painel.add(labelNome);
        painel.add(campoNome);
        painel.add(labelSobrenome);
        painel.add(campoSobrenome);
        painel.add(labelEmail);
        painel.add(campoEmail);
        painel.add(botaoSalvar);
        painel.add(botaoVoltar);

        add(painel);
    }
}

