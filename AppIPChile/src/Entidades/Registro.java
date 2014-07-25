package Entidades;

import java.sql.Date;

public class Registro {
	
	private int Id_Registro;
	private String Comentario;
	private Date Fecha;
	private String Email;
	
	
	public int getId_Registro() {
		return Id_Registro;
	}
	public void setId_Registro(int id_Registro) {
		Id_Registro = id_Registro;
	}
	public String getComentario() {
		return Comentario;
	}
	public void setComentario(String comentario) {
		Comentario = comentario;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	

}
