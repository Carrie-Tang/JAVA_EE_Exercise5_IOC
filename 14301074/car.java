package test.edu.javaee.spring;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


import dev.edu.javaee.spring.bean.BeanDefinition;

import dev.edu.javaee.spring.bean.PropertyValue;

import dev.edu.javaee.spring.bean.PropertyValues;

import dev.edu.javaee.spring.factory.BeanFactory;

import dev.edu.javaee.spring.factory.XMLBeanFactory;

import dev.edu.javaee.spring.resource.LocalFileResource;



@Component("car")
public class car 
{
   private String carId = "666";
	
	
    public String getCarId() 
     {
		return carId;
	}

	public void setCarId(String carId) 
        {
		this.carId = carId;
	}

	public String toString()
        {
    	return " a car with the number "+carId;
        }
}
