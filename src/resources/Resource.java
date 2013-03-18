/**
 * 
 */
package resources;

import java.util.Map;

/**
 * @author moony
 * Every type of resources,
 * including user, org, activity and relations
 * should implement this interface.
 */
public interface Resource {

	/*
	 * Each resource should have
	 * an unique, universal and uniform recourse identifier.
	 * The URI is equivalent to the main index key in database.
	 * E.g. Can be email for users.
	 */
	public String getURI();

	/*
	 * Each resource is attached with multiple (key: value) pairs.
	 * You'd better defined is as constant values in a type of recourse.
	 */
	public String[] getKeys();

	/*
	 * Trigger the database(later through connector) query operations
	 */
	public Object[] getValues(String[] keys);

	/*
	 * Trigger the database(later through connector) insertion/modify operations
	 */
	public int setValues(Map<String, Object> pairs);
	public int setValues(String[] keys, Object[] values);

}
