package Q8;

/*Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display 
name of a person, count the no. of characters present in the name of the person.*/



import java.util.Scanner;

interface DetailInfo {
    void display();
    int count();
}

class Person implements DetailInfo {
    private static int maxCount;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public int count() {
        return name.length();
    }

    public static void setMaxCount(int count) {
        maxCount = count;
    }

    public static int getMaxCount() {
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        Person person = new Person(name);
        person.display();

        int count = person.count();
        System.out.println("Count: " + count);

        Person.setMaxCount(count);
        int maxCount = Person.getMaxCount();
        System.out.println("Max Count: " + maxCount);
    }
}
