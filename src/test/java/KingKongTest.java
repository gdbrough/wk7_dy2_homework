import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KingKongTest {

    private KingKong kingKong;
    private Tank tank;

    @Before
    public void setUp() {
        kingKong = new KingKong("King Kong", 15, 5);
        tank = new Tank("Tanky McTankFace", 35, 6);
    }

    @Test
    public void testCanGetName(){
        assertEquals("King Kong", kingKong.getName());
    }

    @Test
    public void testCanGetHealthValue() {
        assertEquals(15, kingKong.getHealthValue());
    }

    @Test
    public void testCanGetAttackValue() {
        assertEquals(5, kingKong.getAttackValue());
    }

    @Test
    public void testCanAttackArmy() {
        assertEquals(5, kingKong.attackArmy());
    }

    @Test
    public void testHealthValueIsReducedAfterArmyAttach(){
        assertEquals(9, kingKong.incomingAttack(tank));
    }
}
