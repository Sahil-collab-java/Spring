package com.RestExceptionHandling.Model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ErrorInfo {
    private String code;
    private String msg;
    private LocalDate date;
}
