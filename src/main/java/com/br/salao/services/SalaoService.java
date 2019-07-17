package com.br.salao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.salao.models.SalaoModel;
import com.br.salao.repository.SalaoRepository;

@Service
public class SalaoService {

	@Autowired
	private SalaoRepository salaoRepository;

	public void salvarUsuario(SalaoModel user) {
		salaoRepository.save(user);
	}
	public Iterable<SalaoModel> pegarTodosUsuarios(){
		return salaoRepository.findAll();
	}

	public SalaoModel procurarPostagem(Integer id) {
		return salaoRepository.findById(id).get();

	}
}
