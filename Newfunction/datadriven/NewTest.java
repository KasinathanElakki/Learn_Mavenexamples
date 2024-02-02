package datadriven;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority = 0)
  public void StartCar() {
		System.out.println("Start the Car");	
	}
	@Test(priority=1)
	public void FirstGear() {
		System.out.println("Put first gear");	
	}
	@Test(priority=2)
	public void Secondgear() {
		System.out.println("PutSecond gear");
	}
	@Test(priority=3)
	public void Thirdgear() {
		System.out.println("thrid gear");
	}
}
