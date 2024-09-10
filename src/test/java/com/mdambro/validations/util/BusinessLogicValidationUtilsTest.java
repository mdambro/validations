package com.claro.amx.sp.contentofferservice.utils;

import com.mdambro.validations.exception.BusinessRuleException;
import com.mdambro.validations.mock.ValidationStringBlankMock;
import com.mdambro.validations.BusinessLogicValidation;
import com.mdambro.validations.util.BusinessLogicValidationUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusinessLogicValidationUtilsTest {

    @DisplayName("Start Validations Test.")
    @Test
    void startValidations() {

        String stringToValidateWrongParameter = "";
        String stringToValidateCorrectParameter = "OK";
        List<BusinessLogicValidation<String>> validationsList = new ArrayList<>();
        validationsList.add(
                ValidationStringBlankMock.builder()
                        .executionOrder((short) 1)
                        .build()
        );

        assertThrows(
                BusinessRuleException.class,
                () -> BusinessLogicValidationUtils.startValidations(validationsList, stringToValidateWrongParameter)
        );

        assertDoesNotThrow(
                () -> BusinessLogicValidationUtils.startValidations(validationsList, stringToValidateCorrectParameter)
        );

    }

}