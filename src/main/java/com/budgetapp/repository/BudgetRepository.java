package com.budgetapp.repository;

import com.budgetapp.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Account, Long> {
}
