package rpg_lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AxeTest {

    @Test
    public void weaponsAttacksLosesDurability() {

        //Arrange
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(10, 10);

        //Act
        axe.attack(dummy);

        //Assert

        Assertions.assertEquals(9, axe.getDurabilityPoints());

    }

    @Test
    public void testIfBrokenWeaponCanAttack() {

        Assertions.assertThrows(IllegalStateException.class, () -> {
            Axe axe = new Axe(10, 1);
            Dummy dummy = new Dummy(10, 10);

            axe.attack(dummy);
            axe.attack(dummy);
        });
    }

}
