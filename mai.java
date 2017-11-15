package noofsides;

public class mai {
public static void main(String []args)
{
	shape f;
	trian t=new trian();
	hexagon h=new hexagon();
	trapezium tr=new trapezium();
	f=t;//reference to triangle
	f.numberofsides();
	f=h;//reference to hexagon
	f.numberofsides();
	f=tr;//reference to trapezium
	f.numberofsides();
	
}
}
