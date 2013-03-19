/**
 * 
 */
package resources;


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
	 * The URI is equivalent to the main index in database.
	 * E.g. Can be email for users.
	 * @return URI value
	 */
	public String getURI();

}
