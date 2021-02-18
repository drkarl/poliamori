package org.poliamori.crypto.api.config;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public BinanceApiRestClient binanceApiRestClient(final YAMLConfig yamlConfig) {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance(yamlConfig.getApiKey(), yamlConfig.getApiSecret());
        return factory.newRestClient();
    }


}
