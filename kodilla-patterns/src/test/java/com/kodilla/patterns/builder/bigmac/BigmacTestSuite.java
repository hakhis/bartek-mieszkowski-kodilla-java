package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Regular bun")
                .burgers(2)
                .sauce("Barbecue")
                .ingredients("Onion")
                .ingredients("Chili pepper")
                .ingredients("Cheese")
                .ingredients("Lettuce")
                .ingredients("Prawns")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(5, howManyIngredients);
    }

    @Test
    public void testBigmacBuilderIllegalIngredient() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Regular bun")
                .burgers(2)
                .sauce("Barbecue")
                .ingredients("Onion")
                .ingredients("Banana")
                .ingredients("Cheese")
                .ingredients("Lettuce")
                .ingredients("Prawns")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);
    }

    @Test
    public void testBigmacBuilderNoKeyIngredient() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Regular bun")
                .sauce("Barbecue")
                .ingredients("Onion")
                .ingredients("Banana")
                .ingredients("Cheese")
                .ingredients("Lettuce")
                .ingredients("Prawns")
                .build();
        System.out.println(bigmac);

        //When
        //Then
        Assert.assertNull(bigmac);
    }
}
