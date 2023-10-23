package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

public class RectangleTest {

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        Rectangle rectangle = new Rectangle(4.00, 6.00);
        double area = rectangle.area();
        assertThat(area, is(closeTo(24.00, 0.01)));
    }
}