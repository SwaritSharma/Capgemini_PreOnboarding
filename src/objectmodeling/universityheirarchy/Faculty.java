package objectmodeling.universityheirarchy;

public class Faculty {
    private String name;
    Faculty(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public void displayName()
    {
        System.out.println("Faculty Member: "+name);
    }
}
