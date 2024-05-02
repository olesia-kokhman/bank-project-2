package org.core.bankproject2.data;

import jakarta.persistence.*;

@Entity
@Table(name = "banks")
public class BankData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
}
