package managers;

import java.util.Map;
import java.util.Set;

import resources.Resource;

public class UserManager implements Manager {

	static String keys[] = {
		"name",
		"studentID",
		"grade",
		"department",
		"school",
		"cardID",
		"mobile",
		"email",
		"hashPWD",
		"gender",
		"tags",
		"image"
	};

	public static boolean checkTsinghuaUser(String infoUsername, String infoPassword) {
		// TODO: connect to Camus to check
		return true;
	}

	@Override
	public String[] getKeys() {
		return keys;
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
