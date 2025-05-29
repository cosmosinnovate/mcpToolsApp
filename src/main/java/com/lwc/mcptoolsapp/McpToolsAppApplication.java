package com.lwc.mcptoolsapp;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpToolsAppApplication {
    @Bean
    public ToolCallbackProvider getToolCallbackProvider(PreferredToolsService preferredToolsService) {
        return MethodToolCallbackProvider.builder().toolObjects(preferredToolsService).build();
    }
    public static void main(String[] args) {
        SpringApplication.run(McpToolsAppApplication.class, args);
    }

}
