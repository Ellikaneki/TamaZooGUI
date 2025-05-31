/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.iiscastelli.tama.ui.custom;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Ely
 */
public class IntestazioneTabellaCustom extends JLabel implements TableCellRenderer {

    public IntestazioneTabellaCustom() {
        setFont(new Font("Segoe Print", Font.BOLD, 12));
        setForeground(Colore.WHITE);
        setBackground(Colore.SCHAUSS_PINK);
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setText(value.toString());
        return this;
    }

}
