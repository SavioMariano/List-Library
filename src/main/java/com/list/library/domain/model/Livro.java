package com.list.library.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_Livro")
public class Livro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String genero;

    @Column
    private String autor;

    // scale é a quantidade de numeros pós virgula e precision 13 o total de numeros
    // Ex: 99.999.999.999,99
    @Column(precision = 13, scale = 2)
    private BigDecimal preco;

}
