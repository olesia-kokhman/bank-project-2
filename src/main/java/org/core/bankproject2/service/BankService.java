package org.core.bankproject2.service;

import org.core.bankproject2.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Autowired
    private BankRepository repository;


}
