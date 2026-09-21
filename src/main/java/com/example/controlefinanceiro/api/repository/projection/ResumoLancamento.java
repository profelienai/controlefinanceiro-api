package com.example.controlefinanceiro.api.repository.projection;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.example.controlefinanceiro.api.model.TipoLancamento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor 
@Setter @Getter 
public class ResumoLancamento {
    
	private Long codigo;
	private String descricao;
	private LocalDate dataVencimento;
	private LocalDate dataPagamento;
	private BigDecimal valor;
	private TipoLancamento tipo;
	private String categoria;
	private String pessoa;
	
}
