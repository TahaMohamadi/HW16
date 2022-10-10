package org.banking.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.banking.base.entity.BaseEntity;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CreditCard extends BaseEntity<Long> {

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(nullable = false, unique = true)
    private long cardNumber;

    @Column(nullable = false)
    private int ccv2;

    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.DATE)
    private Date expireDate;

    @Column(nullable = false)
    @JdbcTypeCode(SqlTypes.BOOLEAN)
    private boolean isBlocked;
    @OneToMany(mappedBy = "creditCardTransactions")
    private List<Transaction> transactions = new ArrayList<>();

    public CreditCard(Account account, long cardNumber, int ccv2, Date expireDate, boolean isBlocked, List<Transaction> transactions) {
        this.account = account;
        this.cardNumber = cardNumber;
        this.ccv2 = ccv2;
        this.expireDate = expireDate;
        this.isBlocked = isBlocked;
        this.transactions = transactions;
    }

    public CreditCard(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "account=" + account +
                ", cardNumber=" + cardNumber +
                ", ccv2=" + ccv2 +
                ", expireDate=" + expireDate +
                ", isBlocked=" + isBlocked +
                ", transactions=" + transactions +
                '}';
    }
}
