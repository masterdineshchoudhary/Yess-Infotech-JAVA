package onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerToMany {
	@Id
	private int answerid;
	private String answers;
	
	@ManyToOne
	private QuestionOne question;

	public int getAnswerid() {
		return answerid;
	}

	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public QuestionOne getQuestion() {
		return question;
	}

	public void setQuestion(QuestionOne question) {
		this.question = question;
	}
	
	
	
}
