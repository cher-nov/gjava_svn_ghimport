/*
 * PluginDialog.java
 *
 * Created on 27 de Janeiro de 2008, 20:53
 */

package org.gcreator.components;

import java.awt.*;
import java.io.*;
import java.util.zip.*;
import javax.swing.*;
import org.gcreator.components.impl.*;
import org.gcreator.core.*;
import org.gcreator.extended.JarClassLoader;
import org.gcreator.plugins.*;
import org.gcreator.utilities.FileUtilities;

/**
 *
 * @author  Luís Reis
 */
public class PluginDialog extends JDialog {
    private static final long serialVersionUID = 1;
    
    /** Creates new form PluginDialog */
    public IconList list;
    public static File dir;
    public PluginDialog(GPanel parent, boolean modal) {
        super(parent.getICore().getParentWindow());
        setModal(modal);
        initComponents();
        list = new IconList();
        list.setColumnWidth(100);
        list.setColumnHeight(100);
        list.setColumns(5);
        jScrollPane1.setViewportView(list);
        for(Plugin plugin : PluginList.stdlist.plugins) {
            System.out.println("Plugin: " + plugin.name);
            list.addElement(plugin.name, plugin.image, plugin);
        }
        pack();
        setMinimumSize(getSize());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Plugin Manager");
        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/resources/refresh.png"))); // NOI18N
        jButton3.setText("Reload");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Uninstall plugin");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Install new plugin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("<html>Reload plugins</>");

        jButton4.setText("Reinstall plugin");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 138, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton2))
                    .add(jButton3))
                .add(11, 11, 11)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton4)
                    .add(jLabel1))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc = new JFileChooser(dir);
        fc.setMultiSelectionEnabled(false);
        fc.setDialogTitle("Choose the file");
        fc.setApproveButtonText("OK");
        fc.setFileFilter(new CustomFileFilter(".jar", "Plugin archives (*.jar)"));
        if (fc.showOpenDialog(this) == JFileChooser.CANCEL_OPTION) {
            return;
        }
        dir = fc.getCurrentDirectory();
        File f = fc.getSelectedFile();
        if (f == null) {
            return;
        }
        if(!f.exists()) {
            return;
        }
        addPlugin(f);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Object o = list.getSelectedExtraContent();
        if(o==null) {
            return;
        }
        if(o instanceof Plugin){
            uninstall((Plugin) o);
            list.removeElement(list.getSelectedIndex());
            list.repaint();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Plugger.reloadPlugins();
    }//GEN-LAST:event_jButton3ActionPerformed
    @SuppressWarnings("unchecked")
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (list.getSelectedExtraContent() == null) {
            return;
        }
        Plugin p = (Plugin) list.getSelectedExtraContent();
        JFileChooser fc = new JFileChooser(dir);
        fc.setFileFilter(new JFileFilter( ".*\\.jar$", "G-Creator Plugins (*.jar)"));
        if (fc.showOpenDialog(this) == JFileChooser.CANCEL_OPTION) {
            return;
        }
        File f = fc.getSelectedFile();
        if (f == null || !f.exists()) {
            return;
        }
        dir = fc.getCurrentDirectory();
        PluginList.stdlist.plugins.remove(list.getSelectedExtraContent());
        list.removeElement(list.getSelectedIndex());
        uninstall(p);
        p = null;
        System.gc();
        addPlugin(f);
    }//GEN-LAST:event_jButton4ActionPerformed

    public void uninstall(Plugin plugin){
        //System.out.println("Uninstall " + plugin.name);
        String s = "[G-Creator Plugin List]\n";
        plugin.value.uninstall();
        for(Plugin plug : PluginList.stdlist.plugins){
            if (plug == plugin) {
                continue;
            }
            s += "[~Plugin~]\n";
            for(String author : plug.authors) {
                s += "Author=" + author + "\n";
            }
            try {
                s += "Core=" + plug.value.getClass().getName() + "\n";
                s += "License=" + plug.licenseLocation + "\n";
                s += "Name=" + plug.name + "\n";
                //s += "Version=" + plug.version + "\n";
                s += "Image=" + plug.img_loc + "\n";
                s += "Jar=" +plug.jar.getFile().getName()+"\n";
            } catch (Exception exc) {
                System.out.println("Exception: "+exc);
            }
        }
        File f = new File("./settings/pluglist");
        FileOutputStream stream = null;
        try{
            if(f.exists()){
                f.delete();
            }
            stream = new FileOutputStream(f);
            BufferedOutputStream bstream = new BufferedOutputStream(stream);
            bstream.write(s.getBytes());
            bstream.close();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    
     public void addPlugin(File f) {
        BufferedInputStream istream = null;
        ZipInputStream in = null;
        File f2 = new File("./settings/pluglist");
        BufferedOutputStream f2stream = null;
        try {
            f2stream = new BufferedOutputStream(new FileOutputStream(f2, true));
            istream = new BufferedInputStream(new FileInputStream(f));
            in = new ZipInputStream(istream);
        } catch (IOException e) {
            return;
        }
        ZipEntry entry;
        boolean failed = false;
        StringBuffer data = new StringBuffer(120);
        try {
            while((entry = in.getNextEntry()) != null) {
                if (entry.getName().equals("PLUGIN")) {
                    int len;
                    while ((len = in.read()) != -1) {
                        f2stream.write(len);
                        data.append(new char[]{(char)(len)});
                    }
                    f2stream.write('\n');
                    f2stream.write(("Jar="+f.getName()).getBytes());
                    f2stream.write('\n');
                    data.append("\nJar="+f.getName());
                    break;
                }
            }
            if (entry == null) {
                JOptionPane.showMessageDialog(this, 
                        f.getName()+" is not a valid G-Creator plug-in.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                failed = true;
            }
            f2stream.close();
            in.close();
            //Copy the jar file.
            FileUtilities.copyFile(f, new File("./plugins/jars"));
        } catch(IOException e) {
        }
        if (failed) {
            return;
        }
        Plugin plugin = Plugin.parsePlugin(data.toString().split("\n"));
        if (plugin != null) {
            ClassLoading.classLoader.add(new JarClassLoader(plugin.jar));
            Plugger.load(plugin.jar);
            PluginList.stdlist.plugins.add(plugin);
            plugin.value.onSplashDispose();
            list.addElement(plugin.name, plugin.image, plugin);
            list.repaint();
        } else {
            System.out.println("Plugin is null!");
        }
     }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
