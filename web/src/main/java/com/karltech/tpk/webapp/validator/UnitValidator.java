package com.karltech.tpk.webapp.validator;

import com.karltech.tpk.core.dto.UnitBean;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UnitValidator extends ApplicationObjectSupport implements Validator {
	private transient final Log log = LogFactory.getLog(UnitValidator.class);

    public boolean supports(Class<?> aClass) {
        return UnitBean.class.isAssignableFrom(aClass);
    }
    /**
     * This method is called for validating Model Attribute
     */
    public void validate(Object o, Errors errors) {
        UnitBean cmd = (UnitBean)o;
        trimingField(cmd);
        validateRequiredValues(cmd, errors);
    }

    private void validateRequiredValues(UnitBean cmd, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pojo.name", "errors.required", new String[] {this.getMessageSourceAccessor().getMessage("support.unit.form.name")}, "non-empty value required.");
    }

    private void trimingField(UnitBean cmd) {
    	if(StringUtils.isNotEmpty(cmd.getPojo().getName())) {
    		cmd.getPojo().setName(cmd.getPojo().getName().trim());
    	}

    }




}
