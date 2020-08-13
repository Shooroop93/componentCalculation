package Item.ElectricItem.Generators;

import InterfaceItem.ElectricInterface.GeneratorsInterface.GeneratorsCostThree;
import InterfaceItem.ElectricInterface.GeneratorsInterface.GeneratorsCostTwo;
import ParametrsItem.ElectricResourse.Generators.InfoGenerators;

public class SmallGenerator extends InfoGenerators implements GeneratorsCostThree {

    private int count;
    private int costCraftHQM;
    private int costCraftGears;
    private int allEnergyGenerator;

    public void infoSmallGenerator () {

        costCraftItemHQM();
        additionOfOutputEnergy();
        costCraftItemGears();

        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        }  else if(count == 1 ) {
            System.out.println("Стоимость крафта " + count + " малого генератора , составляет : " + costCraftHQM + " металла высокого качества, "
                    + costCraftGears + " шестеренки");
        }else if (count >= 2) {
            System.out.println("Стоимость крафта " + count + " малых генераторов , составляет : " + costCraftHQM + " металла высокого качества, "
                    + costCraftGears + " шестеренки");
        }

        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        } else if(count >= 1  ) {
            System.out.println("Общее количество выдаваемой малым генератором энергии, при условии , что он включен, составляет: " + allEnergyGenerator);
        }

    }

    @Override
    public int costCraftItemHQM() {
        return costCraftHQM = count * getSmallGeneratorHQM();
    }

    @Override
    public int costCraftItemGears() {
        return costCraftGears = count * getSmallGeneratorGears();
    }
    @Override
    public int additionOfOutputEnergy() {
        return allEnergyGenerator = count * getMaxSmallGeneratorGeneratesEnergy();
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

    public int getCostCraftGears() {
        return costCraftGears;
    }

    public void setCostCraftGears(int costCraftGears) {
        this.costCraftGears = costCraftGears;
    }

    public int getAllEnergyGenerator() {
        return allEnergyGenerator;
    }

    public void setAllEnergyGenerator(int allEnergyGenerator) {
        this.allEnergyGenerator = allEnergyGenerator;
    }

    public SmallGenerator(int count) {
        this.count = count;
    }

    public void assembly () {
        costCraftItemHQM();
        additionOfOutputEnergy();
        costCraftItemGears();
    }
}
