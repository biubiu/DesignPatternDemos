package com.di.demo;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * User: Shawn cao
 * Date: 13-9-16
 * Time: PM11:36
 */
public class HollywoodServiceWithFactory {
    public List<Agent> getFriendlyAgents(String agentType){
        AgentFinder agentFinder =AgentFinderFactory.getInstance().agentFinder(agentType);
        List<Agent> agents = filterAgents(agentFinder.findAllAgents(),"java developer");
        return agents;
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
