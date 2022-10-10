package org.banking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.banking.base.entity.BaseEntity;

import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Bank extends BaseEntity<Long> {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true, updatable = false)
    private long bankCode;

    @Column (nullable = false, unique = true, updatable = false)
    private Date bankCreateDate;

    public Bank(String name, long bankCode, Date bankCreateDate) {
        this.name = name;
        this.bankCode = bankCode;
        this.bankCreateDate = bankCreateDate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", bankCode=" + bankCode +
                ", bankCreateDate=" + bankCreateDate +
                '}';
    }
}
