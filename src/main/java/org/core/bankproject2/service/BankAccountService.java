package org.core.bankproject2.service;

import lombok.RequiredArgsConstructor;
import org.core.bankproject2.controller.BankAccountController;
import org.core.bankproject2.data.BankAccountData;
import org.core.bankproject2.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankAccountService {

    private final BankAccountRepository repository;

    public BankAccountData createBankAccount(BankAccountData bankAccountData) {
        return repository.save(bankAccountData);
    }

    public List<BankAccountData> getAllBankAccounts() {
        return repository.findAll();
    }



}
