package com.example.ecomerci.repository;

import com.example.ecomerci.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}