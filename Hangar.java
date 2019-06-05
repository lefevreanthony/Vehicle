public class Hangar {

    public static void main(String[] args) {

        // la référence riri reçoit une nouvelle instance de la classe Duck
        Boat OffShore = new Boat("OffShore"); 
        // utilisation d'un setter    
        OffShore.setkms(84);
        // utilisation de getters      
        System.out.println("i'm " +  OffShore.getBrand() + " i moved for " + String.valueOf(OffShore.getkms() + " it sounds like " + OffShore.DoStuff()));

        Car Clio = new Car("Clio");
        Clio.setkms(165);
        System.out.println("my name is " + Clio.getBrand() + " i moved for " + String.valueOf(Clio.getkms()) + " it sounds like " + Clio.DoStuff());
        
       
    }
}

