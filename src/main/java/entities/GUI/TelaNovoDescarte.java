package main.java.entities.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaNovoDescarte extends JFrame {
    private JTextField campoNome;
    private JComboBox<String> comboBoxTipo;
    private JComboBox<String> comboBoxSetor;
    private JTextField campoQuantidade;
    private JComboBox<String> comboBoxReciclagem;
    private JComboBox<String> comboBoxDescarte;
    private JTextArea campoExplicacao;
    private JButton botaoSalvar;
    private JButton botaoVoltar;

    public TelaNovoDescarte() {
        setTitle("Novo Descarte");
        setSize(600, 450); 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(10, 2, 10, 10)); 

        JLabel labelNome = new JLabel("Nome do resíduo:");
        campoNome = new JTextField();
        JLabel labelTipo = new JLabel("Tipo:");
        String[] opcoesTipo = {"Papel", "Plástico", "Metal", "Vidro", "Orgânico", "Eletrônico" ,"Outro"};
        comboBoxTipo = new JComboBox<>(opcoesTipo);
        JLabel labelTipoFase = new JLabel("Tipo de Fase:");
        String[] opcoesTipoFase = {"Sólido", "Líquido"};
        JComboBox<String> comboBoxTipoFase = new JComboBox<>(opcoesTipoFase);
        JLabel labelSetor = new JLabel("Setor:");
        String[] opcoesSetor = {"Administração", "Produção"};
        comboBoxSetor = new JComboBox<>(opcoesSetor);
        JLabel labelQuantidade = new JLabel("Quantidade:");
        campoQuantidade = new JTextField();
        JLabel labelReciclagem = new JLabel("Forma de Reciclagem:");
        String[] opcoesReciclagem = {"Reciclável", "Não Reciclável"};
        comboBoxReciclagem = new JComboBox<>(opcoesReciclagem);
        JLabel labelDescarte = new JLabel("Como foi Descartado:");
        String[] opcoesDescarte = {"Coleta Seletiva", "Aterro Sanitário", "Incinerado"};
        comboBoxDescarte = new JComboBox<>(opcoesDescarte);
        JLabel labelExplicacao = new JLabel("Explicação:");
        campoExplicacao = new JTextArea();
        botaoSalvar = new JButton("Salvar");
        botaoVoltar = new JButton("Voltar");

        campoExplicacao.setLineWrap(true);
        campoExplicacao.setWrapStyleWord(true);

        painel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        botaoSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(TelaNovoDescarte.this, "Dados salvos com sucesso!");
            }
        });

        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        botaoSalvar.setPreferredSize(new Dimension(120, 30)); 

        botaoVoltar.setPreferredSize(new Dimension(120, 30)); 

        painel.add(labelNome);
        painel.add(campoNome);
        painel.add(labelTipo);
        painel.add(comboBoxTipo);
        painel.add(labelTipoFase);
        painel.add(comboBoxTipoFase);
        painel.add(labelSetor);
        painel.add(comboBoxSetor);
        painel.add(labelQuantidade);
        painel.add(campoQuantidade);
        painel.add(labelReciclagem);
        painel.add(comboBoxReciclagem);
        painel.add(labelDescarte);
        painel.add(comboBoxDescarte);
        painel.add(labelExplicacao);
        painel.add(new JScrollPane(campoExplicacao));
        painel.add(botaoSalvar);
        painel.add(botaoVoltar);

        add(painel);
    }
}

