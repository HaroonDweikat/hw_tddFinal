package test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import classes.Calculater;

public class test {

	Calculater x = new Calculater();

	@Test
	public void Both_Positive() {

		double add = x.add(12.1, 1);
		assertTrue("two input are positive and the result must be positive", add>0);


	}

	@Test
	public void Both_Negative() {
		double add=x.add(-1, -1);
		assertTrue("both input are negative ->output should be negative", add<0);

	}
	@Test
	public void Both_Zero() {


		double add=x.add(0, 0);
		assertTrue("both zeros and output shoudl be zero",0.0==add);


	}
	@Test
	public void Have_Diff_Sign() {

		double para1=-15;
		double para2=10;
		double add=x.add(para1, para2);

		if(para1<0&&(Math.abs(para1)>Math.abs(para2))) {

			assertTrue("the result should be negative",add<0);
		}
		else {
			assertTrue("the result should be positive",add>0);

		}



	}


}
