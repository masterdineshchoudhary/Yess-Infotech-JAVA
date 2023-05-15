package onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuestionOne {
	@Id
	private int questionid;
	private String question;
	
	@OneToMany
	private List<AnswerToMany> answers;

	public int getQuestionid() {
		return questionid;
	}

	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<AnswerToMany> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerToMany> answers) {
		this.answers = answers;
	}
	
	
}
