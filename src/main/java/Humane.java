public class Humane
{
    private int age;
    private String name;
    private String surname;
    private int price;

    public Humane(int age, String name, String surname)
    {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
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
