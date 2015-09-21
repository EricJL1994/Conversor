
import java.awt.Color;
import static java.lang.Character.isDigit;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Autor = new javax.swing.JLabel();
        InfoDato = new javax.swing.JLabel();
        InfoResultado = new javax.swing.JLabel();
        Dato = new javax.swing.JTextField();
        Resultado = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperatura");

        Autor.setText("Autor: Éric Jordán López");

        InfoDato.setText("Dato: Temperatura Celsius");

        InfoResultado.setText("Resultado: Temperatura Fahrenheit");

        Dato.setForeground(new java.awt.Color(153, 153, 153));
        Dato.setText("Introduzca el dato");
        Dato.setToolTipText("");
        Dato.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Dato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DatoFocusLost(evt);
            }
        });
        Dato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatoMouseClicked(evt);
            }
        });

        Resultado.setEditable(false);
        Resultado.setBackground(new java.awt.Color(255, 255, 255));
        Resultado.setForeground(new java.awt.Color(153, 153, 153));
        Resultado.setText("Resultado del conversor");
        Resultado.setFocusable(false);

        Calcular.setText("Convertir");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jLabel1.setText("ºC");

        jLabel2.setText("ºF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Autor)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Dato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InfoDato)
                                .addGap(18, 18, Short.MAX_VALUE)))
                        .addComponent(Calcular)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InfoResultado)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Resultado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InfoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InfoDato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcular)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(Autor)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        // TODO add your handling code here:
            String texto = analizaString(Dato.getText());
        if ("Introduzca el dato".equals(texto)) {
            Dato.setBackground(Color.RED);
            Dato.setForeground(Color.BLACK);
        } else {
            Double Cel = Double.valueOf(texto);
            if (Cel < -273.15) {
                JOptionPane.showMessageDialog(null, "Temperatura por debajo del cero absoluto");
                Dato.setText("");
            } else {
                Double Fah = 1.8 * Cel + 32;
                Resultado.setForeground(Color.BLACK);
                Resultado.setText(Fah.toString());
            }
        }
    }//GEN-LAST:event_CalcularActionPerformed

    private void DatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatoMouseClicked
        // TODO add your handling code here:
        Dato.setText("");
        Dato.setForeground(Color.BLACK);
        Dato.setBackground(Color.WHITE);
        Resultado.setText("");
    }//GEN-LAST:event_DatoMouseClicked

    private void DatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusGained
        // TODO add your handling code here:
        Dato.setText("");
        Dato.setForeground(Color.BLACK);
    }//GEN-LAST:event_DatoFocusGained

    private void DatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusLost
        // TODO add your handling code here:
        if ("".equals(Dato.getText())) {
            Dato.setForeground(new java.awt.Color(153, 153, 153));
            Dato.setText("Introduzca el dato");
        }
    }//GEN-LAST:event_DatoFocusLost

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Autor;
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField Dato;
    private javax.swing.JLabel InfoDato;
    private javax.swing.JLabel InfoResultado;
    private javax.swing.JTextField Resultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    private String analizaString(String text) {
        boolean punto = true;
        boolean menos = true;
        for (int i = 0; i < text.length(); i++) {
            if(!isDigit(text.charAt(i))){
                switch(text.charAt(i)){
                    case '.':
                        if(punto){
                            punto = false;
                        }else{
                            return "Introduzca el dato";
                        }
                        break;
                    case '-':
                        if(menos && i == 0){
                            menos = false;
                        }else{
                            return "Introduzca el dato";
                        }
                        break;
                    default:
                        return "Introduzca el dato";
                }
            }
        }
        return text;
    }
}