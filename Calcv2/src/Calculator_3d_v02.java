import static java.lang.Double.NaN;

/**
 *
 * @author Lucas
 */
public class Calculator_3d_v02 extends javax.swing.JFrame {

    double result, numberOne, numberTwo;
    String operation, stringResult;

    public Calculator_3d_v02() {
        initComponents();
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Calculator = new javax.swing.JPanel();
        buttonSubtraction = new javax.swing.JButton();
        buttonAddition  = new javax.swing.JButton();
        buttonDivision = new javax.swing.JButton();
        buttonMultiplication = new javax.swing.JButton();
        inputOutputNumbers = new javax.swing.JTextField();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        resultButton = new javax.swing.JButton();
        buttonC = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Calculator.setBackground(new java.awt.Color(102, 102, 102));
        Calculator.setToolTipText("Calculadora v0.2");
        Calculator.setName("Calculadora"); 

        buttonSubtraction.setText("-");
        buttonSubtraction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSubtractionMouseClicked(evt);
            }
        });
        
        buttonAddition .setText("+");
        buttonAddition .addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAdditionMouseClicked(evt);
            }
        });
        
        buttonDivision.setText("/");
        buttonDivision.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDivisionMouseClicked(evt);
            }
        });
        
        buttonMultiplication.setText("*");
        buttonMultiplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMultiplicationMouseClicked(evt);
            }
        });

        resultButton.setText("=");
        resultButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultButtonMouseClicked(evt);
            }
        });

        buttonC.setText("C");
        buttonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCMouseClicked(evt);
            }
        });

        inputOutputNumbers.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputOutputNumbers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputOutputNumbersMouseClicked(evt);
            }
        });

        one.setText("1");
        one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberOneMouseClicked(evt);
            }
        });

        two.setText("2");
        two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberTwoMouseClicked(evt);
            }
        });

        three.setText("3");
        three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberThreeMouseClicked(evt);
            }
        });

        four.setText("4");
        four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberFourMouseClicked(evt);
            }
        });

        five.setText("5");
        five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberFiveMouseClicked(evt);
            }
        });

        six.setText("6");
        six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberSixMouseClicked(evt);
            }
        });

        seven.setText("7");
        seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberSevenMouseClicked(evt);
            }
        });

        eight.setText("8");
        eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberEightMouseClicked(evt);
            }
        });

        nine.setText("9");
        nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberNineMouseClicked(evt);
            }
        });

        zero.setText("0");
        zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberZeroMouseClicked(evt);
            }
        });

        buttonSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtractionActionPerformed(evt);
            }
        });
        
        buttonAddition .addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdditionActionPerformed(evt);
            }
        });
        
        buttonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivisionActionPerformed(evt);
            }
        });
        
        buttonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplicationActionPerformed(evt);
            }
        });
        
        buttonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCActionPerformed(evt);
            }
        });

        inputOutputNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputOutputNumbersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CalculadoraLayout = new javax.swing.GroupLayout(Calculator);
        Calculator.setLayout(CalculadoraLayout);
        CalculadoraLayout.setHorizontalGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculadoraLayout.createSequentialGroup().addGap(0, 34, Short.MAX_VALUE)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(CalculadoraLayout.createSequentialGroup().addComponent(resultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonC, javax.swing.GroupLayout.PREFERRED_SIZE, 49,javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 49,javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 49,javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CalculadoraLayout.createSequentialGroup()
                        .addComponent(buttonAddition , javax.swing.GroupLayout.PREFERRED_SIZE, 49,javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 49,javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(inputOutputNumbers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 214,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CalculadoraLayout.createSequentialGroup().addGroup(CalculadoraLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(CalculadoraLayout.createSequentialGroup()
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(CalculadoraLayout.createSequentialGroup()
                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculadoraLayout
                                .createSequentialGroup().addComponent(eight,javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nine,javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculadoraLayout.createSequentialGroup().addComponent(five,
                            javax.swing.GroupLayout.PREFERRED_SIZE, 49,javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(four,javax.swing.GroupLayout.PREFERRED_SIZE, 49,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE)));
        CalculadoraLayout.setVerticalGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculadoraLayout.createSequentialGroup().addContainerGap(20, Short.MAX_VALUE)
                .addComponent(inputOutputNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 37,javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDivision).addComponent(buttonAddition ).addComponent(buttonSubtraction)
                    .addComponent(buttonMultiplication))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one).addComponent(resultButton).addComponent(zero).addComponent(buttonC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(five).addComponent(four).addComponent(three).addComponent(two))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalculadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eight).addComponent(nine).addComponent(seven).addComponent(six))
                .addContainerGap(30, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
            Calculator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(Calculator,
                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    public String current(String number) {
        inputOutputNumbers.setText(inputOutputNumbers.getText() + number);

        String current = inputOutputNumbers.getText();

        return current;
    }



    private void buttonSubtractionMouseClicked(java.awt.event.MouseEvent evt) {
        firstNumberFilter("-");
    }

    private void buttonAdditionMouseClicked(java.awt.event.MouseEvent evt) {
        operation = "+";
        firstNumberFilter();
    }
    
    private void buttonDivisionMouseClicked(java.awt.event.MouseEvent evt) {
        operation = "/";
        firstNumberFilter();
    }

    private void buttonMultiplicationMouseClicked(java.awt.event.MouseEvent evt) {
        operation = "*";
        firstNumberFilter();
    }

    private void resultButtonMouseClicked(java.awt.event.MouseEvent evt) {

        secondNumberFilter();

        while (result == 0.0) {
            result = operations(operation, numberOne, numberTwo);
        }

        stringResult = Double.toString(result);
        inputOutputNumbers.setText(stringResult);

    }

    private void numberOneMouseClicked(java.awt.event.MouseEvent evt) {
        this.current("1");
    }

    private void numberTwoMouseClicked(java.awt.event.MouseEvent evt) {
        this.current("2");
    }

    private void numberThreeMouseClicked(java.awt.event.MouseEvent evt) {
        this.current("3");
    }

    private void numberFourMouseClicked(java.awt.event.MouseEvent evt) {
        this.current("4");
    }

    private void numberFiveMouseClicked(java.awt.event.MouseEvent evt) {
        this.current("5");
    }

    private void numberSixMouseClicked(java.awt.event.MouseEvent evt) {
        this.current("6");
    }

    private void numberSevenMouseClicked(java.awt.event.MouseEvent evt) {
        this.current("7");
    }

    private void numberEightMouseClicked(java.awt.event.MouseEvent evt) {
        this.current("8");
    }

    private void numberNineMouseClicked(java.awt.event.MouseEvent evt) {
        this.current("9");
    }

    private void numberZeroMouseClicked(java.awt.event.MouseEvent evt) {
        this.current("0");
    }

    private void buttonCActionPerformed(java.awt.event.ActionEvent evt) {
        numberOne = 0.0;
        numberTwo = 0.0;
        result = 0.0;

        inputOutputNumbers.setText(null);
    }

    private void buttonSubtractionActionPerformed(java.awt.event.ActionEvent evt) {}
    private void buttonAdditionActionPerformed(java.awt.event.ActionEvent evt) {}
    private void buttonDivisionActionPerformed(java.awt.event.ActionEvent evt) {}
    private void buttonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {}
    private void inputOutputNumbersActionPerformed(java.awt.event.ActionEvent evt) {}
    private void inputOutputNumbersMouseClicked(java.awt.event.MouseEvent evt) {}
    private void buttonCMouseClicked(java.awt.event.MouseEvent evt) {} 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator_3d_v02.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator_3d_v02.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator_3d_v02.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator_3d_v02.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Calculator_3d_v02().setVisible(true);
            }
        });
    }

    private javax.swing.JButton buttonC;
    private javax.swing.JPanel Calculator;
    private javax.swing.JTextField inputOutputNumbers;
    private javax.swing.JButton buttonDivision;
    private javax.swing.JButton buttonMultiplication;
    private javax.swing.JButton buttonAddition ;
    private javax.swing.JButton buttonSubtraction;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton four;
    private javax.swing.JButton two;
    private javax.swing.JButton nine;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton six;
    private javax.swing.JButton seven;
    private javax.swing.JButton three;
    private javax.swing.JButton one;
    private javax.swing.JButton zero;
    private javax.swing.JButton resultButton;
}