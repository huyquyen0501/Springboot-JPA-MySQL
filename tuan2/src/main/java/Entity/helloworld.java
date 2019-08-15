package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "helloworld")
public class helloworld {
	@Id
	int id;
	String word;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}
