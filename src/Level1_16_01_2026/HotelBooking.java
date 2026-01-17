package Level1_16_01_2026;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    HotelBooking()
    {
        this.guestName="John Doe";
        this.roomType="Regular";
        this.nights=2;
    }
    HotelBooking(String guestName,String roomType,int nights)
    {
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    HotelBooking(HotelBooking room)
    {
        this.guestName=room.guestName;
        this.roomType=room.roomType;
        this.nights=room.nights;
    }
}
