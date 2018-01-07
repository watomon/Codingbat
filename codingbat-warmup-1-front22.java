/*
Given a string, take the first 2 chars and return the string with 
the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
If the string length is less than 2, use whatever chars are there.


front22("kitten") Å® "kikittenki"
front22("Ha") Å® "HaHaHa"
front22("abc") Å® "ababcab"
*/

public String front22(String str) {
    String first2;
    
    if (str.length() < 2) {
      first2 = str;
    }else{
      first2 = str.substring(0, 2);
    }
    return(first2 + str + first2);
  }
  
  /*
   answer
   
   public String front22(String str) {
    // First figure the number of chars to take
    int take = 2;
    if (take > str.length()) {
      take = str.length();
    }
    
    String front = str.substring(0, take);
    return front + str + front;
    }
    
  */