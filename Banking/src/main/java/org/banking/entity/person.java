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
public class person extends BaseEntity<Long> {


    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true, updatable = false)
    private long nationalCode;

    @Column (nullable = false, unique = true, updatable = false)
    private long phoneNumber;

    private Date birthDate;

    public person(String fullName, long nationalCode, long phoneNumber, Date birthDate) {
        this.fullName = fullName;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "fullName = " + fullName + ", " +
                "nationalCode = " + nationalCode + ", " +
                "phoneNumber = " + phoneNumber + ", " +
                "birthDate = " + birthDate + ")";
    }
}
