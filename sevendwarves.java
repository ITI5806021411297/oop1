package sevendwarves;
import java.util.Scanner;
public class sevendwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int person1,person2,person3,person4,person5,person6,person7,person8,person9;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Person1 : ");
		person1 = scan.nextInt();
		while(person1<0 || person1 >100){
			System.out.print("Enter Person1 Again : ");
			person1 = scan.nextInt();
		}
		//
		System.out.print("Enter person2 : ");
		person2 = scan.nextInt();
		while(person2<0 || person2 >100){
			System.out.print("Enter person2 Again : ");
			person2 = scan.nextInt();
		}
		//
		System.out.print("Enter person3 : ");
		person3 = scan.nextInt();
		while(person3<0 || person3 >100){

			System.out.print("Enter person3 Again : ");
			person3 = scan.nextInt();
		}
		//
		System.out.print("Enter person4 : ");
		person4 = scan.nextInt();
		while(person4<0 ||person4 >100){

			System.out.print("Enter person4 Again : ");
			person4 = scan.nextInt();
		}
		//
		System.out.print("Enter person5 : ");
		person5 = scan.nextInt();
		while(person5<0 || person5 >100){

			System.out.print("Enter person5  Again : ");
			person5 = scan.nextInt();
		}
		//
		System.out.print("Enter person6 : ");
		person6 = scan.nextInt();
		while(person6<0 || person6 >100){

			System.out.print("Enter person6 Again : ");
			person6 = scan.nextInt();
		}
		//
		System.out.print("Enter person7 : ");
		person7 = scan.nextInt();
		while(person7<0 || person7 >100){

			System.out.print("Enter person7 Again : ");
			person7 = scan.nextInt();
		}
		//
		System.out.print("Enter person8 : ");
		person8 = scan.nextInt();
		while(person8<0 || person8 >100){

			System.out.print("Enter person8 Again : ");
			person8 = scan.nextInt();
		}
		//
		System.out.print("Enter person9 : ");
		person9 = scan.nextInt();
		while(person9<0 || person9 >100){

			System.out.print("Enter person9 Again : ");
			person9 = scan.nextInt();
		}
		//
		if(person3+person4+person5+person6+person7+person8+person9 == 100){
			System.out.print("person1 And person2  He don't dwarf");}
		else if(person2+person7+person3+person4+person5+person8+person9 == 100){
			System.out.print("person1 And person3  He don't dwarf");}
		else if(person5+person2+person3+person6+person7+person8+person9 == 100){
			System.out.print("person1 And person4  He don't dwarf");}
		else if(person2+person4+person3+person6+person7+person8+person9 == 100){
			System.out.print("person1 And person5  He don't dwarf");}
		else if(person2+person3+person5+person4+person7+person8+person9 == 100){
			System.out.print("person1 And person6  He don't dwarf");}
		else if(person2+person3+person5+person6+person4+person8+person9 == 100){
			System.out.print("person1 And person7  He don't dwarf");}
		else if(person2+person3+person5+person6+person7+person4+person9 == 100){
			System.out.print("person1 And person8  He don't dwarf");}
		else if(person2+person3+person5+person6+person7+person8+person4 == 100){
			System.out.print("person1 And person9  He don't dwarf");}
		else if(person5+person1+person3+person6+person7+person8+person9 == 100){
			System.out.print("person2 And person4  He don't dwarf");}
		else if(person1+person4+person3+person6+person7+person8+person9 == 100){
			System.out.print("person2 And person5  He don't dwarf");}
		else if(person1+person3+person5+person4+person7+person8+person9 == 100){
			System.out.print("person2 And person6  He don't dwarf");}
		else if(person1+person3+person5+person6+person4+person8+person9 == 100){
			System.out.print("person2 And person7  He don't dwarf");}
		else if(person1+person3+person5+person6+person7+person4+person9 == 100){
			System.out.print("person2 And person8  He don't dwarf");}
		else if(person1+person3+person5+person6+person7+person8+person4 == 100){
			System.out.print("person2 And person9  He don't dwarf");}
		else if(person5+person2+person1+person6+person7+person8+person9 == 100){
			System.out.print("person3 And person4  He don't dwarf");}
		else if(person2+person4+person1+person6+person7+person8+person9 == 100){
			System.out.print("person3 And person5  He don't dwarf");}
		else if(person2+person1+person5+person4+person7+person8+person9 == 100){
			System.out.print("person3 And person6  He don't dwarf");}
		else if(person2+person1+person5+person6+person4+person8+person9 == 100){
			System.out.print("person3 And person7  He don't dwarf");}
		else if(person2+person1+person5+person6+person7+person4+person9 == 100){
			System.out.print("person3 And person8  He don't dwarf");}
		else if(person2+person1+person5+person6+person7+person8+person4 == 100){
			System.out.print("person3 And person9  He don't dwarf");}
		else if(person2+person3+person1+person6+person7+person8+person9 == 100){
			System.out.print("person4 And person5  He don't dwarf");}
		else if(person2+person1+person5+person3+person7+person8+person9 == 100){
			System.out.print("person4 And person6  He don't dwarf");}
		else if(person2+person1+person5+person6+person3+person8+person9 == 100){
			System.out.print("person4 And person7  He don't dwarf");}
		else if(person2+person1+person5+person6+person7+person3+person9 == 100){
			System.out.print("person4 And person8  He don't dwarf");}
		else if(person2+person1+person5+person6+person7+person8+person3 == 100){
			System.out.print("person4 And person9  He don't dwarf");}
		else if(person2+person1+person4+person3+person7+person8+person9 == 100){
			System.out.print("person5 And person6  He don't dwarf");}
		else if(person2+person1+person4+person6+person3+person8+person9 == 100){
			System.out.print("person5 And person7  He don't dwarf");}
		else if(person2+person1+person4+person6+person7+person3+person9 == 100){
			System.out.print("person5 And person8  He don't dwarf");}
		else if(person2+person1+person4+person6+person7+person8+person3 == 100){
			System.out.print("person5 And person9  He don't dwarf");}
		else if(person2+person1+person4+person5+person3+person8+person9 == 100){
			System.out.print("person6 And person7  He don't dwarf");}
		else if(person2+person1+person4+person5+person7+person3+person9 == 100){
			System.out.print("person6 And person8  He don't dwarf");}
		else if(person2+person1+person4+person5+person7+person8+person3 == 100){
			System.out.print("person6 And person9  He don't dwarf");}
		else if(person2+person1+person4+person5+person6+person3+person9 == 100){
			System.out.print("person7 And person8  He don't dwarf");}
		else if(person2+person1+person4+person5+person6+person8+person3 == 100){
			System.out.print("person7 And person9  He don't dwarf");}
		else if(person2+person1+person4+person5+person6+person7+person3 == 100){
			System.out.print("person8 And person9  He don't dwarf");
		}
	}

}
