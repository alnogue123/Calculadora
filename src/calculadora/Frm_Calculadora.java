/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author alnog
 */
public class Frm_Calculadora extends javax.swing.JFrame {

    String Cadena = "";
    short LocalizarPosicionSimbolo = 0;
    short PosicionSimbolo = 0;
    Calculadora calc;
    short Limite = 0;
    short Opcion = 0;
    short OpcionNumeros = 0;
    short  i = 0;

    public Frm_Calculadora() {
        initComponents();
        calc = new Calculadora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LB_Reultado = new javax.swing.JLabel();
        Btn_numero1 = new javax.swing.JButton();
        Btn_numero2 = new javax.swing.JButton();
        Btn_numero3 = new javax.swing.JButton();
        Btn_numero4 = new javax.swing.JButton();
        Btn_numero5 = new javax.swing.JButton();
        Btn_numero6 = new javax.swing.JButton();
        Btn_numero7 = new javax.swing.JButton();
        Btn_numero8 = new javax.swing.JButton();
        Btn_numero9 = new javax.swing.JButton();
        Btn_numero0 = new javax.swing.JButton();
        Btn_Suma = new javax.swing.JButton();
        Btn_Resta = new javax.swing.JButton();
        Btn_Multiplicacion = new javax.swing.JButton();
        Btn_Division = new javax.swing.JButton();
        Btn_CalcularResultado = new javax.swing.JButton();
        Btn_Limpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        jLabel1.setToolTipText("");

        jButton16.setText("jButton16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        LB_Reultado.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LB_Reultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_Reultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LB_Reultado, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addContainerGap())
        );

        Btn_numero1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_numero1.setText("1");
        Btn_numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_numero1ActionPerformed(evt);
            }
        });

        Btn_numero2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_numero2.setText("2");
        Btn_numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_numero2ActionPerformed(evt);
            }
        });

        Btn_numero3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_numero3.setText("3");
        Btn_numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_numero3ActionPerformed(evt);
            }
        });

        Btn_numero4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_numero4.setText("4");
        Btn_numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_numero4ActionPerformed(evt);
            }
        });

        Btn_numero5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_numero5.setText("5");
        Btn_numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_numero5ActionPerformed(evt);
            }
        });

        Btn_numero6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_numero6.setText("6");
        Btn_numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_numero6ActionPerformed(evt);
            }
        });

        Btn_numero7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_numero7.setText("7");
        Btn_numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_numero7ActionPerformed(evt);
            }
        });

        Btn_numero8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_numero8.setText("8");
        Btn_numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_numero8ActionPerformed(evt);
            }
        });

        Btn_numero9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_numero9.setText("9");
        Btn_numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_numero9ActionPerformed(evt);
            }
        });

        Btn_numero0.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_numero0.setText("0");
        Btn_numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_numero0ActionPerformed(evt);
            }
        });

        Btn_Suma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_Suma.setText("+");
        Btn_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SumaActionPerformed(evt);
            }
        });

        Btn_Resta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_Resta.setText("-");
        Btn_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RestaActionPerformed(evt);
            }
        });

        Btn_Multiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_Multiplicacion.setText("*");
        Btn_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MultiplicacionActionPerformed(evt);
            }
        });

        Btn_Division.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_Division.setText("/");
        Btn_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DivisionActionPerformed(evt);
            }
        });

        Btn_CalcularResultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_CalcularResultado.setText("=");
        Btn_CalcularResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CalcularResultadoActionPerformed(evt);
            }
        });

        Btn_Limpiar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Btn_Limpiar.setText("C");
        Btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_CalcularResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Btn_numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn_numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn_numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Btn_numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Btn_numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Btn_numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Btn_numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Btn_numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Btn_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Btn_Division, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btn_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btn_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btn_Resta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Btn_numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Btn_numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Btn_Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Division, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_CalcularResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String  EscribirNumero(){
             LocalizarPosicionSimbolo++;
            i = OpcionNumeros;
            Cadena = Cadena + Short.toString(i);
            return Cadena;
    }
    
    private void Btn_numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_numero1ActionPerformed
        OpcionNumeros =1;
        Cadena = EscribirNumero();
        LB_Reultado.setText(Cadena);
    }//GEN-LAST:event_Btn_numero1ActionPerformed

    private void Btn_numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_numero2ActionPerformed
        OpcionNumeros = 2;
        Cadena = EscribirNumero();
        LB_Reultado.setText(Cadena);
    }//GEN-LAST:event_Btn_numero2ActionPerformed

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
        Cadena = "";
        LB_Reultado.setText("");
        Limite = 0;
        PosicionSimbolo = 0;
        LocalizarPosicionSimbolo = 0;
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_numero3ActionPerformed
        OpcionNumeros = 3;
        Cadena = EscribirNumero();
        LB_Reultado.setText(Cadena);
    }//GEN-LAST:event_Btn_numero3ActionPerformed

    private void Btn_numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_numero4ActionPerformed
        OpcionNumeros = 4;
        Cadena = EscribirNumero();
        LB_Reultado.setText(Cadena);
    }//GEN-LAST:event_Btn_numero4ActionPerformed

    private void Btn_numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_numero5ActionPerformed
        OpcionNumeros = 5;
        Cadena = EscribirNumero();
        LB_Reultado.setText(Cadena);
    }//GEN-LAST:event_Btn_numero5ActionPerformed

    private void Btn_numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_numero6ActionPerformed
        OpcionNumeros = 6;
        Cadena = EscribirNumero();
        LB_Reultado.setText(Cadena);
    }//GEN-LAST:event_Btn_numero6ActionPerformed

    private void Btn_numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_numero7ActionPerformed
        OpcionNumeros = 7;
        Cadena = EscribirNumero();
        LB_Reultado.setText(Cadena);
    }//GEN-LAST:event_Btn_numero7ActionPerformed

    private void Btn_numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_numero8ActionPerformed
        OpcionNumeros = 8;
        Cadena = EscribirNumero();
        LB_Reultado.setText(Cadena);
    }//GEN-LAST:event_Btn_numero8ActionPerformed

    private void Btn_numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_numero9ActionPerformed
        OpcionNumeros = 9;
        Cadena = EscribirNumero();
        LB_Reultado.setText(Cadena);
    }//GEN-LAST:event_Btn_numero9ActionPerformed

    private void Btn_numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_numero0ActionPerformed
        OpcionNumeros = 0;
        Cadena = EscribirNumero();
        LB_Reultado.setText(Cadena);
    }//GEN-LAST:event_Btn_numero0ActionPerformed

    private void LocalizarSimbolo(){
        PosicionSimbolo = LocalizarPosicionSimbolo;
        LocalizarPosicionSimbolo = 0;
        Limite++;
    }
    
    private void EscribirSimbolo() {
        if (Limite > 1) {
            JOptionPane.showMessageDialog(rootPane, "por ahora solo puedes utilizar un simbolo");
        } else {
            Cadena = calc.ValidarSimbolos(PosicionSimbolo, LocalizarPosicionSimbolo, Cadena, Opcion);
            LB_Reultado.setText(Cadena);
        }
    }

    private void Btn_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SumaActionPerformed
        Opcion = 1;
        LocalizarSimbolo();
        EscribirSimbolo();
    }//GEN-LAST:event_Btn_SumaActionPerformed

    private void Btn_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RestaActionPerformed
        Opcion = 2;
        LocalizarSimbolo();
        EscribirSimbolo();
    }//GEN-LAST:event_Btn_RestaActionPerformed

    private void Btn_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MultiplicacionActionPerformed
        Opcion = 3;
       LocalizarSimbolo();
       EscribirSimbolo();
    }//GEN-LAST:event_Btn_MultiplicacionActionPerformed

    private void Btn_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DivisionActionPerformed
        Opcion = 4;
        LocalizarSimbolo();
        EscribirSimbolo();
    }//GEN-LAST:event_Btn_DivisionActionPerformed

    private void Btn_CalcularResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CalcularResultadoActionPerformed

        String PrimerGrupo = Cadena.substring(0, PosicionSimbolo);
        String SegundoGrupo = Cadena.substring((PosicionSimbolo + 1), Cadena.length());
        double num1 = Double.parseDouble(PrimerGrupo);
        double num2 = Double.parseDouble(SegundoGrupo);
        switch (Cadena.charAt(PosicionSimbolo)) {
            case '+' -> {
                String resultado = Double.toString(calc.Sumar(num1, num2));
                resultado = resultado.replace(".0", "");
                LB_Reultado.setText(resultado);
            }
            case '-' -> {
                String resultado = Double.toString(calc.Restar(num1, num2));
                resultado = resultado.replace(".0", "");
                LB_Reultado.setText(resultado);
            }
            case '*' -> {
                String resultado = Double.toString(calc.Multiplicar(num1, num2));
                resultado = resultado.replace(".0", "");
                LB_Reultado.setText(resultado);
            }
            case '/' ->
                LB_Reultado.setText(calc.Dividir(num1, num2));
            default ->
                throw new AssertionError();
        }
    }//GEN-LAST:event_Btn_CalcularResultadoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_CalcularResultado;
    private javax.swing.JButton Btn_Division;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Multiplicacion;
    private javax.swing.JButton Btn_Resta;
    private javax.swing.JButton Btn_Suma;
    private javax.swing.JButton Btn_numero0;
    private javax.swing.JButton Btn_numero1;
    private javax.swing.JButton Btn_numero2;
    private javax.swing.JButton Btn_numero3;
    private javax.swing.JButton Btn_numero4;
    private javax.swing.JButton Btn_numero5;
    private javax.swing.JButton Btn_numero6;
    private javax.swing.JButton Btn_numero7;
    private javax.swing.JButton Btn_numero8;
    private javax.swing.JButton Btn_numero9;
    private javax.swing.JLabel LB_Reultado;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}