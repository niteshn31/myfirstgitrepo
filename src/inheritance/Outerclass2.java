package inheritance;

class OuterClass {
	int x = 10;

	protected class InnerClass {
		int y = 5;
	}
}
//If you try to access a private inner class from an outside class, an error occurs: