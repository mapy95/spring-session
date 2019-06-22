package com.session.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
//
@EnableRedisHttpSession(maxInactiveIntervalInSeconds=2)
public class SessionConfig01 {
	
	@Autowired
	private RedisProperties properties;
	
	@Bean
	public JedisConnectionFactory connectionFactory() {
		JedisConnectionFactory connectionFactory = new JedisConnectionFactory();
		connectionFactory.setPort(properties.getPort());
		connectionFactory.setHostName(properties.getHostName());
		System.out.println("获取到的hostName是:"+properties.getHostName() + ",port :"+properties.getPort());
		return connectionFactory;
	}
}
