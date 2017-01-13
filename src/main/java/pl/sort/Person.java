package pl.sort;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {

    private String name;
    private String lastName;
    private int year;
    private static List<Person> people = new ArrayList<>();

    public Person(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        people.add(this);
    }

    public static List<Person> getPeopleList(){
        return people;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Person with name: ");
        builder.append(name);
        builder.append(", last name: ");
        builder.append(lastName);
        builder.append(" and birth year: ");
        builder.append(year);

        return builder.toString();
    }

    @Override
    public int compareTo(Person person) {
        return year > person.year ? 1 : year == person.year ? 0 : -1;
    }
}
