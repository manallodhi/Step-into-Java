package LibraryBookmangement;

public class Book {
	
	private String Title = "Lost" ;
	private String Author = "xyz" ;
	private Boolean isIssued = false ; 
	
	 void isIssue() {
		if(!isIssued) {
			isIssued = true ;
			System.out.println("The Book is issued ");
		}else {
			System.out.println("The Book is not issued ");
		}
	}
	
    void returnBook() {
    	if(isIssued) {
    		isIssued = false ;
    		System.out.println("Book is returned");
    	}else {
    		System.out.println("Book is not returned");
    	}
    }
    
    void showStatus() {
    	
    	System.out.println("Book : " + Title + " by " + Author);
    	System.out.println("Status : " + (isIssued ? "Issued" : "Available"));
    	
    }

}
