package org.banking.entity;

import jakarta.persistence.Entity;
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
public class Customer extends BaseEntity<Long> {
    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Customer(Account account, Person person) {
        this.account = account;
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "account=" + account +
                ", person=" + person +
                '}';
    }
}
