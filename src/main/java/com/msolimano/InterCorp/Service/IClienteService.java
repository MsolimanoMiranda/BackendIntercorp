package com.msolimano.InterCorp.Service;

import java.util.List;

import com.msolimano.InterCorp.Entity.Cliente;
import com.msolimano.InterCorp.Entity.ProbableMuerte;


public interface IClienteService {

	    public List<Cliente> findAll();
		
		public void save(Cliente cliente);
		
		public Cliente findById(Long id);
		
		public void delete(Cliente cliente);
		
		public List<Object> ProbableMuerte();
	
}
