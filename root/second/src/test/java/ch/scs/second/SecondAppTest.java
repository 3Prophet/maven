package ch.scs.second;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch.scs.second.SecondApp;

/**
 * Unit test for simple App.
 */
public class SecondAppTest {
    private SecondApp app;

    @BeforeEach
    public void setUp() {
        app = new SecondApp();
    }

    @Test
    public void getSecondTest() {
        assertThat(app.getSecond(), is("Second"));
    }
}
