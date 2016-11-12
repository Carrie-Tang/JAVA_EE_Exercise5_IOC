package test.edu.javaee.spring;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


import dev.edu.javaee.spring.bean.BeanDefinition;

import dev.edu.javaee.spring.bean.PropertyValue;

import dev.edu.javaee.spring.bean.PropertyValues;

import dev.edu.javaee.spring.factory.BeanFactory;

import dev.edu.javaee.spring.factory.XMLBeanFactory;

import dev.edu.javaee.spring.resource.LocalFileResource;



public class officeTest 
{
    private String officeNo = "999";
	
	public String getOfficeNo() 
        {
		return officeNo;
         }


	public void setOfficeNo(String officeNo) 
        {
		this.officeNo = officeNo;
	 }


	public String toString()
        {
		return " Office " +officeNo;
	}

}
