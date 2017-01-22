package com.ppro.model.validators;

import com.ppro.model.Destination;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Roman on 22.1.2017.
 */
@Service
public class DestinationValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Destination.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Destination destination = (Destination) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "airportName", "Vyplň název letiště!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "Vyplň město!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "Vyplň stát!");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "countryCode", "Vyplň kód státu!");

    }
}
