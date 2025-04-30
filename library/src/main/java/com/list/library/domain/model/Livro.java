package com.list.library.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_Livro")
public class Livro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private 

    private String autor;

}
