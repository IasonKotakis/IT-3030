/*
 *  Template Developed by Sotirios Liaskos for the needs of
 *   ITEC3030 Systems Architecture.
 *  @ All Rights Reserved
 */
package itec3030.assignments.a2.ex3;

import itec3030.assignments.a2.ex2.NewTempSensorAdapter;
import newtemp.NewTempSensor.NewTempSensorDevice;


/**
 *
 * @author Sotirios
 */
public class Main {

    Main p = new Main();

    /**
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {



       OurFurnace n = new PlainGasF1();
       n = new Humidifier(n);
       n = new WiFi(n);
       n.turnOn();
    }
}
