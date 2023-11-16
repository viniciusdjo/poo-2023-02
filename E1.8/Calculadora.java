import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame {
  @Override
  public void setSize(int width, int height) {
  super.setSize(width, height);
  }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);

        JLabel labelNumero1 = new JLabel("Informe o primeiro número:");
        labelNumero1.setBounds(20, 20, 200, 25);
        panel.add(labelNumero1);

        JTextField textNumero1 = new JTextField(10);
        textNumero1.setBounds(200, 20, 165, 25);
        panel.add(textNumero1);

        JLabel labelNumero2 = new JLabel("Informe o segundo número:");
        labelNumero2.setBounds(20, 50, 200, 25);
        panel.add(labelNumero2);

        JTextField textNumero2 = new JTextField(10);
        textNumero2.setBounds(200, 50, 165, 25);
        panel.add(textNumero2);
        
        JButton somaButton = new JButton("+");
        somaButton.setBounds(20, 120, 100, 25);
        panel.add(somaButton);

        JButton subtracaoButton = new JButton("-");
        subtracaoButton.setBounds(120, 120, 100, 25);
        panel.add(subtracaoButton);
        
        JButton divisaoButton = new JButton("÷");
        divisaoButton.setBounds(220, 120, 100, 25);
        panel.add(divisaoButton);

        JButton multiplicacaoButton = new JButton("x");
        multiplicacaoButton.setBounds(320, 120, 100, 25);
        panel.add(multiplicacaoButton);

        JLabel resultadoLabel = new JLabel("Resultado: ");
        resultadoLabel.setBounds(20, 150, 350, 25);
        panel.add(resultadoLabel);        
        somaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());

                      double resultado = numero1 + numero2;
                      resultadoLabel.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        subtracaoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());

                      double resultado = numero1 - numero2;
                       resultadoLabel.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });

        multiplicacaoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());

                      double resultado = numero1 * numero2;
                       resultadoLabel.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        }); 

        divisaoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(textNumero1.getText());
                    double numero2 = Double.parseDouble(textNumero2.getText());
                     if (numero2 == 0){
                      resultadoLabel.setText("ERRO! Divisão por 0, insira um número válido");;
                     }else{
                      double resultado = numero1 / numero2;
                       resultadoLabel.setText("Resultado: " + resultado);
                     }
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Erro: Insira números válidos.");
                }
            }
        });        
        frame.setVisible(true);
    }
}