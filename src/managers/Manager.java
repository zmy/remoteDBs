package managers;

import java.util.Map;
import java.util.Set;

import resources.Resource;

/**
 * Place to generate Resources and defines database keys.
 * Cache: (not implement for now)
 * keep a pool in memory, modified Resources should be in the pool.
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

	/**
	 * Trigger the database(later through connector):
	 * query/search
	 */
	public Set<Resource> queryInstances(Map<String, Object> pairs);
	public Resource[] queryInstances(String[] keys, Object[] values);

	/**
	 * Trigger the database(later through connector):
	 * to get attributes of a resource
	 */
	public Map<String, Object> getValues(Resource res, Set<String> keys);
	public Object[] getValues(Resource res, String[] keys);

	/**
	 * Trigger the database(later through connector):
	 * insert/modify
	 */
	public int setValues(Resource res, Map<String, Object> pairs);
	public int setValues(Resource res, String[] keys, Object[] values);

	/**
	 * No need to implement right now.
	 * Flush data in memory to database. 
	 */
	int flush();
}
