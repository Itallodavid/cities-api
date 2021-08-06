package itallodavid.github.citiesapi.models;

import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Entity @Table(name = "estado")
@Getter @Setter
@TypeDef(name = "json", typeClass = JsonType.class)
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

    @Type(type = "json")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "json")
    private List<Integer> ddd;
}
