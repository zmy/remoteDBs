package resources;

import java.util.Map;

public class User implements Resource {

	public static boolean checkTsinghuaUser(String infoUsername, String infoPassword) {
		// TODO: connect to Camus to check
		return true;
	}

	@Override
	public String getURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] getValues(String[] keys) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setValues(Map<String, Object> pairs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setValues(String[] keys, Object[] values) {
		// TODO Auto-generated method stub
		return 0;
	}

}