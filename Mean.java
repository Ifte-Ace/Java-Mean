
import java.util.ArrayList;
public class Mean {
 public static void main(String[] args) {
 
ArrayList<Double> numbers = new ArrayList<>();
 
numbers.add(2.0);
 
numbers.add(4.5);
 
numbers.add(6.5);
 
numbers.add(1.0);
 
double average,sum=0.0;
 
if(numbers.size()==0)
 
average=0.0;
 
else
 
{
 
for(int i=0;i<numbers.size();i++)
 
{
 
sum+=numbers.get(i);
 
}
 
average=sum/numbers.size();
 
}
 
System.out.print("The Mean is: ");
 
System.out.print(average);
