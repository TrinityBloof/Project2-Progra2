/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import codigo.*;
import database.DBConexion;
import objetos.SuperHeroes;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author gara8
 */
public class pnlSuperHeroes extends javax.swing.JPanel {

    FileInputStream fis;
    int longitudBytes;
    Consultas consulta = new Consultas();
    DBConexion conexion = new DBConexion();
    private Connection connection = null;

    public pnlSuperHeroes() {
        initComponents();
        mostrarDatosCombo();
    }

    public void limpiarCampos() {
        txtNombre.setText("");
        txtGenero.setText("");
        txtColorOjo.setText("");
        txtRaza.setText("");
        txtColorPelo.setText("");
        txtAltura.setText("");
        txtPublicador.setText("");
        txtColorPiel.setText("");
        txtAlineacion.setText("");
        txtPeso.setText("");
        lblfoto.setIcon(null);
    }

    public void mostrarDatosCombo() {
        if (jRadioButton1.isSelected()) {
            cmbSuperHeroe.setModel(consulta.cargarNombresHeroes1());
            limpiarCampos();
            String nombre = (String) cmbSuperHeroe.getSelectedItem();
            SuperHeroes superheroes = consulta.cargarUnSuperHeroe(nombre);
            txtNombre.setText(superheroes.getNombre());
            txtGenero.setText(superheroes.getGenero());
            txtColorOjo.setText(superheroes.getColorOjos());
            txtRaza.setText(superheroes.getRaza());
            txtColorPelo.setText(superheroes.getColorPelo());
            txtAltura.setText(Double.toString(superheroes.getAltura()));
            txtPublicador.setText(superheroes.getCasa());
            txtColorPiel.setText(superheroes.getColorPiel());
            txtAlineacion.setText(superheroes.getAlineacion());
            txtPeso.setText(Double.toString(superheroes.getPeso()));
            if (superheroes.getFoto() == null) {

            } else {
                lblfoto.setIcon(superheroes.getFoto());
            }
        } else if (jRadioButton2.isSelected()) {
            cmbSuperHeroe.setModel(consulta.cargarNombresHeroes2());
            limpiarCampos();
            String nombre = (String) cmbSuperHeroe.getSelectedItem();
            SuperHeroes superheroes = consulta.cargarUnSuperHeroe(nombre);
            txtNombre.setText(superheroes.getNombre());
            txtGenero.setText(superheroes.getGenero());
            txtColorOjo.setText(superheroes.getColorOjos());
            txtRaza.setText(superheroes.getRaza());
            txtColorPelo.setText(superheroes.getColorPelo());
            txtAltura.setText(Double.toString(superheroes.getAltura()));
            txtPublicador.setText(superheroes.getCasa());
            txtColorPiel.setText(superheroes.getColorPiel());
            txtAlineacion.setText(superheroes.getAlineacion());
            txtPeso.setText(Double.toString(superheroes.getPeso()));
            if (superheroes.getFoto() == null) {

            } else {
                lblfoto.setIcon(superheroes.getFoto());
            }
        } else if (jRadioButton3.isSelected()) {
            cmbSuperHeroe.setModel(consulta.cargarNombresHeroes3());
            limpiarCampos();
            String nombre = (String) cmbSuperHeroe.getSelectedItem();
            SuperHeroes superheroes = consulta.cargarUnSuperHeroe(nombre);
            txtNombre.setText(superheroes.getNombre());
            txtGenero.setText(superheroes.getGenero());
            txtColorOjo.setText(superheroes.getColorOjos());
            txtRaza.setText(superheroes.getRaza());
            txtColorPelo.setText(superheroes.getColorPelo());
            txtAltura.setText(Double.toString(superheroes.getAltura()));
            txtPublicador.setText(superheroes.getCasa());
            txtColorPiel.setText(superheroes.getColorPiel());
            txtAlineacion.setText(superheroes.getAlineacion());
            txtPeso.setText(Double.toString(superheroes.getPeso()));
            if (superheroes.getFoto() == null) {

            } else {
                lblfoto.setIcon(superheroes.getFoto());
            }
        } else if (jRadioButton4.isSelected()) {
            cmbSuperHeroe.setModel(consulta.cargarNombresHeroes4());
            limpiarCampos();
            String nombre = (String) cmbSuperHeroe.getSelectedItem();
            SuperHeroes superheroes = consulta.cargarUnSuperHeroe(nombre);
            txtNombre.setText(superheroes.getNombre());
            txtGenero.setText(superheroes.getGenero());
            txtColorOjo.setText(superheroes.getColorOjos());
            txtRaza.setText(superheroes.getRaza());
            txtColorPelo.setText(superheroes.getColorPelo());
            txtAltura.setText(Double.toString(superheroes.getAltura()));
            txtPublicador.setText(superheroes.getCasa());
            txtColorPiel.setText(superheroes.getColorPiel());
            txtAlineacion.setText(superheroes.getAlineacion());
            txtPeso.setText(Double.toString(superheroes.getPeso()));
            if (superheroes.getFoto() == null) {

            } else {
                lblfoto.setIcon(superheroes.getFoto());
            }
        } else if (jRadioButton5.isSelected()) {
            cmbSuperHeroe.setModel(consulta.cargarNombresHeroes5());
            limpiarCampos();
            String nombre = (String) cmbSuperHeroe.getSelectedItem();
            SuperHeroes superheroes = consulta.cargarUnSuperHeroe(nombre);
            txtNombre.setText(superheroes.getNombre());
            txtGenero.setText(superheroes.getGenero());
            txtColorOjo.setText(superheroes.getColorOjos());
            txtRaza.setText(superheroes.getRaza());
            txtColorPelo.setText(superheroes.getColorPelo());
            txtAltura.setText(Double.toString(superheroes.getAltura()));
            txtPublicador.setText(superheroes.getCasa());
            txtColorPiel.setText(superheroes.getColorPiel());
            txtAlineacion.setText(superheroes.getAlineacion());
            txtPeso.setText(Double.toString(superheroes.getPeso()));
            if (superheroes.getFoto() == null) {

            } else {
                lblfoto.setIcon(superheroes.getFoto());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        lbCedula5 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        txtGenero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lbCedula = new javax.swing.JLabel();
        txtAlineacion = new javax.swing.JTextField();
        txtPublicador = new javax.swing.JTextField();
        txtColorPiel = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        lbCedula6 = new javax.swing.JLabel();
        lbCedula1 = new javax.swing.JLabel();
        lbCedula2 = new javax.swing.JLabel();
        lbBuscarEst = new javax.swing.JLabel();
        lbCedula7 = new javax.swing.JLabel();
        cmbSuperHeroe = new javax.swing.JComboBox<>();
        txtRaza = new javax.swing.JTextField();
        lbCedula8 = new javax.swing.JLabel();
        txtColorOjo = new javax.swing.JTextField();
        lbCedula9 = new javax.swing.JLabel();
        lbCedula3 = new javax.swing.JLabel();
        lbCedula4 = new javax.swing.JLabel();
        txtColorPelo = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        lblfoto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lbCedula5.setText("Color pelo:");

        btnModificar.setText("Editar");
        btnModificar.setMaximumSize(new java.awt.Dimension(78, 32));
        btnModificar.setMinimumSize(new java.awt.Dimension(78, 32));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lbCedula.setText("Nombre:");

        txtAlineacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlineacionActionPerformed(evt);
            }
        });

        lbCedula6.setText("Color piel:");

        lbCedula1.setText("Género:");

        lbCedula2.setText("Altura:");

        lbBuscarEst.setText("Buscar Super Heroe:");

        lbCedula7.setText("Alineación:");

        cmbSuperHeroe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbSuperHeroeItemStateChanged(evt);
            }
        });

        txtRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaActionPerformed(evt);
            }
        });

        lbCedula8.setText("Peso:");

        lbCedula9.setText("Publicador:");

        lbCedula3.setText("Color ojo:");

        lbCedula4.setText("Raza:");

        txtColorPelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorPeloActionPerformed(evt);
            }
        });

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        lblfoto.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setText("Imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        grupo1.add(jRadioButton1);
        jRadioButton1.setText("A-E");

        grupo1.add(jRadioButton2);
        jRadioButton2.setText("F-K");

        grupo1.add(jRadioButton3);
        jRadioButton3.setText("L-P");

        grupo1.add(jRadioButton4);
        jRadioButton4.setText("Q-V");

        grupo1.add(jRadioButton5);
        jRadioButton5.setText("W-Z");

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbCedula4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCedula3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtColorOjo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbCedula1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbCedula)
                                .addGap(52, 52, 52)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbCedula5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtColorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbCedula7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAlineacion, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbCedula6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtColorPiel, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbCedula9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPublicador, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbCedula2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbCedula8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addComponent(lbBuscarEst)
                .addGap(18, 18, 18)
                .addComponent(cmbSuperHeroe, 0, 218, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addGap(287, 287, 287))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addGap(393, 393, 393))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuscarEst)
                    .addComponent(cmbSuperHeroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCedula)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCedula2))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCedula1)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCedula3)
                            .addComponent(txtColorOjo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCedula4)
                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbCedula5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtColorPelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCedula9)
                            .addComponent(txtPublicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCedula6)
                            .addComponent(txtColorPiel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCedula7)
                            .addComponent(txtAlineacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCedula8)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)))
                .addComponent(jButton1)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            String nombre = txtNombre.getText();
            connection = conexion.Conexion();
            String sql = "UPDATE super_heroes SET name = ?, gender = ?, eyecolor = ?, race = ?, haircolor = ?, height = ?, publisher = ?, skincolor = ?, alignment = ?, weight = ?, pic = ? WHERE name = '" + nombre + "'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtGenero.getText());
            ps.setString(3, txtColorOjo.getText());
            ps.setString(4, txtRaza.getText());
            ps.setString(5, txtColorPelo.getText());
            ps.setDouble(6, Double.parseDouble(txtAltura.getText()));
            ps.setString(7, txtPublicador.getText());
            ps.setString(8, txtColorPiel.getText());
            ps.setString(9, txtAlineacion.getText());
            ps.setDouble(10, Double.parseDouble(txtPeso.getText()));
            ps.setBinaryStream(11, fis, longitudBytes);
            ps.execute();
            ps.close();
            limpiarCampos();
            JOptionPane.showMessageDialog(null, "Guardado correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión", "Mensaje", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos, error: " + e.toString() );
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtAlineacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlineacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlineacionActionPerformed

    private void cmbSuperHeroeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbSuperHeroeItemStateChanged
        limpiarCampos();
        String nombre = (String) cmbSuperHeroe.getSelectedItem();
        SuperHeroes superheroes = consulta.cargarUnSuperHeroe(nombre);
        txtNombre.setText(superheroes.getNombre());
        txtGenero.setText(superheroes.getGenero());
        txtColorOjo.setText(superheroes.getColorOjos());
        txtRaza.setText(superheroes.getRaza());
        txtColorPelo.setText(superheroes.getColorPelo());
        txtAltura.setText(Double.toString(superheroes.getAltura()));
        txtPublicador.setText(superheroes.getCasa());
        txtColorPiel.setText(superheroes.getColorPiel());
        txtAlineacion.setText(superheroes.getAlineacion());
        txtPeso.setText(Double.toString(superheroes.getPeso()));
        if (superheroes.getFoto() == null) {

        } else {
            lblfoto.setIcon(superheroes.getFoto());
        }
    }//GEN-LAST:event_cmbSuperHeroeItemStateChanged

    private void txtRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaActionPerformed

    private void txtColorPeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorPeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorPeloActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lblfoto.setIcon(null);
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = j.showOpenDialog(null);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                fis = new FileInputStream(j.getSelectedFile());
                this.longitudBytes = (int) j.getSelectedFile().length();
                try {
                    Image icono = ImageIO.read(j.getSelectedFile()).getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_DEFAULT);
                    lblfoto.setIcon(new ImageIcon(icono));
                    lblfoto.updateUI();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "imagen: " + ex);
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarDatosCombo();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbSuperHeroe;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JLabel lbBuscarEst;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbCedula1;
    private javax.swing.JLabel lbCedula2;
    private javax.swing.JLabel lbCedula3;
    private javax.swing.JLabel lbCedula4;
    private javax.swing.JLabel lbCedula5;
    private javax.swing.JLabel lbCedula6;
    private javax.swing.JLabel lbCedula7;
    private javax.swing.JLabel lbCedula8;
    private javax.swing.JLabel lbCedula9;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JTextField txtAlineacion;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtColorOjo;
    private javax.swing.JTextField txtColorPelo;
    private javax.swing.JTextField txtColorPiel;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPublicador;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
