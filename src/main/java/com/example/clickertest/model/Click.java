package com.example.clickertest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="CLICKER")
public class Click {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) long id;

    @Column(nullable = true)

    private int clickAmount;

    public Click(int i) {
    }
}