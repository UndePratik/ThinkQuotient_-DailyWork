package arraylistAssignment;

import java.util.*;

public class Main extends ArrayListAssignment {

	@Override
	 void usingIterator(ArrayList<Integer> list) {
		Iterator<Integer> list1 = list.iterator();
		while(list1.hasNext())
		{
			System.out.println(list1.next());
		}
		
		
	}
	@Override
	void usingForloop(ArrayList<Integer> list) {
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

	@Override
	void usingForeach(ArrayList<Integer> list) {
		for(Integer l:list)
		{
			System.out.println(l);
		}
		
	}
	@Override
	void printTheCollection(ArrayList<String> color) {
		for(String c:color)
		{
			System.out.println(c);
		}
	}
	@Override
	void removeElement(ArrayList<String> list) {
		
			list.remove("Pratik");
		
	}
	
	 @Override
	 
	void removeAllElement(ArrayList<Integer> list) {
		list.removeAll(list);
		
	}
	@Override
	void retainAllElements(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	/*
	@Override
	void knowHowManyElements(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void arrayListEmptyOrNot(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void searchElement(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void specifiedCollection(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void retrieveAnElement(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void insertAnElements(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void printEvenNumber(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void matchTwoCollection(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void cheackCollectionIsEmpty(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void convertCollectionToArray(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void swapTwoElements(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	void replaceSecondElement(ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
	}
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main();
		
		ArrayList<Integer> list=new ArrayList<>();
		
		System.out.println("------Enter Elements--------");

		for(int i=0; i<5; i++)
		{
			list.add(sc.nextInt());
		}
		/*
		System.out.println(list);
		System.out.println("------UsingIterator------");
		m.usingIterator(list);
		System.out.println("------UsingForLoop------");
		m.usingForloop(list);
		System.out.println("------UsingForEach------");
		m.usingForeach(list);
		
		*/
		
		ArrayList<String> list1=new ArrayList<>();
		
		System.out.println("------Enter Colors--------");

		for(int i=0; i<5; i++)
		{
			list1.add(sc.next());
		}
		
		m.removeElement(list1);

	}
	
}
	