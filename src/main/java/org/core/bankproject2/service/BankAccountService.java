package org.core.bankproject2.service;

import lombok.RequiredArgsConstructor;
import org.core.bankproject2.data.BankAccountData;
import org.core.bankproject2.repository.BankAccountRepository;
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
