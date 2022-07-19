import java.util.*;
public class PasswordCheck{
			public static void main(String args[]){
			Scanner sc = new Scanner(System.in);	
			boolean valid = false;
			for(;;){
			System.out.println("Enter the password with only number and charcters");
			String password=sc.nextLine();
		
			if(password.length()<8){
					System.out.println("Password must have atleast 8 character ");
			}	else{
						for(int i=0;i<password.length();i++){
							char c = password.charAt(i);
							if(('a'<=c && c<='z')||('A'<=c && c<='Z')||('0'<=c&& c<='9')){
								valid= true;
							}else{
								valid= false;
							}
							if(valid==false){
								System.out.println("Invalid password.\nPassword must contain only letter and digits only.");
								System.out.println("Symbols are not allowed : "+password.charAt(i));
								break;
							}
							
						}
						if(valid==true){
					     System.out.println("Password accepted");
						}	
					}
					
					if(valid==true) break;
					else continue;
			}
		}
		
}
