package pl.sort.FrameComponents;

import pl.sort.Person;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class PersonList extends JList<Person> implements ListSelectionListener, MouseListener {
    private List<Person> list = new ArrayList<>();
    private IOTextField name;
    private IOTextField lastName;
    private IOTextField year;

    public PersonList(Dimension location, Dimension size, List<Person> list,
                      IOTextField nameTF, IOTextField lastNameTF, IOTextField yearTF) {

        addListSelectionListener(this);

        this.list = list;
        this.name = nameTF;
        this.lastName = lastNameTF;
        this.year = yearTF;

        setListData(list.toArray(new Person[list.size()]));
        setLocation(location.width, location.height);
        setSize(size);
        setBorder(new BevelBorder(1));

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = this.getSelectedIndex();

            name.setText(list.get(index).getName());
            lastName.setText(list.get(index).getLastName());
            year.setText(Integer.toString(list.get(index).getYear()));

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setListData(list.toArray(new Person[list.size()]));
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
