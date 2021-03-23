package com.mycompany.swing.spring;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;

public class Internal_Empleados extends javax.swing.JInternalFrame {

    private static Internal_Empleados unico;
    private EmpleadosAPI service;
    private Empleados emp;

    private Internal_Empleados() {
        initComponents();
        pack();
        setTitle("CRUD-Empleados");
        setResizable(false);
        service = new EmpleadosAPI();
    }

    public static Internal_Empleados getInstance() {
        if (null == unico) {
            unico = new Internal_Empleados();
        }
        return unico;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        claveTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombreTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefonoTxt = new javax.swing.JTextField();
        consultarTodos = new javax.swing.JButton();
        consulta = new javax.swing.JButton();
        anadir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre", "Direccion", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Clave(5):");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Direccion:");

        jLabel4.setText("Telefono:");

        consultarTodos.setText("Consultar Todos");
        consultarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarTodosActionPerformed(evt);
            }
        });

        consulta.setText("Consulta");
        consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaActionPerformed(evt);
            }
        });

        anadir.setText("Anadir");
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        jButton1.setText("Cerrar Ventana");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(consultarTodos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telefonoTxt)
                                .addGap(1, 1, 1))
                            .addComponent(nombreTxt)
                            .addComponent(claveTxt)
                            .addComponent(direccionTxt))
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(claveTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultarTodos)
                    .addComponent(anadir)
                    .addComponent(eliminar)
                    .addComponent(editar)
                    .addComponent(consulta)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void consultarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarTodosActionPerformed
        try {
            JSONArray jsonArray = new JSONArray(service.GetAllEmpleados());
            DefaultTableModel modelo = ((DefaultTableModel) jTable1.getModel());
            int filas = modelo.getRowCount();
            for (int i = 1; i <= filas; i++) {
                modelo.removeRow(0);
            }
            for (int i = 0; i < jsonArray.length(); i++) {
                modelo.addRow(new Object[]{jsonArray.getJSONObject(i).getLong("id"), jsonArray.getJSONObject(i).getString("nombre"),
                    jsonArray.getJSONObject(i).getString("direccion"), jsonArray.getJSONObject(i).getString("telefono")});
            }
            quitarContenido();
        } catch (Exception ex) {
            Logger.getLogger(Internal_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultarTodosActionPerformed

    private void consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaActionPerformed
        try {
            JSONObject json = new JSONObject(service.GetIdEmpleados(claveTxt.getText()));
            DefaultTableModel modelo = ((DefaultTableModel) jTable1.getModel());
            int filas = modelo.getRowCount();
            for (int i = 1; i <= filas; i++) {
                modelo.removeRow(0);
            }
            modelo.addRow(new Object[]{json.get("id"), json.get("nombre"), json.get("direccion"), json.get("telefono")});
            quitarContenido();
        } catch (Exception ex) {
            Logger.getLogger(Internal_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_consultaActionPerformed

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed
        try {
            emp = new Empleados();
            emp.setId(0);
            emp.setNombre(nombreTxt.getText());
            emp.setDireccion(direccionTxt.getText());
            emp.setTelefono(telefonoTxt.getText());
            JSONObject json = new JSONObject(emp);
            service.PostNewEmpleado(json.toString());
            quitarContenido();
        } catch (Exception ex) {
            Logger.getLogger(Internal_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_anadirActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        try {
            service.DeleteIdEmpleado(claveTxt.getText());
            quitarContenido();
        } catch (Exception ex) {
            Logger.getLogger(Internal_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        try {
            emp = new Empleados();
            emp.setId(Long.parseLong(claveTxt.getText()));
            emp.setNombre(nombreTxt.getText());
            emp.setDireccion(direccionTxt.getText());
            emp.setTelefono(telefonoTxt.getText());
            JSONObject json = new JSONObject(emp);
            service.PutUpdateEmpleado(json.toString(),claveTxt.getText());
            quitarContenido();
        } catch (Exception ex) {
            Logger.getLogger(Internal_Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void quitarContenido() {
        claveTxt.setText(null);
        nombreTxt.setText(null);
        direccionTxt.setText(null);
        telefonoTxt.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadir;
    private javax.swing.JTextField claveTxt;
    private javax.swing.JButton consulta;
    private javax.swing.JButton consultarTodos;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JTextField telefonoTxt;
    // End of variables declaration//GEN-END:variables
}
