package com.crtv.creativetechnocollege;

import android.os.AsyncTask;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTask extends AsyncTask<Void, Void, Boolean> {

    private String mRecipientEmail;
    private String mSubject;
    private String mMessage;

    public SendMailTask(String recipientEmail, String subject, String message) {
        mRecipientEmail = recipientEmail;
        mSubject = subject;
        mMessage = message;
    }

    @Override
    protected Boolean doInBackground(Void... voids) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication("studentzonectc2023@gmail.com", "efkylrbtvexvgsqs");
            }
        });
        try {
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress("studentzonectc2023@gmail.com"));
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(mRecipientEmail));
            mimeMessage.setSubject(mSubject);
            mimeMessage.setText(mMessage);
            Transport.send(mimeMessage);
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
            return false;
        }
    }
}
