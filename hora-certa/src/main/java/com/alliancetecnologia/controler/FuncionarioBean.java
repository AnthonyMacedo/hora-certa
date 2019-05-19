package com.alliancetecnologia.controler;


import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import com.alliancetecnologia.annotations.TransactionJpa;
import com.alliancetecnologia.model.FuncionarioModel;

@Named
@ViewScoped
public class FuncionarioBean {
	
	@Inject
	private EntityManager manager;
	private FuncionarioModel funcionario;
	
	public FuncionarioBean() {
		novo();
	}
	
	public void novo() {
		funcionario = new FuncionarioModel();
		
	}
	
	
	@TransactionJpa
	public void salvar() {
		manager.merge(funcionario);
	}

	public FuncionarioModel getFuncionario() {
		return funcionario;
	}

	
}
