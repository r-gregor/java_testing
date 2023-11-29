// Q: How can I send an email by Java application using GMail, Yahoo, or Hotmail?
// A: Something like this (sounds like you just need to change your SMTP server):


// imports:
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;


public class SendMyMail
{

    public static void main(String[] args)
    {
        String host = "smtp.gmail.com";                 // CHANGE
        String from = "user name";                      // CHANGE
        Properties props = System.getProperties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", "asdfgh");      // CHANGE
        props.put("mail.smtp.port", "587");             // 587 is the port number of yahoo mail
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props, null);
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));

        InternetAddress[] to_address = new InternetAddress[to.length];
        int i = 0;
        // To get the array of addresses
        while (to[i] != null)
        {
            to_address[i] = new InternetAddress(to[i]);
            i++;
        }

        System.out.println(Message.RecipientType.TO);
        i = 0;
        while (to_address[i] != null)
        {
            message.addRecipient(Message.RecipientType.TO, to_address[i]);
            i++;
        }

        message.setSubject("sending in a group");
        message.setText("Welcome to JavaMail");
        // alternately, to send HTML mail:
        // message.setContent("<p>Welcome to JavaMail</p>", "text/html");
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.mail.yahoo.co.in", "user name", "asdfgh");
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }

}


// ############# ANOTHER EXAMPLE ############################################################################

//set CLASSPATH=%CLASSPATH%;activation.jar;mail.jar
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class Mail
{
    String  d_email = "iamdvr@gmail.com",
            d_password = "****",
            d_host = "smtp.gmail.com",
            d_port  = "465",
            m_to = "iamdvr@yahoo.com",
            m_subject = "Testing",
            m_text = "Hey, this is the testing email using smtp.gmail.com.";
    public static void main(String[] args)
    {
        String[] to={"XXX@yahoo.com"};
        String[] cc={"XXX@yahoo.com"};
        String[] bcc={"XXX@yahoo.com"};
        //This is for google
        Mail.sendMail("venkatesh@dfdf.com", "password", "smtp.gmail.com", 
                      "465", "true", "true", 
                      true, "javax.net.ssl.SSLSocketFactory", "false", 
                      to, cc, bcc, 
                      "hi baba don't send virus mails..", 
                      "This is my style...of reply..If u send virus mails..");
    }

    public synchronized static boolean sendMail(
        String userName, String passWord, String host, 
        String port, String starttls, String auth, 
        boolean debug, String socketFactoryClass, String fallback, 
        String[] to, String[] cc, String[] bcc, 
        String subject, String text) 
    {
        Properties props = new Properties();
        //Properties props=System.getProperties();
        props.put("mail.smtp.user", userName);
        props.put("mail.smtp.host", host);
        if(!"".equals(port))
            props.put("mail.smtp.port", port);
        if(!"".equals(starttls))
            props.put("mail.smtp.starttls.enable",starttls);
        props.put("mail.smtp.auth", auth);
        if(debug) {
            props.put("mail.smtp.debug", "true");
        } else {
            props.put("mail.smtp.debug", "false");         
        }
        if(!"".equals(port))
            props.put("mail.smtp.socketFactory.port", port);
        if(!"".equals(socketFactoryClass))
            props.put("mail.smtp.socketFactory.class",socketFactoryClass);
        if(!"".equals(fallback))
            props.put("mail.smtp.socketFactory.fallback", fallback);

        try
        {
            Session session = Session.getDefaultInstance(props, null);
            session.setDebug(debug);
            MimeMessage msg = new MimeMessage(session);
            msg.setText(text);
            msg.setSubject(subject);
            msg.setFrom(new InternetAddress("p_sambasivarao@sutyam.com"));
            for(int i=0;i<to.length;i++) {
                msg.addRecipient(Message.RecipientType.TO, 
                                 new InternetAddress(to[i]));
            }
            for(int i=0;i<cc.length;i++) {
                msg.addRecipient(Message.RecipientType.CC, 
                                 new InternetAddress(cc[i]));
            }
            for(int i=0;i<bcc.length;i++) {
                msg.addRecipient(Message.RecipientType.BCC, 
                                 new InternetAddress(bcc[i]));
            }
            msg.saveChanges();
            Transport transport = session.getTransport("smtp");
            transport.connect(host, userName, passWord);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            return true;
        }
        catch (Exception mex)
        {
            mex.printStackTrace();
            return false;
        }
    }

}