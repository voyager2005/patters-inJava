import java.util.Scanner; 
public class star_pattern_n
{
    public static void main(String args[])
    {
        // declaring scanner object
        Scanner sc = new Scanner(System.in); 
        
        // accepting the number or rows 
        System.out.print("Please enter the number of rows: ");
        int n = sc.nextInt();
        
        // clearing the screen 
        System.out.print("\f");
        
        // pattern 1
        //  * * * * 
        //  * * * * 
        //  * * * * 
        //  * * * *
        System.out.println("\nPattern 1:"); 
        for(int i = 1 ; i <= n; i++)
        {
            for(int j = 1 ; j <= n; j++)
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
        System.out.println("\nPattern 2:" ); 
        for(int i = 1 ; i <= n ; i++)
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
        System.out.println("\nPattern 3:"); 
        for( int i = 1 ; i <= n ; i++)
        {
            for( int j = n ; j >= i ; j--)
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
        for(int i = 1 ; i <= n ; i++)
        {
            for( int j = 1 ; j<= i ; j++)
            {
                System.out.print("* "); 
            }

            System.out.println(); 
        }
        for( int i = 1 ; i <= n ; i++)
        {
            for( int j = n-1 ; j >= i ; j--)
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
        System.out.println("\nPattern 5:");
        for( int i = 1 ; i <= n; i++)
        {
            // printing the spaces 
            for( int spaces = n - i ; spaces >= 1 ; spaces--)
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
        System.out.println("\nPattern 6:");
        for( int i = 1 ; i <= n ; i++)
        {
            // printing space
            for( int spaces = i - 1; spaces >= 1; spaces--)
            {
                System.out.print(" "); 
            }

            // printing stars 
            for( int j = n ; j >= i ; j--)
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
        for( int i = 1 ; i <= n; i++)
        {
            // printing the spaces 
            for( int spaces = n - i ; spaces >= 1 ; spaces--)
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
        for( int i = 1 ; i <= n ; i++)
        {
            // printing space
            for( int spaces = i; spaces >= 1; spaces--)
            {
                System.out.print(" "); 
            }

            // printing stars 
            for( int j = n-1 ; j >= i ; j--)
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
        //* * * * *
        System.out.println("\nPattern 8:");
        for( int i = 1 ; i <= n; i++)
        {
            // printing the spaces 
            for( int spaces = n - i ; spaces >= 1 ; spaces--)
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
        System.out.println("\nPattern 9:");
        for( int i = 1 ; i <= n; i++)
        {
            // printing the spaces 
            for( int spaces = i-1 ; spaces >= 1 ; spaces--)
            {
                System.out.print(" "); 
            }

            //printing the star
            for( int j = i ; j <= n ; j++)
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
        for( int i = 1 ; i <= n; i++)
        {
            // printing the spaces 
            for( int spaces = n - i ; spaces >= 1 ; spaces--)
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
        for( int i = 1 ; i <= n; i++)
        {
            // printing the spaces 
            for( int spaces = i ; spaces >= 1 ; spaces--)
            {
                System.out.print(" "); 
            }

            //printing the star
            for( int j = 1 ; j <= n-i ; j++)
            {
                System.out.print("* "); 
            }

            // going to the next line
            System.out.println();
        }
    }
}   
