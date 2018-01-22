public String frontBack(String str) {
    String str2;
    char first,last;
    
    if (str.length()<=1){
      return str;
    }
    
    first = str.charAt(str.length()-1);
    last = str.charAt(0);
    str2 = str.substring(1, str.length()-1);
    
    return first+str2+last;
    
}
/* Solution
    String mid = str.substring(1, str.length()-1);
    // last + mid + first
    return str.charAt(str.length()-1) + mid + str.charAt(0);
*/