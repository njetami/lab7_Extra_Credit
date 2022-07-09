public class lab7_Extra_Credit {
    public static void main(String[] args) {
        int fp=0;
        int sp=0;


        for (int row=1; row<=10; row++)
        {

            for(int col=1; col<=11; col++)
            {
                if (col == 1 || col == 11 || (col == fp || col == sp) && row<10/2+2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            if(row==1)
            {
                fp=1;
                sp=11;
            }
                fp++;
                sp--;
            }



    }
}
