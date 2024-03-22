package org.example.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Accounts extends BaseEntity {
    @Column(name="customer_id")
    private Long customerId;
    @Id
    @Column(name="account_number")
    private Long accountNumber; // we don't want to have auto generated id
    @Column(name="account_type")
    private String accountType;
    @Column(name="branch_address")
    private String branchAddress;
}