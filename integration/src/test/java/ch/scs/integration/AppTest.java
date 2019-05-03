package ch.scs.integration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

    private App app;

    @BeforeEach
    public void setUp() {
        app = new App();
    }

    @Test
    public void basicOutputTest() {
        assertThat(app.basicOutput(), is("Basic output."));

    }

}
