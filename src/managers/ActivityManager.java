package managers;

import java.util.Map;
import java.util.Set;

import resources.Resource;

public class ActivityManager implements Manager {

	static String keys[] = { // list of keys
		"name",
		"organization", // the organiztion it belongs to
		"venue",
		"datetime",
		"description",
		"tags",
		"poster",
		"exhibitions" // link to devices
	};

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
