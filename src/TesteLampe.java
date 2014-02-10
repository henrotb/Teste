
public class TesteLampe {

    public static void main(String[] args) {
	
	Lampe malampe=new Lampe();
	
	if(malampe.estAllumee)
	    malampe.eteindre();
	else
	    malampe.allumer();
	
	

    }

}
