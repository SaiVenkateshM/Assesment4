package model;
import java.io.Serializable;
public class Question implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private char answer;
	private char selectedAnswer;

	public Question() {
	}

	public Question(int id, String question, String optionA, String optionB, String optionC, String optionD,
			char asnwer) {
		this.id = id;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = asnwer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public char getAsnwer() {
		return answer;
	}

	public void setAsnwer(char asnwer) {
		this.answer = asnwer;
	}
	
	public char getSelectedAnswer() {
		return selectedAnswer;
	}
	
	public void setSelectedAnswer(char selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}

}

