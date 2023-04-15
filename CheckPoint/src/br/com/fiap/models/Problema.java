package br.com.fiap.models;

public class Problema {
	private String problem;
	private String how;
	private double hour;
	
	public Problema(String problem, String how, double hour) {
		this.problem = problem;
		this.how = how;
		this.hour = hour;
	}
	
	public String returnProb() {
		return "\n" + "Motivo da consulta " + problem + "\n" + "Como aconteceu " + how + "\n" + "Há " + hour + " horas";
	}
	
	
	

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getHow() {
		return how;
	}

	public void setHow(String how) {
		this.how = how;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}
	
	

}
