package rpg_lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DummyTest {

        @Test
    public void dummyLoosesHealthPointsIfAttacked (){

            Dummy dummy = new Dummy(10, 10);

            dummy.takeAttack(5);

            Assertions.assertEquals(5, dummy.getHealth());

    }
    @Test
    public void deadDummyThrowsAnExceptionIfAttacked() {

            Assertions.assertThrows(IllegalStateException.class, () -> {
                Dummy dummy = new Dummy(0, 10);
                dummy.isDead();

                dummy.takeAttack(10);
            });
    }

    @Test
    public void testIfDeadDummyCanGiveXP(){
            Dummy dummy = new Dummy(0, 15);
            dummy.isDead();

            Assertions.assertEquals(15, dummy.giveExperience());
    }

    @Test
    public void testIfAliveDummyCannotGiveXP() {

            Assertions.assertThrows(IllegalStateException.class, () -> {

                Dummy dummy = new Dummy(5, 15);
                dummy.giveExperience();

            });
    }



}
