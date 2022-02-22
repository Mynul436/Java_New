package com.company;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;

public class JOoptionpaneInput {
    public static void main(String[] args) {
        String name;
        String surname;
        name= JOptionPane.showInputDialog("Enter your name: ");
        surname= JOptionPane.showInputDialog("Enter your surname: ");
        JOptionPane.showMessageDialog(null, "Here your name:"+name+" "+surname);



    }

}
