package Structural.Proxy.Boec;

public class Electronic{
    private int id;
    private String name;


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Electronic(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
