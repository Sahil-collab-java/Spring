package com.example.Repo;

import com.example.Model.Account;
import com.example.Model.AccountPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepo extends JpaRepository<Account, AccountPK> {
}
