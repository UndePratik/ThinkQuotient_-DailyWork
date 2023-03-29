package ContainmentProject2;

public class BookTest {
	
	public static void searchfromAuthorId(Author a[])
	{
		Author a1[];
		System.out.println("Author detail from Id:--------------");
		
		
	}

	public static void main(String[] args) {
		Book [] b = new Book[2];
		
		Author [] a = new Author[2];
		
		a[0]=new Author(101,"Pratik",b);
		
		//
		
		b[0]=new Book(1,"faltugiri",2023);
		b[1]=new Book(2,"Backbecher",2022);
		
		
		
		Book [] b1 = new Book[2];
		
		a[1]=new Author(102, "Rohit",b1);
		
		b1[0]= new Book(1,"Maal",2023);
		b1[1]= new Book(2,"Tatti",2024);
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i].toString());
		}
		
	}

}
