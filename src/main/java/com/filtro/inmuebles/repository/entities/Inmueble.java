package com.filtro.inmuebles.repository.entities;

import com.filtro.inmuebles.repository.enums.TipoPiso;
import com.filtro.inmuebles.repository.enums.TipoServicio;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "inmueble_id")
public abstract class Inmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long referencia;

    @ManyToOne
    @JoinColumn(
        name = "propietario_id"
    )
    Propietario propietario;

    @Column(unique = true)
    private String direccion;

    @Enumerated(EnumType.STRING)
    private TipoPiso tipoPiso;

    private double valor;

    @Column(name = "superficie_m2")
    private double superficie;

    @Enumerated(EnumType.STRING)
    private TipoServicio tipoServicio;

    public void setReferencia() {
        this.referencia = this.hashCode();
    }

    

    public Inmueble(long referencia, Propietario propietario, String direccion, TipoPiso tipoPiso, double valor,
            double superficie, TipoServicio tipoServicio) {
                super();
        this.referencia = referencia;
        this.propietario = propietario;
        this.direccion = direccion;
        this.tipoPiso = tipoPiso;
        this.valor = valor;
        this.superficie = superficie;
        this.tipoServicio = tipoServicio;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((propietario == null) ? 0 : propietario.hashCode());
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Inmueble other = (Inmueble) obj;
        if (propietario == null) {
            if (other.propietario != null)
                return false;
        } else if (!propietario.equals(other.propietario))
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        return true;
    }

    
    
}
