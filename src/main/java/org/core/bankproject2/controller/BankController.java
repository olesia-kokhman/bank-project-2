package org.core.bankproject2.controller;

import lombok.RequiredArgsConstructor;
import org.core.bankproject2.data.BankAccountData;
import org.core.bankproject2.data.BankData;
import org.core.bankproject2.service.BankService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/bank")
@RequiredArgsConstructor
public class BankController {

    private final BankService service;

    @GetMapping
    public ResponseEntity<List<BankData>> getAllBankAccounts() {
        List<BankData> bankDataList = service.getAllBanks();
        return ResponseEntity.status(HttpStatus.FOUND).body(bankDataList);
    }

}
