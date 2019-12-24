/**
 * Created by @authoer haquem on Dec 24, 2019 
 */
package com.mhaque.javase.basic.environmet;

import java.util.Properties;

/**
 * @author haquem
 *
 */
public class SystemProperties {

	/**
	 * <ul>
	 *    <li>"file.separator"	Character that separates components of a file path. This is "/" on UNIX and "\" on Windows.
	 *    <li> "java.class.path"	Path used to find directories and JAR archives containing class files. Elements of the class path are separated by a platform-specific character specified in the path.separator property.
	 *    <li>"java.home"	Installation directory for Java Runtime Environment (JRE)
	 *    <li>"java.vendor"	JRE vendor name
	 *    <li>"java.vendor.url"	JRE vendor URL
	 *    <li>"java.version"	JRE version number
	 *    <li>"line.separator"	Sequence used by operating system to separate lines in text files
	 *    <li>"os.arch"	Operating system architecture
	 *    <li>"os.name"	Operating system name
	 *    <li>"os.version"	Operating system version
	 *    <li>"path.separator"	Path separator character used in java.class.path
	 *    <li>"user.dir"	User working directory
	 *    <li>"user.home"	User home directory
	 *    <li>"user.name"	User account name

	 * </ul
	 * @param args
	 */
	public static void main(String[] args) {
		String[] props = {"java.home", "java.version", "user.home", "user.name"};
		for(String prop : props) {
			System.out.println(System.getProperty(prop));
		}
		Properties properties = System.getProperties(); 
		properties.forEach((key, value) -> {
			System.out.println(key +" = "+ value);
		});

	}

}
