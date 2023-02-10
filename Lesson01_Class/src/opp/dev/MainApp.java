package opp.dev;
import java.util.Scanner;
public class MainApp{
	static Scanner sc = new Scanner(System.in);
	public static void input(Person[] students) {
	    for (int i = 0; i < students.length; i++) {
	    	Person student = new Person();
	    	System.out.print("Nhập tên sinh viên thứ " + (i + 1) + ": ");
	        student.name = sc.nextLine();
	        System.out.print("Nhập tuổi sinh viên thứ " + (i + 1) + ": ");
	        student.old = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Nhập địa chỉ sinh viên thứ " + (i + 1) + ": ");
	        student.add = sc.nextLine();
	        System.out.print("Nhập số điện thoại sinh viên thứ " + (i + 1) + ": ");
	        student.phone = sc.nextLine();
	        System.out.print("Nhập điểm trung bình sinh viên thứ " + (i + 1) + ": ");
	        student.averegr  = sc.nextDouble();
	        sc.nextLine();
	        students[i] = student;
}
}
	 public static void print(Person[] students) {
		    System.out.println("Danh sách 10 sinh viên đã nhập:");
		    for (int i = 0; i < students.length; i++) {
		      System.out.println("Sinh viên thứ " + (i + 1) + ":");
		      System.out.println("\tTên: " + students[i].name);
		      System.out.println("\tTuổi: " + students[i].old);
		      System.out.println("\tĐịa chỉ: " + students[i].add);
		      System.out.println("\tSố điện thoại: " + students[i].phone);
		      System.out.println("\tĐiểm trung bình: " + students[i].averegr);
		    }
		  }

		  public static void main(String[] args) {
		    Person[] students = new Person[2];
		    input(students);
		    print(students);
		  }
		}

