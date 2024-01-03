package inheritance;

interface FirstInterface {
	public void myMethod(); // interface method
}

interface SecondInterface {
	public void myOtherMethod(); // interface method
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
	@Override
	public void myMethod() {
		System.out.println("Some text..");
	}

	@Override
	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}

// interface is group of related classes methods with empty bodies
// mehods should be public
// we cannot create an object for interfaces
// we cannot modify properties in interfaces as they are final.
// No constructor in the interfaces.
// Attributes: public, static and final