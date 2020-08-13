package Item.ElectricItem.Generators;

import InterfaceItem.ElectricInterface.GeneratorsInterface.GeneratorsCostFive;
import ParametrsItem.ElectricResourse.Generators.InfoGenerators;

public class WindTurbine extends InfoGenerators implements GeneratorsCostFive {

    private int count;
    private int costCraftHQM;
    private int costCraftGears;
    private int costCraftSheetMetal;
    private int costCraftWood;
    private int allEnergyGenerator;

    public void infoWindTurbine () {

        costCraftItemHQM();
        costCraftItemWood();
        costCraftItemGears();
        costCraftItemSheetMetal();
        additionOfOutputEnergy();

        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        } else if(count == 1 && costCraftHQM == 1 && costCraftGears == 1 && costCraftSheetMetal == 1 && costCraftWood ==1 ) {
            System.out.println("Стоимость крафта " + count + " ветрогенератора , составляет : " + costCraftHQM + " металл высокого качества, " +
        costCraftWood +" дерево, " + costCraftGears + " шестеренка, " + costCraftSheetMetal + " листовой металл");
        } else if(count == 1 ) {
            System.out.println("Стоимость крафта " + count + " ветрогенератора , составляет : " + costCraftHQM + " металла высокого качества, " +
                    costCraftWood +" дерева, " + costCraftGears + " шестеренки, " + costCraftSheetMetal + " листового металла");
        }else if (count >= 4) {
            System.out.println("Стоимость крафта " + count + " ветрогенераторов , составляет : " + costCraftHQM + " металла высокого качества, " +
                    costCraftWood +" дерева, " + costCraftGears + " шестеренки, " + costCraftSheetMetal + " листового металла");
        }

        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        } else if(count >= 1  ) {
            System.out.println("Общее количество выдаваемой ветрогенератором энергии, с учетом постройки на максимальной высоте, составляет: " + allEnergyGenerator);
        }



    }

    @Override
    public int additionOfOutputEnergy() {
        return allEnergyGenerator = count * getMaxWindTurbineGeneratesEnergy();
    }

    @Override
    public int costCraftItemHQM() {
        return costCraftHQM = count * getWindTurbineHQM();
    }

    @Override
    public int costCraftItemGears() {
        return costCraftGears = count * getWindTurbineGears();
    }

    @Override
    public int costCraftItemWood() {
        return costCraftWood = count * getWindTurbineWood();
    }

    @Override
    public int costCraftItemSheetMetal() {
        return  costCraftSheetMetal = count * getWintTurbineSheetMetal();
    }

    public WindTurbine(int count) {
        this.count = count;
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

    public int getCostCraftSheetMetal() {
        return costCraftSheetMetal;
    }

    public void setCostCraftSheetMetal(int costCraftSheetMetal) {
        this.costCraftSheetMetal = costCraftSheetMetal;
    }

    public void assembly () {
        costCraftItemHQM();
        costCraftItemWood();
        costCraftItemGears();
        costCraftItemSheetMetal();
        additionOfOutputEnergy();
    }
}
