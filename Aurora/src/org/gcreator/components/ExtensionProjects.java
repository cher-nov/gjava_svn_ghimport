/*
 * GameProjects.java
 *
 * Created on 4 de Setembro de 2007, 23:32
 */

package org.gcreator.components;

import org.gcreator.managers.*;

/**
 *
 * @author  Luís
 */
public class ExtensionProjects extends javax.swing.JPanel {
    
    /** Creates new form GameProjects */
    
    private ProjectTypes ptypes;
    public int tnum;
    
    public ExtensionProjects(ProjectTypes ptypes) {
        this.ptypes = ptypes;
        initComponents();
        jButton1.setText(LangSupporter.activeLang.getEntry(63));
        ptypes.npro.ProjectButtons.add(jButton1);
    }
    
    public int getSelectedProject(){
        if(jButton1.isSelected())
            return 3;
        return -1;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/build.png"))); // NOI18N
        jButton1.setText("Empty Extension");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setButton(int sel){
        ptypes.npro.uncheckAll();
        if(sel==1)
            jButton1.setSelected(true);
    }
    
    public void turnOff(){
        setButton(0);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setButton(1);
        String str = jButton1.getText()
                .replaceAll("\\s", "_")
                .replaceAll("[\\.:?^(){}]","")
                .replaceAll("(\\[|\\])", "")
                + "1";
        if(str.charAt(0)=='1')
            str = "p1";
        ptypes.npro.jTextField1.setText(str);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
    
}
