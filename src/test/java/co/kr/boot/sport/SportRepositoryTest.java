package co.kr.boot.sport;

import co.kr.boot.jpa.food.entity.Food;
import co.kr.boot.jpa.food.service.FoodService;
import co.kr.boot.jpa.sport.entity.Sport;
import co.kr.boot.jpa.sport.repository.SportRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SportRepositoryTest {

    @Autowired
    SportRepository sportRepository;

    @Test
    @DisplayName("redisBasicTest")
    void redisBasicTest() {
        Sport soccer = Sport.builder().id(1L).name("Soccer").build();
        sportRepository.save(soccer);
        log.info("Sport 저장");

        Sport found = sportRepository.findById(1L).get();
        log.info("Soccer 찾기");

        assertEquals(found.getId(), 1L);
        assertEquals(found.getName(), "Soccer");

    }

    @Autowired
    FoodService foodService;

    @Test
    @DisplayName("cachedFoodTest")
    public void cachedFoodTest() {
        Food hamburger = foodService.createFood("Hamburger", 1000);
    }
}
