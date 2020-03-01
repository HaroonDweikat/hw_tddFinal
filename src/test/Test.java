package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

import classes.Calculater;

public class Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	 public void testSum_BothNumberZeros_ShouldReturnZero() {
		//Arrange
		int n1=0;
		int n2=0;
		Calculater c=new Calculater();
		
		//Act
		int result=c.sum(n1,n2);
		
		//Assert
		Assert.assertTrue(result==0);
		
		
	}
	
	@org.junit.Test
	 public void testSum_BothNumberPositive_ShouldReturnPositive() {
		
		//Arrange
				int n1=10;
				int n2=5;
				Calculater c=new Calculater();
				
				//Act
				int result=c.sum(n1,n2);
				
				//Assert
				Assert.assertTrue(result>0);
				
		
		}
	
	@org.junit.Test
	 public void testSum_BothNumberNegative_ShouldReturnPositive() {
		
		//Arrange
				int n1=-6;
				int n2=-7;
				Calculater c=new Calculater();
				
				//Act
				int result=c.sum(n1,n2);
				
				//Assert
				Assert.assertTrue(result<0);
				
		
	}

}
