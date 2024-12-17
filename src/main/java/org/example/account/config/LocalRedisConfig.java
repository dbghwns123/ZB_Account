package org.example.account.config;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import redis.embedded.RedisExecProvider;
import redis.embedded.RedisServer;
import redis.embedded.util.OS;

import java.io.IOException;

@Configuration
public class LocalRedisConfig {

//    @Value("${spring.data.redis.port}")
    @Value("${spring.data.redis.port}")
    private int redisPort;

    private RedisServer redisServer;

    @PostConstruct
    public void startRedis() throws IOException {
        // ARM용 Redis 바이너리 경로 명시
        RedisExecProvider customProvider = RedisExecProvider.defaultProvider()
                .override(OS.MAC_OS_X, "/opt/homebrew/bin/redis-server");

        // Redis 서버 설정
        redisServer = RedisServer.builder()
                .port(redisPort)
                .redisExecProvider(customProvider) // ARM 바이너리 경로 사용
                .build();

        redisServer.start();
    }

    @PreDestroy
    public void stopRedis() {
        if (redisServer != null) {
            redisServer.stop();
        }
    }
}

//@Configuration
//public class LocalRedisConfig {
//    @Value("${spring.redis.port}")
//    private int redisPort;
//    private RedisServer redisServer;

//    @PostConstruct
//    public void startRedis() {
//        redisServer = new RedisServer(redisPort);
//        redisServer.start();
//    }

//    @PreDestroy
//    public void stopRedis() {
//        if (redisServer != null) {
//            redisServer.stop();
//        }
//    }
//}
