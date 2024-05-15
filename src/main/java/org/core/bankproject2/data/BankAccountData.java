package org.core.bankproject2.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "accounts", schema = "public")
@Getter
@Setter
public class BankAccountData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "account_number")

    private String accountNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bank_id")
    private BankData bank;

    private double balance;

    @Enumerated(EnumType.STRING)
    private AccountCurrency currency;

    @Column(name = "credit_limit")
    private Integer creditLimit;
}

