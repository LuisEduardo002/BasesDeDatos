package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "evento_categoria")
public class EventoCategoria {

    @EmbeddedId
    private EventoCategoriaId id;

    @ManyToOne
    @MapsId("eventoId")
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne
    @MapsId("categoriaId")
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}

@Embeddable
@Data
class EventoCategoriaId implements java.io.Serializable {
    private Long eventoId;
    private Long categoriaId;
}