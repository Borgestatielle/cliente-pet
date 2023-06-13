package br.com.petz.clientepet.cliente.application.service;

import org.springframework.boot.autoconfigure.security.oauth2.server.servlet.OAuth2AuthorizationServerProperties.Client;
import org.springframework.stereotype.Service;

import br.com.petz.clientepet.cliente.application.api.ClienteRequest;
import br.com.petz.clientepet.cliente.application.api.ClienteResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Client(clienteRequest))
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return null;
	}
}