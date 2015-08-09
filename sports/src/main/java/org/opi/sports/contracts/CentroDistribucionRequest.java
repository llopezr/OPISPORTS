package org.opi.sports.contracts;

public class CentroDistribucionRequest {
	
	private int idCentroDistribucion;
	private String nombre;
	private String telefono;
	private String correo;
	private String direccion;
	
	public int getIdCentroDistribucion() {
		return idCentroDistribucion;
	}
	public void setIdCentroDistribucion(int idCentroDistribucion) {
		this.idCentroDistribucion = idCentroDistribucion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
