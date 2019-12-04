package com.msolimano.InterCorp.Entity;

import java.util.List;

//import com.fasterxml.jackson.annotation.JsonInclude;
//
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDataList {

	public int estado;
	public String mensaje;
	public List<Object> data;

	

	public ResponseDataList() {
		
	}
	public ResponseDataList(int estado, String mensaje, List<Object> data) {
		
		this.estado = estado;
		this.mensaje = mensaje;
		this.data = data;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public List<Object> getData() {
		return data;
	}
	public void setData(List<Object> data) {
		this.data = data;
	}

	
	
	
	
}
