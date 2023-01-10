package ru.sbrf.gitcommit.week2;

public class RealtyObject {
    protected String name = new String();
    protected String address = new String();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "RealtyObject{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
