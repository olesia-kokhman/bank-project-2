package org.core.bankproject2.controller;

import lombok.RequiredArgsConstructor;
import org.core.bankproject2.data.BankAccountData;
import org.core.bankproject2.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
        return ResponseEntity.status(HttpStatus.FOUND).body(bankAccountDataList);
    }

}
