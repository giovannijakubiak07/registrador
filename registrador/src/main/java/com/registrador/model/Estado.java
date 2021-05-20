package com.registrador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
public class Estado {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    @Column
    private String nome;

    @Column
    private String sigla;

}
