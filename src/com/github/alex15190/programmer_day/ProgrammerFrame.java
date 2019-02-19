package com.github.alex15190.programmer_day;

import javax.swing.*;

public class ProgrammerFrame extends JFrame {
    private JPanel panel;

    ProgrammerFrame(ProgrammerDay pday){
        panel = new ProgrammerPanel(pday);
        add(panel);
        pack();
    }
}
