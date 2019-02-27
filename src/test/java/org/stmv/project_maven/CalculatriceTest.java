package org.stmv.project_maven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatriceTest extends TestCase {
	
	public void testAdd()
    {
		Calculatrice c = new Calculatrice();
        assertTrue(c.add(1, 1) == 2);
    }
	
	public void testLess()
    {
		Calculatrice c = new Calculatrice();
        assertTrue(c.less(2, 1) == 1);
    }
}
