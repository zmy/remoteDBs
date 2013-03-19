package resources;

public class User implements Resource {

	String Email = null;

	@Override
	public String getURI() {
		return Email;
	}

}
