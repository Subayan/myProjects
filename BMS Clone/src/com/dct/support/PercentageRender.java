/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dct.support;

import java.awt.Component;
import javax.swing.JTable;

/**
 *
 * @author Subayan
 */
public class PercentageRender extends CurrencyRenderer {

    public PercentageRender(int max, int min) {
        super(max, min);

    }

    public PercentageRender() {
        super();
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

        } else if (Double.parseDouble(value.toString()) > 100.00) {

            table.setValueAt(new Double(100.00), row, column);
        }
        return component;
    }
}
