package br.com.projuris.entity;

import java.math.BigDecimal;

public class CustoDepartamentoEntity {
	
	public CustoDepartamentoEntity(String departamento, BigDecimal custo) {
		this.departamento = departamento;
		this.custo = custo;
	}
	
	private String departamento;
	private BigDecimal custo;
	 
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public BigDecimal getCusto() {
		return custo;
	}
	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}
	public void soma(BigDecimal valor) {
		this.custo = custo.add(valor);
	}

}
