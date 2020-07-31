package br.com.projuris.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.projuris.MyCalculo;
import br.com.projuris.entity.CustoCargoEntity;
import br.com.projuris.entity.CustoDepartamentoEntity;
import br.com.projuris.entity.FuncionarioEntity;

@Controller
public class CalculoController {
	
	public CalculoController() {}
	
	List<FuncionarioEntity> funcionarios  = new ArrayList<FuncionarioEntity>();
	
	public CalculoController(List<FuncionarioEntity> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	private MyCalculo myCalculo = new MyCalculo();;
	
	@RequestMapping(value = "/CustoCargo", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)	
    public @ResponseBody List<CustoCargoEntity> PostCustoCargo(@RequestBody List<FuncionarioEntity> funcionarios) throws Exception {
        return myCalculo.custoPorCargo(funcionarios);
    }
	
	@RequestMapping(value = "/CustoDepartamento", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<CustoDepartamentoEntity> PostCustoDepartamento(@RequestBody List<FuncionarioEntity> funcionarios) throws Exception {
		return myCalculo.custoPorDepartamento(funcionarios);
    }
}
