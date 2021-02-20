package com.huanhai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册服务
 *
 * @author Lenovo
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaServer.class,args);
    }
}
