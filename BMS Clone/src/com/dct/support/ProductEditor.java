/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dct.support;

import javax.swing.DefaultCellEditor;
import javax.swing.JTextField;

/**
 *
 * @author Subayan
 */
public class ProductEditor extends DefaultCellEditor{

    public ProductEditor(JTextField textField) {
        super((JTextField) new ProductCombobox().getEditorComponent());
        
    }

    public ProductEditor() {
        super((JTextField) new ProductCombobox().getEditorComponent());
    }
    
    
}
