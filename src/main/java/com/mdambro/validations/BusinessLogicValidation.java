package com.mdambro.validations;

import com.mdambro.validations.exception.BusinessRuleException;

public interface BusinessLogicValidation<T> {

    short getExecutionOrder();

    void validate(T toValidate) throws BusinessRuleException;

}
