package com.di.demo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * User: Shawn cao
 * Date: 13-9-16
 * Time: PM11:58
 */
public class HollywoodServiceWithDI {

    public static List<Agent> getFriendlyAgents(AgentFinder finder){
        List<Agent> agents = finder.findAllAgents();
        return filterAgents(agents,"java developer");
    }

    public static List<Agent> filterAgents(List<Agent> agents,String agentType){
        List<Agent> filterAgents = Lists.newArrayList();
        for (Agent agent:agents){
            if(agent.getType().equals(agentType)){
                filterAgents.add(agent);
            }
        }
        return filterAgents ;
    }
}
