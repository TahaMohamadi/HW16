package org.banking.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.banking.base.entity.BaseEntity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Branch extends BaseEntity<Long> {

    @Column(nullable = false)
    private String branchName;

    @Column(nullable = false, unique = true)
    private long branchCode;

    @OneToOne
    @JoinColumn(name = "boss_id")
    private Employee boss;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bank_id")
    private Bank bankId;

    public Branch(String branchName, long branchCode, Employee boss, Bank bankId) {
        this.branchName = branchName;
        this.branchCode = branchCode;
        this.boss = boss;
        this.bankId = bankId;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchName='" + branchName + '\'' +
                ", branchCode=" + branchCode +
                ", boss=" + boss +
                ", bankId=" + bankId +
                '}';
    }
}
