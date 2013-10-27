/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dct.support;

import java.awt.Component;
import java.text.NumberFormat;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Subayan
 */
public class CurrencyEditor extends DefaultCellEditor {

        private NumberFormat formatter;
      
        private JTextField textField;

        public CurrencyEditor(NumberFormat formatter) {
            super(new JTextField());
            this.formatter = formatter;
            this.textField = (JTextField) this.getComponent();
            textField.setHorizontalAlignment(JTextField.RIGHT);
            textField.setBorder(null);
        }
        
        public CurrencyEditor(){
            super(new JTextField());
             this.formatter =  NumberFormat.getInstance();
              this.textField = (JTextField) this.getComponent();
            textField.setHorizontalAlignment(JTextField.RIGHT);
            textField.setBorder(null);
        }

        @Override
        public Object getCellEditorValue() {
            try {
                return new Double(textField.getText());
            } catch (NumberFormatException e) {
                return Double.valueOf(0);
            }
        }

        @Override
        public Component getTableCellEditorComponent(JTable table,
            Object value, boolean isSelected, int row, int column) {
            textField.setText((value == null)
                ? "" : formatter.format((Double) value));
            return textField;
        }
    }
