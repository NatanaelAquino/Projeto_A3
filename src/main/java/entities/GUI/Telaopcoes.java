package main.java.entities.GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class Telaopcoes extends JFrame {
    public Telaopcoes() {
        setTitle("Opções");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(4, 1));

        JButton botaoAlterarDados = new JButton("Alterar Dados");
        JButton botaoNovoDescarte = new JButton("Novo Descarte");
        JButton botaoDesepemnho = new JButton("Desempenho");
        JButton botaoHistoricoDescarte = new JButton("Histórico de Descarte");

        botaoAlterarDados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaAlterarDados telaAlterarDados = new TelaAlterarDados();
                telaAlterarDados.setVisible(true);
            }
        });

        botaoDesepemnho.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){
                TelaDesempenho telaDesempenho = new TelaDesempenho();
                telaDesempenho.setVisible(true);
            }
        } );
        botaoAlterarDados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaAlterarDados telaAlterarDados = new TelaAlterarDados();
                telaAlterarDados.setVisible(true);
            }
        });


        botaoNovoDescarte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TelaNovoDescarte novoDescarte = new TelaNovoDescarte();
                novoDescarte.setVisible(true);
            }
        });

        botaoHistoricoDescarte.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
            }
        });

        painel.add(botaoAlterarDados);
        painel.add(botaoNovoDescarte);
        painel.add(botaoDesepemnho);
        painel.add(botaoHistoricoDescarte);

        add(painel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Telaopcoes telaopcoes = new Telaopcoes();
            telaopcoes.setVisible(true);
        });
    }
}
