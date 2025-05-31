/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.iiscastelli.tama.ui.model;

import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ely
 */
public class TamaTableModel extends DefaultTableModel {

    public TamaTableModel() {
        super();
        addColumn("Tipo");
        addColumn("Nome");
        addColumn("Affetto");
        addColumn("Sazietà");
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 ->
                Icon.class;
            default ->
                super.getColumnClass(columnIndex);
        };
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}
