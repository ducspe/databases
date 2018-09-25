package bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EstateAgent{
	@Id
	private String username;
	private String name;
	private String address;
	private String password;
	
	/*
	@OneToMany(mappedBy="manager")
	private Collection <Estate> estates = new ArrayList<Estate>();

	public Collection<Estate> getEstates() {
		return estates;
	}



	public void setEstates(Collection<Estate> estates) {
		this.estates = estates;
	}
	*/


	public EstateAgent(){}



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



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
