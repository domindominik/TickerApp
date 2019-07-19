package pl.example;

public class Humane
{
    private int age;
    private String name;
    private String surname;
    private int price;
    private int spaceUnit;

    public Humane(int age, String name, String surname)
    {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.price = 0;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + " Surname: " + surname + " Age: " + age + "\n";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPrice() {
        return price;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
