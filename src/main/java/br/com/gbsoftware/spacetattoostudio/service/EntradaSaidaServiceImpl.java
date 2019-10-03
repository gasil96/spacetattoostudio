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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import br.com.gbsoftware.spacetattoostudio.domain.model.EntradaSaida;
import br.com.gbsoftware.spacetattoostudio.repository.EntradaSaidaRepository;

@Service
public class EntradaSaidaServiceImpl implements EntradaSaidaService {

	@Autowired
	private EntradaSaidaRepository entradaSaidaRepository;

	@Override
	public void salvar(EntradaSaida entradaSaida) {

		if (entradaSaida.getDesconto() == null) {

			entradaSaidaRepository.save(entradaSaida);
		} else {
			BigDecimal resultadoValorComDesconto = (entradaSaida.getValor().multiply(entradaSaida.getDesconto()).divide(new BigDecimal(100)));
			
			System.err.println("---------------------> " + resultadoValorComDesconto);
//			entradaSaidaRepository.save(entradaSaida);
		}

	}

	@Override
	public void editar(EntradaSaida entradaSaida) {

		entradaSaidaRepository.saveAndFlush(entradaSaida);
	}

	@Override
	public void deletar(Long id) {
		entradaSaidaRepository.deleteById(id);
	}

	@Override
	public Optional<EntradaSaida> buscarPorId(Long id) {
		return entradaSaidaRepository.findById(id);
	}

	@Override
	public List<EntradaSaida> buscarTodos() {
		return entradaSaidaRepository.findAll();
	}

	@Override
	public List<EntradaSaida> busarTodosDoDia(Long iDCaixaFK) {
		return entradaSaidaRepository.findByEntradaSaida(iDCaixaFK);
	}

}
