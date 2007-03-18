package org.gjava.actoreditor;

import java.awt.Image;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.SimpleBeanInfo;
import org.openide.loaders.UniFileLoader;
import org.openide.util.Utilities;

public class actorDataLoaderBeanInfo extends SimpleBeanInfo {

    public BeanInfo[] getAdditionalBeanInfo() {
        try {
            return new BeanInfo[] {Introspector.getBeanInfo(UniFileLoader.class)};
        } catch (IntrospectionException e) {
            throw new AssertionError(e);
        }
    }
    
    public Image getIcon(int type) {
                if (type == BeanInfo.ICON_COLOR_16x16 || type == BeanInfo.ICON_MONO_16x16) {
            return Utilities.loadImage("org/gjava/actoreditor/object.png");
        } else {
            return null;
        }

    }

}
