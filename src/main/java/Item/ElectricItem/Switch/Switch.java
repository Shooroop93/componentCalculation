package Item.ElectricItem.Switch;


import InterfaceItem.ElectricInterface.ElectricalInterface.ConsumptionCost;
import ParametrsItem.ElectricResourse.Electrica.InfoElectrician;

public class Switch extends InfoElectrician implements ConsumptionCost {


    private int count;
    private int costCraftHQM;
    private int consumption ;

    public void infoSwitch () {
        costCraftItem();
        consumptionEnergyItem();
        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        } else if(count == 1 && costCraftHQM == 1 ) {
            System.out.println("Стоимость крафта " + count + " переключателя , составляет : " + costCraftHQM + " металл высокого качества" );
        } else if(count == 1 ) {
            System.out.println("Стоимость крафта " + count + " переключателя , составляет : " + costCraftHQM + " металла высокого качества" );
        }else if (count >= 1) {
            System.out.println("Стоимость крафта " + count +  " переключателей , составляет : " + costCraftHQM + " металла высокого качества");
        }

        if (count <=0) {
            System.out.println("Не верное число для подсчета");
        } else if(count == 1 && consumption == 1 ) {
            System.out.println("Потребление энергии " + count + " переключателя, составляет : " + consumption + " энергия");
        } else if(count == 1 ) {
            System.out.println("Потребление энергии " + count + " переключателя, составляет : " + consumption + " энергии");
        } else if (count >= 1) {
            System.out.println("Потребление энергии " + count + " переключателей, составляет : " + consumption+ " энергии");
        }
    }

    @Override
    public int consumptionEnergyItem() {
        return consumption = count * getSwitchEnergy();
    }

    @Override
    public int costCraftItem() {
        return costCraftHQM = count * getSwitchHQM();
    }

    public Switch(int count) {
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

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void assembly () {
        costCraftItem();
        consumptionEnergyItem();
    }
    }
