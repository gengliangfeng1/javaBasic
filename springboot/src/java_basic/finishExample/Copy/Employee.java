package java_basic.finishExample.Copy;

class Employee implements Cloneable{
    String name;
    int id;

    Address address;
    public Employee(String name,int id, Address address){
        this.name=name;
        this.id=id;
        this.address=address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Perform a deep copy
        Employee cloned = (Employee) super.clone();
        cloned.address = (Address) address.clone(); // Deep copy the address
        return cloned;
    }
}