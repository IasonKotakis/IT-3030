/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itec3030.assignments.a2.ex2;

import newtemp.NewTempSensor.NewTempSensorDriver;

/**
 *
 * @author Hp
 */
public class NewTempSensorDriverImpl extends NewTempSensorDriver {

    private String ID;
    private int lastTemp;

    /**
     *
     * @param ID
     */
    public NewTempSensorDriverImpl(String ID) {
        setID(ID);
    }

    /**
     *
     * @param newTemp
     */
    @Override
    public void newTemperature(final int newTemp) {
        TempSensorDevice temp = new TempSensorDevice();
        temp.update(newTemp);
        super.registerObserver(temp);
        super.notifyObservers(newTemp);
        super.removeObserver(temp);
        lastTemp = newTemp;
        System.out.println("Sensor (" + ID + ") receiving new Temperature :" + lastTemp);
    }

    /**
     *
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return lastTemp + "";
    }

}
