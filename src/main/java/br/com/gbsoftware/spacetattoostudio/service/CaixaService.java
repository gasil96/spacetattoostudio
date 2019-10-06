package br.com.gbsoftware.spacetattoostudio.service;
import java.math.BigDecimal;
/**
 * <b>Gabriel S. Sofware</b>
 * 
 * @author Gabriel Silva - gasil96@gmail.com
 * @version 2019 - Criação
 */
import java.util.List;
import java.util.Optional;

import br.com.gbsoftware.spacetattoostudio.domain.model.Caixa;
import br.com.gbsoftware.spacetattoostudio.domain.model.EntradaSaida;

public interface CaixaService {

	void salvar(Caixa caixa);

	void editar(Caixa caixa);

	void detelar(Long id);
	
	Optional<Caixa> buscarPorId(Long id);

	List<Caixa> buscarTodos();
	
	Caixa getDiaAtual();

	List<EntradaSaida> getLancamentos();

	Optional<BigDecimal> sumValorEntradaDia();

	Optional<BigDecimal> sumValorSaidaDia();

	BigDecimal calculoValorTotalDia();

	BigDecimal calculoTotalDebito();

	BigDecimal calculoTotalCredito();

	BigDecimal calculoTotalAVista();
	
}
