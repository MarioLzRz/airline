package org.ies.airport.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Passenger {
    private String nif;
    private int seatNumber;
    private List<Luggage> luggages;
}
