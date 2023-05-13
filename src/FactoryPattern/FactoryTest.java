package FactoryPattern;

import org.junit.jupiter.api.Test;

class FactoryTest {

    @Test
    void GetFood_GivenCake_ReturnsCake() {
        //Arrange
        FoodFactory foodFactory = new FoodFactory();
        //Act
        Food food = foodFactory.getFood("cake");
        //Assert
        assert food.getClass().toString().equals("class FactoryPattern.Cake");
    }
    @Test
    void GetFood_GivenPizza_ReturnsPizza() {
        //Arrange
        FoodFactory foodFactory = new FoodFactory();
        //Act
        Food food = foodFactory.getFood("pizza");
        //Assert
        assert food.getClass().toString().equals("class FactoryPattern.Pizza");
    }
}