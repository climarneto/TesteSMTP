/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Cursor;
import java.awt.Toolkit;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Destinatario;
import modelo.EmailAEnviar;
import modelo.Remetente;
import modelo.ServidorSmtp;
import modelo.UtilitarioEmail;
import org.apache.commons.mail.EmailException;


/**
 *
 * @author llima
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private String msgErro = "";

    /**
     * Creates new form CadUsuario
     */
    public TelaPrincipal() {
        initComponents();
        //setando título
        this.setTitle("Teste SMTP 1.0 | Climar Neto");
        //setando icone
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("imagens\\icon.png"));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtServidor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDestinatario = new javax.swing.JTextField();
        jButtonLimpar = new javax.swing.JButton();
        jButtonTestar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        chtls = new javax.swing.JCheckBox();
        chstarttls = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtRemetente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        chssl = new javax.swing.JCheckBox();
        chstarttlsrq = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Teste SMTP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 280, 17);

        jPanelCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Servidor: ");
        jPanelCadastro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        jPanelCadastro.add(txtServidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 20, 560, -1));

        jLabel4.setText("Porta:");
        jPanelCadastro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));
        jPanelCadastro.add(txtPorta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 550, -1));

        jLabel6.setText("Usuário:");
        jPanelCadastro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanelCadastro.add(txtDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 550, -1));

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        jButtonTestar.setText("Testar");
        jButtonTestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestarActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonTestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, -1, -1));
        jPanelCadastro.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 550, -1));

        jLabel8.setText("Senha:");
        jPanelCadastro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        chtls.setText("Utiliza TLS?");
        chtls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chtlsActionPerformed(evt);
            }
        });
        jPanelCadastro.add(chtls, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        chstarttls.setText("Utiliza StartTLS?");
        chstarttls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chstarttlsActionPerformed(evt);
            }
        });
        jPanelCadastro.add(chstarttls, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel9.setText("Remetente:");
        jPanelCadastro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel10.setText("Destinatário:");
        jPanelCadastro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        jPanelCadastro.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 550, -1));
        jPanelCadastro.add(txtRemetente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 550, -1));

        txtLog.setColumns(20);
        txtLog.setRows(5);
        txtLog.setEnabled(false);
        jScrollPane1.setViewportView(txtLog);

        jPanelCadastro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 470, -1));

        chssl.setText("Utiliza SSL?");
        chssl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chsslActionPerformed(evt);
            }
        });
        jPanelCadastro.add(chssl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        chstarttlsrq.setText("Utiliza StartTLS Required?");
        chstarttlsrq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chstarttlsrqActionPerformed(evt);
            }
        });
        jPanelCadastro.add(chstarttlsrq, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        getContentPane().add(jPanelCadastro);
        jPanelCadastro.setBounds(10, 60, 710, 360);

        setSize(new java.awt.Dimension(740, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        txtLog.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonTestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTestarActionPerformed
        // TODO add your handling code here:
        txtLog.setText("");
        ServidorSmtp s = new ServidorSmtp();
        s.setServidor(txtServidor.getText());
        s.setPorta(Integer.parseInt(txtPorta.getText()));
        s.setUsuario(txtUsuario.getText());
        s.setSenha(txtSenha.getText());
        
        if (chssl.isSelected()){
            s.setUtilizaSsl(true);
        }else {
            s.setUtilizaSsl(false);
        }
        
        if (chtls.isSelected()){
            s.setUtilizaTls(true);
        }else {
            s.setUtilizaTls(false);
        }
        
        if (chstarttls.isSelected()){
            s.setUtilizaStartTls(true);
        }else {
            s.setUtilizaStartTls(false);
        }
        
        if (chstarttlsrq.isSelected()){
            s.setUtilizaStartTlsRequired(true);
        }else {
            s.setUtilizaStartTlsRequired(false);
        }
        
        EmailAEnviar e = new EmailAEnviar();
        
        Destinatario destinatario = new Destinatario();
        destinatario.setEmail(txtDestinatario.getText());
        destinatario.setNome("Destinatário");
        
        Remetente remetente = new Remetente();
        remetente.setEmail(txtRemetente.getText());
        remetente.setNome("Remetente");
        e.setDestinatario(destinatario);
        e.setRemetente(remetente);
        
        e.setTitulo("Teste SMTP | Climar Neto - E-mail Teste!");
        e.setMensagem("Se recebeu este e-mail, as configurações são válidas!");
        
        UtilitarioEmail ue = new UtilitarioEmail();
        try {
            ue.enviaEmailHtml(e, s);
            txtLog.setText("Enviado e-mail teste para o Destinatário, verifique a caixa de entrada!");
        } catch (EmailException | MalformedURLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            txtLog.setText("Erro: " + ex.getMessage() +  "\nCausa: " + ex.getCause().toString());
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonTestarActionPerformed

    private void chtlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chtlsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chtlsActionPerformed

    private void chstarttlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chstarttlsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chstarttlsActionPerformed

    private void chsslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chsslActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chsslActionPerformed

    private void chstarttlsrqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chstarttlsrqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chstarttlsrqActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chssl;
    private javax.swing.JCheckBox chstarttls;
    private javax.swing.JCheckBox chstarttlsrq;
    private javax.swing.JCheckBox chtls;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonTestar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDestinatario;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JTextField txtRemetente;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtServidor;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
public void limpatela() {
        //limpando os campos
        txtDestinatario.setText(null);
        txtPorta.setText(null);
        txtSenha.setText(null);
        txtServidor.setText(null);
    }

}
