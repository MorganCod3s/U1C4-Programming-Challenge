public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        int ind = x.length() - 2;
         if (x.length() < 3){
            ind = 0;
        }
        String isLy = x.substring(ind);
        if ((isLy.equals("ly")) && (x.length() >= 2 )) {
            return true;
        } else {
        return false;
        }
    }

    public String conCat(String s1, String s2) {
        String s1Last = s1.substring((s1.length()-1));
        int len = 0;
        if (s2.length() != 0) {
            len = 1;
        }
        String s2First = s2.substring(0,len);
        String conCat = "";
        
        if((s1.length() == 0) && (s2.length() == 0)){
            conCat = "";
        } else if (s1.length() == 0){
            s1Last = "";
            conCat = s2;
        } else if (s2.length() == 0){
            s2First = "";
            conCat = s1;
        }

        if (s1Last.equals(s2First)) {
            s2 = s2.substring(1);
            conCat = s1 + s2;
        } else {
            conCat = s1 + s2;
        }
        return conCat;
    }

    public String withoutX(String s1) {
        String s1First = s1.substring(0,1);
        String s1Last = s1.substring((s1.length()-1));
        if(s1First.equals("x") && (s1Last.equals("x"))) {
             s1 = s1.substring(1);
             s1 = s1.substring(0,(s1.length()-1));
        } else if (s1First.equals("x")) {
            s1 = s1.substring(1);
        } else if (s1Last.equals("x")){
                 s1 = s1.substring(0,(s1.length()-1));
             }
        return s1;
            }

    public String fizzString(String s1) {
        String s1First = s1.substring(0,1);
        String s1Last = s1.substring((s1.length()-1));
        if((s1First.equals("f")) && (s1Last.equals("b"))) {
        return "FizzBuzz";
        } else if(s1Last.equals("b")){
        return "Buzz";
        } else if(s1First.equals("f")){
        return "Fizz";
        } else {
        return s1;
        }
    }

    public String fizzString2(int x) {
        int mod2 = x%2;
        int mod3 = x%3;
        int mod5 = x%5;
        if ((mod3 == 0) && (mod5 == 0)){
            return "FizzBuzz!";
        } else if((mod5) == 0){
        return "Buzz!";
        } else if((mod3) == 0){
        return "Fizz!";
        } else if((mod2) == 0){
            return "2!";
        } else{
        return "1!";
        }
    }

}
