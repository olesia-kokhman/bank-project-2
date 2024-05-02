package org.core.bankproject2.repository;

import org.core.bankproject2.data.BankData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<BankData, Integer> {

}
