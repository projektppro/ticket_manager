package com.ppro.model.validators;

import com.ppro.model.Objednavka;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Arci on 22.1.2017.
 */
@Service
public class ObjednavkaValidace implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Objednavka.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (((Objednavka) target).getJmeno().isEmpty()){
            errors.rejectValue("jmeno","jmeno","Jméno je prázdné");
        }
        if (((Objednavka) target).getPrijmeni().isEmpty()){
            errors.rejectValue("prijmeni","prijmeni","Příjmení je prázdné");
        }
        if (((Objednavka) target).getEmail().isEmpty()){
            errors.rejectValue("email","email","Email je prázdné");
        }
    }
}
