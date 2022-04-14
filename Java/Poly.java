
class Plane {
    void takeoff() {
        System.out.println("normal plane take off");
    }

    void fly() {
        System.out.println("normal plane fly");
    }

    void land() {
        System.out.println("normal plane land");
    }
}

class PassengerPlane extends Plane {


    void carryPassenger() {
        System.out.println("Carrying passengers");
    }
}

class CargoPlane extends Plane {


    void carryGoods() {
        System.out.println("Carrying goods");
    }
}

class FighterPlane extends Plane {


    void carryArms() {
        System.out.println("Carrying arms");
    }
}

public class Poly {
    public static void main(String[] args) {
        FighterPlane f = new FighterPlane();
        CargoPlane c = new CargoPlane();
        PassengerPlane p = new PassengerPlane();
        Plane r;
        r = f;
        ((FighterPlane)(r)).carryArms();
        r = c;
        ((CargoPlane)(r)).carryGoods();
        r = p;
        ((PassengerPlane)(r)).carryPassenger();
    }
}