package com.msolimano.InterCorp.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.msolimano.InterCorp.Entity.Cliente;


public interface ClienteDao extends CrudRepository<Cliente, Long> {

	@Query(value="select * from list_probable_muerte",nativeQuery=true)
	public List<Object> ProbableMuerte();
	
	
}
