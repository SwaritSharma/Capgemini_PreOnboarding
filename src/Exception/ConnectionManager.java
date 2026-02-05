package Exception;

public class ConnectionManager {

    public void useConnection() {
        FakeConnection conn = new FakeConnection();
        try {
            conn.open();
            throw new RuntimeException("Something went wrong");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            conn.close(); // guaranteed cleanup
        }
    }
}