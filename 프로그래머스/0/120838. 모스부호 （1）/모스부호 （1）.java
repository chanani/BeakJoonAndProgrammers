class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] str = letter.split(" ");
        for(int i = 0; i < str.length; i++){
            answer += mose(str[i]);
        }
        return answer;
    }
    
    public static String mose(String str){
        if(str.equals(".-")) return "a";
        else if(str.equals("-...")) return "b";
        else if(str.equals("-.-.")) return "c";
        else if(str.equals("-..")) return "d";
        else if(str.equals(".")) return "e";
        else if(str.equals("..-.")) return "f";
        else if(str.equals("--.")) return "g";
        else if(str.equals("....")) return "h";
        else if(str.equals("..")) return "i";
        else if(str.equals(".---")) return "j";
        else if(str.equals("-.-")) return "k";
        else if(str.equals(".-..")) return "l";
        else if(str.equals("--")) return "m";
        else if(str.equals("-.")) return "n";
        else if(str.equals("---")) return "o";
        else if(str.equals(".--.")) return "p";
        else if(str.equals("--.-")) return "q";
        else if(str.equals(".-.")) return "r";
        else if(str.equals("...")) return "s";
        else if(str.equals("-")) return "t";
        else if(str.equals("..-")) return "u";
        else if(str.equals("...-")) return "v";
        else if(str.equals(".--")) return "w";
        else if(str.equals("-..-")) return "x";
        else if(str.equals("-.--")) return "y";
        else if(str.equals("--..")) return "z";
        else return "-1";
    }
}