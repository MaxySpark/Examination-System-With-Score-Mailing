/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author maxyspark
 */
public class AdminProfileFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminProfileFrame
     */
    public AdminProfileFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        customInit();
    }
    public AdminProfileFrame(String username,String password) {
        initComponents();
        this.username = username;
        this.password = password;
        this.setLocationRelativeTo(null);
        customInit();
        loadProfile();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailAdmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        cancelBtn = new javax.swing.JButton();
        ePass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel1.setText("Username");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        userName.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        userName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        userName.setMinimumSize(new java.awt.Dimension(28, 38));
        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel2.setText("Password");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        emailAdmin.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        emailAdmin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel3.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel3.setText("Email");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel4.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel4.setText("Password");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        updateBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        updateBtn.setText("Submit");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        cancelBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        ePass.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        ePass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(pass)
                            .addComponent(ePass))))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(311, 311, 311))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(emailAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(ePass, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 972, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed

    }//GEN-LAST:event_userNameActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String user,email,passU,passE;
        user = userName.getText();
        passU = pass.getText();
        email = emailAdmin.getText();
        passE = ePass.getText();
        Connection c = null;
        Statement s;
        if(email.matches(EMAIL_REGEX) && !user.trim().equals("") && !passU.trim().trim().equals("") && !passE.equals("")) {
            try {
                dispose();
                Class.forName("com.mysql.jdbc.Driver");
                c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ExamManagement","root","");
                s=c.createStatement();
                ResultSet rs = s.executeQuery("SELECT * FROM ADMIN WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"'");
//                ResultSet eu = s.executeQuery("SELECT * FROM EMAIL");
                if(rs.next()) {
                    s.executeUpdate("UPDATE ADMIN SET EMAIL='"+email+"',PASSWORD='"+passU+"',EPASSWORD='"+passE+"',USERNAME='"+user+"' WHERE USERNAME='"+username+"'");
                    s.executeUpdate("DELETE FROM EMAIL");
                    s.executeUpdate("INSERT INTO EMAIL VALUES('"+email+"','"+passE+"')");
                }
                JOptionPane.showMessageDialog(this, "Update Successful","Message",JOptionPane.INFORMATION_MESSAGE);

            } catch(Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(),"Exception",JOptionPane.ERROR_MESSAGE);
            } finally {
                try{c.close();}catch(Exception e){}
                AdminDashboardFrame ad = new AdminDashboardFrame(username,password);
                    ad.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Check The Entered Details Again","Registration Error",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    public void loadProfile() {
        Connection c = null;
        Statement s;
        try {
          Class.forName("com.mysql.jdbc.Driver");
          c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ExamManagement","root","");
          s=c.createStatement();

         //Query
//         ResultSet r = s.executeQuery("SELECT * FROM EXAMS WHERE ID="+selectedId);
//         r.next();
//         totalQuestion = r.getInt("TOTALQUESTION");

         ResultSet rs = s.executeQuery("SELECT * FROM ADMIN WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"'");
         if(rs.next()) {
              
              emailAdmin.setText(rs.getString("EMAIL"));
              ePass.setText(rs.getString("EPASSWORD"));
              userName.setText(rs.getString("USERNAME"));
              pass.setText(rs.getString("PASSWORD"));
              
         } else  {
                 
                emailAdmin.setText(rs.getString(""));
                ePass.setText(rs.getString(""));
                userName.setText(rs.getString(""));
                pass.setText(rs.getString(""));
                
         }

      } catch(Exception e) {
          JOptionPane.showMessageDialog(this, e.getMessage(),"Exception",JOptionPane.ERROR_MESSAGE);
      } finally {
          try{c.close();}catch(Exception e){}
      }  
    }
    
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        dispose();
        AdminDashboardFrame adf = new AdminDashboardFrame();
        adf.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    
    final public void customInit(){
        jLabel1.setHorizontalAlignment(JLabel.CENTER);
        ePass.setHorizontalAlignment(JLabel.CENTER);
        emailAdmin.setHorizontalAlignment(JLabel.CENTER);
        userName.setHorizontalAlignment(JLabel.CENTER);
        jLabel2.setHorizontalAlignment(JLabel.CENTER);
        jLabel3.setHorizontalAlignment(JLabel.CENTER);
        jLabel4.setHorizontalAlignment(JLabel.CENTER);
        pass.setHorizontalAlignment(JLabel.CENTER);
         
    }
    
    
    String username;
    String password;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPasswordField ePass;
    private javax.swing.JTextField emailAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
