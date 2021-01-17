public class x
{
    public static void main(String args[])
    {
        /**
        printing this pattern: (consider "-" as " " [spaces])

        *-------*
        -*-----*
        --*---*
        ---*-*
        ----*
        ---*-*
        --*---*
        -*-----*
        *-------*

        we are going to devide this pattern into 2 different parts

        part 1:
        *-------*
        -*-----*
        --*---*
        ---*-*
        ----*

        part 2:
        ---*-*
        --*---*
        -*-----*
        *-------*

        */
       
        // CHANGE THE NUMERICAL VALUE HERE TO CHANGE THE NUMBER STARS PRINTED 
        int howManyStars = 5; 

        // default pattern settings
        String space = " ";
        String pattern = "*";
        int upperTriangle = howManyStars; 
        int lowerTriangle = upperTriangle-1; 
        int k = 1; 
  
        // This loop is to change the number of spaces based on the value of howManyStars
        for( int i = 1 ; i < lowerTriangle; i++)
            k += 2; 

        // loop to print the first part:
        for( int i = 1 ; i <= upperTriangle ; i++)
        {
            // printing the left hand side spaces 
            for( int spaces = i-1 ; spaces >= 1 ; spaces--)
            {
                System.out.print(space);
            }

            // printing the * next to the spaces 
            System.out.print(pattern);

            // printing the next set of spaces
            for( int spaces = k ; spaces >= 1 ; spaces--)
            {
                System.out.print(space);

                if(spaces == 1 && i != upperTriangle)
                {
                    // printing the last star
                    System.out.print(pattern); 
                }
            }

            // decrementing your k value
            k -= 2;  

            // going to the next line
            System.out.print("\n"); 
        }   

        // re-initializing your k value
        k = 1; 

        // loop to print the second part 
        for( int i = 1 ; i <= lowerTriangle ; i++)
        {
            // printing the left hand side spaces 
            for( int spaces = lowerTriangle-i ; spaces >= 1 ; spaces--)
            {
                System.out.print(space);
            }

            // printing the * next to the spaces 
            System.out.print(pattern);

            // printing the next set of spaces
            for( int spaces = 1 ; spaces <= k ; spaces++)
            {
                System.out.print(space);
            }

            // incrementing your k value
            k += 2; 

            // printing the last star
            System.out.print(pattern); 

            // going to the next line
            System.out.print("\n"); 
        } 
    }
}
