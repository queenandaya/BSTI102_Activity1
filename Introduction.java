import java.io.*;

public class Introduction {
    
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    		String name;
    		String address;
    		String contact;
    		String section;
    		
    		System.out.println("Enter your name: ");
    		name = br.readLine();
    		
    		System.out.println("Enter your section: ");
    		section = br.readLine();
    		
    		System.out.println("Enter your address: ");
    		address = br.readLine();
    		
    		System.out.println("Enter your contact: ");
    		contact = br.readLine();
    		
    		System.out.println("Hi I'm " + name + " from " + section + " I live in " + address + " you can contact me " + contact);
    		
    		
    }
}
