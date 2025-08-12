import java.util.*;
class leapoperation{
    public boolean isleap(int year){
        if((((year%4==0) && (year%100)!=0))||(year%400==0)){
            System.out.println(year);
            return true;
        }
        return false;
        }
    }
class leap{
    public static void main(String[] args) {
        leapoperation obj=new leapoperation();
        Scanner sc = new Scanner(System.in);
        int Syear=sc.nextInt();//2020
        System.out.println("Enter Start Year:" + Syear);
        int Eyear=sc.nextInt();//2025
        System.out.println("Enter End Year:" + Eyear);
        int Tyear=Eyear-Syear;
        System.out.println("Total Year:" + Tyear);
        int Lyear=0;
        for(int year=Syear;year<=Eyear;year++){
            if(obj.isleap(year)){
                Lyear++;
            }
        }
        System.out.println(Lyear);
        int NLyear=Tyear-Lyear;
        System.out.println("Non-Leap Year:" + NLyear);
        int TOdd=(Lyear*2)+(NLyear*1);
        int day=TOdd%7;
        String [] str = {"Saturday'","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        System.out.println(str[day]);
        }
    }
