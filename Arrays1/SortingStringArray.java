package Arrays1;

public class SortingStringArray {

	public static void main(String[] args) {
		
		String color[] = {"black","white","yellow","orange"};
		
		for(int i=0;i<color.length;i++)
		{
			for(int j=i+1;j<color.length;j++)
			{
				if(color[i].charAt(0)>color[j].charAt(0))
				{
					String temp=color[i];
					color[i]=color[j];
					color[j]=temp;
				}
			}
		}
		for(String s:color)
		{
			System.out.println(s);
		}
	}

}
