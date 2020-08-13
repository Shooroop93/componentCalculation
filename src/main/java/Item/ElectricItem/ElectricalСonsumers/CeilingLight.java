package Item.ElectricItem.ElectricalСonsumers;

import InterfaceItem.ElectricInterface.ElectricalInterface.ConsumptionCost;
import ParametrsItem.ElectricResourse.Electrica.InfoElectrician;

public class CeilingLight extends InfoElectrician implements ConsumptionCost {

private int count;
private int costCraftHQM;
private int consumption ;
private  boolean runLight;

    @Override
    public int consumptionEnergyItem() {
        return consumption = count * getCeilingLightEnergy();
    }

    @Override
    public int costCraftItem() {
        return costCraftHQM = count * getCeilingLightMetal();
    }

    public void infoCeilingLight () {
        costCraftItem();
        consumptionEnergyItem();
        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        } else if(count == 1 && costCraftHQM == 1 ) {
            System.out.println("Стоимость крафта " + count + " электрической лампы , составляет : " + costCraftHQM + " металл");
        } else if(count == 1 ) {
            System.out.println("Стоимость крафта " + count + " электрической лампы , составляет : " + costCraftHQM + " металла");
        }else if (count >= 1) {
            System.out.println("Стоимость крафта " + count +  " электрических ламп , составляет : " + costCraftHQM + " металла");
        }

        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        } else if(count == 1 && consumption == 1 ) {
            System.out.println("Потребление энергии " + count + " электрической лампы, составляет : " + consumption + " энергия");
        } else if(count == 1 ) {
            System.out.println("Потребление энергии " + count + " электрической лампы, составляет : " + consumption + " энергии");
        } else if (count >= 1) {
            System.out.println("Потребление энергии " + count + " электрических ламп, составляет : " + consumption+ " энергии");
        }


    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public CeilingLight(int count) {
        this.count = count;
    }

    public int getCostCraftHQM() {
        return costCraftHQM;
    }

    public void setCostCraftHQM(int costCraftHQM) {
        this.costCraftHQM = costCraftHQM;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public CeilingLight(int count, boolean runLight) {
        this.count = count;
        this.runLight = runLight;
    }
}
