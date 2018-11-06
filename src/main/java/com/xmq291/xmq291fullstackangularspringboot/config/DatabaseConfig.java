package com.xmq291.xmq291fullstackangularspringboot.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.xmq291.xmq291fullstackangularspringboot.repository")
@EnableTransactionManagement
public class DatabaseConfig {

}
