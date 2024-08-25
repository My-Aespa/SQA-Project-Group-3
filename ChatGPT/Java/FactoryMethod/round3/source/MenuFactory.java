package ChatGPT.Java.FactoryMethod.round3.source;

// MenuFactory.java
public abstract class MenuFactory {
     public abstract Beverage createBeverage(String type);
     public abstract Pastry createPastry(String type);
     public abstract Snack createSnack(String type);
 }