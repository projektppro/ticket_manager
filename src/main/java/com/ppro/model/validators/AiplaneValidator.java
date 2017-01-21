package com.ppro.model.validators;

import com.ppro.model.Airplane;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Arci on 25.11.2016.
 */
@Service
public class AiplaneValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Airplane.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (((Airplane) target).getName().isEmpty()){
            errors.rejectValue("name","name","Jméno letadla je prázdné");
        }
    }
}
