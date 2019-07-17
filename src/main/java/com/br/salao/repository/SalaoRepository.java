package com.br.salao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.br.salao.models.SalaoModel;

@Repository
public interface SalaoRepository extends CrudRepository<SalaoModel, Integer>{

}
