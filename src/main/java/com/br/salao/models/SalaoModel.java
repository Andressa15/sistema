package com.br.salao.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class SalaoModel  implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	private String nome;
	
	@NotNull
	private String email;
	
	
	@NotNull
	
	private String tipoDeServico;
	
	@NotNull
	private String detalhes;
	
	@NotNull
	private String diaDaSemana;
	
	@NotNull
	private String mes;
	
	@NotNull
	private double horas;
	
	@NotNull
	private double valor;

	
	
	public SalaoModel() {
	
	}
	
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTipoDeServico() {
		return tipoDeServico;
	}


	public void setTipoDeServico(String tipoDeServico) {
		this.tipoDeServico = tipoDeServico;
	}


	public String getDetalhes() {
		return detalhes;
	}


	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}


	public String getDiaDaSemana() {
		return diaDaSemana;
	}


	public void setDiaDaSemana(String diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}


	public double getHoras() {
		return horas;
	}


	public void setHoras(double horas) {
		this.horas = horas;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
}