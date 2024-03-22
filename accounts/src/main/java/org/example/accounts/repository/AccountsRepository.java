package org.example.accounts.repository;

import org.example.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {
    Optional<Accounts> findAccountsByCustomerId(Long customerId);

    @Transactional
    @Modifying
    void deleteAccountsByCustomerId(Long customerId);
}