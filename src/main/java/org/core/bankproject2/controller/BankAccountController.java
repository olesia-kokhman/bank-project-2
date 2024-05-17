package org.core.bankproject2.controller;

import lombok.RequiredArgsConstructor;
import org.core.bankproject2.data.BankAccountData;
import org.core.bankproject2.service.BankAccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/bank_accounts")
@RequiredArgsConstructor
public class BankAccountController {

    private final BankAccountService service;

    @PostMapping()
    public ResponseEntity<BankAccountData> createBankAccount(@RequestBody BankAccountData bankAccountData,
                                                             BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bankAccountData);
        }

        BankAccountData createdBankAccount = service.createBankAccount(bankAccountData);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBankAccount);
    }

    @GetMapping
    public ResponseEntity<List<BankAccountData>> getAllBankAccounts() {
        List<BankAccountData> bankAccountDataList = service.getAllBankAccounts();
        return ResponseEntity.status(HttpStatus.OK).body(bankAccountDataList);
    }

    @DeleteMapping("/{bankAccountId}")
    public ResponseEntity<Void> deleteBankAccount(@PathVariable int bankAccountId) {
        try {
            service.deleteBankAccount(bankAccountId);
            return ResponseEntity.noContent().build();
        } catch (IllegalArgumentException exception) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{bankAccountId}")
    public ResponseEntity<BankAccountData> updateBankAccount(@PathVariable int bankAccountId,
                                                             @RequestBody BankAccountData updatedBankAccountData) {
        try {
            BankAccountData bankAccountData = service.updateBankAccount(bankAccountId, updatedBankAccountData);
            return ResponseEntity.status(HttpStatus.OK).body(bankAccountData);
        } catch (IllegalArgumentException exception) {
            return ResponseEntity.badRequest().body(updatedBankAccountData);
        }


    }
}
