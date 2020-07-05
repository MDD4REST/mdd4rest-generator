package core.ontologytoyamltools;

import java.util.ArrayList;

/**
 * Class extending an {@link ArrayList} of resources so that it returns a unique {@link Resource} for each name.
 * 
 * @author themis
 */
@SuppressWarnings("serial")
public class Resources extends ArrayList<Resource> {

	/**
	 * Adds a resource given its name, if it does not exist.
	 * 
	 * @param name the name of the resource to be added.
	 */
	public void addResourceIfItDoesNotExist(String name) {
		for (Resource resource : this) {
			if (resource.Name.equals(name))
				return;
		}
		add(new Resource(name));
	}

	/**
	 * Adds a resource given its name, if it does not exist.
	 * 
	 * @param name the name of the resource to be added.
	 * @param isAlgorithmic boolean denoting whether the resource is algorithmic.
	 */
	public void addResourceIfItDoesNotExist(String name, boolean isAlgorithmic) {
		for (Resource resource : this) {
			if (resource.Name.equals(name))
				return;
		}
		add(new Resource(name, isAlgorithmic));
	}

	/**
	 * Adds a resource given its name, if it does not exist.
	 * 
	 * @param name the name of the resource to be added.
	 * @param isAlgorithmic boolean denoting whether the resource is algorithmic.
	 * @param isExternalService boolean denoting whether the resource is an external service.
	 */
	public void addResourceIfItDoesNotExist(String name, boolean isAlgorithmic, boolean isExternalService) {
		for (Resource resource : this) {
			if (resource.Name.equals(name))
				return;
		}
		add(new Resource(name, isAlgorithmic, isExternalService));
	}

	/**
	 * Returns a resource given its name. If the resource does not exist, it creates it first.
	 * 
	 * @param name the name of the resource to be returned.
	 * @return a {@link Resource} that corresponds to the given name.
	 */
	public Resource getResourceByName(String name) {
		for (Resource resource : this) {
			if (resource.Name.equals(name))
				return resource;
		}
		Resource resource = new Resource(name);
		add(resource);
		return resource;
	}

	/**
	 * Returns a resource given its name. If the resource does not exist, it creates it first.
	 * 
	 * @param name the name of the resource to be returned.
	 * @param isAlgorithmic boolean denoting whether the resource is algorithmic.
	 * @return a {@link Resource} that corresponds to the given name.
	 */
	public Resource getResourceByName(String name, boolean isAlgorithmic) {
		for (Resource resource : this) {
			if (resource.Name.equals(name))
				return resource;
		}
		Resource resource = new Resource(name, isAlgorithmic);
		add(resource);
		return resource;
	}

	/**
	 * Returns a resource given its name. If the resource does not exist, it creates it first.
	 * 
	 * @param name the name of the resource to be returned.
	 * @param isAlgorithmic boolean denoting whether the resource is algorithmic.
	 * @param isExternalService boolean denoting whether the resource is an external service.
	 * @return a {@link Resource} that corresponds to the given name.
	 */
	public Resource getResourceByName(String name, boolean isAlgorithmic, boolean isExternalService) {
		for (Resource resource : this) {
			if (resource.Name.equals(name))
				return resource;
		}
		Resource resource = new Resource(name, isAlgorithmic, isExternalService);
		add(resource);
		return resource;
	}
}
