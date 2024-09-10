package com.mdambro.validations.util;

import com.mdambro.validations.exception.BusinessRuleException;
import com.mdambro.validations.BusinessLogicValidation;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BusinessLogicValidationUtils {

    public static <T> void startValidations(List<BusinessLogicValidation<T>> validations,
                                            T toValidateObject) throws BusinessRuleException {

        validations.stream().sorted(
                Comparator.comparingInt(BusinessLogicValidation::getExecutionOrder)
        ).forEach(
                validation -> validation.validate(toValidateObject)
        );

    }

}
