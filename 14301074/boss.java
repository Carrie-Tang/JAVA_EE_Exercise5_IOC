package test.edu.javaee.spring;

import org.junit.Test;


import dev.edu.javaee.spring.bean.BeanDefinition;

import dev.edu.javaee.spring.bean.PropertyValue;

import dev.edu.javaee.spring.bean.PropertyValues;

import dev.edu.javaee.spring.factory.BeanFactory;

import dev.edu.javaee.spring.factory.XMLBeanFactory;

import dev.edu.javaee.spring.resource.LocalFileResource;


import test.annotation.Component;

public class boss 
{
  private office office;
  private car car;
  
  public boss() 
{
	
  }
  
  @Autowired
  public boss(car car ,office office)
{
      this.car = car;
      this.office = office ;
  }

  public String toString()
{
	  return "I have "+ car.toString()+" and "+ office.toString();
  }
}
