package org.ies.airport.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Airline {
    private String name;
    private Map<Integer, Flight> flights;
    private List<Customer> Customers;

}
