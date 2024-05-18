package com.example.departament.entities;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id; // O banco de dados vai gerar este valor automaticamente pelo 
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
   
	private String name;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	public User() {
		
	}
	
	public User(Long Id, String name, String email) {
		this.Id = Id;
		this.name = name;
		this.email = email;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
