package Item.ElectricItem.Generators;

import InterfaceItem.ElectricInterface.GeneratorsInterface.GeneratorsCostTwo;
import ParametrsItem.ElectricResourse.Generators.InfoGenerators;

public class LargeSolarPanel extends InfoGenerators implements GeneratorsCostTwo {

    private int count;
    private int costCraftHQM;
    private int allEnergyGenerator;

    public void infoLargeSolarPanel () {

        costCraftItemHQM();
        additionOfOutputEnergy();

        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        }  else if(count == 1 ) {
            System.out.println("Стоимость крафта " + count + " большой солнечной панели , составляет : " + costCraftHQM + " металла высокого качества");
        }else if (count >= 2) {
            System.out.println("Стоимость крафта " + count + " больших солнечных панелей , составляет : " + costCraftHQM + " металла высокого качества");
        }

        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        } else if(count >= 1  ) {
            System.out.println("Общее количество выдаваемой большой солнечной панелью энергии, с учетом правильной установки и наличие солнца, составляет: " + allEnergyGenerator);
        }

    }

    @Override
    public int costCraftItemHQM() {
        return costCraftHQM = count * getLargeSolarHQM();
    }

    @Override
    public int additionOfOutputEnergy() {
        return allEnergyGenerator = count * getMaxLargeSolarPanelGeneratesEnergy();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCostCraftHQM() {
        return costCraftHQM;
    }

    public void setCostCraftHQM(int costCraftHQM) {
        this.costCraftHQM = costCraftHQM;
    }

    public int getAllEnergyGenerator() {
        return allEnergyGenerator;
    }

    public void setAllEnergyGenerator(int allEnergyGenerator) {
        this.allEnergyGenerator = allEnergyGenerator;
    }

    public LargeSolarPanel(int count) {
        this.count = count;
    }

    public void assembly () {
        costCraftItemHQM();
        additionOfOutputEnergy();}
}
