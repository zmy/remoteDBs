/**
 * 
 */
package resources;

import java.util.Map;
import java.util.Set;

/**
 * @author moony
 * Every type of resources,
 * including user, org, activity and relations
 * should implement this interface.
 */
public interface Resource {

	/**
	 * Each resource should have
	 * an unique, universal and uniform recourse identifier.
	 * The URI is equivalent to the main index key in database.
	 * E.g. Can be email for users.
	 * @return URI value
	 */
	public String getURI();

	/**
	 * Trigger the database(later through connector) query operations
	 */
	public Object[] getValues(String[] keys);

	/**
	 * Trigger the database(later through connector) insertion/modify operations
	 */
	public int setValues(Map<String, Object> pairs);
	public int setValues(String[] keys, Object[] values);

}
