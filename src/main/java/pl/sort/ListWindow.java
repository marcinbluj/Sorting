package pl.sort;

import pl.sort.FrameComponents.AddPersonButton;
import pl.sort.FrameComponents.IOTextField;
import pl.sort.FrameComponents.PersonList;
import pl.sort.FrameComponents.SortButton;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class ListWindow extends JFrame {

    private static List<Character> numbersList = new ArrayList<>();
    private static List<Character> lettersList = new ArrayList<>();

    public ListWindow() throws HeadlessException {

        for (int i = 0; i < 10; i++) {
            numbersList.add(Integer.toString(i).charAt(0));
        }

        for (int i = 65; i <= 90; i++) {
            lettersList.add((char) i);

            char upperCaseChar = ((char) i);
            lettersList.add(Character.toLowerCase(upperCaseChar));
            System.out.println((char) i);
            System.out.println(Character.toLowerCase(upperCaseChar));

        }


        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(0, 0);
        pack();
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("ListWindow");
        setName("aaa");
        setVisible(true);


        new Person("Marcin", "Bluj", 1992);
        new Person("Macin", "Blu", 1991);
        new Person("Marci", "uj", 1990);

        IOTextField name = new IOTextField(new Dimension(355, 210), new Dimension(200, 25), lettersList);
        add(name);

        IOTextField lastName = new IOTextField(new Dimension(355, 240), new Dimension(200, 25), lettersList);
        add(lastName);

        IOTextField year = new IOTextField(new Dimension(355, 270), new Dimension(200, 25), numbersList);
        add(year);

        PersonList personJList = new PersonList(new Dimension(5, 5),
                new Dimension(550, 200), Person.getPeopleList(), name, lastName, year);

        add(personJList);

        AddPersonButton addPersonButton = new AddPersonButton("AddPerson", new Dimension(355, 300), new Dimension(200, 25), name, lastName, year, personJList);
        add(addPersonButton);

        add(new SortButton("SortByName",
                new Dimension(5, 210),
                new Dimension(300, 25),
                Person.getPeopleList(), new NameComparator(), personJList));

        add(new SortButton("SortByLastName",
                new Dimension(5, 240),
                new Dimension(300, 25),
                Person.getPeopleList(), new LastNameComparator(), personJList));

        add(new SortButton("SortByBirthYear",
                new Dimension(5, 270),
                new Dimension(300, 25),
                Person.getPeopleList(), new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.compareTo(o2);
            }
        }, personJList));

        repaint();

    }
}


