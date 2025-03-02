package OOPS.Interfaces;

import org.w3c.dom.ls.LSOutput;


public class InterfacesConcept implements Engine,Appearance
{
    static final int price = 7000 ;
    public static void main(String[] args)
    {
InterfacesConcept obj = new InterfacesConcept();

    }

    @Override
    public void Color() {
        System.out.println("car color is Pink");
    }

    @Override
    public void Glitter() {
        System.out.println("Glitter is of silver color");
    }

    @Override
    public void speed() {
        System.out.println("Speed is good");
    }

    @Override
    public void brake() {
        System.out.println("brake");
    }

    @Override
    public void acc() {
        System.out.println("accelerate");
    }
}
