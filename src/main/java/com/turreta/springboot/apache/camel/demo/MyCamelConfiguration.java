package com.turreta.springboot.apache.camel.demo;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
// import org.springframework.context.annotation.Configuration;


// @Configuration
@Component
public class MyCamelConfiguration {

    @Bean
    RoutesBuilder myRouter() {
        return new RouteBuilder() {

            @Override
            public void configure() throws Exception {
            from("file:/C:/Users/windowuser/Desktop/ksg/blog/Spring%20Boot%20-%20Using%20annotations%20for%20Apache%20Camel/shared/in?move=./processed")
                    .to("file:/C:/Users/windowuser/Desktop/ksg/blog/Spring%20Boot%20-%20Using%20annotations%20for%20Apache%20Camel/shared/out");
            }
        };
    }
}
