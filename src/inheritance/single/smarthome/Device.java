package inheritance.single.smarthome;

public class Device {
    protected int deviceId;
    protected String status;

    public Device(int deviceId,String status)
    {
        this.deviceId=deviceId;
        this.status=status;
    }

    public void deviceDetails()
    {
        System.out.println("Device Id: "+deviceId);
        System.out.println("Device Status: "+status);
    }
}
