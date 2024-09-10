package com.mdambro.validations.exception;

public class BusinessRuleException extends RuntimeException {

    public BusinessRuleException() {

        super();

    }

    public BusinessRuleException(String message) {

        super(message);

    }

    public BusinessRuleException(String message, Throwable cause) {

        super(message, cause);

    }

    public BusinessRuleException(Throwable cause) {

        super(cause);

    }

}
