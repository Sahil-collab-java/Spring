package com.example.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "account_tbl")
public class Account {
    private String holderName;
    private String branch;

    @EmbeddedId
    private AccountPK accountPK;
}
