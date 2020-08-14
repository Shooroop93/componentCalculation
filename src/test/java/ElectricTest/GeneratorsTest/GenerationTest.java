package ElectricTest.GeneratorsTest;

import Item.ElectricItem.Generators.LargeSolarPanel;
import Item.ElectricItem.Generators.SmallGenerator;
import Item.ElectricItem.Generators.WindTurbine;
import com.sun.xml.internal.ws.developer.UsesJAXBContext;
import org.junit.Test;

public class GenerationTest {

}

class WindTurbineTest  {
    @Test
    public static void main(String[] args) {
        WindTurbine windTurbine = new WindTurbine(4);
        windTurbine.infoWindTurbine();

    }
}

class LargeSolarPanelTest {
    @Test
    public static void main(String[] args) {
        LargeSolarPanel largeSolarPanel = new LargeSolarPanel(156);
        largeSolarPanel.infoLargeSolarPanel();
    }
        }

        class SmallGeneratorTest{
    @Test
    public static void main(String[] args) {
        SmallGenerator smallGenerator = new SmallGenerator(2);
        smallGenerator.infoSmallGenerator();
    }
        }
