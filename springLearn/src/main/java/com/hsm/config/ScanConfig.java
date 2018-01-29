package com.hsm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hsm.bean.SgtPeppers;

@Configuration
@ComponentScan(basePackageClasses= {SgtPeppers.class})
public class ScanConfig {

}

