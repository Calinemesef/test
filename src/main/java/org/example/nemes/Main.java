package org.example.nemes;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow mainWindow = new MainWindow();
                mainWindow.show();
            }
        });

        for (int i = 1; i <= 5; i++) {
            TestRecord record = new TestRecord(i, "Number " + i);
            System.out.println("Record: a = " + record.a() + ", b = " + record.b());
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
        }
    }

    public record TestRecord(int a, String b) { }
}