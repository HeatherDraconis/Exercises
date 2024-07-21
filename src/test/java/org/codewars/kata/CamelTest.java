package org.codewars.kata;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CamelTest {
    @Test
    public void tests() {
        assertEquals( "camel Casing", Camel.camelCase("camelCasing"));
        assertEquals( "camel Casing Test", Camel.camelCase("camelCasingTest"));
        assertEquals( "camelcasingtest", Camel.camelCase("camelcasingtest"));
    }
}
