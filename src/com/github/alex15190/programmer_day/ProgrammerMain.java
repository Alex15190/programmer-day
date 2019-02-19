package com.github.alex15190.programmer_day;

import javax.swing.*;
import java.awt.*;

public class ProgrammerMain {
    public static void main(String[] args) {
        ProgrammerDay pday = new ProgrammerDay();
        EventQueue.invokeLater(() -> {
            JFrame frame = new ProgrammerFrame(pday);
            frame.setTitle("День программиста");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
        });
    }
}
