package org.alicebot.ab.utils;

public class AimlToJavaService {

	//create method that will decide which Java method to call, according to the String received from TestAB (parts[1])
	private String aiml;
	Jdbc jdbc = new Jdbc();
	
	public AimlToJavaService(String aiml){
		this.aiml = aiml;
	}
	
	public void execute(){
		//check if record already exists
		StringUtils splitter = new StringUtils(); 
        String parts[] = splitter.splitAttValue(aiml);
        int count = jdbc.checkIfExists(parts[0], parts[1]);
		
        System.out.println("Matching records: " + count);
	}
	
	
}
