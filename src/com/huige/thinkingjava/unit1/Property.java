/**
 * 
 */
package com.huige.thinkingjava.unit1;

import java.util.Date;
import java.util.Properties;

/**
 * @author huige
 *
 *         2015年8月19日 上午10:44:05
 */
public class Property {

	/**
	 * @param args
	 */

	/**
	 * Sole entry point to class & application
	 * 
	 * @param args
	 *            array of string arguments
	 * @return No return value
	 * @exception exceptions
	 *                No exceptions thrown
	 */
	public static void main(String[] args) {
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("--- Memory Usage:");
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory = " + rt.totalMemory() + " Free Memory = " + rt.freeMemory());
	}

}
