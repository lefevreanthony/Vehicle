public abstract class Vehicle {

    // attributs  
    private String brand;  
    private int kms;  

    // constructeurs  
    public Vehicle(String brand) {  
        this.brand = brand;  
        this.kms = 0;  
    }
  
    // accesseurs et mutateurs  
    public String getBrand() {  
        return this.brand;  
    }  

    public void setBrand(String brand) {  
        this.brand = brand;  
    }  

    public int getkms() {  
        return this.kms;  
    }  

    public void setkms(int kms) {
        this.kms = kms;
    }

    // methodes
    public abstract String DoStuff();
}
