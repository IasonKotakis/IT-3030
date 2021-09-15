/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itec3030.assignments.a2.ex2;

import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import newtemp.NewTempSensor.NewTempSensorDriver;

/**
 *
 * @author Hp
 */
public class NewTempSensorAdapter implements AbstractNewTempSensorAdapter, TemperatureSensor {

    private NewTempSensorDriver newTempSensorDriver;
    private String ID;
    private boolean enable;
    private boolean disable;
    ControllerInterface c;

    @Override
    public NewTempSensorDriver getAdatptee() {
        newTempSensorDriver = new NewTempSensorDriverImpl(ID);
        return newTempSensorDriver;
    }

    /**
     *
     * @param o2
     */
    @Override
    public void setID(String o2) {
        this.ID = o2;
    }

    /**
     *
     * @return
     */
    @Override
    public int getReading() {
        return Integer.parseInt(newTempSensorDriver.toString());
    }

    /**
     *
     * @param i
     */
    @Override
    public void newTemperature(int i) {
        newTempSensorDriver.newTemperature(i);
    }

    /**
     *
     * @return
     */
    @Override
    public ControllerInterface getController() {
        return c;
    }

    /**
     *
     * @param ci
     */
    @Override
    public void setController(ControllerInterface ci) {
        this.c = ci;
    }

    /**
     *
     * @return
     */
    @Override
    public String getID() {
        return ID;
    }

    /**
     *
     */
    @Override
    public void enable() {
        this.enable = true;
    }

    /**
     *
     */
    @Override
    public void disable() {
        this.disable = true;
        this.enable = false;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean enabled() {
        return enable;
    }

}
