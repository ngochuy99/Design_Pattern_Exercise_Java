package Creational.Prototype;

public abstract class Shape implements Cloneable{
    private String id;
    protected String type;
    abstract void draw();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object clone;
        clone = super.clone();
        return clone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
