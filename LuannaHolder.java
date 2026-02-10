import java.util.ArrayList;


public class LuannaHolder
{
    private int size;
    private String bucket[];
    private String bigBuck[];
    
    public LuannaHolder()
    {
        size = 0;
        bucket = new String[10];
        bigBuck= new String[20];
    }
    
    public void addToBucket(String value)
    {
       if(size<10)
       {
           bucket[size]= value;
       }
       else
       {
           for(int i = 0; i < bucket.length; i++)
           {
               bigBuck[i] = bucket[i];
           }
           bigBuck[size]=value;
       }
       size++;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public String getPosition(int pos)
    {
        if(pos< 0 || pos >= size)
        return null;
        if(size<=10)
        return bucket[pos];
        else
        return bigBuck[pos];
    }
    
    public void printAll()
    {
        for(int i = 0; i < bucket.length; i++)
        {
            if(bucket[i] != null)
            {
                System.out.println(getPosition(i));
            }
        }
    }
    
    public void Clear()
    {
        bigBuck = null;
        bucket = null;
        size = 0;
        
        System.out.println("Clearing Array...");
        System.out.println("Array now contains : " + size + " Values");
    }
    //ArrayList implementation
}
