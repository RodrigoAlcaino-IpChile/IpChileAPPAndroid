package Entidades;

public class Evaluacion {
	
	private int id_evaluacion;
	private String tipo_evaluacion;
	private int porcentaje;
	private double nota;
	private int id_asignatura;
	
	
	
	
	public int getId_asignatura() {
		return id_asignatura;
	}
	public void setId_asignatura(int id_asignatura) {
		this.id_asignatura = id_asignatura;
	}
	public int getId_evaluacion() {
		return id_evaluacion;
	}
	public void setId_evaluacion(int id_evaluacion) {
		this.id_evaluacion = id_evaluacion;
	}
	public String getTipo_evaluacion() {
		return tipo_evaluacion;
	}
	public void setTipo_evaluacion(String tipo_evaluacion) {
		this.tipo_evaluacion = tipo_evaluacion;
	}
	public int getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
