package itallodavid.github.citiesapi.dto;

import lombok.Getter;

import java.io.Serializable;

@Getter
public final class APIErrorResponseDTO implements Serializable {
    private final String message;

    public APIErrorResponseDTO(final String message){
        this.message = message;
    }
}
