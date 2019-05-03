/* 
 * Copyright (c) 2019 Supercomputing Systems AG, Schweiz. Alle Rechte vorbehalten.
 */
package ch.scs.integration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// TODO Javadoc for type AppTestIT
/**
 */
public class AppTestIT {

    private App app;

    @BeforeEach
    public void setUp() {
        app = new App();
    }

    @Test
    public void integrationTest() {
        assertThat(app.basicOutput(), is("Basic output."));
    }

}
