package com.example.ecomerci.repository;

import com.example.ecomerci.entidades.Categoria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CategoriaRepositoryTest {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Test
    void deveInserirCategoria() {
        Categoria categoria = new Categoria(null, "Eletrônicos");
        Categoria salva = categoriaRepository.save(categoria);
        assertThat(salva.getId()).isNotNull();
    }
}