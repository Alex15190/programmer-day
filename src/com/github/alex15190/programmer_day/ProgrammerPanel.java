package com.github.alex15190.programmer_day;

import javax.swing.*;
import java.awt.*;

public class ProgrammerPanel extends JPanel{
    private JPanel editAndBtnPanel;
    private JTextField txtField;
    private JButton calcButton;
    private JLabel result;

    private ProgrammerDay pday;

    ProgrammerPanel (ProgrammerDay pday){
        this.pday = pday;
        setLayout(new BorderLayout());
        editAndBtnPanel = new JPanel();
        txtField        = new JTextField("2018",10);
        calcButton      = new JButton("Вычислить");
        editAndBtnPanel.add(txtField, BorderLayout.WEST);
        editAndBtnPanel.add(calcButton, BorderLayout.EAST);
        this.add(editAndBtnPanel, BorderLayout.NORTH);
        result = new JLabel("13 сентября 2018", SwingConstants.CENTER);
        this.add(result, BorderLayout.SOUTH);

        calcButton.addActionListener(event -> {
            String txt = txtField.getText();
            int year = Integer.parseInt(txt);
            pday.setYear(year);
            String output = pday.showDay();
            result.setText(output);
        });
    }
}
