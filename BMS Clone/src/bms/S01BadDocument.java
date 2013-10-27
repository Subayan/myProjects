/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bms;



/**
 *
 * @author Subayan
 */
import javax.swing.*;
import javax.swing.text.*;

public class S01BadDocument extends PlainDocument {
    
    public void insertString(int offs, String str, AttributeSet a) {
        // reject the insert but print a message on the console
       
        
    }
    
    private static void createAndShowGUI() {
        // the combo box (add/modify items if you like to)
        JComboBox comboBox = new JComboBox(new Object[] {"Ester", "Jordi", "Jordina", "Jorge", "Sergi"});
        // has to be editable
        comboBox.setEditable(true);
        // get the combo boxes editor component
        JTextComponent editor = (JTextComponent) comboBox.getEditor().getEditorComponent();
        // change the editor's document
        editor.setDocument(new S01BadDocument());
        
        // create and show a window containing the combo box
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(3);
        frame.getContentPane().add(comboBox);
        frame.pack(); frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
