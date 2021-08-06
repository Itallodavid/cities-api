package itallodavid.github.citiesapi.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name = "estado")
@Getter @Setter
public class State {
    @Id
    private Long id;

    @Column(name = "nome", length = 60)
    private String name;

    @Column(length = 2)
    private String uf;

    private Integer ibge;

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;

    private String ddd;
}
