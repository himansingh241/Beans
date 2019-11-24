/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanspractical;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;

/**
 *
 * @author himan
 */
public class Employee {
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Class.forName("beanspractical.EmployeeBean"));
        PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();
        System.out.println("Properties:");
        for (PropertyDescriptor pd: pds) {
            System.out.println(pd.getName());
        }
        MethodDescriptor[] mds = beanInfo.getMethodDescriptors();
        System.out.println("Methods:");
        for (MethodDescriptor md: mds) {
            System.out.println(md.getName());
        }
    }
}
