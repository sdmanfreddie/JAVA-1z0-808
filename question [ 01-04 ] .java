public class Snake {
    
    // String result = "done"; // pass 01
    
    public void shed(boolean time) {

        String result = "done"; // pass 02

        if (time) {
            
            // String result = "done"; // does not compile here
            
        }
        
        System.out.println( result );
        
        // String result = "done"; // does not compile here

    }
    
    public static void main ( String[] argu ) {
        
        new Snake().shed( true );
        
    }
		
}
