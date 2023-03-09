package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@WebUI")
	public void preWebUITestConditions()
	{
		System.out.println("WebUI Preconditions are executed");
	}
	
	@After("@WebUI")
	public void postWebUITestConditions()
	{
		System.out.println("WebUI PostConditions are executed");
	}
	
	@Before("@Mobile")
	public void preMobileTestConditions()
	{
		System.out.println("Mobile Preconditions are executed");
	}
	
	@After("@Mobile")
	public void postMobileTestConditions()
	{
		System.out.println("Mobile PostConditions are executed");
	}
}
