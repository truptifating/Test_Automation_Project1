package sendingMail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) throws EmailException 
	{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("truptifating@gmail.com", "Mihurani17@"));
		email.setSSLOnConnect(true);
		email.setFrom("truptifating@gmail.com");
		email.setSubject("Automating the Test Mail by Trupti from Selenium Webdriver");
		email.setMsg("This is a test mail from Code written on Eclipse by Trupti... :-)");
		email.addTo("truptifating@gmail.com");
		email.send();
		System.out.println("Email Sent");

	}

}
