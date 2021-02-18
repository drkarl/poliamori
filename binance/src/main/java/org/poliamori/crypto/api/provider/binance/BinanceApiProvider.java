package org.poliamori.crypto.api.provider.binance;

import com.binance.api.client.BinanceApiRestClient;
import org.poliamori.crypto.api.provider.CryptoApiProvider;
import org.springframework.stereotype.Component;

@Component
public class BinanceApiProvider implements CryptoApiProvider {

    private final BinanceApiRestClient binanceClient;

    public BinanceApiProvider(final BinanceApiRestClient binanceClient) {
        this.binanceClient = binanceClient;
    }

}
