/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itec3030.assignments.a2.ex2;

import newtemp.NewTempSensor.Observer;

/**
 *
 * @author Hp
 */
public class TempSensorDevice implements Observer {

    private int Temp;

    /**
     *
     * @param p0
     */
    @Override
    public void update(int p0) {
        this.Temp = p0;
    }

    @Override
    public String toString() {
        return this.Temp + "";
    }

}
