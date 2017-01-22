package com.ppro.model.validators;

import com.ppro.model.Destination;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
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
        if (((Destination) target).getAirportName().isEmpty()){
            errors.rejectValue("airportName","airportName","Název letiště je prázdný");
        }
        if (((Destination) target).getCity().isEmpty()){
            errors.rejectValue("city","city","Město je prázdné");
        }
        if (((Destination) target).getCountry().isEmpty()){
            errors.rejectValue("country","country","Stát je prázdný");
        }
        if (((Destination) target).getCountryCode().isEmpty()){
            errors.rejectValue("countryCode","countryCode","Zkratka státu je prázdná");
        }
    }


}
