/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rawdata;

import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Subayan
 */
public class ComboboxData {

    private DefaultComboBoxModel<String> model;

    /*
     * Merrilee   Celestine   Emilia   Alberto   Refugio   Pauline   Trinidad  
     * Lesa   Sherlyn   Celinda   Wilhelmina   Melodi   Dorcas   Lavonna   Pura
     *   Regina   Annetta   Dominica   Deandra   Julene  
     */
    public ComboboxData() {
        model = new DefaultComboBoxModel<String>();
        String name = "Merrilee Celestine Emilia Alberto Refugio Pauline Trinidad Lesa Sherlyn Celinda Wilhelmina Melodi Dorcas Lavonna Pura Regina Annetta Dominica Deandra Julene";
        StringTokenizer tok = new StringTokenizer(name, "  ");
        while (tok.hasMoreElements()) {
            String s = tok.nextElement().toString().trim();
            if (!s.isEmpty()) {
                model.addElement(s);
            }
        }
    }

    public DefaultComboBoxModel getReadyModel() {
        return model;
    }

    public void printAllNames() {

        for (int i = 0; i < model.getSize(); i++) {
            System.out.println(":" + model.getElementAt(i));
        }
    }

    public DefaultComboBoxModel getFilteredModel(String text) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        for (int i = 0; i < this.model.getSize(); i++) {
            if (this.model.getElementAt(i).startsWith(text)) {
                model.addElement(this.model.getElementAt(i));
            }
        }
        return model;
    }

    public static void main(String... a) {
        new ComboboxData().printAllNames();
    }
}
