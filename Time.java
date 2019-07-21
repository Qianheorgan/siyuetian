public class Time {
	public int hour;
	public int minute;
	public int second;
public Time (int hour,int minute, int second)
{
	
	if(hour<0||hour>23){
		return ;
		
	}
	if(minute<0||minute>59){
		return;
	}
	if(second<0||second>59){
		return ;
	}
	this.hour=hour;
	this.minute=minute;
	this.second=second;
	
}
public Time after(int seconds){
	second+=seconds;
	while(second>59){
		minute+=1;
		second-=60;
		if(minute==60){
			hour+=1;
			minute=0;
			if(hour==24){
				hour=0;
			}
		}
	}
	return this;
}
public String toString(){
	return String.format("%02d:%02d:%02d",hour,minute,second);
}

public static void main(String[] args){
	Time p=new Time(1,2,2);
	Time r=p.after(80);
	System.out.println(r.toString());
}
}