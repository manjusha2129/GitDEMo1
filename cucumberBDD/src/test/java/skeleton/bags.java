package skeleton;

import io.cucumber.java.en.Given;

public class bags {
	@Given("(Sarah|She) has {double} cucumber(s) in {string}")
	public void sarah_has_cucumbers_in_her_bag(Double double1,String string1) {
		System.out.println(double1+"\t"+string1);
	    
	}

}
