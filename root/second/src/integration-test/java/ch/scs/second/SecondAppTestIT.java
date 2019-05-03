/* 
 * Copyright (c) 2019 Supercomputing Systems AG, Schweiz. Alle Rechte vorbehalten.
 */
package ch.scs.second;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// TODO Javadoc for type SecondAppTestIT
/**
 */
public class SecondAppTestIT {

    private SecondApp app;

    @BeforeEach
    public void setUp() {
        app = new SecondApp();
    }

    @Test
    public void testGetSecondForIT() {
        assertThat(app.getSecondForIT(), is("SecondForIT"));
    }

}
