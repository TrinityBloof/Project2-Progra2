/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author gara8
 */
public class MostrarPanel {

    public void mostrarPanel(JPanel p, JPanel pnlGrafico) {
        p.setSize(1100, 620);
        p.setLocation(0, 0);

        pnlGrafico.removeAll();

        pnlGrafico.add(p, BorderLayout.CENTER);

        pnlGrafico.revalidate();

        pnlGrafico.repaint();
    }
}
