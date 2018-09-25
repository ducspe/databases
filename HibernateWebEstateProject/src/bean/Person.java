package bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int person_id;
	private String firstname;
	private String name;
	private String address;
	
	public Person(){}
	
	

	public Person(int person_id, String firstname, String name, String address) {
		super();
		this.person_id = person_id;
		this.firstname = firstname;
		this.name = name;
		this.address = address;
	}



	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", firstname=" + firstname
				+ ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
