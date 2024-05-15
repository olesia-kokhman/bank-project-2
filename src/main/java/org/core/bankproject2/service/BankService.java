package org.core.bankproject2.service;

import lombok.RequiredArgsConstructor;
import org.core.bankproject2.data.BankData;
import org.core.bankproject2.repository.BankRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BankService {

    private final BankRepository repository;

    public List<BankData> getAllBanks() {
        return repository.findAll();
    }


}
