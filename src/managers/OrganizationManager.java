package managers;

import java.util.Map;
import java.util.Set;

import resources.Resource;
import resources.Activity;

public class OrganizationManager implements Manager {

	static String keys[] = { // list of keys
		"name",
		"school",
		"type", // charity or not
		"class", // e.g. sports, art, music, science or ...
		"members",
		"chairman",
		"microblog", // link of microblog
		"mobile", // cellphone number of the chairman
		"avatar",
		"hashPWD",
		"tags",
		"description"
	};

	public static Set<Activity> getActivities() { // get the activities of the organization
		// TODO: connect to Camus to check
		return null;
	}

	@Override
	public String[] getKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource createInstance(Map<String, Object> pairs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource createInstance(String[] keys, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Resource> queryInstances(Map<String, Object> pairs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource[] queryInstances(String[] keys, Object[] values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getValues(Resource res, Set<String> keys) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getValues(Resource res, String[] keys) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setValues(Resource res, Map<String, Object> pairs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setValues(Resource res, String[] keys, Object[] values) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int flush() {
		// TODO Auto-generated method stub
		return 0;
	}

}
