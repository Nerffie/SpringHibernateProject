package com.projet.service;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.projet.entity.Utilisateur;

public class Mail {
	//private final String username="testsodibet@gmail.com";
	//private final String password="sodibettesting";
	private static final String PROPERTY_URL             = "url";
    //private static final String PROPERTY_DRIVER          = "driver";
    private static final String PROPERTY_NOM_UTILISATEUR = "nomutilisateur";
    private static final String PROPERTY_MOT_DE_PASSE    = "motdepasse";
    private static final String FICHIER_PROPERTIES       = "/com/projet/service/mail.properties";
	private Utilisateur utilisateur;
	
	public Mail(Utilisateur utilisateur) {
		this.utilisateur=utilisateur;
	}
	
	public void sendMail() {
		Properties properties = new Properties();
        String url;
        //String driver;
        
        String nomUtilisateur;
        String motDePasse;

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream fichierProperties = classLoader.getResourceAsStream( FICHIER_PROPERTIES );

        if ( fichierProperties == null ) {
            try {
				throw new Exception( "Le fichier properties " + FICHIER_PROPERTIES + " est introuvable." );
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        try {
            properties.load( fichierProperties );
            url = properties.getProperty( PROPERTY_URL );
            //driver = properties.getProperty( PROPERTY_DRIVER );
            nomUtilisateur = properties.getProperty( PROPERTY_NOM_UTILISATEUR );
            motDePasse = properties.getProperty( PROPERTY_MOT_DE_PASSE );
            
            
            Properties props = new Properties();
    		props.put("mail.smtp.auth", "true");
    		props.put("mail.smtp.starttls.enable", "true");
    		props.put("mail.smtp.host", "smtp.gmail.com");
    		props.put("mail.smtp.port", "465");
    		
    		Session session = Session.getInstance(props,
    				  new javax.mail.Authenticator() {
    					protected PasswordAuthentication getPasswordAuthentication() {
    						return new PasswordAuthentication(nomUtilisateur
    								, motDePasse);
    					}
    				  });
    		
    		
    		
    		Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(nomUtilisateur));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(utilisateur.getEmail()));
			message.setSubject("Validation du compte Sodibet");
			message.setText("Bonjour "+utilisateur.getNom()+" "+utilisateur.getPrenom()+"\n\n"+"Merci d'avoir créer un compte chez Sodibet,"
				+ "\n\n Pour valider votre inscription, veuillez cliquez sur le lien suivant!"
					+"\n\n"+url+"/Verify?key="+utilisateur.getValideHash());

			Transport.send(message);
        } catch ( IOException e ) {
        	e.printStackTrace();
        }
        catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	
	}
}
