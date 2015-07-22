/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import entity.FirstTime;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Xcelsia
 */
@Component
public class FirstTimeValidator implements Validator {
    @Override
    public boolean supports(Class clazz) {
      return FirstTime.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //FirstTime f  = (FirstTime)target;
        ValidationUtils.rejectIfEmpty(errors, "password",
            "required", new Object[] {"Password"},"Password field is empty");
        ValidationUtils.rejectIfEmpty(errors, "confirmPassword",
            "required", new Object[] {"Confirm Password"});
        
        if (!errors.hasFieldErrors("password")&&!errors.hasFieldErrors("confirmPassword")) {
            FirstTime firstTime = (FirstTime) target;
            if (!firstTime.getPassword().matches(firstTime.getConfirmPassword())) {
                errors.rejectValue("confirmPassword","notmatching", "Passwords not matching");
            }          
        }

    }
}
