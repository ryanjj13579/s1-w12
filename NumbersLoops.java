public class NumbersLoops{
    public NumbersLoops(){
      //while that prints 0 - 10
      int index = 0;
      while(index < 11){
        System.out.println(index);
        index++;
      }
    
      System.out.println("what is new index: " + index);

      //for i loop prints 0 - 10
      for(int index2 = 0; index2< 11; index2++){
        System.out.println(index2);
      }
    }
    public int digitSum(int num){
      int sum = 0;
      for (int x = 0; x < num; x++){
        sum = sum + x;
      }
      return sum;
    }
    
    public int reverseNum(int num){
      //. How are you going 3... 32 ... 321
      int newNum = 0;
      while(num != 0){
        newNum = newNum * 10 + (num % 10);
        num /= 10;
        //use mod
        // use integer division
        //mathy moment to build newNum
      }
      return newNum;
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      int count = 0;
      for(int x = start; x <= finish; x++){
        if (x == reverseNum(x))
          ++count;
      }
      return count;
    }
  }
