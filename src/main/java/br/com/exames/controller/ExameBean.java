package br.com.exames.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.exames.model.Exame;

@Named
@SessionScoped
public class ExameBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private Exame exame;

	private List<Exame> exames = new ArrayList<Exame>();

	public String adicionarExame() {
		exames.add(exame);
		System.out.println("Exame " + exame.getNomeExame() + " cadastrado com sucesso!");

		limpar();
		
		return "";
	}
	
	public void limpar() {
		this.exame = new Exame();
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}

}
