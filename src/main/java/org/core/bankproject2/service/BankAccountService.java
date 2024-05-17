package org.core.bankproject2.service;

import lombok.RequiredArgsConstructor;
import org.core.bankproject2.data.BankAccountData;
import org.core.bankproject2.repository.BankAccountRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Pageable;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BankAccountService {

    private final BankAccountRepository repository;

    public BankAccountData createBankAccount(BankAccountData bankAccountData) {
        return repository.save(bankAccountData);
    }

    public Page<BankAccountData> getAllBankAccounts(int page, int size) {
        PageRequest pageable = PageRequest.of(page, size);
        return repository.findAll(pageable);
    }

    public BankAccountData updateBankAccount(int bankAccountDataId, BankAccountData bankAccountData) {
        if(repository.existsById(bankAccountDataId)) {
            bankAccountData.setId(bankAccountDataId);
            return repository.save(bankAccountData);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void deleteBankAccount(int bankAccountDataId) {
        if(repository.existsById(bankAccountDataId)) {
            repository.deleteById(bankAccountDataId);
        } else {
            throw new IllegalArgumentException();
        }
    }



}
