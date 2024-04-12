package com._Redis.Model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Country implements Serializable {

    private Integer srNo;
    private String name;
    private String countryCode;

}
