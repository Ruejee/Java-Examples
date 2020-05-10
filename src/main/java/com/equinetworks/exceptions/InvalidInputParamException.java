package com.equinetworks.exceptions;

/**
 * Only for testing and understand how work Exception
 * Bad practice to use in live work something like this ))
 */
public class InvalidInputParamException extends RuntimeException {

    public InvalidInputParamException() {
    }

    public InvalidInputParamException(String message) {
        super(message);
    }

    public InvalidInputParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidInputParamException(Throwable cause) {
        super(cause);
    }
}
