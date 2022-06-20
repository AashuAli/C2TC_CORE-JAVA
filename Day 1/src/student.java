class student {
	
int rollno;
String name;
float fee;
student (int rollno,String name,float fee)
{
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
	
	}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student (111,"ankit",5000f);
		student s2=new student (111,"sumit",6000f);
		s1.display();
		s2.display();
		

	}

}