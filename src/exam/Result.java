/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author maxyspark
 */
public class Result {
    public Result(ArrayList<String> ans,int examId,String email,int totalQuestion) {
        this.ans = ans;
        this.examId = examId;
        this.email = email;
        this.totalQuestion = totalQuestion;
    }
    
    public void getAns() {
        Connection c = null;
        Statement s;
        try {
          Class.forName("com.mysql.jdbc.Driver");
          c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ExamManagement","root","");
          s=c.createStatement();

         //Query
        
         ResultSet rs = s.executeQuery("SELECT * FROM EXAM_"+examId);
         while(rs.next()) {
            cAns.add(rs.getString("CA"));
         } 
      } catch(Exception e) {
          JOptionPane.showMessageDialog(null, e.getMessage(),"Exception",JOptionPane.ERROR_MESSAGE);
      } finally {
          try{c.close();}catch(Exception e){}
          
          checkAns();
      } 
    }
    public void checkAns() {
        for(int i=0;i<cAns.size();i++) {
            if(cAns.get(i).equals(ans.get(i))) {
                correctCount += 1;
            }
        }
        sendMail();
    }
    public void sendMail(){
        int p = (correctCount/totalQuestion)*100;
        Mail mail = new Mail(email, "Math", p);
    }
    ArrayList<String> ans;
    int examId;
    String email;
    int totalQuestion;
    int correctCount = 0;
    ArrayList<String> cAns = new ArrayList<>();
}
