package com.practico.apiRestPagination.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "localidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Localidad extends Base {

    @Column(name = "denominacion")
    private String denominacion;
}
