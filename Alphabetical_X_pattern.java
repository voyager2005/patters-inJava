public class Alphabetical_X_pattern
{
    public static void main(String args[])
    {
        int howManyStars = 5;
        char character = 'A';
        
        // default pattern settings
        String space = " ";
        String pattern = "*";
        int upperTriangle = howManyStars; 
        int lowerTriangle = upperTriangle-1; 
        int k = 1; 

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
            System.out.print(character);

            // printing the next set of spaces
            for( int spaces = k ; spaces >= 1 ; spaces--)
            {
                System.out.print(space);

                if(spaces == 1 && i != upperTriangle)
                {
                    // printing the last star
                    System.out.print(character); 
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
            System.out.print(character);

            // printing the next set of spaces
            for( int spaces = 1 ; spaces <= k ; spaces++)
            {
                System.out.print(space);
            }

            // incrementing your k value
            k += 2; 

            // printing the last star
            System.out.print(character); 

            // going to the next line
            System.out.print("\n"); 
        } 
    }
}
