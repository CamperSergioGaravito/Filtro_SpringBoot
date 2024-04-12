package com.filtro.inmuebles.repository.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter

@Entity
@DiscriminatorValue("Villa")
public class Villa extends Estancia  {

    @Column(name = "tamano_parcela")
    private double sizeParcela;

    public Villa(int habitaciones, int banios, int aseos, int cocinas, boolean gasNatural, boolean luz,
            boolean puertaBlindada, boolean parqueadero, double sizeParcela) {
        super(habitaciones, banios, aseos, cocinas, gasNatural, luz, puertaBlindada, parqueadero);
        this.sizeParcela = sizeParcela;
    }

    
    
}
