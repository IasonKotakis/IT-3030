package itec3030.assignments.a1;
import itec3030.assignments.a1.sensors.thermoset.ThermoSetX19FrontEnd.FrontEnd;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.Thermostat;
public class ThermosetX19 implements Thermostat {
 private int temrature;
 private ControllerInterface controlthermostat;
 public ThermosetX19(){
 FrontEnd f=new FrontEnd(this);
 f.pack();
 f.setVisible(true);

 }
 @Override
 public void newTemperature(int t) {
 this.temrature=t;
 }
 @Override
 public ControllerInterface getController() {
 return this.controlthermostat;
 }
 @Override
 public void setController(ControllerInterface controllerInterface) {
 this.controlthermostat=controllerInterface;
 }
 @Override
 public String getID() {
 return null;
 }
 @Override
 public void setID(String s) {
 }
 @Override
 public void enable() {
 }
 @Override
 public void disable() {
 }
 @Override
 public boolean enabled() {
 return false;
 }
 @Override
 public int getReading() {
 return temrature;
 }
}