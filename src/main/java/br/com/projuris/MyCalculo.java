package br.com.projuris;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.projuris.entity.CustoCargoEntity;
import br.com.projuris.entity.CustoDepartamentoEntity;
import br.com.projuris.entity.FuncionarioEntity;
import br.com.projuris.repository.CalculoRepository;

public class MyCalculo implements CalculoRepository {

	@Override
	public List<CustoCargoEntity> custoPorCargo(List<FuncionarioEntity> funcionarios) throws Exception {
		CustoCargoEntity custoCargoAssitente = new CustoCargoEntity("Assistente", new BigDecimal(0));
		CustoCargoEntity custoCargoDiretor = new CustoCargoEntity("Diretor", new BigDecimal(0));
		CustoCargoEntity custoCargoGerente = new CustoCargoEntity("Gerente", new BigDecimal(0));
		CustoCargoEntity custoCargoEstagiario = new CustoCargoEntity("Estagiario", new BigDecimal(0));
		
		for(FuncionarioEntity funcionario : funcionarios) {
			switch (funcionario.getCargo()) {
			case "Assistente":
				custoCargoAssitente.soma(funcionario.getSalario());
				break;
			case "Diretor":
				custoCargoDiretor.soma(funcionario.getSalario());
				break;
			case "Gerente":
				custoCargoGerente.soma(funcionario.getSalario());
				break;
			case "Estagiario":
				custoCargoEstagiario.soma(funcionario.getSalario());
				break;
			default:
				throw new Exception("Tipo de cargo não encontrado.");
			}
		}
		List<CustoCargoEntity> custoCargoList = new ArrayList<CustoCargoEntity>();
				
		custoCargoList.add(custoCargoAssitente);
		custoCargoList.add(custoCargoDiretor);
		custoCargoList.add(custoCargoGerente);
		custoCargoList.add(custoCargoEstagiario);
		
		return custoCargoList;
	}

	@Override
	public List<CustoDepartamentoEntity> custoPorDepartamento(List<FuncionarioEntity> funcionarios) throws Exception {
		CustoDepartamentoEntity custoDepartamentoAdministrativo = 
				new CustoDepartamentoEntity("Administrativo", new BigDecimal(0));
		CustoDepartamentoEntity custoDepartamentoFinanceiro = 
				new CustoDepartamentoEntity("Financeiro", new BigDecimal(0));
		CustoDepartamentoEntity custoDepartamentoJuridico = 
				new CustoDepartamentoEntity("Juridico", new BigDecimal(0));
		
		
		for(FuncionarioEntity funcionario : funcionarios) {
			switch (funcionario.getDepartamento()) {
			case "Administrativo":
				custoDepartamentoAdministrativo.soma(funcionario.getSalario());
				break;
			case "Financeiro":
				custoDepartamentoFinanceiro.soma(funcionario.getSalario());
				break;
			case "Juridico":
				custoDepartamentoJuridico.soma(funcionario.getSalario());
				break;
			default:
				throw new Exception("Tipo de departamento não encontrado.");
			}
		}
		List<CustoDepartamentoEntity> custoDepartamentoList = new ArrayList<CustoDepartamentoEntity>();
				
		custoDepartamentoList.add(custoDepartamentoAdministrativo);
		custoDepartamentoList.add(custoDepartamentoFinanceiro);
		custoDepartamentoList.add(custoDepartamentoJuridico);
		
		return custoDepartamentoList;
	}
}
