package org.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.banking.base.entity.BaseEntity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee extends BaseEntity<Long> {
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Enumerated
    public String positionEnum;

    @OneToOne
    @JoinColumn(name = "boss_id")
    public Employee boss;

    public Employee(Person person, String positionEnum, Employee boss) {
        this.person = person;
        this.positionEnum = positionEnum;
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person=" + person +
                ", positionEnum='" + positionEnum + '\'' +
                ", boss=" + boss +
                '}';
    }
}
