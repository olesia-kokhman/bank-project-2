package org.core.bankproject2.data;

import jakarta.persistence.*;

@Entity
@Table(name = "Accounts")
public class BankAccountData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "account_number")
    private String accountNumber;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private BankData bank;

    private double balance;

    @Enumerated(EnumType.STRING)
    private AccountCurrency currency;

    @Column(name = "credit_limit")
    private int creditLimit;
}

