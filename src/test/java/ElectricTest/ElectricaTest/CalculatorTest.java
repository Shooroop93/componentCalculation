package ElectricTest.ElectricaTest;

import Item.ElectricItem.Switch.Button;
import Item.ElectricItem.ElectricalСonsumers.CeilingLight;
import Item.ElectricItem.Switch.SmartSwitch;
import Item.ElectricItem.Switch.Switch;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public static void main(String[] args) {
        CeilingLight ceilingLight = new CeilingLight(333
        );
        ceilingLight.infoCeilingLight();
    }


}
class SwitchTest {
    public static void main(String[]args){
        Switch aswitch = new Switch(3);
        aswitch.infoSwitch();

}
}

class ButtonTest {
    @Test
    public static void main(String[] args) {
        Button button = new Button (6);
        button.infoButton();

    }
}

class SmartSwitchTest{
    @Test
    public static void main(String[] args) {
        SmartSwitch smartSwitch = new SmartSwitch(1);
        smartSwitch.infoSmartSwitch();
    }
}


