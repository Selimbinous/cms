package com.selim.demoapp.config;

import com.selim.demoapp.filter.mynewfilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myfilterconfig {

    @Bean
    public FilterRegistrationBean<mynewfilter> registrationBean(){
      FilterRegistrationBean<mynewfilter> registrationBean= new FilterRegistrationBean<>();
      registrationBean.setFilter(new mynewfilter());
      registrationBean.addUrlPatterns("/customers");
      return registrationBean;
    }
}
