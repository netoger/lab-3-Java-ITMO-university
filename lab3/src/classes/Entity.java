package classes;

public abstract class Entity {
    // абстрактный класс для объектов (не живых)
    protected String name;
    protected String property;
    public abstract void setProperty(String property);
    public abstract String getProperty();

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
