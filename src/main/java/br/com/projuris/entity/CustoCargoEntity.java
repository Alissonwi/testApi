package br.com.projuris.entity;

import java.math.BigDecimal;

public class CustoCargoEntity {

	public CustoCargoEntity(String cargo, BigDecimal custo) {
		this.cargo = cargo;
		this.custo = custo;
	}
	
	private String cargo; 
	private BigDecimal custo;
	 
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
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
