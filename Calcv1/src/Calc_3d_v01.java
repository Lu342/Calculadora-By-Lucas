
import java.awt.Toolkit;

import javax.swing.JFrame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Calc_3d_v01 extends javax.swing.JFrame {

    double result;
    double numberOne, numberTwo;
    String operacao, resultado;

    public Calc_3d_v01() {
        initComponents();

        icon(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Calculadora = new javax.swing.JPanel();
        Entrada_numberTwo = new javax.swing.JTextField();
        bottom_subtrair = new javax.swing.JButton();
        bottom_soma = new javax.swing.JButton();
        bottom_dividir = new javax.swing.JButton();
        bottom_multiplicar = new javax.swing.JButton();
        Entrada_numberOne = new javax.swing.JTextField();
        Exit_operacoes = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jTextField1.setText("jTextField1");

        jButton2.setText("jButton2");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Calculadora.setBackground(new java.awt.Color(102, 102, 102));
        Calculadora.setToolTipText("Calc v0.1");
        Calculadora.setMaximumSize(new java.awt.Dimension(300, 300));
        Calculadora.setMinimumSize(new java.awt.Dimension(300, 265));
        Calculadora.setName("Calculadora"); // NOI18N
        Calculadora.setPreferredSize(new java.awt.Dimension(325, 300));

        Entrada_numberTwo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Entrada_numberTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Entrada_numberTwoMouseClicked(evt);
            }
        });
        Entrada_numberTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entrada_numberTwoActionPerformed(evt);
            }
        });

        bottom_subtrair.setText("-");
        bottom_subtrair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottom_subtrairMouseClicked(evt);
            }
        });
        bottom_subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottom_subtrairActionPerformed(evt);
            }
        });

        bottom_soma.setText("+");
        bottom_soma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottom_somaMouseClicked(evt);
            }
        });
        bottom_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottom_somaActionPerformed(evt);
            }
        });

        bottom_dividir.setText("/");
        bottom_dividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottom_dividirMouseClicked(evt);
            }
        });
        bottom_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottom_dividirActionPerformed(evt);
            }
        });

        bottom_multiplicar.setText("*");
        bottom_multiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bottom_multiplicarMouseClicked(evt);
            }
        });
        bottom_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottom_multiplicarActionPerformed(evt);
            }
        });

        Entrada_numberOne.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Entrada_numberOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Entrada_numberOneMouseClicked(evt);
            }
        });
        Entrada_numberOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entrada_numberOneActionPerformed(evt);
            }
        });

        Exit_operacoes.setBackground(new java.awt.Color(153, 153, 153));
        Exit_operacoes.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Exit_operacoes.setForeground(new java.awt.Color(102, 102, 102));
        Exit_operacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit_operacoes.setToolTipText("");
        Exit_operacoes.setOpaque(true);

        javax.swing.GroupLayout CalculadoraLayout = new javax.swing.GroupLayout(Calculadora);
        Calculadora.setLayout(CalculadoraLayout);
        CalculadoraLayout.setHorizontalGroup(CalculadoraLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CalculadoraLayout.createSequentialGroup().addContainerGap(53, Short.MAX_VALUE)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Exit_operacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 214,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(CalculadoraLayout.createSequentialGroup().addGroup(CalculadoraLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Entrada_numberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 104,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(CalculadoraLayout.createSequentialGroup()
                                                .addComponent(bottom_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bottom_subtrair, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(CalculadoraLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(CalculadoraLayout.createSequentialGroup()
                                                        .addComponent(bottom_dividir,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(bottom_multiplicar,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(Entrada_numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(53, Short.MAX_VALUE)));
        CalculadoraLayout.setVerticalGroup(CalculadoraLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CalculadoraLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Entrada_numberOne, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Entrada_numberTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bottom_subtrair).addComponent(bottom_soma).addComponent(bottom_dividir)
                                .addComponent(bottom_multiplicar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Exit_operacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Calculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Calculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 210, Short.MAX_VALUE));

        Calculadora.getAccessibleContext().setAccessibleName("Calc");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottom_subtrairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bottom_subtrairActionPerformed

    }// GEN-LAST:event_bottom_subtrairActionPerformed

    private void bottom_somaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bottom_somaActionPerformed

    }// GEN-LAST:event_bottom_somaActionPerformed

    private void bottom_dividirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bottom_dividirActionPerformed

    }// GEN-LAST:event_bottom_dividirActionPerformed

    private void bottom_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bottom_multiplicarActionPerformed

    }// GEN-LAST:event_bottom_multiplicarActionPerformed

    private void Entrada_numberTwoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Entrada_numberTwoActionPerformed
    }// GEN-LAST:event_Entrada_numberTwoActionPerformed

    public final void icon(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage(
                    "C:/Users/Lucas/Documents/GitHub/Calculadora-By-Lucas/Calcv1/Imagens/calculadoraImage01.png"));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void operacoes_sem_erros() {

        try {
            numberOne = Double.parseDouble(Entrada_numberOne.getText());
            numberTwo = Double.parseDouble(Entrada_numberTwo.getText());
            operacoes(operacao, numberOne, numberTwo);
            resultado = Double.toString(result);
            Exit_operacoes.setText(resultado);

        } catch (NumberFormatException e) {
            Entrada_numberOne.setText(null);
            Entrada_numberTwo.setText(null);
        }

    }

    public void operacoes(String operacao, double numberOne, double numberTwo) {
        if (operacao.equalsIgnoreCase("+")) {
            result = numberOne + numberTwo;
        } else if (operacao.equalsIgnoreCase("-")) {
            result = numberOne - numberTwo;
        } else if (operacao.equalsIgnoreCase("/")) {
            result = numberOne / numberTwo;
        } else if (operacao.equalsIgnoreCase("*")) {
            result = numberOne * numberTwo;
        }
    }

    private void bottom_somaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_bottom_somaMouseClicked
        operacao = "+";
        this.operacoes_sem_erros();
    }// GEN-LAST:event_bottom_somaMouseClicked

    private void bottom_subtrairMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_bottom_subtrairMouseClicked
        operacao = "-";
        this.operacoes_sem_erros();
    }// GEN-LAST:event_bottom_subtrairMouseClicked

    private void bottom_dividirMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_bottom_dividirMouseClicked
        operacao = "/";
        this.operacoes_sem_erros();

        if (this.Exit_operacoes.getText().equals("NaN") || this.Exit_operacoes.getText().equals("Infinity")) {
            Exit_operacoes.setText("0.0");
        }
    }// GEN-LAST:event_bottom_dividirMouseClicked

    private void bottom_multiplicarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_bottom_multiplicarMouseClicked
        operacao = "*";
        this.operacoes_sem_erros();
    }// GEN-LAST:event_bottom_multiplicarMouseClicked

    private void Entrada_numberOneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Entrada_numberOneActionPerformed

    }// GEN-LAST:event_Entrada_numberOneActionPerformed

    private void Entrada_numberOneMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Entrada_numberOneMouseClicked
        Entrada_numberOne.setText(null);
        Exit_operacoes.setText(null);
    }// GEN-LAST:event_Entrada_numberOneMouseClicked

    private void Entrada_numberTwoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Entrada_numberTwoMouseClicked
        Entrada_numberTwo.setText(null);
        Exit_operacoes.setText(null);
    }// GEN-LAST:event_Entrada_numberTwoMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Calc_3d_v01().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Calculadora;
    private javax.swing.JTextField Entrada_numberOne;
    private javax.swing.JTextField Entrada_numberTwo;
    private javax.swing.JLabel Exit_operacoes;
    private javax.swing.JButton bottom_dividir;
    private javax.swing.JButton bottom_multiplicar;
    private javax.swing.JButton bottom_soma;
    private javax.swing.JButton bottom_subtrair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
