package exam;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Mail {
    String from,pass,to,sub,msg;
      
    public Mail(String from,String pass,String to,String sub, String msg) {
        this.from = from;
        this.pass = pass;
        this.to = to;
        this.sub = sub;
        this.msg = msg;
        init();
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
    
}
