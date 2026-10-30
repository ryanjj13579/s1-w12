public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s = s.substring(1);
        count++;
      }
      return count;
    }
    
    //"sean", 3 --> "seanseansean"
    //concatenation means join --> "+"
    public String copy(String s, int num){
      String s1 = "";
      int numLoops = num;
      while(numLoops > 0){
        s1 = s1 + s;
        numLoops--;
      }
      return s1;
    }
    
    //s1 = "sean" s2 = "frog" ==> sferaong
    public String interweaving(String s1, String s2){
      String newString = "";
      for (int i = 0; i < s1.length(); i++){
        newString += s1.substring (i, i+1) + s2.substring (i, i+1);
    }
      return newString;
  }
  }