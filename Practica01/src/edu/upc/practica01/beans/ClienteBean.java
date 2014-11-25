package edu.upc.practica01.beans;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class ClienteBean {
	
	int codigoCliente;
	String nombre = "";
	String apellido = "";
	String direccion = "";
	String telefono = "";
	String imagen = "";
	Bitmap imagenLoaded;
	public ImageView view;
	
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Bitmap getImagenLoaded() {
		return imagenLoaded;
	}
	public void setImagenLoaded(Bitmap imagenLoaded) {
		this.imagenLoaded = imagenLoaded;
	}
	public ImageView getView() {
		return view;
	}
	public void setView(ImageView view) {
		this.view = view;
	}


}
