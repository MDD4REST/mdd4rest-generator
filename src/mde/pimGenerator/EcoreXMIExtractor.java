package mde.pimGenerator;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ServicePIM.RESTfulServicePIM;


public class EcoreXMIExtractor{
	
	private ResourceSet oResourceSet;
	private URI oURI;
	private org.eclipse.emf.ecore.resource.Resource oEcoreResource;
	private String strProjectName;
	
	public EcoreXMIExtractor(String strProjectName){
		
		this.strProjectName = strProjectName;
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(this.strProjectName + "PIM.model").getAbsolutePath());
		System.out.println(oURI.devicePath());

		// Create a resource for this file.
		oEcoreResource = oResourceSet.createResource(oURI);
	}
	
	public void exportEcoreXMI(RESTfulServicePIM oRESTfulServicePIM){
		EList<ServicePIM.Resource> resources = oRESTfulServicePIM.getHasResources();
		System.out.println("resources " + resources);
		System.out.println("relationships " + resources.get(1).getHasRelationship());
		this.oEcoreResource.getContents().add(oRESTfulServicePIM);
//		System.out.println("All " + this.oEcoreResource.getContents());
		//save to disk
		try {
			this.oEcoreResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}