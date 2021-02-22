package org.poliamori.crypto.api.provider.binance;

import com.binance.api.client.BinanceApiRestClient;
import org.poliamori.crypto.api.provider.CryptoApiProvider;
import org.springframework.stereotype.Component;

@Component
public class BinanceApiProvider implements CryptoApiProvider {

    private final BinanceApiRestClient binanceClient;

//    Collect historical data from
//    Tick-by-tick Trades - Price and volume data, all transactions executed on the exchange
//    Order Book Snapshots - Bids and asks placed within 10% of the midprice, taken twice per minute, and derived order book measures including market depth, slippage, and spread.
//    VWAP - [Volume Weighted Average Price] in granularities ranging from 1 second to 1 day
//    OHLCV - Candlesticks in granularities ranging from 1 second to 1 day

    public BinanceApiProvider(final BinanceApiRestClient binanceClient) {
        this.binanceClient = binanceClient;
    }

    public void getAllPrices() {
        binanceClient.getAllPrices().forEach(System.out::println);
    }

    public void getAccountInfo() {
        System.out.println(binanceClient.getAccount());
    }

    public void getExchangeInfo() {
        System.out.println(binanceClient.getExchangeInfo());
    }

}
