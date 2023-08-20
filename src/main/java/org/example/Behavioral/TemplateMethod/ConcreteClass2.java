package org.example.Behavioral.TemplateMethod;

class ConcreteClass2 extends AbstractClass {
    protected void requiredOperations1() {
        System.out.println("ConcreteClass2 says: Implemented Operation1");
    }

    protected void requiredOperation2() {
        System.out.println("ConcreteClass2 says: Implemented Operation2");
    }

    protected void hook1() {
        System.out.println("ConcreteClass2 says: Overridden Hook1");
    }
}
