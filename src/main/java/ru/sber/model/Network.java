package ru.sber.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Network {
    public Network() {
    }

    @Id
    Long id;
    String name;
    Double value;
    String description;
    Integer defaultValue;

}
