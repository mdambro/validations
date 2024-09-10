package com.mdambro.validations.mock;

import com.mdambro.validations.exception.BusinessRuleException;
import com.mdambro.validations.BusinessLogicValidation;
import org.junit.platform.commons.util.StringUtils;
import lombok.*;

@Builder
@AllArgsConstructor
@Setter
public class ValidationStringBlankMock implements BusinessLogicValidation<String> {

    private short executionOrder;

    @Override
    public short getExecutionOrder() {

        return executionOrder;

    }

    @Override
    public void validate(String toValidate) throws BusinessRuleException {

        if(StringUtils.isBlank(toValidate))
            throw new BusinessRuleException("String blank");

    }

}
