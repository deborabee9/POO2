package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
	private String cpf;
	private String nome;
	private List<Matricula> listaMatricula = new ArrayList<>();
	

	public Aluno(String cpf, String nome) {
		
		this.cpf = cpf;
		this.nome = nome;
	}
	public boolean adicionaDisciplina(Matricula matricula) {
		if (matricula != null && listaMatricula.contains(matricula)) {
			listaMatricula.add(matricula); return true;}
			{
				return false;
			}
		
	}

	public String getCpf() {
		return cpf;
	}


	public String getNome() {
		return nome;
	}

	



	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(nome, other.nome);
	}

	public String toString() {
		return "Aluno [cpf=" + cpf + ", nome=" + nome + "]";
	}


	
	
	
}
