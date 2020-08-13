package CalculatingTheRequiredResourcesForItem.CeilingLight;

import Item.ElectricItem.ElectricalСonsumers.CeilingLight;

public interface CalculatorInterface {

    public static void main(String[] args) {

        CeilingLight ceilingLight = new CeilingLight(49);
        ceilingLight.infoCeilingLight();
        int allEnergy = ceilingLight.getConsumption();
        System.out.println(allEnergy);




    }


}
