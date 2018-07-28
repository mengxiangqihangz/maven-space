package com.zzl.test;

import junit.framework.Assert;

import org.junit.Test;

import com.zzl.maven.Good;

public class GoodTest {
	
	@Test
	public void introduceTest(){
		Good g  = new Good();
		String str = g.introduceSelf();
		Assert.assertEquals("mentu", str);
		
	}
	
}
