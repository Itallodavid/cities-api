package itallodavid.github.citiesapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "pais")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
public class Country {
    @Id
    private Long id;

    @Column(name = "nome", length = 60)
    private String name;

    @Column(name = "nome_pt", length = 60)
    private String portugueseName;

    @Column(name = "sigla", length = 2)
    private String abbreviation;

    private Integer bacen;
}
