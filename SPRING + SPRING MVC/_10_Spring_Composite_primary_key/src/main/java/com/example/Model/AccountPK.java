package com.example.Model;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class AccountPK implements Serializable {

    private Long accNum;
    private String accType;
}
