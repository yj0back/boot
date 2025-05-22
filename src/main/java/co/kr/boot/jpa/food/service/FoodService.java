package co.kr.boot.jpa.food.service;

import co.kr.boot.jpa.food.entity.Food;
import co.kr.boot.jpa.food.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodService {
    private final FoodRepository foodRepository;

    @CachePut(cacheNames = "food", key = "#result.id")
    public Food createFood(String name, int price) {
        return foodRepository.save(Food.create(name, price));
    }
}
