package edu.upc.practica01.beans;

public class UsuarioBean {
	
	int codigoUsuario;
	String usuario = "";
	String clave = "";
	//Sin iniciar:0 Iniciado:1
	boolean estadoDia; 
	
	public boolean isEstadoDia() {
		return estadoDia;
	}
	public void setEstadoDia(boolean estadoDia) {
		this.estadoDia = estadoDia;
	}
	public int getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	

}
