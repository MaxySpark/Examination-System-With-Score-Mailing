package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Mail {
    String from;
    String pass;
    String sub = "Exam Control : Result";
    String to,msg;
      
    public Mail(String to,String exam,float score) {
        this.to = to;
        this.msg = "You Have Got : "+score+"% in The Following Exam\n" + exam +"\n\nThank You- \n Exam Control";
        loadProfile();
    }
    
    public void init() {
        try {
            Properties p = new Properties();
            p.put("mail.smtp.host","smtp.gmail.com");
            p.put("mail.smtp.port","465");
            p.put("mail.smtp.auth","true");
            p.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
            p.put("mail.smtp.socketFactory.port","465");
            Session s=Session.getDefaultInstance(p,new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(from, pass);
            }} );
            s.setDebug(true);
            Message m=new MimeMessage(s);  
            m.setSentDate(new Date());
            m.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setSubject(sub);
            m.setText(msg);
            Transport.send(m);
            JOptionPane.showMessageDialog(null, "Mail SENT to "+to,"Info",JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
            
    }
    
    public void loadProfile() {
        Connection c = null;
        Statement s;
        try {
          Class.forName("com.mysql.jdbc.Driver");
          c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ExamManagement","root","");
          s=c.createStatement();

         ResultSet rs = s.executeQuery("SELECT * FROM EMAIL");
         if(rs.next()) {
              
              from = rs.getString("EMAIL");
              pass = rs.getString("PASSWORD");
              
         }

      } catch(Exception e) {
          JOptionPane.showMessageDialog(null, e.getMessage(),"Exception",JOptionPane.ERROR_MESSAGE);
      } finally {
          try{c.close();}catch(Exception e){}
            init();
      }  
    }
    
}
