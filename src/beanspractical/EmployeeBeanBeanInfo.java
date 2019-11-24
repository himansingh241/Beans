/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanspractical;

import java.beans.IntrospectionException;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author himan
 */
public class EmployeeBeanBeanInfo extends SimpleBeanInfo {

    @Override
    public MethodDescriptor[] getMethodDescriptors() {
        MethodDescriptor[] md = new MethodDescriptor[2];
        try {
            md[0] = new MethodDescriptor(EmployeeBean.class.getMethod("overtime"));
            md[1] = new MethodDescriptor(EmployeeBean.class.getMethod("fine"));
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(EmployeeBeanBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(EmployeeBeanBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return md;
    }

    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        PropertyDescriptor[] pd = new PropertyDescriptor[2];
        try {
            pd[0] = new PropertyDescriptor("empID", EmployeeBean.class);
            pd[1] = new PropertyDescriptor("name", EmployeeBean.class);
        } catch (IntrospectionException ex) {
            Logger.getLogger(EmployeeBeanBeanInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pd;
    }
    
}
