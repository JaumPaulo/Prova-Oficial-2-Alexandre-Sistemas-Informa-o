package com.joaopaulo.barDoZe.business.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "produto")
public class ProdutoBean {

	private String nome;
	private String categoria;
	private Float precoUnid;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Float getPrecoUnid() {
		return precoUnid;
	}

	public void setPrecoUnid(Float precoUnid) {
		this.precoUnid = precoUnid;
	}

}
