package com.di.demo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * User: Shawn cao
 * Date: 13-9-16
 * Time: PM11:32
 */
public class HollywoodSerivice {

    public static List<Agent> getFriendAgents(){
        AgentFinder finder = new SpreadsheetAgentFinder();
        List<Agent> agents = finder.findAllAgents();
        List<Agent> filterAgents = filterAgents(agents,"java developer");
        return filterAgents;
    }

    public static List<Agent> filterAgents(List<Agent> agents,String agentType){
        List<Agent> filterAgents = Lists.newArrayList();
        for (Agent agent:agents){
            if(agent.getType().equals(agentType)){
                filterAgents.add(agent);
            }
        }
        return filterAgents;
    }
}
