package com.example.ecomerci.repository;

import com.example.ecomerci.entidades.Cliente;
import com.example.ecomerci.entidades.Pedido;
import com.example.ecomerci.repository.ClienteRepository;
import com.example.ecomerci.repository.PedidoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.Instant;

@DataJpaTest
class PedidoRepositoryTest {

    @Autowired
    private PedidoRepository pedidoRepository;
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void deveInserirPedido() {
        Cliente cliente = clienteRepository.save(new Cliente(null, "Maria", "maria@email.com", "11888887777"));
        Pedido pedido = new Pedido(null, Instant.now(), cliente);
        Pedido salvo = pedidoRepository.save(pedido);
        assertThat(salvo.getId()).isNotNull();
    }
}
