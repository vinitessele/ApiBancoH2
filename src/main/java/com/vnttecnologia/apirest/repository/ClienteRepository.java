package com.vnttecnologia.apirest.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.vnttecnologia.apirest.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
		
}
