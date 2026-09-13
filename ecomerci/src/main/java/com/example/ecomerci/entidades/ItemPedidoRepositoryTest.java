package com.example.ecomerci.repository;

import com.example.ecomerci.entidades.Cliente;
import com.example.ecomerci.entidades.ItemPedido;
import com.example.ecomerci.entidades.Pedido;
import com.example.ecomerci.repository.ClienteRepository;
import com.example.ecomerci.repository.ItemPedidoRepository;
import com.example.ecomerci.repository.PedidoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.Instant;

@DataJpaTest
class ItemPedidoRepositoryTest {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;
    
    @Autowired
    private PedidoRepository pedidoRepository;
    
    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void deveInserirItemPedido() {
        Cliente cliente = clienteRepository.save(new Cliente(null, "Carlos", "carlos@email.com", "11777776666"));
        Pedido pedido = pedidoRepository.save(new Pedido(null, Instant.now(), cliente));
        
        ItemPedido item = new ItemPedido(null, pedido, null, 2, 150.0);
        ItemPedido salvo = itemPedidoRepository.save(item);
        assertThat(salvo).isNotNull();
    }
}