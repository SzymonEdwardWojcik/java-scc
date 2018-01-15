package com.codecool.scc.config;

import com.codecool.scc.dao.FileReader;
import com.codecool.scc.services.SimpleCsvConverter;
import com.codecool.scc.view.OutputFormatterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

    @Bean
    public FileReader fileReader() {
        return new FileReader();
    }

    @Bean
    public OutputFormatterFactory outputFormatterFactory() {
        return new OutputFormatterFactory();
    }

    @Bean
    public SimpleCsvConverter simpleCsvConverter() {
        return new SimpleCsvConverter(fileReader(), outputFormatterFactory());
    }

}
