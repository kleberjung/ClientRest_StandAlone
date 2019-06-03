package br.com.teste.kleber.loader;

import br.com.teste.kleber.model.Exame;
import br.com.teste.kleber.wsclient.ExameClient;

public class LoaderClient {

	public static void main(String[] args) {
		Exame exame = new Exame();
		
		exame = new ExameClient().getExame();
		
		System.out.println("Id: " + exame.getId());
		System.out.println("Exame: " + exame.getExame());
		System.out.println("Id Paciente: " + exame.getPaciente().getId());
		System.out.println("Nome Paciente: " + exame.getPaciente().getNome());
		System.out.println("Convênio Paciente: " + exame.getPaciente().getConvenio());
		System.out.println("Id Médico: " + exame.getMedico().getId());
		System.out.println("Nome Médico: " + exame.getMedico().getNome());
		System.out.println("Escpeciladade Médico: " + exame.getMedico().getEspecialidade());
		System.out.println("CRM Médico: " + exame.getMedico().getCrm());
		System.out.println("Resultado: " + exame.getResultado());
		System.out.println("Responsável: " + exame.getResponsavel());
	}

}
