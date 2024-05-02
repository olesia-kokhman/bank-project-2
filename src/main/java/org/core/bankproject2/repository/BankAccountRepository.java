package org.core.bankproject2.repository;

import org.core.bankproject2.data.BankAccountData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountData, Integer> {

}
