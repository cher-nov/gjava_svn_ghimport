/*
 * EventList.java
 *
 * Created on 27 de Fevereiro de 2007, 21:59
 */

package org.gjava.actoreditor.beans;

import java.awt.Color;
import java.awt.Component;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import org.gjava.actoreditor.Utilz;
import org.gjava.actoreditor.Value;
import org.gjava.actoreditor.events.eventData;

/**
 *
 * @author  Porfirio
 */
public class EventList extends javax.swing.JList
{
    
    public static DefaultListModel events = new DefaultListModel();
    
    /** Creates new form EventList */
    public EventList()
    {
        setDropTarget(new DropTarget(this,new DropTargetListener()
        {
            public void dragEnter(DropTargetDragEvent dropTargetDragEvent)
            {
                //not needed
            }
            public void dragExit(DropTargetEvent dropTargetEvent)
            {
                //not needed
            }
            public void dragOver(DropTargetDragEvent dtde)
            {
                if( dtde.isDataFlavorSupported( Utilz.EVENT_DATA_FLAVOR ) )
                {
                    //only accept object of our type
                    dtde.acceptDrag( DnDConstants.ACTION_COPY_OR_MOVE );
                }
                else
                {
                    //reject everything else
                    dtde.rejectDrag();
                }
            }
            public void drop(DropTargetDropEvent dtde)
            {
                //first check if we support this type of data
                if( !dtde.isDataFlavorSupported( Utilz.EVENT_DATA_FLAVOR ) )
                {
                    dtde.rejectDrop();
                }
                //accept the drop so that we can access the Transferable
                dtde.acceptDrop( DnDConstants.ACTION_COPY_OR_MOVE );
                eventData data = null;
                try
                {
                    //get the dragged data from the transferable
                    //get the dragged data from the transferable
                    data = (eventData) dtde.getTransferable().getTransferData(Utilz.EVENT_DATA_FLAVOR);
                }
                catch (IOException ex)
                {
                    ex.printStackTrace();
                }
                catch (UnsupportedFlavorException ex)
                {
                    ex.printStackTrace();
                }
                
                dtde.dropComplete( null != data );
                if( null != data )
                {
                    int idx = locationToIndex(dtde.getLocation());
                    events.addElement(new Value(data.getDisplayName(),new ImageIcon(data.getBigImage()), new DefaultListModel() )) ;
                    
                    System.out.println(""+idx);
                    //dropTargetDropEvent.getSource().
                }
            }
            public void dropActionChanged(DropTargetDragEvent dropTargetDragEvent)
            {
            }
        }));
        this.setCellRenderer(new SimpleCellRenderer());
        initComponents();
        setModel(events);
    }
    
    class SimpleCellRenderer extends JLabel implements ListCellRenderer
    {
        public SimpleCellRenderer()
        {
            setOpaque(true);
        }
        
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
        {
            Value val = (Value)value;
            setText(val.value);
            setIcon(val.image);
            
            setBackground(isSelected ? Color.black : (index & 1) == 0 ? Color.white : Color.LIGHT_GRAY);
            setForeground(isSelected ? Color.white : Color.black);
            return this;
        }
        
        
    }
    
    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDragEnabled(true);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
