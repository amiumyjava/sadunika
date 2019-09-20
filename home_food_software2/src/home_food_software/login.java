
package home_food_software;
//import  some java libraries-FD--------------------------------------------------------------------------------------------------------------------------------------------------------
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

   
    public login() {
        initComponents();
       
    }

   
   // @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CheckBox = new javax.swing.JCheckBox();
        PasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HOME FOOD -login  page");

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(null);

        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 230, 60, 16);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(100, 190, 181, 22);

        login.setText("login");
        login.setBorder(new javax.swing.border.MatteBorder(null));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(250, 270, 220, 60);

        jLabel5.setText("Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 190, 38, 16);

        CheckBox.setText("show pass word.");
        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });
        jPanel1.add(CheckBox);
        CheckBox.setBounds(100, 260, 139, 25);

        PasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordField1);
        PasswordField1.setBounds(100, 230, 181, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_food_software/images/home_food_logo_mini.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 30, 250, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_food_software/images/myfood.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(1, -2, 540, 352);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//close methd for close loging window after get loging to selections-FD-------------------------------------------------------------------------------------------------------------------
    public  void close(){
WindowEvent windowClose= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
}
    
    
    
//loning button get data from fields and see them correct-FD-------------------------------------------------------------------------------------------------------------------------------    
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
String uname= name.getText();
String psw= PasswordField1.getText();
if(uname.equals("") && psw.equals(""))
{
    String[] args = null;
selection.selectionmain(args);
 close();
}
else
{JOptionPane.showMessageDialog(rootPane, "You enter incorrect username or password!  Try again."); 

}





        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed
// if check box select show the password and if not do'nt show it-FD--------------------------------------------------------------------------------------------------------------------------------
    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
 // TODO add your handling code here:
if (CheckBox.isSelected()){
    PasswordField1.setEchoChar((char)0);
    
}else{
PasswordField1.setEchoChar('*');
}

    }//GEN-LAST:event_CheckBoxActionPerformed

    private void PasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void loginmain(String args[]) {
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
          
            } 
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JPasswordField PasswordField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
