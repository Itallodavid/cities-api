package itallodavid.github.citiesapi.exceptions;

import static itallodavid.github.citiesapi.utils.ExceptionMessage.ENTITY_NOT_FOUND;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(){
        super(ENTITY_NOT_FOUND);
    }
}
