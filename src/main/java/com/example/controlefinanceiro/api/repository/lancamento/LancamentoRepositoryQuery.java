package com.example.controlefinanceiro.api.repository.lancamento;

import java.util.List;

import com.example.controlefinanceiro.api.model.Lancamento;
import com.example.controlefinanceiro.api.repository.filter.LancamentoFilter;


public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
	
}
