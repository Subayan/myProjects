/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dct.support;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.text.JTextComponent;
import rawdata.ComboboxData;

/**
 *
 * @author Subayan
 */
public class ProductCombobox extends JComboBox<String> {

    private JTable table;

    public ProductCombobox() {
        getMeReady();
    }

    public ProductCombobox(JTable table) {
        super();
        this.table = table;
        getMeReady();
    }

    public JComponent getEditorComponent(){
        if(editor.getEditorComponent() != null){
            return (JComponent) editor.getEditorComponent();
        }
        return null;
    }
    
    private void getMeReady() {
        setFocusable(true);
        setEditable(true);
        
        getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent e) {
//                System.out.println("Table row no. :" + table.getSelectedRow());
                String st = getEditor().getItem().toString();
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_ENTER) {
                    // this is where table will come into play
//                    System.out.println("Table row no. :" + table.getSelectedRow());
                    table.changeSelection(table.getSelectedRow(), table.getSelectedColumn(), true, false);
                }

                if ((key >= 48 && key <= 57) || (key >= 65 && key <= 96) || (key >= 97 && key <= 122) || (key == 8) || (key == KeyEvent.VK_SPACE)) {
                    setModel(new ComboboxData().getFilteredModel(st));
                    if (getItemCount() > 0) {
                        showPopup();
                        if (key != 8) {
                            ((JTextComponent) getEditor().getEditorComponent()).select(st.length(), getEditor().getItem().toString().length());
                            // realy long code this is .... :O
                        } else {
                           getEditor().setItem(st);
                        }

                    } else {
                     //   addItem(st);
                    }
                }
            }
        });

        addFocusListener(new FocusAdapter() {

            @Override
            public void focusGained(FocusEvent e) {
             
                 
            }
        
        
        });
        
        
    }
    
}
