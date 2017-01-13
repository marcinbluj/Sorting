package pl.sort.FrameComponents;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

/**
 * Created by MSI on 13.01.2017.
 */
public class IOTextField extends JTextField implements KeyListener{

    private List<Character> characterList = new ArrayList<>();

    public IOTextField(Dimension location, Dimension size, List<Character> includedChars) {

        addKeyListener(this);
        setLocation(location.width, location.height);
        setSize(size);
        setBorder(new BevelBorder(1));

        characterList = includedChars;

    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (!characterList.contains(e.getKeyChar())) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
