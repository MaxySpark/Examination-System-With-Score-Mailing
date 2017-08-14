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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author maxyspark
 */
public class ExamQuesionAddFrame extends javax.swing.JFrame {

    /**
     * Creates new form ExamQuesionAdd
     */
    public ExamQuesionAddFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        customInit();
    }
    //custom
    public ExamQuesionAddFrame(int id) {
        this.selectedId = id;
        initComponents();
        this.setLocationRelativeTo(null);
        customInit();
        loadExam();
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
        heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        examTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        totalQuestion = new javax.swing.JSpinner();
        saveOnly = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        heading.setFont(new java.awt.Font("Courier 10 Pitch", 1, 36)); // NOI18N
        heading.setText("Edit Examination Details");
        heading.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jLabel1.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel1.setText("Exam Title");

        examTitle.setFont(new java.awt.Font("Courier 10 Pitch", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel2.setText("Total Questions");

        totalQuestion.setFont(new java.awt.Font("Courier 10 Pitch", 1, 18)); // NOI18N
        totalQuestion.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));

        saveOnly.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        saveOnly.setText("Save Only");
        saveOnly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOnlyActionPerformed(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton3.setText("Save and Edit Questions");

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton4.setText("Delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(examTitle))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(totalQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveOnly, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(examTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveOnly, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(closeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveOnlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOnlyActionPerformed
        String title = examTitle.getText();
        int total;
        try {
            totalQuestion.commitEdit();
        } catch ( java.text.ParseException e ) {  }
        total = (Integer) totalQuestion.getValue();
        Connection c = null;
        Statement s;
        try {
          Class.forName("com.mysql.jdbc.Driver");
          c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ExamManagement","root","");
          s=c.createStatement();

          s.executeUpdate("UPDATE EXAMS SET TITLE='"+title+"',TOTALQUESTION="+total+" WHERE ID="+selectedId);
          JOptionPane.showMessageDialog(this, "Exam Title and Total Question Updated","Update",JOptionPane.ERROR_MESSAGE);
         //Query
         ResultSet rs = s.executeQuery("SELECT * FROM EXAMS WHERE ID="+selectedId);
         if(rs.next()) {
             examTitle.setText(rs.getString("TITLE"));
             totalQuestion.setValue(rs.getInt("TOTALQUESTION"));
         }

      } catch(Exception e) {
          JOptionPane.showMessageDialog(this, e.getMessage(),"Exception",JOptionPane.INFORMATION_MESSAGE);
      } finally {
          try{c.close();}catch(Exception e){}
      } 
    }//GEN-LAST:event_saveOnlyActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
        ExamManagementFrame emf = new ExamManagementFrame();
        emf.setVisible(true);
    }//GEN-LAST:event_closeBtnActionPerformed

    // load exam list
    
    private void loadExam() {
        
        Connection c = null;
        Statement s;
                  try {
                    Class.forName("com.mysql.jdbc.Driver");
                    c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ExamManagement","root","");
                    s=c.createStatement();

                   //Query
                   ResultSet rs = s.executeQuery("SELECT * FROM EXAMS WHERE ID="+selectedId);
                   if(rs.next()) {
                       examTitle.setText(rs.getString("TITLE"));
                       totalQuestion.setValue(rs.getInt("TOTALQUESTION"));
                   }
                   
                } catch(Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage(),"Exception",JOptionPane.ERROR_MESSAGE);
                } finally {
                    try{c.close();}catch(Exception e){}
                }  
    }
    
    // custom init
    
    final public void customInit(){
        heading.setHorizontalAlignment(JLabel.CENTER);
    }
    
    int selectedId;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField examTitle;
    private javax.swing.JLabel heading;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveOnly;
    private javax.swing.JSpinner totalQuestion;
    // End of variables declaration//GEN-END:variables
}