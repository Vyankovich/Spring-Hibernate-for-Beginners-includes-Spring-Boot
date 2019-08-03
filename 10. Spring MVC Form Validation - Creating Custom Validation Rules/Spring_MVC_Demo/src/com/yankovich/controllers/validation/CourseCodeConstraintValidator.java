package com.yankovich.controllers.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefixes;

    @Override
    public void initialize(CourseCode constraint) {
        coursePrefixes = constraint.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

        boolean result = false;
        if (theCode != null) {
            // loop thru course prefixes
            // check to see if code matches any of the course prefixes
            for (String temp : coursePrefixes) {
                result = theCode.startsWith(temp);
                // if we found a match then break out of the loop
                if (result) {
                    break;
                }
            }
        } else {
            result = true;
        }

        return result;
    }

}
