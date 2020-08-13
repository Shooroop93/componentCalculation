package Item.ElectricItem.Switch;

import InterfaceItem.ElectricInterface.ElectricalInterface.ConsumptionCostTT;
import ParametrsItem.ElectricResourse.Electrica.InfoElectrician;

public class SmartSwitch extends InfoElectrician implements ConsumptionCostTT {

        private int count;
        private int costCraftHQM;
        private int costCraftTT;
        private int consumption ;

        public void infoSmartSwitch() {
            costCraftItem();
            consumptionEnergyItem();
            costCraftTTItem();

            if (count <=0) {
                System.out.println("Не верное число для подсчета");
            } else if(count == 1 && costCraftHQM == 1 ) {
                System.out.println("Стоимость крафта " + count + " умного переключателя , составляет : " + costCraftHQM + " металл высокого качества, " +
                        costCraftTT + " старых микросхем");
            } else if(count == 1 ) {
                System.out.println("Стоимость крафта " + count + " умного переключателя , составляет : " + costCraftHQM + " металла высокого качества, " +
                        costCraftTT + " старая микросхема");
            }else if (count >= 1) {
                System.out.println("Стоимость крафта " + count +  " умных переключателей , составляет : " + costCraftHQM + " металла высокого качества, " +
                        costCraftTT + " старые микросхемы");
            }

            if (count <=0) {
                System.out.println("Не верное число для подсчета");
            } else if(count == 1 && consumption == 1 ) {
                System.out.println("Потребление энергии " + count + " умного переключателя, составляет : " + consumption + " энергия");
            } else if(count == 1 ) {
                System.out.println("Потребление энергии " + count + " умного переключателя, составляет : " + consumption + " энергии");
            } else if (count >= 1) {
                System.out.println("Потребление энергии " + count + " умных переключателей, составляет : " + consumption+ " энергии");
            }
        }

        @Override
        public int costCraftTTItem() {
        return costCraftTT = count * getSmartSwitchTT();
    }

        @Override
        public int consumptionEnergyItem() {
            return consumption = count * getSwitchEnergy();
        }

        @Override
        public int costCraftItem() {
            return costCraftHQM = count * getSmartSwitchHQM();
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

    public int getCostCraftTT() {
        return costCraftTT;
    }

    public void setCostCraftTT(int costCraftTT) {
        this.costCraftTT = costCraftTT;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public SmartSwitch(int count) {
        this.count = count;
    }
    public void assembly (){
        costCraftItem();
        consumptionEnergyItem();
        costCraftTTItem();
    }
}
