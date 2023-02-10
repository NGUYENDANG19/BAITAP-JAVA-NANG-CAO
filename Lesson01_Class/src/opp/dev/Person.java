package opp.dev;

public class Person {

	// thuộc tính
		String name;
		int old;
		String add;
		String phone;
		double averegr;
		
		// phương thức
		void setName(String name)	{
			this.name = name;
		}
		String getName()	{
			return this.name;
			
		}
		void setName(int old)	{
			this.old = old;
		}
		int getOld()	{
			return this.old;
	}
		void setAdd(String add)	{
			this.add = add;
		}
		String getAdd()	{
			return this.add;
			
}
		void setPhone(String phone)	{
			this.phone = phone;
		}
		String getPhone()	{
			return this.phone;
}
		void set(double averegrScore)	{
			this.averegr = averegrScore;
		}
		double getAveregr()	{
			return this.averegr;	
}
}

