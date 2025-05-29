package Entidades;

import java.util.Date;

import TEnum.Status;

public class Matricula {

	private Date dataMatricula;
	private Aluno aluno;
	private Disciplina disciplina;
	private Turma turma;
	private Status status;
	
	public Matricula( Aluno aluno, Disciplina disciplina, Turma turma) {
		super();
		this.dataMatricula = new Date();
		this.aluno.adicionaDisciplina(null);
		this.disciplina = disciplina;
		this.turma = turma;
		this.status = Status.MATRICULADO;
	}

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public Turma getTurma() {
		return turma;
	}

	public Status getStatus() {
		return status;
	}
	
	public void confirmar() {
		if (status == Status.MATRICULADO || status == Status.TRANCADO) 
		{status = Status.CURSANDO;}
	}
	public void trancar(){
		if(status == Status.CURSANDO) {
			status = Status.TRANCADO;	}
	}
	public void aprovar() {
		if(status == Status.CURSANDO) {
			status = Status.CONCLUIDO;}
	}
	public void reprovado() {
		if(status == Status.CURSANDO) {
			status = Status.REPROVADO;}
	}

	@Override
	public String toString() {
		return "Matricula [dataMatricula=" + dataMatricula + ", aluno=" + aluno + ", disciplina=" + disciplina
				+ ", turma=" + turma + ", status=" + status + "]";
	}
	
}
