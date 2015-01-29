package com.di.demo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * User: Shawn cao
 * Date: 13-9-16
 * Time: PM11:29
 */
public class WebServiceAgentFinder implements  AgentFinder {
    private String path;
    private String type;
    @Override
    public List<Agent> findAllAgents() {
        return Lists.newArrayList();
    }

    @Override
    public String toString() {
        return "WebServiceAgentFinder{" +
                "path='" + path + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {

        return type;
    }

    public String getPath() {

        return path;
    }
}
