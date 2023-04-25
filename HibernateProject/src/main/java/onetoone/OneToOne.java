package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {
	public static void main(String[] args) {
		SessionFactory f= new Configuration().configure().buildSessionFactory();
    	Session session = f.openSession();
    	Transaction t = session.beginTransaction();
    	
    	Question question1 = new Question();
    	question1.setQuestionId(1);
    	question1.setQuestion("What is Java ?");
    	
    	Answer answer1 = new Answer();
    	answer1.setAnswerId(1);
    	answer1.setAnswer("Java is a programming language");
    	answer1.setQuestion(question1);
    	
    	question1.setAnswer(answer1);
    	
    	Question question2 = new Question();
    	question2.setQuestionId(2);
    	question2.setQuestion("What is collection framework ?");
    	
    	Answer answer2 = new Answer();
    	answer2.setAnswerId(2);
    	answer2.setAnswer("Collection Framework");
    	answer2.setQuestion(question2);
    	
    	question2.setAnswer(answer2);
    	
    	session.save(question1);
    	session.save(answer1);
    	session.save(question2);
    	session.save(answer2);
    	
    	t.commit();
    	
    	Question data = (Question) session.get(Question.class, 1);
    	System.out.println(data.getQuestionId());
    	System.out.println(data.getQuestion());
    	System.out.println(data.getAnswer().getAnswerId());
    	System.out.println(data.getAnswer().getAnswer());
    	
    	f.close();
    	
    	
    	
	}
}
