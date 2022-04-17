package com.restaurants.brewery.services;

import com.restaurants.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerID);
}
