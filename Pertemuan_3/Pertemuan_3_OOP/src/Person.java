class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void sayHello() {
        this.sayHello("Farrier");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ". My name is " + this.name);
    }

    public static void main(String[] args) {
        var person = new Person("Rayhan Surya", "Somewhere");
        //person.name = "Rayhan Surya";

        person.sayHello("Farrier");

        var person1 = new Person("Farrier", "Somewhere2");
        var person2 = new Person("Farrier");
        var person3 = new Person();
    }
}
