public class Item
{
    public Integer key;
    public Integer data;
    public Item()
    {
        //key=0;
        //data=0;
    }
    public Item(Integer key,Integer data)
    {
        this.key=key;
        this.data=data;
    }
    public String toString()
    {
        return key+" -> "+data+" , ";
    }
}