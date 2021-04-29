
import static java.lang.Double.NaN;

// import java.util.regex.Pattern;

/**
 *
 * @author Lucas
 */
public class Calc_3d_v02 extends javax.swing.JFrame {

    double result, numberOne, numberTwo;
    String operacao, resultado;

    public Calc_3d_v02() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Calculadora = new javax.swing.JPanel();
        bottom_subtrair = new javax.swing.JButton();
        bottom_soma = new javax.swing.JButton();
        bottom_dividir = new javax.swing.JButton();
        bottom_multiplicar = new javax.swing.JButton();
        Entrada_Saida_numbers = new javax.swing.JTextField();
        numberUm = new javax.swing.JButton();
        numberDois = new javax.swing.JButton();
        numberTres = new javax.swing.JButton();
        numberCinco = new javax.swing.JButton();
        numberQuatro = new javax.swing.JButton();
        numberSeis = new javax.swing.JButton();
        numberSete = new javax.swing.JButton();
        numberOito = new javax.swing.JButton();
        numberNove = new javax.swing.JButton();
        numberZero = new javax.swing.JButton();
        resultBottom = new javax.swing.JButton();
        BottomCE = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Calculadora.setBackground(new java.awt.Color(102, 102, 102));
        Calculadora.setToolTipText("Calculadora v0.2");
        Calculadora.setName("Calculadora"); // NOI18N

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

        Entrada_Saida_numbers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Entrada_Saida_numbers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Entrada_Saida_numbersMouseClicked(evt);
            }
        });
        Entrada_Saida_numbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entrada_Saida_numbersActionPerformed(evt);
            }
        });

        numberUm.setText("1");
        numberUm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberUmMouseClicked(evt);
            }
        });

        numberDois.setText("2");
        numberDois.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberDoisMouseClicked(evt);
            }
        });

        numberTres.setText("3");
        numberTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberTresMouseClicked(evt);
            }
        });

        numberCinco.setText("5");
        numberCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberCincoMouseClicked(evt);
            }
        });

        numberQuatro.setText("4");
        numberQuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberQuatroMouseClicked(evt);
            }
        });

        numberSeis.setText("6");
        numberSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberSeisMouseClicked(evt);
            }
        });

        numberSete.setText("7");
        numberSete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberSeteMouseClicked(evt);
            }
        });

        numberOito.setText("8");
        numberOito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberOitoMouseClicked(evt);
            }
        });

        numberNove.setText("9");
        numberNove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberNoveMouseClicked(evt);
            }
        });

        numberZero.setText("0");
        numberZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberZeroMouseClicked(evt);
            }
        });

        resultBottom.setText("=");
        resultBottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultBottomMouseClicked(evt);
            }
        });

        BottomCE.setText("CE");
        BottomCE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BottomCEMouseClicked(evt);
            }
        });
        BottomCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottomCEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CalculadoraLayout = new javax.swing.GroupLayout(Calculadora);
        Calculadora.setLayout(CalculadoraLayout);
        CalculadoraLayout.setHorizontalGroup(CalculadoraLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CalculadoraLayout.createSequentialGroup().addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(CalculadoraLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(CalculadoraLayout.createSequentialGroup()
                                        .addComponent(resultBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BottomCE, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numberZero, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numberUm, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(CalculadoraLayout.createSequentialGroup()
                                        .addComponent(bottom_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bottom_subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bottom_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bottom_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Entrada_Saida_numbers, javax.swing.GroupLayout.Alignment.LEADING,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 214,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(CalculadoraLayout.createSequentialGroup().addGroup(CalculadoraLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(CalculadoraLayout.createSequentialGroup()
                                                .addComponent(numberSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numberSete, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(CalculadoraLayout.createSequentialGroup()
                                                .addComponent(numberDois, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(numberTres, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(CalculadoraLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculadoraLayout
                                                        .createSequentialGroup()
                                                        .addComponent(numberOito,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(numberNove,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculadoraLayout
                                                        .createSequentialGroup()
                                                        .addComponent(numberQuatro,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(numberCinco,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(34, Short.MAX_VALUE)));
        CalculadoraLayout.setVerticalGroup(CalculadoraLayout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CalculadoraLayout.createSequentialGroup().addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(Entrada_Saida_numbers, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bottom_dividir).addComponent(bottom_soma).addComponent(bottom_subtrair)
                                .addComponent(bottom_multiplicar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numberUm).addComponent(resultBottom).addComponent(numberZero)
                                .addComponent(BottomCE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numberQuatro).addComponent(numberCinco).addComponent(numberTres)
                                .addComponent(numberDois))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numberOito).addComponent(numberNove).addComponent(numberSete)
                                .addComponent(numberSeis))
                        .addContainerGap(30, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                Calculadora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Calculadora,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String atual(String numero) {
        Entrada_Saida_numbers.setText(Entrada_Saida_numbers.getText() + numero);

        String atual = Entrada_Saida_numbers.getText();

        return atual;
    }

    public double operacoes(String operacao, double numberOne, double numberTwo) {
        if (operacao.equalsIgnoreCase("+")) {
            result = numberOne + numberTwo;
        } else if (operacao.equalsIgnoreCase("-")) {
            result = numberOne - numberTwo;
        } else if (operacao.equalsIgnoreCase("/")) {
            result = numberOne / numberTwo;
            if (result == NaN) {
                result = 0.0;
            }

        } else if (operacao.equalsIgnoreCase("*")) {
            result = numberOne * numberTwo;
        } else {
            result = 0.0;
        }
        return result;
    }

    public boolean checagemNumberTwo() {
        try {
            String numeroDois = this.atual("");
            Entrada_Saida_numbers.setText("");
            numberTwo = Double.parseDouble(numeroDois);

        } catch (NumberFormatException e) {
            Entrada_Saida_numbers.setText(null);
        }

        return true;
    }

    public boolean checagemNumberOne() {
        try {
            String numeroUm = this.atual("");
            Entrada_Saida_numbers.setText("");
            numberOne = Double.parseDouble(numeroUm);

        } catch (NumberFormatException e) {
            Entrada_Saida_numbers.setText(null);
        }

        return true;
    }

    private void bottom_subtrairMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_bottom_subtrairMouseClicked
        operacao = "-";
        checagemNumberOne();
    }// GEN-LAST:event_bottom_subtrairMouseClicked

    private void bottom_subtrairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bottom_subtrairActionPerformed

    }// GEN-LAST:event_bottom_subtrairActionPerformed

    private void bottom_somaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_bottom_somaMouseClicked
        operacao = "+";
        checagemNumberOne();
    }// GEN-LAST:event_bottom_somaMouseClicked

    private void bottom_somaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bottom_somaActionPerformed

    }// GEN-LAST:event_bottom_somaActionPerformed

    private void bottom_dividirMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_bottom_dividirMouseClicked
        operacao = "/";
        checagemNumberOne();
    }// GEN-LAST:event_bottom_dividirMouseClicked

    private void bottom_dividirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bottom_dividirActionPerformed

    }// GEN-LAST:event_bottom_dividirActionPerformed

    private void bottom_multiplicarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_bottom_multiplicarMouseClicked
        operacao = "*";
        checagemNumberOne();
    }// GEN-LAST:event_bottom_multiplicarMouseClicked

    private void bottom_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bottom_multiplicarActionPerformed

    }// GEN-LAST:event_bottom_multiplicarActionPerformed

    private void Entrada_Saida_numbersMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_Entrada_Saida_numbersMouseClicked
    }// GEN-LAST:event_Entrada_Saida_numbersMouseClicked

    private void Entrada_Saida_numbersActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_Entrada_Saida_numbersActionPerformed

    }// GEN-LAST:event_Entrada_Saida_numbersActionPerformed

    private void numberUmMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_numberUmMouseClicked
        this.atual("1");
    }// GEN-LAST:event_numberUmMouseClicked

    private void numberDoisMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_numberDoisMouseClicked
        this.atual("2");
    }// GEN-LAST:event_numberDoisMouseClicked

    private void numberTresMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_numberTresMouseClicked
        this.atual("3");
    }// GEN-LAST:event_numberTresMouseClicked

    private void numberQuatroMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_numberQuatroMouseClicked
        this.atual("4");
    }// GEN-LAST:event_numberQuatroMouseClicked

    private void numberCincoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_numberCincoMouseClicked
        this.atual("5");
    }// GEN-LAST:event_numberCincoMouseClicked

    private void numberSeisMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_numberSeisMouseClicked
        this.atual("6");
    }// GEN-LAST:event_numberSeisMouseClicked

    private void numberSeteMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_numberSeteMouseClicked
        this.atual("7");
    }// GEN-LAST:event_numberSeteMouseClicked

    private void numberOitoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_numberOitoMouseClicked
        this.atual("8");
    }// GEN-LAST:event_numberOitoMouseClicked

    private void numberNoveMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_numberNoveMouseClicked
        this.atual("9");
    }// GEN-LAST:event_numberNoveMouseClicked

    private void numberZeroMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_numberZeroMouseClicked
        this.atual("0");
    }// GEN-LAST:event_numberZeroMouseClicked

    private void resultBottomMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_resultBottomMouseClicked

        checagemNumberTwo();

        while (result == 0.0) {
            result = operacoes(operacao, numberOne, numberTwo);
        }

        resultado = Double.toString(result);
        Entrada_Saida_numbers.setText(resultado);
        // ContaInserida();

    }// GEN-LAST:event_resultBottomMouseClicked

    private void BottomCEMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_BottomCEMouseClicked

    }// GEN-LAST:event_BottomCEMouseClicked

    private void BottomCEActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BottomCEActionPerformed
        numberOne = 0.0;
        numberTwo = 0.0;
        result = 0.0;

        Entrada_Saida_numbers.setText(null);
    }// GEN-LAST:event_BottomCEActionPerformed

    // private Double ContaInserida() {
    // String input = Entrada_Saida_numbers.getText();

    // String caracteres = "=-+. ";
    // Double tot = 0.0;

    // String[] spliter = input.split("[" + Pattern.quote(caracteres) + "]+");

    // String pValor = spliter[0];
    // numberOne = Double.parseDouble(pValor);
    // String svalor = spliter[1];
    // numberTwo = Double.parseDouble(svalor);

    // Entrada_Saida_numbers.setText(pValor);
    // if (input.equalsIgnoreCase("-")) {
    // tot = numberOne - numberTwo;
    // } else if (input.equalsIgnoreCase("+")) {
    // tot = numberOne + numberTwo;
    // } else if (input.equalsIgnoreCase("/")) {
    // tot = numberOne / numberTwo;
    // if (tot == NaN) {
    // tot = 0.0;
    // }
    // } else if (input.equalsIgnoreCase("*")) {
    // tot = numberOne * numberTwo;
    // }

    // return tot;

    // }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc_3d_v02.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc_3d_v02.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc_3d_v02.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc_3d_v02.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calc_3d_v02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottomCE;
    private javax.swing.JPanel Calculadora;
    private javax.swing.JTextField Entrada_Saida_numbers;
    private javax.swing.JButton bottom_dividir;
    private javax.swing.JButton bottom_multiplicar;
    private javax.swing.JButton bottom_soma;
    private javax.swing.JButton bottom_subtrair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton numberCinco;
    private javax.swing.JButton numberDois;
    private javax.swing.JButton numberNove;
    private javax.swing.JButton numberOito;
    private javax.swing.JButton numberQuatro;
    private javax.swing.JButton numberSeis;
    private javax.swing.JButton numberSete;
    private javax.swing.JButton numberTres;
    private javax.swing.JButton numberUm;
    private javax.swing.JButton numberZero;
    private javax.swing.JButton resultBottom;
    // End of variables declaration//GEN-END:variables
}
