package com.di.demo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * User: Shawn cao
 * Date: 13-9-16
 * Time: PM11:29
 */
public class SpreadsheetAgentFinder implements AgentFinder {

    private String path;
    private String type;

    @Override
    public String toString() {
        return "SpreadsheetAgentFinder{" +
                "path='" + path + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public List<Agent> findAllAgents() {
        return Lists.newLinkedList();
    }

}
