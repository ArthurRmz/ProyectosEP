/**
 * 
 */
package com.soa.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author tlopez
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.soa")
public class ApplicationContextConfig {

}
