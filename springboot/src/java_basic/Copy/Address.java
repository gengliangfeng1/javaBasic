package java_basic.Copy;


class Address implements Cloneable{
    String streetName;
    int streetId;
    public Address(String streetName,int streetId){
        this.streetName=streetName;
        this.streetId=streetId;
    }

    public void setStreetId(int streetId) {
        this.streetId = streetId;
    }


    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}