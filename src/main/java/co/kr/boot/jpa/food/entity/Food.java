package co.kr.boot.jpa.food.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter private String name;
    @Setter private int price;

    public static Food create(String name, int price) {
        Food food = new Food();
        food.setName(name);
        food.setPrice(price);
        return food;
    }
}
