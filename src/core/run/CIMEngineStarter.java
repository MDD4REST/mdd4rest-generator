package core.run;

public class CIMEngineStarter {
	public static void main(String[] args)
	{	
		System.out.println("MyCore CIM engine started.");
		
		//check input arguments sanity
		if(args.length < 2)
		{
			System.out.println("Usage: java -cp project_Name project_path");
			return;
		}
		
		String projectName = args[0];
		String projectPath = args[1];
		OutputGenerator outputGenerator = new OutputGenerator(projectName, projectPath);
		
		//parse the input yaml file
		System.out.println("------------------------------------------------------------------------");
		System.out.println("GENERATING LINKED ONTOLOGY");
		outputGenerator.linkedOntolotyGenerator();
		System.out.println("LINKED ONTOLOGY GENERATED");
	}
}