package com.session.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

//@EnableRedisHttpSession(maxInactiveIntervalInSeconds=1)
public class SessionConfig {
	
//	@Value("${spring.redis.host}")
//	private String hostName;
//	@Value("${spring.redis.port}")
//	private int port;
//	
//	@Bean
//	public JedisConnectionFactory connectionFactory() {
//		JedisConnectionFactory connectionFactory = new JedisConnectionFactory();
//		connectionFactory.setPort(port);
//		connectionFactory.setHostName(hostName);
//		System.out.println("获取到的hostName是:"+hostName + ",port :"+port);
//		return connectionFactory;
//	}
}
