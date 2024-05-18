package com.example.departament.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_department") //em uma entidade do Spring Data JPA é usada para especificar o nome da tabela no banco de dados
    public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;  // O banco de dados vai gerar este valor automaticamente pelo @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private String name;
	
	
	
	public Department (){
		
	}

	public Department(String name, Long id) {
		super();
		this.name = name;
		this.id = id;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	
	
	

	
}
