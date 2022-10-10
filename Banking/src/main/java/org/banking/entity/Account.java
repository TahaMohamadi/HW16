package org.banking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.banking.base.entity.BaseEntity;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account extends BaseEntity<Long> {
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @Column(nullable = false)
    private Date createDate;

    @Column(nullable = false)
    private long balance;

    @Column(nullable = false, unique = true)
    private long accountCode;

    public Account(Branch branch, CreditCard creditCard, Date createDate, long balance, long accountCode) {
        this.branch = branch;
        this.createDate = createDate;
        this.balance = balance;
        this.accountCode = accountCode;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "branch=" + branch +
                ", createDate=" + createDate +
                ", balance=" + balance +
                ", accountCode=" + accountCode +
                '}';
    }
}
