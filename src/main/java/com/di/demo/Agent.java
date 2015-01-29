package com.di.demo;

/**
 * User: Shawn cao
 * Date: 13-9-16
 * Time: PM9:49
 */
public class Agent {

    private String type;

    @Override
    public String toString() {
        return "Agent{" +
                "type='" + type + '\'' +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {

        return type;
    }
}
