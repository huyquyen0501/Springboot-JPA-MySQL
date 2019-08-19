package demoboot.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "helloworld")
public class HelloWorld implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "word")
	private String word;

	public int getId() {
		return id;
	}

	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HelloWorld(int id, String word) {
		super();
		this.id = id;
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

}
