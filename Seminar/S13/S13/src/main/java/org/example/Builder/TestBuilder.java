package org.example.Builder;

public class TestBuilder {

//    private Test test;
    private int expectedValue;
    private String description;

    private int value;

    public TestBuilder expectedValue(int expectedValue) {
        this.expectedValue = expectedValue;
        return this;
    }

    public TestBuilder test(String description) {
        this.description = description;
        return this;
    }

    public TestBuilder result(int value) {
        this.value = value;
        return this;
    }

    public Test build() {
        return new Test(description, value, expectedValue);
    }
}
