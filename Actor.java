
public class Actor {

	String firstname;
	String lastname;
	
	public Actor(String first, String last)
	{
	firstname = first;
	lastname=last;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Actor actor = new Actor("Arnold", "Smith");
		
		System.out.print(actor.firstname +"\t");
		System.out.print(actor.lastname);
		
		
		
	}

}
