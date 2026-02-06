

public class HolderTester
{
    public static void main (String[] args)
    {
        LuannaHolder Hold = new LuannaHolder();
        
        Hold.addToBucket("Bucket1");
        System.out.println("Contains: "+ Hold.getSize() + " Value");
        Hold.addToBucket("Bucket2");
        System.out.println("Contains: "+ Hold.getSize() + " Values");
        Hold.addToBucket("Bucket3");
        System.out.println("Contains: "+ Hold.getSize() + " Values");
        Hold.addToBucket("Bucket4");
        System.out.println("Contains: "+ Hold.getSize() + " Values");
        Hold.addToBucket("Bucket5");
        System.out.println("Contains: "+ Hold.getSize() + " Values");
        Hold.addToBucket("Bucket6");
        System.out.println("Contains: "+ Hold.getSize() + " Values");
        Hold.addToBucket("Bucket7");
        System.out.println("Contains: "+ Hold.getSize() + " Values");
        Hold.addToBucket("Bucket8");
        System.out.println("Contains: "+ Hold.getSize() + " Values");
        Hold.addToBucket("Bucket9");
        System.out.println("Contains: "+ Hold.getSize() + " Values");
        Hold.addToBucket("Bucket10");
        System.out.println("Contains: "+ Hold.getSize() + " Values");
        Hold.addToBucket("Bucket11");
        System.out.println("Contains: "+ Hold.getSize() + " Values");
        System.out.println("");
        
        System.out.println("In Position 6 the Value is " + Hold.getPosition(6));
        System.out.println("");
        System.out.println("Values: ");
        Hold.printAll();
        
        System.out.println("");
        System.out.println("Lets remove Value 4...");
        Hold.remove(4);
        System.out.println("Now lets see what our array looks like:");
        Hold.printAll();
        
        System.out.println("");
    }
}
