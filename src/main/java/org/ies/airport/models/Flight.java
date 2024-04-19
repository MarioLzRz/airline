package org.ies.airport.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private Date flightDate;
    private Set<Passenger> passengers;
}
