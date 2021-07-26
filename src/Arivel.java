
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gumansingh
 */
public class Arivel extends javax.swing.JFrame {

    /**
     * Creates new form Arrival
     */
    public Arivel() {
        initComponents();
        setSize (1520, 750);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(0, 0, 0));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("Karachi Airline Service");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 740, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("Arrival");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 250, -1));

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(51, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"K-265", "<html><font color=\"GREEN\">Terminal C</color></html>", "Karachi", "<html><font color=\"RED\">40</color></html>", "6:20 am", "<html><font color=\"GREEN\">ON TIME</color></html>"},
                {"AU-352", "<html><font color=\"GREEN\">Terminal A</color></html>", "Karachi", "<html><font color=\"RED\">20</color></html>", "6:40 am", "<html><font color=\"RED\">DELAYED</color></html>"},
                {"NY-281", "<html><font color=\"GREEN\">Terminal D</color></html>", "Karachi", "<html><font color=\"RED\">07</color></html>", "7:50 am", "<html><font color=\"GREEN\">CHECK-IN</color></html>"},
                {"AE-271", "<html><font color=\"GREEN\">Terminal Z</color></html>", "Karachi", "<html><font color=\"RED\">39</color></html>", "9:20 am", "<html><font color=\"RED\">CANCELLED</color></html>"},
                {"DH-981", "<html><font color=\"GREEN\">Terminal B</color></html>", "Karachi", "<html><font color=\"RED\">31</color></html>", "12:00 pm", "<html><font color=\"GREEN\">ON TIME</color></html>"},
                {"KM-871", "<html><font color=\"GREEN\">Terminal A</color></html>", "Karachi", "<html><font color=\"RED\">11</color></html>", "12:15 pm", "<html><font color=\"GREEN\">ON TIME</color></html>"},
                {"IT-627", "<html><font color=\"GREEN\">Terminal C</color></html>", "Karachi", "<html><font color=\"RED\">27</color></html>", "1:05 pm", "<html><font color=\"RED\">DELAYED</color></html>"},
                {"CB-224", "<html><font color=\"GREEN\">Terminal D</color></html>", "Karachi", "<html><font color=\"RED\">08</color></html>", "2:35 pm", "<html><font color=\"GREEN\">ON TIME</color></html>"},
                {"CG-837", "<html><font color=\"GREEN\">Terminal B</color></html>", "Karachi", "<html><font color=\"RED\">37</color></html>", "3:00 pm", "<html><font color=\"GREEN\">ON TIME</color></html>"},
                {"PK-522", "<html><font color=\"GREEN\">Terminal A</color></html>", "Karachi", "<html><font color=\"RED\">22</color></html>", "3:25 pm", "<html><font color=\"GREEN\">CHECK-IN</color></html>"},
                {"QT-733", "<html><font color=\"GREEN\">Terminal C</color></html>", "Karachi", "<html><font color=\"RED\">30</color></html>", "5:00 pm", "<html><font color=\"RED\">CANCELLED</color></html>"}
            },
            new String [] {
                "<html><body><h3><font color=\"BLUE\">FLIGHT</color></body></html>", "<html><body><h3><font color=\"green\">TERMINAL</color></body></html>", "<html><body><h3><font color=\"BLUE\">DESTINATION</color></body></html>", "<html><body><h3><font color=\"RED\">GATE</color></body></html>", "<html><body><h3><font color=\"BLUE\">TIME</color></body></html>", "<html><body><h3><font color=\"GREEN\">REMARKS</color></body></html>"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jScrollPane2.setViewportView(jTable1);

        panel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1390, 530));

        exit.setBackground(new java.awt.Color(255, 102, 255));
        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(51, 0, 204));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        panel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 90, 50));

        Back.setBackground(new java.awt.Color(255, 102, 255));
        Back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(51, 0, 204));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        panel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 50));

        jLabel5.setText("jLabel5");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, 2900, 1550));

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 1380, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        frame = new JFrame ("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Do you really want to Exit","Output Console",
            JOptionPane.YES_NO_OPTION) == (JOptionPane.YES_NO_OPTION)){
        System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new ticketing().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Arivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}