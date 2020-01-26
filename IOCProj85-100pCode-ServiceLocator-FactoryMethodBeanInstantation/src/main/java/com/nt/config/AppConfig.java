package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.cb.service")
@ImportResource("classpath:com/cb/cfgs/applicationContext.xml")
public class AppConfig {

}
