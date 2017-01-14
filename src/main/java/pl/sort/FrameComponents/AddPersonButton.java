package pl.sort.FrameComponents;

import pl.sort.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AddPersonButton extends JButton implements MouseListener {

    private IOTextField name;
    private IOTextField lastName;
    private IOTextField year;


    public AddPersonButton(String buttonName, Dimension location, Dimension size,
                           IOTextField name, IOTextField lastName, IOTextField year, PersonList personList) {

        addMouseListener(this);
        addMouseListener(personList);

        setText(buttonName);
        setLocation(location.width, location.height);
        setSize(size);

        this.name = name;
        this.lastName = lastName;
        this.year = year;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (name.getText().equals("") || lastName.getText().equals("") || year.getText().equals("")) {
            throw new IllegalArgumentException("Brak argumentow.");

        } else {
//            for (int i = 0; i < Person.getPeopleList().size(); i++) {
//
//                if (Person.getPeopleList().get(i).getName().equals(name.getText())
//                        && (Person.getPeopleList().get(i).getLastName().equals(lastName.getText()))
//                        && (Person.getPeopleList().get(i).getYear() == (Integer.parseInt(year.getText())))) {
//
//                    Person.getPeopleList().remove(i);
//                }
//            }
            new Person(name.getText(), lastName.getText(), Integer.parseInt(year.getText()));
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
