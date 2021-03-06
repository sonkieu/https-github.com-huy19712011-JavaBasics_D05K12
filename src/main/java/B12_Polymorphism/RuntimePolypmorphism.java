package B12_Polymorphism;

// method overriding / runtime polymorphism

import java.util.ArrayList;
import java.util.List;

// base class
class Automobile {

    void showInfo() {
        System.out.println("Automobile");
    }
}

// sub classes
class Toyota extends Automobile {

    @Override // annotations
    void showInfo() {
        System.out.println("Toyota");
    }

    void other() {
        System.out.println("Other Method");
    }
}

class Honda extends Automobile {

    @Override
    void showInfo() {
        System.out.println("Honda");
    }
}

class Nissan extends Automobile {

    @Override
    void showInfo() {
        System.out.println("Nissan");
    }
}

public class RuntimePolypmorphism {

    public static void main(String[] args) {

        Automobile toyota = new Toyota(); //upcasting
        toyota.showInfo();
        //toyota.other(); // error
        ((Toyota) toyota).other(); // downcasting

        //toyota instanceof Toyota
        Automobile honda = new Honda();
        honda.showInfo();

        Automobile[] arr = new Automobile[5];

        arr[0] = toyota;
        arr[1] = new Toyota();
        arr[2] = new Honda();
        arr[3] = new Nissan();
        arr[4] = new Toyota();

        System.out.println("--------------------------------------");
        for (int i = 0; i < arr.length; ++i) {
            arr[i].showInfo();
        }

        System.out.println("--------------------------------------");
        for (int i = 0; i < arr.length; ++i) {

            if (arr[i] instanceof Toyota) {
                //((Toyota) arr[i]).other();
            }
        }

        System.out.println("--------------------------------------");
        // ArrayList<Automobile>
        // List<Automobile>
        List<Automobile> list = new ArrayList<>();
        list.add(toyota);
        list.add(new Toyota());
        list.add(new Honda());
        list.add(new Nissan());
        list.add(new Toyota());
        list.add(new Nissan());

        for (var a : list) {
            a.showInfo();
        }


    }

}


/*
17/11/2021
1. T???o 1 array c?? 5 ?? t??. D??ng v??ng l???p for in ra th??ng tin t???t c??? c??c xe
2. Ch??? khi l?? xe Toyota => in ra "Other method"
*/
