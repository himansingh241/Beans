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
public class Student {
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(Class.forName("beanspractical.StudentBean"));
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        System.out.println("Properties: ");
        for (PropertyDescriptor pd: propertyDescriptors) {
            System.out.println(pd.getName());
        }
        System.out.println("Methods:");
        MethodDescriptor methodDescriptor[] = beanInfo.getMethodDescriptors();
        for (MethodDescriptor md: methodDescriptor) {
            System.out.println(md.getName());
        }
    }
}
