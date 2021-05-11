package kodlamaio.HRMS.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
@Data

public class Users {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	public Users() {}

	public Users(int id) {
		super();
		this.id = id;
	}

}
