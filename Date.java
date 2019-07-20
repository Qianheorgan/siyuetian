 public class Date {
public int year;
public int month;
public int day;
public Date (int year,int month,int day){
	if(year<1840||year>2020){
		return;
	}
	if(month<1||month>12){
		return;
	}
	if(day<1||day>Cha(month,year)){
		return;
	}
	this.year=year;
	this.month=month;
	this.day=day;
	
}
public int[] day_of_month={31,28,31,30,31,30,31,31,30,31,30,31};
public int Cha (int month,int year){
	if(month==0)
		return (day_of_month[month+11]);
	if(month!=2){
		return(day_of_month[month-1]);
	}
	
	if(isKan(year)){
		return 29;
	}
	else{
		return 28;
	}
}
public boolean isKan(int year) {
	if(year%4==0&&year%100!=0||year%400==0)
	{
		return true;
	}
	return false;
}
public Date after(int days){
	day+=days;
	while(day>Cha(month,year)){
		day-=Cha(month,year);
		month+=1;
		if(month>12){
			month=1;
			year+=1;
		}
		
	}
	return this;
}
public Date before(int days2)
{
	day-=days2;
	while(day<=0){
		
		day+=Cha((month-1),year);
		month-=1;
		if (month<1){
			month=12;
			year-=1;
		}
	}
	return this;
}
public String toString(){
	return String.format("%4d-%2d-%2d",year,month,day);
}
public static void main(String[] args){
	Date p=new Date (2017,11,20);
	Date r=p.after(80);
	Date m=p.before(80);
	System.out.println(r.toString());
	System.out.println(m.toString());
	
}
}
