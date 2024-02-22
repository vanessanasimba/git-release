/**
 * 
 */
package com.vicaworks.git;

/**
 * @author cristianvillarreal
 *
 */
public class Departamento {

	private String nombre;
	private String identificador;
	private String sucursal;
	
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
}
