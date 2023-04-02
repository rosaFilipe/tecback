package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


@Entity
@Table(name="tb_classificacao_etaria")
//para colocar um nome na tabela
public class Classificacao_Etaria {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 100)
    private String descricao;


}
