package Creational.Prototype.Boec;

public abstract class Item implements Cloneable{
    private int id;
    protected String type;
    abstract void create();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone;
        clone = super.clone();
        return clone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
