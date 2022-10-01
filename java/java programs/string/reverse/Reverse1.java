// https://www.javatpoint.com/how-to-reverse-string-in-java
class Reverse1 {

    public static String reveseString(String str){
        StringBuilder s = new StringBuilder(str);
       s.reverse();
       return s.toString();
    }
   public static void main(String[] args) {
    reveseString("pranav verma");
   }
}
