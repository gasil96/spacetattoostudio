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

import br.com.gbsoftware.spacetattoostudio.domain.model.Cliente;

public interface ClienteService {

	void salvar(Cliente cliente);
	
	void updateCredito(BigDecimal valorCredito, Long idCliente);

	void updateStatus(String statusCliente, Long idCliente);

	void editar(Cliente cliente);
	
	Optional<Cliente> buscarPorId(Long id);

	List<Cliente> buscarPorNome(String nome);
	
	List<Cliente> buscarPorInstagram(String instagram);
	
	List<Cliente> buscarTodos();
	
	List<Cliente> getPorCadastroMes();

	List<Cliente> getPorCadastroMesAnterio();
	
	List<Cliente> getClienteIdInstaNome();

	BigDecimal calcularGastoTotalCliente(Cliente cliente);
}
