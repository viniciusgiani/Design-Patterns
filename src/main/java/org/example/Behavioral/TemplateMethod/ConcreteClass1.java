package org.example.Behavioral.TemplateMethod;

class ConcreteClass1 extends AbstractClass {
    protected void requiredOperations1() {
        System.out.println("ConcreteClass1 says: Implemented Operation1");
    }

    protected void requiredOperation2() {
        System.out.println("ConcreteClass1 says: Implemented Operation2");
    }
}
