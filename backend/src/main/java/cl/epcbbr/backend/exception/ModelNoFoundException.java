package cl.epcbbr.backend.exception;

public class ModelNoFoundException extends RuntimeException{
    public ModelNoFoundException(String message) {
        super(message);
    }
}
