package com.msolimano.InterCorp.Entity;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class ProbableMuerte {

	
	private int id;
	private String nombres;
	private int edad;
	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento;
	@Temporal(TemporalType.DATE)
	private Date probable_muerte;
	
	
	
	public ProbableMuerte() {
		
	}
	
	
	
	
	public ProbableMuerte(int id, String nombres, int edad, Date fecha_nacimiento, Date probable_muerte) {
		
		this.id = id;
		this.nombres = nombres;
		this.edad = edad;
		this.fecha_nacimiento = fecha_nacimiento;
		this.probable_muerte = probable_muerte;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Date getProbable_muerte() {
		return probable_muerte;
	}
	public void setProbable_muerte(Date probable_muerte) {
		this.probable_muerte = probable_muerte;
	}
	
	
	
}
