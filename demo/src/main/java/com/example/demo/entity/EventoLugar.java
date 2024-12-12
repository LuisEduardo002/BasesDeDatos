package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "evento_lugar")
public class EventoLugar {

    @EmbeddedId
    private EventoLugarId id;

    @ManyToOne
    @MapsId("eventoId")
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne
    @MapsId("lugarId")
    @JoinColumn(name = "lugar_id")
    private Lugar lugar;
}

@Embeddable
@Data
class EventoLugarId implements java.io.Serializable {
    private Long eventoId;
    private Long lugarId;
}