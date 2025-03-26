package com.cennox.rcp.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;

@Configuration
public class HazelcastClientConfig {
   @Bean
    public HazelcastInstance hazelcastClientInstance() {
        ClientConfig clientConfig = new ClientConfig();

        
        clientConfig.getNetworkConfig()
                .addAddress("hazelcast:5701");
    
        
        return HazelcastClient.newHazelcastClient(clientConfig);
    }
}
