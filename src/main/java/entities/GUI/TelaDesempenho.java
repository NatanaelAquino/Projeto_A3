package main.java.entities.GUI;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TelaDesempenho extends JFrame {
    private Map<String, Integer> quantidadePorSetor;
    private Map<String, String> classificacaoRisco;

    public TelaDesempenho() {
        setTitle("Desempenho por Setor");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(0, 2, 10, 10));

        JLabel labelTitulo = new JLabel("Desempenho por Setor");
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel labelSetor = new JLabel("Setor");
        JLabel labelQuantidade = new JLabel("Quantidade de Lixo Descartado");
        JLabel labelRisco = new JLabel("Classificação de Risco");

        painel.add(labelSetor);
        painel.add(labelQuantidade);
        painel.add(labelRisco);

        for (Map.Entry<String, Integer> entry : quantidadePorSetor.entrySet()) {
            String setor = entry.getKey();
            int quantidade = entry.getValue();
            String risco = classificacaoRisco.getOrDefault(setor, "Desconhecido");

            JLabel labelNomeSetor = new JLabel(setor);
            JLabel labelQuantidadeSetor = new JLabel(Integer.toString(quantidade));
            JLabel labelRiscoSetor = new JLabel(risco);

            painel.add(labelNomeSetor);
            painel.add(labelQuantidadeSetor);
            painel.add(labelRiscoSetor);
        }

        JScrollPane scrollPane = new JScrollPane(painel);
        add(scrollPane);
    }

    public static void main(String[] args) {
        Map<String, Integer> quantidadePorSetor = new HashMap<>();
        quantidadePorSetor.put("Administração", 150);
        quantidadePorSetor.put("Produção", 100);

        Map<String, String> classificacaoRisco = new HashMap<>();
        classificacaoRisco.put("Administração", "Alto");
        classificacaoRisco.put("Produção", "Alto");

        SwingUtilities.invokeLater(() -> {
            TelaDesempenho telaDesempenho = new TelaDesempenho();
            telaDesempenho.setVisible(true);
        });
    }
}
