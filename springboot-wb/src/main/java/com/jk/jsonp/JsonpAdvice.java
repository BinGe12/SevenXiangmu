package com.jk.jsonp;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * Created by Administrator on 2017/11/14.
 */
@ControllerAdvice(basePackages = "com.jk.controller")
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {

    public JsonpAdvice() {
        super("callback","jsonp");
    }

}
