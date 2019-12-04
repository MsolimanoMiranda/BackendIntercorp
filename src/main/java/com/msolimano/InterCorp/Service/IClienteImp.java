package com.msolimano.InterCorp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.msolimano.InterCorp.Dao.ClienteDao;
import com.msolimano.InterCorp.Entity.Cliente;
import com.msolimano.InterCorp.Entity.ProbableMuerte;

@Service
public class IClienteImp implements IClienteService {

	@Autowired
	private ClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
	
	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
	}
	

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Object> ProbableMuerte() {
		
		return (List<Object>) clienteDao.ProbableMuerte();
	}

}
