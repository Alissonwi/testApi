package br.com.projuris.repository;

import org.springframework.stereotype.Repository;

import br.com.projuris.entity.CustoCargoEntity;
import br.com.projuris.entity.CustoDepartamentoEntity;
import br.com.projuris.entity.FuncionarioEntity;

import java.util.List;

@Repository
public interface CalculoRepository {

	public List<CustoCargoEntity> custoPorCargo(List<FuncionarioEntity> funcionarios) throws Exception;
	public List<CustoDepartamentoEntity> custoPorDepartamento(List<FuncionarioEntity> funcionarios) throws Exception;
	
}
