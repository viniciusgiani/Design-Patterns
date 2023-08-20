package org.example.Behavioral.TemplateMethod;

abstract class AbstractClass {

    public final void templateMethod() {
        baseOperation1();
        requiredOperations1();
        baseOperation2();
        hook1();
        requiredOperation2();
        baseOperation3();
        hook2();
    }
    protected void baseOperation1() {
        System.out.println("AbstractClass says: I am doing the bulk of the work");
    }

    protected void baseOperation2() {
        System.out.println("AbstractClass says: But I let subclasses override some operations");
    }

    protected void baseOperation3() {
        System.out.println("AbstractClass says: But I am doing the bulk of the work anyway");
    }

    protected abstract void requiredOperations1();

    protected abstract void requiredOperation2();

    protected void hook1() {}

    protected void hook2() {}
}
