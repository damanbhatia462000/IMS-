package OopsDemo2;

class Honda extends Car
{
	public void hondaStart()
	{
		Engine heng=new Engine();  // Composition - Honda class fully dependent on Engine
		heng.startEngine();
	}
}

class Hyundai extends Car
{
	public void hyundaiStart()
	{
		Engine heng=new Engine();  // Composition - Hyundai class fully dependent on Engine
		heng.startEngine();
	}
}
public class CompositionDemo {

	public static void main(String[] args) {
		
		Honda hondaCity=new Honda();
		
		hondaCity.setColor("Silver");//setting characteristics of new Honda city using car class methods.
		hondaCity.setMax_speed(180);   

		System.out.println("*******Honda Car Details *********");
		System.out.println(hondaCity.getColor() +" Color");
		System.out.println(hondaCity.getMax_speed()+" Speed");

		hondaCity.hondaStart();  //method of Honda Class->call Engine class methods 
		
		
		
	}

}
