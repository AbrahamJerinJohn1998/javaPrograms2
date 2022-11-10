class Tile
{
    int edgeLength;
    int tileArea;
    Tile(int edgeLength)
    {
        this.edgeLength=edgeLength;
        tileArea=edgeLength*edgeLength;
    }
    int getTileArea()
    {
        return tileArea;
    }

}
class  Floor
{
    int length,width;
    Floor(int length,int width)
    {
        this.length=length;
        this.width=width;
    }
    void totalTiles(Tile t)
    {
        double tileArea=t.tileArea;
        double floorArea=length*width;
        double numofTiles=floorArea/ tileArea;
        System.out.println("Number of tiles="+numofTiles);
    }
}
public class Tilestotal {
    public static void main(String[] args) {
        Tile t1=new Tile(7);

        int elen= t1.edgeLength;
        System.out.println("Edge length: "+elen);

        int tilarea= t1.getTileArea();
        System.out.println("TileArea is : "+tilarea);

        Floor f1=new Floor(600,700);
        System.out.println("Floor length is: " + f1.length);
        System.out.println("Floor width is : "+ f1.width);
        f1.totalTiles(t1);
    }

}