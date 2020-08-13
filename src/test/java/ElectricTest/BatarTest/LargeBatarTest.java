package ElectricTest.BatarTest;

import Item.ElectricItem.Batteries.LargeRechargableBattery;
import Item.ElectricItem.Batteries.MediumRechargableBattery;
import Item.ElectricItem.Batteries.SmallRechargableBattery;
import org.junit.Test;

public class LargeBatarTest {

    @Test
    public static void main(String[] args) {

        LargeRechargableBattery largeRechargableBattery = new LargeRechargableBattery(6);
        largeRechargableBattery.infoLargeBattary();
    }
}

class MediumBatarTest {

    @Test
    public static void main(String[] args) {
        MediumRechargableBattery mediumRechargableBattery = new MediumRechargableBattery(7);
        mediumRechargableBattery.infoMediumBattary();
    }
}

class SmallBatarTest {
    public static void main(String[] args) {
        SmallRechargableBattery smallRechargableBattery = new SmallRechargableBattery(3);
        smallRechargableBattery.infoSmallBattary();
    }
}
