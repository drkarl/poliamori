package org.poliamori.crypto.api.config;

import com.binance.api.client.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Bean
    public BinanceApiClientFactory binanceApiClientFactory(final YAMLConfig yamlConfig) {
        return BinanceApiClientFactory.newInstance(yamlConfig.getApiKey(), yamlConfig.getApiSecret());
    }

    @Bean
    public BinanceApiRestClient binanceApiRestClient(final BinanceApiClientFactory binanceApiClientFactory) {
        return binanceApiClientFactory.newRestClient();
    }

    @Bean
    public BinanceApiAsyncRestClient binanceAsyncApiRestClient(final BinanceApiClientFactory binanceApiClientFactory) {
        return binanceApiClientFactory.newAsyncRestClient();
    }

    @Bean
    public BinanceApiWebSocketClient binanceWebSocketClient(final BinanceApiClientFactory binanceApiClientFactory) {
        return binanceApiClientFactory.newWebSocketClient();
    }

    @Bean
    public BinanceApiMarginRestClient binanceMarginRestClient(final BinanceApiClientFactory binanceApiClientFactory) {
        return binanceApiClientFactory.newMarginRestClient();
    }

    @Bean
    public BinanceApiAsyncMarginRestClient binanceAsyncMarginRestClient(final BinanceApiClientFactory binanceApiClientFactory) {
        return binanceApiClientFactory.newAsyncMarginRestClient();
    }

    @Bean
    public BinanceApiSwapRestClient binanceApiSwapRestClient(final BinanceApiClientFactory binanceApiClientFactory) {
        return binanceApiClientFactory.newSwapRestClient();
    }

}
