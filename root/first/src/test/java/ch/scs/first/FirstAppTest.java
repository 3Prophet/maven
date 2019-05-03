package ch.scs.first;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sc.scs.first.FirstApp;

public class FirstAppTest {

    private FirstApp app;

    @BeforeEach
    public void setUp() {
        app = new FirstApp();
    }

    @Test
    public void getFirstTest() {
        assertThat(app.getFirst(), is("First"));
    }

}
