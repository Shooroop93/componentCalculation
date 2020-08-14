package CalculatingTheRequiredResourcesForItem.CeilingLight;


import CalculatingTheRequiredResourcesForItem.CeilingLight.logics.BatteryCalculator;
import Item.ElectricItem.ElectricalСonsumers.CeilingLight;
import Item.ElectricItem.Switch.Switch;

public class CalculatorCeilingLight {

    public static void main(String[] args) {

        CeilingLight ceilingLight = new CeilingLight(550);
        ceilingLight.infoCeilingLight();

        BatteryCalculator batteryCalculator = new BatteryCalculator(ceilingLight.getConsumption());
        System.out.println("Для подключения  " + ceilingLight.getCount() +" электрических ламп, вам потребуется :");
        batteryCalculator.infoBatteryCalculator();

        Switch aSwitch = new Switch(batteryCalculator.getCountAllBattery());


        if (batteryCalculator.getCountAllBattery() == 1) {
            System.out.println("1 умный переключатель или 1 переключатель или 1 кнопка");
        } else if (batteryCalculator.getCountAllBattery() > 1) {
            System.out.println(batteryCalculator.getCountAllBattery() + " переключателей или " + batteryCalculator.getCountAllBattery() + " умных переключателей " +
                    batteryCalculator.getCountAllBattery() + " кнопок");
        }







    }

}
