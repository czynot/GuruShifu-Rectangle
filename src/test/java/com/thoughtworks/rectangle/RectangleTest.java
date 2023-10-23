package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RectangleTest {

    @Test
    public void shouldReturnAreaWhenLengthAndBreadthAreGiven() {
        Rectangle rectangle = new Rectangle(4, 6);
        int area = rectangle.area();
        assertThat(area, equalTo(24));
    }
}