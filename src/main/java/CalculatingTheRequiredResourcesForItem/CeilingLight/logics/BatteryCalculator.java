package CalculatingTheRequiredResourcesForItem.CeilingLight.logics;

import Item.ElectricItem.Batteries.LargeRechargableBattery;
import Item.ElectricItem.Batteries.MediumRechargableBattery;
import Item.ElectricItem.Batteries.SmallRechargableBattery;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class BatteryCalculator {

    private int ceilingEnergy;

    private final int maxLargeRechargableBattery = 98;
    private final int maxMediumRechargableBattery = 48;
    private final int SmallRechargableBattery = 23;

    private int countLargeRechargableBattery = 0;
    private int countMediumRechargableBattery = 0;
    private int countSmallRechargableBattery = 0;

    private int countAllBattery = 0 ;

    public void infoBatteryCalculator() {


        if (getCeilingEnergy() <= 0) {
            System.out.println("Введите коректное число");
        } else if (getCeilingEnergy() > 0 && getCeilingEnergy() <= 23) {
            countSmallRechargableBattery = 1;
            System.out.println(countSmallRechargableBattery + " маленький аккумулятор");

        } else if (getCeilingEnergy() > 23 && getCeilingEnergy() <= 48) {
            countMediumRechargableBattery = 1;
            System.out.println(countMediumRechargableBattery + " средний аккумулятор");

        } else if (getCeilingEnergy() > 49 && getCeilingEnergy() <= 98) {
            countLargeRechargableBattery = 1;
            System.out.println(countLargeRechargableBattery + " большой аккумулятор");

        } else if (getCeilingEnergy() > 0 && getCeilingEnergy() > 98) {

            double countBigBoxR = getCeilingEnergy() / maxLargeRechargableBattery;
            double n2 = getCeilingEnergy() - (maxLargeRechargableBattery * countBigBoxR);
            double resultCountBigBox = countBigBoxR;
            int countMediumBoxR = (int) (n2 / maxMediumRechargableBattery);
            int resultCountMediumBox = (int) Math.ceil(countMediumBoxR);
            double n3 = (n2 - (maxMediumRechargableBattery * countMediumBoxR));
            double countSmallBoxR = (n3 / SmallRechargableBattery);
            int resultCountSmallBox = (int) Math.ceil(countSmallBoxR);
            countLargeRechargableBattery = (int) countBigBoxR;
            countMediumRechargableBattery = (int) resultCountMediumBox;
            countSmallRechargableBattery = (int) resultCountSmallBox;

            if (countSmallRechargableBattery % 2 == 0) {
                countMediumRechargableBattery = countMediumRechargableBattery + (countSmallRechargableBattery / 2);
                countSmallRechargableBattery = 0;
            }

            if (countMediumRechargableBattery % 2 == 0) {
                countLargeRechargableBattery = countLargeRechargableBattery + (countMediumRechargableBattery / 2);
                countMediumRechargableBattery = 0;
            }

            countAllBattery = countLargeRechargableBattery + countMediumRechargableBattery + countSmallRechargableBattery;


            System.out.println(countLargeRechargableBattery + " больших аккумуляторов");
            System.out.println(countMediumRechargableBattery + " средних аккумуляторов");
            System.out.println(countSmallRechargableBattery + " маленьких аккумуляторов");
        }

    }



    public BatteryCalculator(int ceilingEnergy) {
        this.ceilingEnergy = ceilingEnergy;
    }

    public int getCeilingEnergy() {
        return ceilingEnergy;
    }

    public void setCeilingEnergy(int ceilingEnergy) {
        this.ceilingEnergy = ceilingEnergy;
    }

    public int getMaxLargeRechargableBattery() {
        return maxLargeRechargableBattery;
    }

    public int getMaxMediumRechargableBattery() {
        return maxMediumRechargableBattery;
    }

    public int getSmallRechargableBattery() {
        return SmallRechargableBattery;
    }

    public int getCountLargeRechargableBattery() {
        return countLargeRechargableBattery;
    }

    public void setCountLargeRechargableBattery(int countLargeRechargableBattery) {
        this.countLargeRechargableBattery = countLargeRechargableBattery;
    }

    public int getCountMediumRechargableBattery() {
        return countMediumRechargableBattery;
    }

    public void setCountMediumRechargableBattery(int countMediumRechargableBattery) {
        this.countMediumRechargableBattery = countMediumRechargableBattery;
    }

    public int getCountSmallRechargableBattery() {
        return countSmallRechargableBattery;
    }

    public void setCountSmallRechargableBattery(int countSmallRechargableBattery) {
        this.countSmallRechargableBattery = countSmallRechargableBattery;
    }

    public int getCountAllBattery() {
        return countAllBattery;
    }

    public void setCountAllBattery(int countAllBattery) {
        this.countAllBattery = countAllBattery;
    }
}
