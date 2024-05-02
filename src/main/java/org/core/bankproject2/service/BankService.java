package org.core.bankproject2.service;

import lombok.RequiredArgsConstructor;
import org.core.bankproject2.repository.BankRepository;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankService {

    private final BankRepository repository;


}
