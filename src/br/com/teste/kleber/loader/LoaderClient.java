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
		System.out.println("Conv�nio Paciente: " + exame.getPaciente().getConvenio());
		System.out.println("Id M�dico: " + exame.getMedico().getId());
		System.out.println("Nome M�dico: " + exame.getMedico().getNome());
		System.out.println("Escpeciladade M�dico: " + exame.getMedico().getEspecialidade());
		System.out.println("CRM M�dico: " + exame.getMedico().getCrm());
		System.out.println("Resultado: " + exame.getResultado());
		System.out.println("Respons�vel: " + exame.getResponsavel());
	}

}
