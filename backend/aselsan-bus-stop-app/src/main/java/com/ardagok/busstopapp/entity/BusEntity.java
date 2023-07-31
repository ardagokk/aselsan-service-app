package com.ardagok.busstopapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter

@Table(name = "bus_entity")
@Entity
public class BusEntity {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "no")
    private String no;

    @Column(name = "name")
    private String name;

    public Set<StopEntity> getBusStop() {
        return busStop;
    }

    public void setBusStop(Set<StopEntity> busStop) {
        this.busStop = busStop;
    }

    @ManyToMany
    @JoinTable(
            name = "bus_stops",
            joinColumns = @JoinColumn(name = "bus_id"),
            inverseJoinColumns = @JoinColumn(name = "stop_id")
    )


    private Set<StopEntity> busStop;
  /*  @ManyToMany
    @JoinTable(
            name = "bus_stops_return",
            joinColumns = @JoinColumn(name="bus_id"),
            inverseJoinColumns = @JoinColumn(name = "stop_id")
    )


    private Set<StopEntity> busStop2;
*/

}
