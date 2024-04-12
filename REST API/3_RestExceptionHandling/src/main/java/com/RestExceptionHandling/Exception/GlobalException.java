package com.RestExceptionHandling.Exception;

import com.RestExceptionHandling.Model.ErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ErrorInfo> handleErrorInfoResponseEntity(Exception exception){
        String msg = exception.getMessage();
        ErrorInfo errorInfo = new ErrorInfo();

        errorInfo.setCode("SBI012");
        errorInfo.setMsg(msg);
        errorInfo.setDate(LocalDate.now());

        return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = UserException.class)
    public ResponseEntity<ErrorInfo> errorInfoResponseEntity(Exception exception){
        String msg = exception.getMessage();
        ErrorInfo errorInfo = new ErrorInfo();

        errorInfo.setCode("SBI012");
        errorInfo.setMsg(msg);
        errorInfo.setDate(LocalDate.now());

        return new ResponseEntity<>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
