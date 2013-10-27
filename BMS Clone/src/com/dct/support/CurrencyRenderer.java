/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dct.support;

import java.awt.Component;
import java.text.NumberFormat;
import java.util.Currency;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Subayan
 */
public class CurrencyRenderer extends DefaultTableCellRenderer {

    private NumberFormat formatter;

    public CurrencyRenderer(NumberFormat formatter) {
        this.formatter = formatter;
        this.setHorizontalAlignment(JLabel.RIGHT);
    }

    public CurrencyRenderer() {
        this.formatter = NumberFormat.getInstance();
        formatter.setMaximumFractionDigits(2);
        formatter.setMinimumFractionDigits(2);
        formatter.setCurrency(Currency.getInstance("INR"));

        this.setHorizontalAlignment(JLabel.RIGHT);
    }

    public CurrencyRenderer(int max, int min) {
        this.formatter = NumberFormat.getInstance();
        formatter.setMaximumFractionDigits(max);
        formatter.setMinimumFractionDigits(min);
        formatter.setCurrency(Currency.getInstance("INR"));

        this.setHorizontalAlignment(JLabel.RIGHT);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
                row, column);

        if (value == null) {
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
                    row, column);
        }
        if (Double.parseDouble(value.toString()) < 0.00) {
            table.setValueAt(new Double(0.00), row, column);

        }

        return component;
    }

    @Override
    public void setValue(Object value) {
        setText((value == null) ? "" : formatter.format(value));
    }
}
