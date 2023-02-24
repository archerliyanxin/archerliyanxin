package org.lyx.model;

public abstract class Pizza {
    private String name;
    private int id;
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
