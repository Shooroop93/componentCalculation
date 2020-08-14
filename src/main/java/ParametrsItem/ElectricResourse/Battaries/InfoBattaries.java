package ParametrsItem.ElectricResourse.Battaries;

public class InfoBattaries {

    private int maxPowerOutputLarge = 100 ;
    private int largeHQM = 50;
    private int capacityLarge = 24000;

    private int maxPowerOutputMedium = 50 ;
    private int capacityMedium = 9000;
    private int mediumHQM = 25;

    private int maxPowerOutputSmall = 10 ;
    private int capacitySmall = 150;
    private int smallHQM = 10;


    public int getMaxPowerOutputLarge() {
        return maxPowerOutputLarge;
    }

    public int getMaxPowerOutputMedium() {
        return maxPowerOutputMedium;
    }

    public int getMaxPowerOutputSmall() {
        return maxPowerOutputSmall;
    }

    public int getCapacityLarge() {
        return capacityLarge;
    }

    public int getCapacityMedium() {
        return capacityMedium;
    }

    public int getCapacitySmall() {
        return capacitySmall;
    }

    public int getLargeHQM() {
        return largeHQM;
    }

    public int getMediumHQM() {
        return mediumHQM;
    }

    public int getSmallHQM() {
        return smallHQM;
    }
}
