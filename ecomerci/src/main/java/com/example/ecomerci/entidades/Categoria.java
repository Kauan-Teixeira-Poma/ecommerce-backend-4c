package com.example.ecomerci.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Data
@Getter
@NoArgsConstructor
@Setter

public class Categoria {
    
        private Short id;
        private String nome;
        private String descricao;


}
