package com.msolimano.InterCorp.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.msolimano.InterCorp.Entity.Cliente;
import com.msolimano.InterCorp.Entity.Kpi;
import com.msolimano.InterCorp.Entity.ResponseDataList;
import com.msolimano.InterCorp.Entity.ResponseDataObject;
import com.msolimano.InterCorp.Entity.ProbableMuerte;
import com.msolimano.InterCorp.Service.IClienteService;





@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ClienteController {
	
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping(path="/clientes", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Cliente> index() {
		return clienteService.findAll();
	}
	
	@GetMapping(path="/listclientes", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseDataList ProbabledeMuerte() {
		
		
		
		
		List<ProbableMuerte> datos= new ArrayList<ProbableMuerte>();
		Iterator<?> iterador  = clienteService.ProbableMuerte().iterator();
		while(iterador.hasNext()) {
			ProbableMuerte m= new ProbableMuerte();
	        Object obj[] = (Object[]) iterador.next();
	        m.setId((int) obj[0]);
	        m.setNombres((String) obj[1]);
	        m.setEdad((int) obj[2]);
	        m.setFecha_nacimiento((Date) obj[3]);
	        m.setProbable_muerte((Date) obj[4]);
	        datos.add(m);
	        
	    }
		

		return rsList(datos);
	}
	
	@GetMapping("/clientes/{id}")
	public Cliente show(@PathVariable Long id) {
		return this.clienteService.findById(id);
		
	}
	
	
	@GetMapping("/kpiclientes")
	public ResponseDataObject Test() {
		
		int sumatoria = 0;
		int cont=0;
		float media = 0;
		float desviacion= 0;
		
		List<Cliente> ls= clienteService.findAll();
		Kpi res= new Kpi();
		for (Cliente i: ls) {
			
			sumatoria=(sumatoria+i.getEdad());
			cont++;
	   }
		
	    media=sumatoria/cont;
	    desviacion = (float) Math.sqrt(media);
	    res.setPromedio(media);
	    res.setDesviacion_estandar(desviacion);
		
		return rsObject(res);
		
	}
	
	

	@PostMapping("/crearcliente")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseDataObject create(@RequestBody Cliente cliente) {
		this.clienteService.save(cliente);
		return rsObject(cliente);
	}
	
	
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Cliente currentCliente = this.clienteService.findById(id);
		this.clienteService.delete(currentCliente);
	}
	
	
	
	
	
	
	ResponseDataList rsList(Object x) {
		
	
//		if((x instanceof Kpi)||(x instanceof Cliente) ){
		ResponseDataList res=new ResponseDataList();	
		res.setData((List<Object>) x);
		res.setMensaje("OK");
		res.setEstado(200);
		
		return res;
	}
	
	ResponseDataObject rsObject(Object x) {
		
		
		ResponseDataObject res=new ResponseDataObject();	
		res.setData(x);
		res.setMensaje("OK");
		res.setEstado(200);
		return res;
	}
	
	
	

}
