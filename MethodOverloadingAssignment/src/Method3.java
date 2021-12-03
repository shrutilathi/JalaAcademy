

/**
 *3.Write two methods with the same name and same number of parameters of same type 
and call from main method
 * @author shruti
 * You can not define more than one method with the same name,
 * Order and the type of the arguments. It would be a compiler error.
 */



public class Method3 {
    public void print(String name, int id)
	{

		System.out.println("Name : " + name + " "
						+ "Id : " + id);
	}

	public void print(int id, String name)
	{

		System.out.println("Id : " + id + " "
						+ "Name : " + name);
	}
        public static void main(String[] args)
	{

		Method3 obj = new Method3();

		obj.print("Aditi", 1);
		obj.print(2,"Shruti");
	}
}
