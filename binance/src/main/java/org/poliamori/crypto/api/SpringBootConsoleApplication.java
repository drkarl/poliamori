package org.poliamori.crypto.api;

import lombok.extern.flogger.Flogger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Level;

@Flogger
@SpringBootApplication
public class SpringBootConsoleApplication
        implements CommandLineRunner {

    public static void main(String[] args) {
        log.at(Level.INFO).log("STARTING THE APPLICATION");
        SpringApplication.run(SpringBootConsoleApplication.class, args);
        log.at(Level.INFO).log("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        log.at(Level.INFO).log("EXECUTING : command line runner");

        for (int i = 0; i < args.length; ++i) {
            log.at(Level.INFO).log("args[{}]: {}");
        }
    }
}
