package itallodavid.github.citiesapi.dto;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class UniqueValueResponseDTO implements Serializable {
    private final Object value;

    public UniqueValueResponseDTO(final Object value){
        this.value = value;
    }
}
