package org.example.Behavioral.Visitor;

class ConcreteComponentA implements Component {
    public void accept(Visitor visitor) {
        visitor.visitConcreteComponentA(this);
    }

    public String exclusiveMethodOfConcreteComponentA() {
        return "A";
    }
}
