package com.lwc.mcptoolsapp;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class PreferredToolsService {
    @Tool(name = "FullStackDevList", description = "Find the preferred devops tools at the company LearnwithCosmos")
    public String getPreferredTools(@ToolParam(description = "Name the DevOps tool category to search") String tools) {
        if (tools.equalsIgnoreCase("cicd")) {
            return "github action";
        }
        if (tools.equalsIgnoreCase("build")) {
            return "maven";
        }
        if (tools.equalsIgnoreCase("containerization")) {
            return "docker";
        }
        if (tools.equalsIgnoreCase("microservices")) {
            return "kubernetes rcp";
        }
        return "Any apache tool";
    }
}
