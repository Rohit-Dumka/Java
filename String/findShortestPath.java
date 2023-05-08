import java.lang.Math.*;

class s
{
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
    public static float getShortestPath(String path)
    {

            int X=0,Y=0;
            for(int i=0;i<path.length();i++)
            {
                char direction = path.charAt(i);

                if(direction=='S')
                Y--;
                else if(direction=='N')
                Y++;
                else if(direction=='E')
                X++;
                else
                X--;
            }
                int X2=X*X;
                int Y2=Y*Y;

                return (float)Math.sqrt(X2+Y2);
    }
}
