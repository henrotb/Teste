

/** Implémentation d'une lampe simple avec état et puissance.
 * 
 * @author henrotb
 * @version 1.0.0
 */
public class Lampe 
{
    private final static int P_DEFAUT=100;
    

    private int puissance;
    
    
    private boolean estAllumee;
    
    
    public Lampe()
    
    {
	this.puissance=Lampe.P_DEFAUT;
	this.estAllumee=false;
    }

    /** Instance ?
     * 
     * @param p = puissance
     */
    public Lampe(int p)
    
    {
	this.puissance = p;
	this.estAllumee=false;
    }
    
    
    public void allumer()
    
    {
	this.estAllumee=true;
	
    }

    
    public void eteindre()
    
    {
	this.estAllumee=false;
	
    }
    
    /**
     * 
     * @return La puissance de la lampe 
     */
    public int getPuissance()
    
    {
	
    return this.puissance;
    
    }
  
    public boolean isEstAllumee()
    
    {
	
    return this.estAllumee;
   
    }

}
