package br.com.fiap.games.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_games")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Game {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_GAMES"
    )
    @SequenceGenerator(
            name = "SEQ_GAMES",
            sequenceName = "SEQ_GAMES",
            allocationSize = 1
    )
    private Long id; // long Long=wrapper
    private String titulo;

    @Column(name = "data_lancamento")
    private LocalDate dataLancamento;

}
