package pl.sort.FrameComponents;

import pl.sort.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;

public class SortButton extends JButton implements MouseListener{
    private java.util.List<Person> list;
    private Comparator<Person> comparator;
    private PersonList personList;

    public SortButton(String text, Dimension location, Dimension size,
                      List<Person> peopleList, Comparator<Person> comparator, PersonList personList) {

        addMouseListener(this);
        setText(text);
        setLocation(location.width, location.height);
        setSize(size);

        this.list = peopleList;
        this.comparator = comparator;
        this.personList = personList;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        list.sort(comparator);
        personList.setListData(Person.getPeopleList().toArray(new Person[Person.getPeopleList().size()]));
        repaint();
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
