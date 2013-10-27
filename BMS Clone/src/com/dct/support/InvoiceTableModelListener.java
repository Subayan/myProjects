/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dct.support;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Subayan
 */
public class InvoiceTableModelListener implements TableModelListener {

    @Override
    public void tableChanged(TableModelEvent e) {

        TableModel model = (TableModel) e.getSource();
        switch (e.getColumn()) {
            case 1:
                System.out.println("Item Name has been changed :" + model.getValueAt(e.getFirstRow(), e.getColumn()).toString());
                String item = model.getValueAt(e.getFirstRow(), e.getColumn()).toString();
                if (!item.isEmpty()) {
                    model.setValueAt(125.21, e.getFirstRow(), 2);     //Rate
                    model.setValueAt(14, e.getFirstRow(), 3);         //Tax
                    model.setValueAt(calculatePrice(model, e), e.getFirstRow(), 4);   //Price
                    model.setValueAt(1, e.getFirstRow(), 5);          //Quantity
                    model.setValueAt(105, e.getFirstRow(), 6);          //Discount
                    model.setValueAt(calculateAmount(model, e), e.getFirstRow(), 7);          //Amount
                }else{
                    makeAllZero(model, e);
                }
                break;

        }
//        
//        System.out.println("Col no is :" + e.getColumn());
//        System.out.println("row no is :" + e.getFirstRow());
//        System.out.println("New value is :" + model.getValueAt(e.getFirstRow(), e.getColumn()));
    }

    private double calculatePrice(TableModel model, TableModelEvent e) {
        System.out.println("this is it" + (1.00 + (Double.parseDouble(model.getValueAt(e.getFirstRow(), 3).toString()) / 100.00)));
        double Price = Double.parseDouble(model.getValueAt(e.getFirstRow(), 2).toString()) * (1.00 + (Double.parseDouble(model.getValueAt(e.getFirstRow(), 3).toString()) / 100.00));     //Rate
        return Price;

    }

    private double calculateRate(TableModel model, TableModelEvent e) {
        System.out.println("this is it" + (1.00 + (Double.parseDouble(model.getValueAt(e.getFirstRow(), 3).toString()) / 100.00)));
        double Rate = Double.parseDouble(model.getValueAt(e.getFirstRow(), 2).toString()) * (1.00 + (Double.parseDouble(model.getValueAt(e.getFirstRow(), 3).toString()) / 100.00));     //Rate
        return Rate;

    }

    private double calculateAmount(TableModel model, TableModelEvent e) {
        System.out.println("this is it" + (1.00 + (Double.parseDouble(model.getValueAt(e.getFirstRow(), 3).toString()) / 100.00)));
        double Price = Double.parseDouble(model.getValueAt(e.getFirstRow(), 2).toString()) * (1.00 + (Double.parseDouble(model.getValueAt(e.getFirstRow(), 3).toString()) / 100.00));     //Rate
        double qty = Double.parseDouble(model.getValueAt(e.getFirstRow(), 5).toString());
        double discount = Double.parseDouble(model.getValueAt(e.getFirstRow(), 6).toString());
        double amount = Price * qty;
        if (discount != 0.00) {
            amount = amount - (amount * (discount / 100.00));
        }
        return amount;

    }

    private void makeAllZero(TableModel model, TableModelEvent e) {
        model.setValueAt(0, e.getFirstRow(), 2);     //Rate
        model.setValueAt(0, e.getFirstRow(), 3);         //Tax
        model.setValueAt(0, e.getFirstRow(), 4);   //Price
        model.setValueAt(0, e.getFirstRow(), 5);          //Quantity
        model.setValueAt(0, e.getFirstRow(), 6);          //Discount
        model.setValueAt(0, e.getFirstRow(), 7);          //Amount

    }
}
