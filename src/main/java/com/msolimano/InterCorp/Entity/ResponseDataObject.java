package com.msolimano.InterCorp.Entity;



//import com.fasterxml.jackson.annotation.JsonInclude;
//
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDataObject {

	public int estado;
	public String mensaje;
	public Object data;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ResponseDataObject() {
		
	}
	public ResponseDataObject(int estado, String mensaje,Object data) {
		
		this.estado = estado;
		this.mensaje = mensaje;
		this.data=data;
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

	
	
	
}
