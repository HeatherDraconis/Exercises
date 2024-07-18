package org.codewars.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CamelTest {
    @Test
    public void tests() {
        assertEquals( "Incorrect", "camel Casing", Camel.camelCase("camelCasing"));
        assertEquals( "Incorrect", "camel Casing Test", Camel.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", Camel.camelCase("camelcasingtest"));
    }
}
