package com.wjsrz.doctorApp.config;

import com.wjsrz.doctorApp.utils.Result;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class RequestParamValidateHandler {

    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public Result handleBindException(BindException ex){
        List<String> defaultMsg = ex.getBindingResult().getAllErrors()
                .stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.toList());
        String errMsg = defaultMsg.get(0);
        Result result = new Result();
        result.setMessage(errMsg);
        result.setCode(1001);
        result.setData("请求参数异常");
        return result;
    }
}
