package org.example.Behavioral.Visitor;

class ConcreteComponentB implements Component {
    public void accept(Visitor visitor) {
        visitor.visitConcreteComponentB(this);
    }

    public String specialMethodOfConcreteComponentB() {
        return "B";
    }
}
