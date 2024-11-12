package com.example.api_delas.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "avaliacao")

public class AvaliacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idavaliacao;

    @OneToOne
    @JoinColumn(name = "contratacao_idcontratacao", nullable = false)
    private ContratacaoModel idcontratacao;

    @Column(name = "nota")
    private int nota;
}
