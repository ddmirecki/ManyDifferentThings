package asd.pl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

/**
 * Created by RENT on 2017-01-12.
 */
public class PersonWindow extends JFrame {

    public PersonWindow() throws HeadlessException {
        setVisible(true);
        setSize(600, 400);
        setLayout(null);
        JButton button = new JButton("click me");
        button.setSize(200, 50);
        button.setLocation(0, 0);
        add(button);

        JTextField textField = new JTextField();
        textField.setSize(100, 50);
        textField.setLocation(0, 50);
        add(textField);

        JList jlist = new JList<>();
        jlist.setSize(200, 200);
        jlist.setLocation(0, 100);
        add(jlist);

        java.util.List personList = new ArrayList<>();
        personList.add(new Person("Jan", "Kowalski", 1980));
        personList.add(new Person("Adam", "Mickiewicz", 1960));
        personList.add(new Person("Adam", "Adamski", 1970));
        personList.add(new Person("Adam", "Jonski", 1970));
        personList.add(new Person("Michal", "Kowalski", 1970));

        jlist.setListData(personList.toArray());

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(textField.getText().isEmpty()){
                textField.setText("czesc");}
                else{

                textField.setText("");}


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
        });

    }




    public static void main(String[] args) {
        new PersonWindow();

    }
}
