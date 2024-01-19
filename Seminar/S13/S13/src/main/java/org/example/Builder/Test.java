package org.example.Builder;

public class Test {

    private String description;
    private int value;
    private int expectedValue;

    public Test(String description, int value, int expectedValue) {
        this.description = description;
        this.value = value;
        this.expectedValue = expectedValue;
    }

    public void run() {
        if(value != expectedValue)
            throw new RuntimeException("Value is different from the expected one");
    }


}
