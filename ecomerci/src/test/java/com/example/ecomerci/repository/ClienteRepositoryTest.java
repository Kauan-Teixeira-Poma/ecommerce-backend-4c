package com.example.ecomerci.repository;

import com.example.ecomerci.entidades.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class ClienteRepositoryTest {

    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void deveInserirCliente() {
        Cliente cliente = new Cliente(null, "João Silva", "joao@email.com", "11999998888");
        Cliente salvo = clienteRepository.save(cliente);
        assertThat(salvo.getId()).isNotNull();
    }
}