package inheritance.single.smarthome;

public class Thermostat extends Device{
    private int temperatureSetting;

    Thermostat(int deviceId,String status,int temperatureSetting)
    {
        super(deviceId, status);
        this.temperatureSetting=temperatureSetting;
    }

    @Override
    public void deviceDetails() {
        super.deviceDetails();
        System.out.println("Device Temperature Setting: "+temperatureSetting);
    }
}
