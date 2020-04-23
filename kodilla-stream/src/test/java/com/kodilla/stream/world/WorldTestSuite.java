package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetSandBeansQuantity() {
        //Given
        Continent asia = new Continent();
        Continent europe = new Continent();
        Continent africa = new Continent();
        Continent australia = new Continent();
        Continent southAmerica = new Continent();

        //Countries for asia
        Country china = new Country(new BigDecimal("100"));
        Country thailand = new Country(new BigDecimal("100"));
        Country vietnam = new Country(new BigDecimal("100"));
        //Countries for europe
        Country france = new Country(new BigDecimal("100"));
        Country poland = new Country(new BigDecimal("100"));
        Country germany = new Country(new BigDecimal("100"));
        //Countries for africa
        Country congo = new Country(new BigDecimal("100"));
        Country egypt = new Country(new BigDecimal("100"));
        Country rpa = new Country(new BigDecimal("100"));
        //Countries for australia
        Country australia_country = new Country(new BigDecimal("100"));
        Country newZeland = new Country(new BigDecimal("100"));
        Country polynesia = new Country(new BigDecimal("100"));
        //Countries for south america
        Country brazil = new Country(new BigDecimal("100"));
        Country peru = new Country(new BigDecimal("100"));
        Country argentina = new Country(new BigDecimal("100"));

        asia.addCountry(china);
        asia.addCountry(thailand);
        asia.addCountry(vietnam);

        europe.addCountry(france);
        europe.addCountry(poland);
        europe.addCountry(germany);

        africa.addCountry(congo);
        africa.addCountry(rpa);
        africa.addCountry(egypt);

        australia.addCountry(australia_country);
        australia.addCountry(newZeland);
        australia.addCountry(polynesia);

        southAmerica.addCountry(brazil);
        southAmerica.addCountry(peru);
        southAmerica.addCountry(argentina);

        World world = new World();
        world.addContinent(asia);
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(australia);
        world.addContinent(southAmerica);

        //When
        BigDecimal worldPopulation = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPopulation = new BigDecimal("1500");
        Assert.assertEquals(expectedPopulation, worldPopulation);
    }
}
