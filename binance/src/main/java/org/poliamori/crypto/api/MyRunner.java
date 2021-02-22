package org.poliamori.crypto.api;

import org.poliamori.crypto.api.provider.binance.BinanceApiProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private final BinanceApiProvider binanceApiProvider;

    public MyRunner(BinanceApiProvider binanceApiProvider) {
        this.binanceApiProvider = binanceApiProvider;
    }

    @Override
    public void run(String... args) throws Exception {
//        binanceApiProvider.getAllPrices();
        binanceApiProvider.getAccountInfo();
//        binanceApiProvider.getExchangeInfo();
    }
}
