package br.com.senaibrasilia.projetofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nome;	
	
	
	public Categoria() {
	
	}

	public Categoria(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Categoria(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
}
