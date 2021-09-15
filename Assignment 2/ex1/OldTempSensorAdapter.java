/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itec3030.assignments.a2.ex1;

import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import oldtempinc.drivers.OldTempSensor;

public class OldTempSensorAdapter implements TemperatureSensor {

    OldTempSensor oldTempSensor;
    ControllerInterface ci;
    private String ID;
    private boolean enable;
    private boolean disable;

    public OldTempSensorAdapter() {
        oldTempSensor = new OldTempSensor();
    }

    @Override
    public void newTemperature(int i) {
        oldTempSensor.newTemperature(i);
    }

    @Override
    public ControllerInterface getController() {
        return this.ci;
    }

    @Override
    public void setController(ControllerInterface ci) {
        this.ci = ci;
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public void setID(String string) {
        this.ID = string;
    }

    @Override
    public void enable() {
        this.enable = true;
    }

    @Override
    public void disable() {
        this.disable = true;
        this.enable = false;
    }

    @Override
    public boolean enabled() {
        return true;
    }

    @Override
    public int getReading() {
        return (int) oldTempSensor.getTemperature();
    }

}
