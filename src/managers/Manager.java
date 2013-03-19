package managers;

import java.util.Map;
import java.util.Set;

import resources.Resource;

/**
 * Place to generate Resources and defines database keys.
 */
public interface Manager {

	/**
	 * Each resource is attached with multiple (key: value) pairs.
	 * You'd better defined is as constant values in a type of recourse.
	 * @return The first element of the String array is the key corresponding to URI!
	 */
	public String[] getKeys();
	
	public Resource createInstance(Map<String, Object> pairs);
	public Resource createInstance(String[] keys, Object[] values);
	
	public Set<Resource> queryInstances(Map<String, Object> pairs);
	public Resource[] queryInstances(String[] keys, Object[] values);
	
	/**
	 * No need to implement right now.
	 * Flush data in memory to database. 
	 */
	int flush();
}
