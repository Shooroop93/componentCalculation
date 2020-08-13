package CalculatingTheRequiredResourcesForItem.CeilingLight;

import Item.ElectricItem.ElectricalСonsumers.CeilingLight;
import Item.ElectricItem.Switch.Button;
import Item.ElectricItem.Switch.SmartSwitch;
import Item.ElectricItem.Switch.Switch;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CalculatorCeilingLight {

   public static void main(String[] args) {
        int calculatorLight = 6666;
        int calclutorButton;


        CeilingLight ceilingLight = new CeilingLight(calculatorLight, true);
        ceilingLight.infoCeilingLight();

       int calculatorEnergy = ceilingLight.getConsumption();

       int a = calculatorEnergy % 100;

       System.out.println(a);

       //Записывает количество Switch для подключения

       int quantitySwitch = 0;

       if (calculatorEnergy <= 0 ) {
           System.out.println("Не верное число для подсчета");
       } else if (calculatorEnergy >= 1 && calculatorEnergy <= 98 ) {
           quantitySwitch = 1;
       } else if (calculatorEnergy > 98 && calculatorEnergy <= 196 ) {
           quantitySwitch = 2;
       } else if (calculatorEnergy >196) {
           System.out.println("В клановый дом, столько лампочек не требуется");
           System.out.println("Введите значение ближе к реальности");
           System.exit(0);
       }


       //Ввыводит на экран, какое количество элетроники требуется для подключения n ламп

        if(calculatorLight == 1 ) {
            System.out.println("Для подключения " + calculatorLight + " лампы, потребуется : " + new Button(quantitySwitch).getCount() + " кнопка или " + new Switch(quantitySwitch).getCount()
                    + " переключатель или " + new SmartSwitch(quantitySwitch).getCount() + " умный переключатель" );
        } else if (calculatorLight >= 1) {
            System.out.println("Для подключения " + calculatorLight + " ламп, потребуется : " + new Button(quantitySwitch).getCount() + " кнопки или " + new Switch(quantitySwitch).getCount()
                    + " переключателя или " + new SmartSwitch(quantitySwitch).getCount() + " умных переключателя" );
        }


    }



}
