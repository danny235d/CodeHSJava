public class TShirt extends Clothing
{
    String fabric;
    
    public TShirt(String size, String color, String fabric) {
        super(size,color);
        this.fabric = fabric;
    }
    
    public String getFabric() {return fabric;}
}
