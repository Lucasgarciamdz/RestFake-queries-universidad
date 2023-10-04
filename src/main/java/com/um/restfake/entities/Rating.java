package com.um.restfake.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Rating extends Base {

    @Column(name = "rating", nullable = false)
    private Double rate;

    @Column(name = "contador")
    private int count;


}
