package solid.isp;

public class Beverage {
}

interface CoffeeMachine {
    void makeCoffee();
    void steamMilk();
    void selfClean();
}

class ModernCoffeeMachine implements CoffeeMachine {

    @Override
    public void makeCoffee() {
        // logic to make a coffee
    }

    @Override
    public void steamMilk() {
        // logic to steam milk
    }

    @Override
    public void selfClean() {
        // logic to self clean
    }
}

// Problem: clients can still call the not impl methods.
class OldSchoolCoffeeMachine implements CoffeeMachine {

    @Override
    public void makeCoffee() {
        // make coffee
    }

    @Override
    public void steamMilk() {
    // old machine cannot steam milk
    }

    @Override
    public void selfClean() {
        // old machine cannot self clean
    }
}

// Solution. Now clients can choose which functionality they want.
interface CoffeeMaker {
    void makeCoffee();
}

interface MilkSteamer {
    void steamMilk();
}

interface SelfCleaner {
    void selfClean();
}


