package co.kr.boot.jpa.sport.entity;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.redis.core.RedisHash;

@Getter
@Builder
@RedisHash(value = "sport", timeToLive = 300)
public class Sport {

    @Id
    public Long id;
    public String name;
}
