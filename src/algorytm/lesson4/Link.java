package algorytm.lesson4;

class Link {

    public int age;
    public String name;
    public Link next;

    public Link(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void displayLink() {
        System.out.println("Name: " + this.name + " age: " + this.age);
    }
}