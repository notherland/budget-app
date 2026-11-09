package com.budgetapp.service;

import com.budgetapp.model.Account;
import com.budgetapp.repository.BudgetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BudgetService {

    private final BudgetRepository budgetRepository;

    public List<Account> findAll() {
        return budgetRepository.findAll();
    }

    public Optional<Account> findById(Long id) {
        return budgetRepository.findById(id);
    }

    public Account save(Account account) {
        return budgetRepository.save(account);
    }

    public void deleteById(Long id) {
        budgetRepository.deleteById(id);
    }
}
