package mde.pimGenerator;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import DynamicPIM.PIMDynamic;
import StaticPIM.PIMDomain;
import StaticPIM.Project;

public class EcoreXMIExtractor {

	private ResourceSet oStaticResourceSet;
	private ResourceSet oDynamicResourceSet;
	private URI oStaticURI;
	private URI oDynamicURI;
	private org.eclipse.emf.ecore.resource.Resource oStaticEcoreResource;
	private org.eclipse.emf.ecore.resource.Resource oDynamicEcoreResource;
	private String projectName;
	private String projectPath;

	public EcoreXMIExtractor(String projectName, String projectPath) {

		this.projectName = projectName;
		this.projectPath = projectPath;

		// Create a resource set.
		oStaticResourceSet = new ResourceSetImpl();
		oDynamicResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oStaticResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());
		
		oDynamicResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
				org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION,
				new XMIResourceFactoryImpl());

		// Get the URI of the model file.
		oStaticURI = URI.createFileURI(new File(this.projectPath + "/PIM/StaticPIM.model").getAbsolutePath());
		oDynamicURI = URI.createFileURI(new File(this.projectPath + "/PIM/DynamicPIM.model").getAbsolutePath());
		
		System.out.println(oStaticURI.devicePath());
		System.out.println(oDynamicURI.devicePath());

		// Create a resource for this file.
		oStaticEcoreResource = oStaticResourceSet.createResource(oStaticURI);
		oDynamicEcoreResource = oDynamicResourceSet.createResource(oDynamicURI);
	}

	public void exportStaticEcoreXMI(Project oPIMStatic) {
		this.oStaticEcoreResource.getContents().add(oPIMStatic);
		// save to disk
		try {
			this.oStaticEcoreResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void exportDynamicEcoreXMI(DynamicPIM.Project oPIMDynamic) {
		this.oDynamicEcoreResource.getContents().add(oPIMDynamic);
		// save to disk
		try {
			this.oDynamicEcoreResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}