package br.com.projuris.entity;

import java.math.BigDecimal;

public class FuncionarioEntity {
	
	private String cargo; 
	private String departamento;
	private BigDecimal salario;	
	
	
	public FuncionarioEntity(String cargo, String depargamento, BigDecimal salario)
	{ 	this.cargo = cargo; this.departamento = depargamento;
		this.salario = salario;
	} 

	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public BigDecimal getSalario() {
		return salario;
	}


	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}
