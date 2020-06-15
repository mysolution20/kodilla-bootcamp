package com.kodilla.patterns.builder.bigmac;

import org.junit.*;

public class BigmacTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Beginning of BigmacTests tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All BigmacTests tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute BigmacTest test #" + testCounter);
    }

    @Test
    public void testNewBigmacNumberOfIngredentShouldBe4() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("roll")
                .burgers(1)
                .sauce("standard")
                .sauce("barbecue")
                .ingredient("lettuce")
                .ingredient("onions")
                .ingredient("becon")
                .ingredient("cheese")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        System.out.println(bigmac);
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }

    @Test
    public void testNewBigmacNumberOfTypeOfSaucesShouldBe2() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("roll")
                .burgers(1)
                .sauce("standard")
                .sauce("barbecue")
                .ingredient("lettuce")
                .ingredient("onions")
                .ingredient("becon")
                .ingredient("cheese")
                .build();
        //When
        int howManyTypesOfSauces = bigmac.getIngredients().size();
        System.out.println(bigmac);
        //Then
        Assert.assertEquals(4, howManyTypesOfSauces);
    }

    @Test
    public void testNewBigmacNumberOfBurgersShouldBe2() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("roll")
                .burgers(2)
                .sauce("standard")
                .sauce("barbecue")
                .ingredient("lettuce")
                .ingredient("onions")
                .ingredient("becon")
                .ingredient("cheese")
                .build();
        //When
        int howManyBurgers = bigmac.getBurgers();
        System.out.println(bigmac);
        //Then
        Assert.assertEquals(2, howManyBurgers);
    }

    @Test
    public void testNewBigmacTypeOfBunShouldBeBun() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun")
                .burgers(2)
                .sauce("standard")
                .sauce("barbecue")
                .ingredient("lettuce")
                .ingredient("onions")
                .ingredient("becon")
                .ingredient("cheese")
                .build();
        //When
        String whatTypeOfBun = bigmac.getBun();
        System.out.println(bigmac);
        //Then
        Assert.assertEquals("bun", whatTypeOfBun);
    }
}