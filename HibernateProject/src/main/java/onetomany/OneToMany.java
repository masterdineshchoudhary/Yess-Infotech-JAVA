package onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
		SessionFactory f= new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();
		Transaction t = session.beginTransaction();
		
		QuestionOne question = new QuestionOne();
		question.setQuestionid(1);
		question.setQuestion("What is a programming lanaguage");
		
		AnswerToMany a1 = new AnswerToMany();
		a1.setAnswerid(1);
		a1.setAnswers("mast");
		a1.setQuestion(question);
		
		AnswerToMany a2 = new AnswerToMany();
		a2.setAnswerid(2);
		a2.setAnswers("ahe");
		a2.setQuestion(question);
		
		AnswerToMany a3 = new AnswerToMany();
		a3.setAnswerid(3);
		a3.setAnswers("java");
		a3.setQuestion(question);
		
		List<AnswerToMany> list = new ArrayList<AnswerToMany>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		question.setAnswers(list);
		
		session.save(question);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		t.commit();
		session.close();
		f.close();
	}
}
