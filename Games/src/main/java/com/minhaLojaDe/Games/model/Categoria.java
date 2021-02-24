package com.minhaLojaDe.Games.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity @Table(name="tb_categoria") public class Categoria {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long id_categoria;
	@Column(nullable = false, unique = true) @Size(min=2,max=20) private String tipo;
	@Column(nullable = false) private String descricao;
	@Column(nullable = false) @Size(min=5,max=50) private String localizacao;
//Relacionamento
	@OneToMany(mappedBy = "categoria")
	private List<Produto> produto;
	
//Get and Set

	public long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
}
