package teststaticclass;

public class TestStaticClass
{
    public static void main(String[] args)
    {
        Bbb b = new Bbb();
        b.yyy();
    }
}

class Aaa
{
 	int xxx;
 	void yyy() { xxx = 1; }
 }


 class Bbb extends Aaa {
 	final Aaa finalref = new Aaa();

 	final void yyy() {
 		System.out.println("In method yyy()");
 		finalref.xxx = 12345;
 	}
 }
