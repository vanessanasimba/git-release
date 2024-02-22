/**
 * 
 */
package com.vicaworks.git;

import java.util.Date;

/**
 * @author cristianvillarreal
 *
 */
public class Persona {
	
	private String nombre;
	private String identificacion;
	private Date fechaNacimiento;
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

}
