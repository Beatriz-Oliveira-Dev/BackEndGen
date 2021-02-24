package com.minhaLojaDe.Games.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity @Table(name="tb_produto") public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long id_produto;
	@NotNull @Size(min=5,max=50) private String nomeJogo;	
	@NotNull private float preco;	
	@NotNull @Size(min=5,max=5000) private String descricaoJogo;
//Relacionamento	
	@ManyToOne
	@JsonIgnore
	private Categoria categoria;
	@OneToMany(mappedBy = "produto")
	private List<Usuario> usuario;
	
//Get and set
	
	public long getId_produto() {
		return id_produto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}

	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDescricaoJogo() {
		return descricaoJogo;
	}

	public void setDescricaoJogo(String descricaoJogo) {
		this.descricaoJogo = descricaoJogo;
	}

	
	
	
}
