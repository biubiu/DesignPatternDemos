package com.di.demo;

/**
 * User: Shawn cao
 * Date: 13-9-16
 * Time: PM11:38
 */
public class AgentFinderFactory {
    private static AgentFinderFactory agentFinderFactory;

    public static AgentFinderFactory getInstance(){
        if(agentFinderFactory == null){
            agentFinderFactory = new AgentFinderFactory();
        }
        return agentFinderFactory;
    }

    public AgentFinder agentFinder(String agentType){
        AgentFinder agentFinder = null;
        switch (agentType){
        case "webservice":
            agentFinder = new WebServiceAgentFinder();
        break;
        case "spreadsheet":
            agentFinder = new SpreadsheetAgentFinder();
        break;
        default:
            agentFinder = new WebServiceAgentFinder();
        break;
        }
        return agentFinder;
    }
}
