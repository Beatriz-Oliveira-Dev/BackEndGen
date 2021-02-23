package com.farmaciadobem.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity @Table(name="tb_produto") public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long id_produto;
	
	@Size(min=3, max=45) @NotNull private String nome;
	
	@NotNull private double preco;
	
	@NotNull private boolean precisa_receita;
	
	@ManyToOne
	@JsonIgnore
	private Categoria categoria;
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public long getId_produto() {
		return id_produto;
	}

	public void setId_produto(long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isPrecisa_receita() {
		return precisa_receita;
	}

	public void setPrecisa_receita(boolean precisa_receita) {
		this.precisa_receita = precisa_receita;
	}		

	
}
