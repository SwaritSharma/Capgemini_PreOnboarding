package gen_assignment.smart_warehouse;

public abstract class WareHouseItem {
    private final String name;

    public WareHouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
