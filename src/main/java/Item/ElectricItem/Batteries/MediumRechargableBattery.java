package Item.ElectricItem.Batteries;

import InterfaceItem.ElectricInterface.BatteryInterface.BattareyConsumption;
import ParametrsItem.ElectricResourse.Battaries.InfoBattaries;

public class MediumRechargableBattery extends InfoBattaries implements BattareyConsumption {

    private int count ;
    private int costCraftHQM;

    public void infoMediumBattary () {
        costCraftItem();

        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        } else if(count == 1 && costCraftHQM == 1 ) {
            System.out.println("Стоимость крафта " + count + " среднего аккумулятора , составляет : " + costCraftHQM + " металл высокого качества, ");
        } else if(count == 1 ) {
            System.out.println("Стоимость крафта " + count + " среднего аккумулятора , составляет : " + costCraftHQM + " металла высокого качества, ");
        }else if (count >= 1) {
            System.out.println("Стоимость крафта " + count +  " средних аккумуляторов , составляет : " + costCraftHQM + " металла высокого качества, ");
        }
    }

    @Override
    public int costCraftItem() {
        return costCraftHQM = count * getMediumHQM();
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

    public MediumRechargableBattery(int count) {
        this.count = count;
    }

    public void assembly () {
        costCraftItem();
    }
}

