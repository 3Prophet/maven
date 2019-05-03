/* 
 * Copyright (c) 2019 Supercomputing Systems AG, Schweiz. Alle Rechte vorbehalten.
 */
package ch.scs.first;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sc.scs.first.FirstApp;

public class FirstAppTestIT {

    private FirstApp app;

    @BeforeEach
    public void setUp() {
        app = new FirstApp();
    }

    @Test
    public void testGetFirstForIT() {
        assertThat(app.getFirstForIT(), is("FirstForIT"));
    }
}
