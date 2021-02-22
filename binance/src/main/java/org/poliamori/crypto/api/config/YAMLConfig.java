package org.poliamori.crypto.api.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@Data
public class YAMLConfig {

    @Value("${crypto.provider.api.binance.api-key}")
    private String apiKey;

    @Value("${crypto.provider.api.binance.api-secret}")
    private String apiSecret;

}