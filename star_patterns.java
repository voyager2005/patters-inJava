public class star_patterns
{
    public static void main(String args[])
    {
        // pattern 1
        //  * * * * 
        //  * * * * 
        //  * * * * 
        //  * * * *
        System.out.println("\nPattern 1: "); 
        for(int i = 1 ; i <= 4; i++)
        {
            for(int j = 1 ; j <= 4; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        // pattern 2.
        // * 
        // * * 
        // * * * 
        // * * * * 
        System.out.println("\nPattern 2: "); 
        for(int i = 1 ; i <= 4 ; i++)
        {
            for( int j = 1 ; j<= i ; j++)
            {
                System.out.print("* "); 
            }

            System.out.println(); 
        }

        // pattern 3
        // * * * * 
        // * * * 
        // * * 
        // * 
        System.out.println("\nPattern 3: "); 
        for( int i = 1 ; i <= 4 ; i++)
        {
            for( int j = 4 ; j >= i ; j--)
            {
                System.out.print("* "); 
            }

            System.out.println(); 
        }

        // pattern 4
        // * 
        // * * 
        // * * * 
        // * * * * 
        // * * * * * 
        // * * * * 
        // * * * 
        // * * 
        // * 
        System.out.println("\nPattern 4: "); 
        for(int i = 1 ; i <= 5 ; i++)
        {
            for( int j = 1 ; j<= i ; j++)
            {
                System.out.print("* "); 
            }

            System.out.println(); 
        }
        for( int i = 1 ; i <= 4 ; i++)
        {
            for( int j = 4 ; j >= i ; j--)
            {
                System.out.print("* "); 
            }

            System.out.println(); 
        }

        // pattern 5
        //     *
        //    **
        //   ***
        //  ****
        // *****
        System.out.println("\nPattern 5: ");
        for( int i = 1 ; i <= 5; i++)
        {
            // printing the spaces 
            for( int spaces = 5 - i ; spaces >= 1 ; spaces--)
            {
                System.out.print(" "); 
            }

            //printing the star
            for( int j = 1 ; j <= i ; j++)
            {
                System.out.print("*"); 
            }

            // going to the next line
            System.out.println();
        }

        // pattern 6
        // *****
        //  ****
        //   ***
        //    **
        //     * 
        System.out.println("\nPattern 6: ");
        for( int i = 1 ; i <= 5 ; i++)
        {
            // printing space
            for( int spaces = i - 1; spaces >= 1; spaces--)
            {
                System.out.print(" "); 
            }

            // printing stars 
            for( int j = 5 ; j >= i ; j--)
            {
                System.out.print("*");
            }

            // going to next line
            System.out.println();
        }

        // pattern 7
        //     *
        //    **
        //   ***
        //  ****
        // *****
        //  ****
        //   ***
        //    **
        //     * 
        System.out.println("\nPattern 7: ");
        for( int i = 1 ; i <= 5; i++)
        {
            // printing the spaces 
            for( int spaces = 5 - i ; spaces >= 1 ; spaces--)
            {
                System.out.print(" "); 
            }

            //printing the star
            for( int j = 1 ; j <= i ; j++)
            {
                System.out.print("*"); 
            }

            // going to the next line
            System.out.println();
        }
        for( int i = 1 ; i <= 5 ; i++)
        {
            // printing space
            for( int spaces = i - 1; spaces >= 1; spaces--)
            {
                System.out.print(" "); 
            }

            // printing stars 
            for( int j = 5 ; j >= i ; j--)
            {
                System.out.print("*");
            }

            // going to next line
            System.out.println();
        }

        // pattern 8
        //    * 
        //   * * 
        //  * * * 
        // * * * * 
        System.out.println("\nPattern 8: ");
        for( int i = 1 ; i <= 5; i++)
        {
            // printing the spaces 
            for( int spaces = 5 - i ; spaces >= 1 ; spaces--)
            {
                System.out.print(" "); 
            }

            //printing the star
            for( int j = 1 ; j <= i ; j++)
            {
                System.out.print("* "); 
            }

            // going to the next line
            System.out.println();
        }
        
        // pattern 9
        // * * * * * 
        //  * * * *
        //   * * *
        //    * *
        //     *
        System.out.println("\nPattern 9: ");
        for( int i = 1 ; i <= 5; i++)
        {
            // printing the spaces 
            for( int spaces = i-1 ; spaces >= 1 ; spaces--)
            {
                System.out.print(" "); 
            }

            //printing the star
            for( int j = i ; j <= 5 ; j++)
            {
                System.out.print("* "); 
            }

            // going to the next line
            System.out.println();
        }
        
        // pattern 10
        //     * 
        //    * * 
        //   * * * 
        //  * * * *
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *
        System.out.println("\nPattern 10:");
        for( int i = 1 ; i <= 5; i++)
        {
            // printing the spaces 
            for( int spaces = 5 - i ; spaces >= 1 ; spaces--)
            {
                System.out.print(" "); 
            }

            //printing the star
            for( int j = 1 ; j <= i ; j++)
            {
                System.out.print("* "); 
            }

            // going to the next line
            System.out.println();
        }
        for( int i = 1 ; i <= 5; i++)
        {
            // printing the spaces 
            for( int spaces = i ; spaces >= 1 ; spaces--)
            {
                System.out.print(" "); 
            }

            //printing the star
            for( int j = 1 ; j <= 5-i ; j++)
            {
                System.out.print("* "); 
            }

            // going to the next line
            System.out.println();
        }
    }
}   
