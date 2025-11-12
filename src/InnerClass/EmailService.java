package InnerClass;

interface EmailService {
public void sendmail(EmailDetails e);
class EmailDetails{
	String to_list;
	String cc_list;
	String subject;
	String body;
}
}