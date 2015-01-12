package com.softserveinc.tools;

import com.softserveinc.tools.Input;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Volodymyr
 */
public class InputTest {

	@Test
	public void inputFirstTest() {
		Assert.assertTrue(Input.isNatural(1000) == Input.isNatural(1000));
	}

	@Test
	public void inputSecondTest() {
		Assert.assertFalse(Input.isNatural(-1000));
	}
}
