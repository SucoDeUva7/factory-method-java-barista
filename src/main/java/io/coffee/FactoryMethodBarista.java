package io.coffee;

// Step 1: Define the Transport interface
interface Order {
    void deliver();
}

// Step 2: Create concrete classes for each type of transport
class Cappuccino implements Order {
    @Override
    public void deliver() {
        System.out.println("Delivering the order of Cappuccino");
    }
}

class FlatWhite implements Order {
    @Override
    public void deliver() {
        System.out.println("Delivering the order of Flat White");
    }
}

class Latte implements Order {
    @Override
    public void deliver() {
        System.out.println("Delivering the order of Latte");
    }
}

// Step 3: Create an abstract class TransportFactory
abstract class BaristaFactory {
    abstract Order createCup();
}

// Step 4: Create concrete factory classes
class CappuccinoFactory extends BaristaFactory {
    @Override
    Order createCup() {
        return new Cappuccino();
    }
}

class FlatWhiteFactory extends BaristaFactory {
    @Override
    Order createCup() {
        return new FlatWhite();
    }
}

class LatteFactory extends BaristaFactory {
    @Override
    Order createCup() {
        return new Latte();
    }
}

// Usage
public class FactoryMethodBarista {
    public static void main(String[] args) {
        // Create a Cappuccino using CappuccinoFactory
        BaristaFactory cappuccinoFactory = new CappuccinoFactory();
        Order cappuccino = cappuccinoFactory.createCup();
        cappuccino.deliver();

        // Create a Flat White using FlatWhiteFactory
        BaristaFactory flatWhiteFactory = new FlatWhiteFactory();
        Order flatWhite = flatWhiteFactory.createCup();
        flatWhite.deliver();

        // Create a Latte using LatteFactory
        BaristaFactory latteFactory = new LatteFactory();
        Order latte = latteFactory.createCup();
        latte.deliver();
    }
}
