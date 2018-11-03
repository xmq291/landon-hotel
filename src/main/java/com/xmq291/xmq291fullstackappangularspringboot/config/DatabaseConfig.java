package com.xmq291.xmq291fullstackappangularspringboot.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableJpaRepositories("com.xmq291.xmq291fullstackappangularspringboot.repository")
@EnableTransactionManagement
public class DatabaseConfig {

}
