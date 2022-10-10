package org.banking.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.banking.base.entity.BaseEntity;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Transaction extends BaseEntity<Long> {
    @OneToOne
    @JoinColumn(name = "from_card_id")
    private CreditCard fromCard;
    @OneToOne
    @JoinColumn(name = "to_card_id")
    private CreditCard toCard;

    @Column(nullable = false)
    private long value;

    @Column(nullable = false)
    private Date transactionDate;

    @ManyToOne(cascade = CascadeType.ALL)
    private CreditCard creditCardTransactions;
}
