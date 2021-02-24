package com.minhaLojaDe.Games.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity @Table(name="tb_usuario") public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long id_usuario;
	@NotNull private String nomeUsuario;
	@NotNull private int idadeUsuario;	
	@NotNull private String cpfUsuario;
//Relacionamento
	@ManyToOne
	@JsonIgnore
	private Produto produto;

//Get and Set
	
	public long getId_usuario() {
		return id_usuario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getIdadeUsuario() {
		return idadeUsuario;
	}

	public void setIdadeUsuario(int idadeUsuario) {
		this.idadeUsuario = idadeUsuario;
	}

	public String getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

}
