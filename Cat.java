public class Cat {
    private String name;
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
  
    public String getColor() {
        return color;
    }

    public void play() {
        System.out.println(name + " играет");
    }

    public void wash() {
        System.out.println(name + " умывается");
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Тимур", 5, "черный");
        Cat cat2 = new Cat("Рыжик", 7, "рыжий");

        System.out.println("Cat 1: ");
        System.out.println("Name: " + cat1.getName());
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());

        System.out.println("\nCat 2: ");
        System.out.println("Name: " + cat2.getName());
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " + cat2.getColor());

        cat1.play();
        cat2.wash();
    }
}
