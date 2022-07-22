
package calc2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Calc2 extends javax.swing.JFrame {
    
    public Calc2() {
        initComponents();
        this.setTitle("Calculadora");
        this.Resultado.setEditable(false);//Hace que no nos deje escribir en el TextField
        setResizable(false);//Hace que no podamos cambiar el tamaño dela ventana
        this.boton = 0;
        
    }
    
    
    //OPERACIONES
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        BotonPunto = new javax.swing.JButton();
        BotonSumar = new javax.swing.JButton();
        Botoneq = new javax.swing.JButton();
        BotonDiv = new javax.swing.JButton();
        BotonRestar = new javax.swing.JButton();
        BotonMulti = new javax.swing.JButton();
        Resultado = new javax.swing.JTextField();
        jButtonC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        BotonPunto.setText(".");
        BotonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPuntoActionPerformed(evt);
            }
        });

        BotonSumar.setText("+");
        BotonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumarActionPerformed(evt);
            }
        });

        Botoneq.setText("=");
        Botoneq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoneqActionPerformed(evt);
            }
        });

        BotonDiv.setText("/");
        BotonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDivActionPerformed(evt);
            }
        });

        BotonRestar.setText("-");
        BotonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestarActionPerformed(evt);
            }
        });

        BotonMulti.setText("*");
        BotonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiActionPerformed(evt);
            }
        });

        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });

        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton5)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BotonSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Botoneq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton9)
                                .addComponent(BotonPunto))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BotonMulti)
                                .addComponent(BotonDiv))
                            .addGap(18, 18, 18))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(BotonSumar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(BotonRestar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton7)
                    .addComponent(BotonMulti))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton0)
                    .addComponent(BotonPunto)
                    .addComponent(BotonDiv)
                    .addComponent(jButtonC))
                .addGap(18, 18, 18)
                .addComponent(Botoneq)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiActionPerformed
        // TODO add your handling code here:
        this.acum =  Double.parseDouble(this.Resultado.getText());
        this.operador = 3;
        this.Resultado.setText("");
        dec = false;
    }//GEN-LAST:event_BotonMultiActionPerformed

    private void BotonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumarActionPerformed
        // TODO add your handling code here:
        this.acum =  Double.parseDouble(this.Resultado.getText());
        this.operador = 1;
        this.Resultado.setText("");
        dec = false;
    }//GEN-LAST:event_BotonSumarActionPerformed

    private void BotonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestarActionPerformed
        // TODO add your handling code here:
        this.acum = Double.parseDouble(this.Resultado.getText());
        this.operador = 2;
        this.Resultado.setText("");
        dec = false;
    }//GEN-LAST:event_BotonRestarActionPerformed

    private void BotonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDivActionPerformed
        // TODO add your handling code here:
        this.acum =  Double.parseDouble(this.Resultado.getText());
        this.operador = 4;
        this.Resultado.setText("");
        dec = false;
    }//GEN-LAST:event_BotonDivActionPerformed

    private void BotoneqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoneqActionPerformed
        // TODO add your handling code here:
        this.operando1 =  Double.parseDouble(this.Resultado.getText());
        this.operando2 = Double.parseDouble(this.Resultado.getText());
        System.out.println(this.operando1  + "+" + this.acum);
        switch(operador){
            case 1: resultado = this.acum + this.operando1;
                break;
            case 2: resultado = this.acum - this.operando1;
                break;
            case 3: resultado = this.acum * this.operando1;
                break;
            case 4: resultado = this.acum / this.operando1;
                break;   
        
        }
        Locale  localActual = Locale.GERMAN;//Libreria de signos alemana
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(localActual);
        simbolos.setDecimalSeparator('.');
        //Dar formato
        DecimalFormat formatoResultado = new DecimalFormat("#.######", simbolos);
        Resultado.setText(String.valueOf(formatoResultado.format(resultado)));
        operando1 = 0;
        dec = false;
        
    }//GEN-LAST:event_BotoneqActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ResultadoActionPerformed

    
    
    //BOTONES DE NUMEROS,PUNTO Y C
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.boton = 1;
        this.Resultado.setText(Resultado.getText() + this.boton);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.boton = 2;
        this.Resultado.setText(Resultado.getText() + this.boton);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.boton = 3;
        this.Resultado.setText(Resultado.getText() + this.boton);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.boton = 4;
        this.Resultado.setText(Resultado.getText() + this.boton);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.boton = 5;
        this.Resultado.setText(Resultado.getText() + this.boton);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.boton = 6;
        this.Resultado.setText(Resultado.getText() + this.boton);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.boton = 7;
        this.Resultado.setText(Resultado.getText() + this.boton);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.boton = 8;
        this.Resultado.setText(Resultado.getText() + this.boton);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.boton = 9;
        this.Resultado.setText(Resultado.getText() + this.boton);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
        this.boton = 0;
        if (this.Resultado.getText().equals("")!= false){
            this.Resultado.setText(Resultado.getText() + this.boton);
        } else 
            this.Resultado.setText(Resultado.getText() + this.boton);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void BotonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPuntoActionPerformed
        if(!dec){
            if ("".equals(this.Resultado.getText())){
                this.Resultado.setText("0.");
                dec = true;
            }else{
                this.Resultado.setText(Resultado.getText() + ".");
                dec = true;
            } 
        }
        
        
    }//GEN-LAST:event_BotonPuntoActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        this.Resultado.setText("");
        this.operando1 = 0;
        this.resultado = 0;
        dec = false;
        
    }//GEN-LAST:event_jButtonCActionPerformed

    
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc2().setVisible(true);
            }
        });
    }
    
    
    private int boton = 0;
    private double operando1;
    private double operando2;
    private double acum;
    private int operador;
    private double resultado = 0;
    private boolean dec = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDiv;
    private javax.swing.JButton BotonMulti;
    private javax.swing.JButton BotonPunto;
    private javax.swing.JButton BotonRestar;
    private javax.swing.JButton BotonSumar;
    private javax.swing.JButton Botoneq;
    private javax.swing.JTextField Resultado;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    // End of variables declaration//GEN-END:variables
}
