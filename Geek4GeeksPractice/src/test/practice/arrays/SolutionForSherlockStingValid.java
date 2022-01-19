package test.practice.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
    {
    HashMap<Character, Integer> map = new HashMap<>();
    char[] str_arr= s.toCharArray();
    for(char c:str_arr)
    {
        if(map.containsKey(c))
        {
            map.put(c, map.get(c)+1);
        }
        else
        {
            map.put(c,1);
        }
    }
    System.out.println(map.toString());
    System.out.println(map.values());
    //define min max frequencies
    int min = (int) Math.pow(10, 5); int max = 0;
    for(int value : map.values()) {
        if (value < min ) {
            min = value;
        }
        if(value > max ) {
            max = value;
        }
    }
    System.out.println(map.size());
    if(min == max) { return "YES";} //all frequencies equal
    //if( (max - min) > 1 && map.size()>2) {return "NO";} //removing one character can not make the equal

    //for other cases make sure that only one frequency is different
    int countBiggerThanMin = 0;
    for(int value : map.values()) {
        if(value > min ) {
            countBiggerThanMin++;
        }
    }

    if((countBiggerThanMin == 1) || //only one bigger than min
            (countBiggerThanMin == (map.size() - 1))) { //min is samller than all others
        return "YES";
    }
    return "NO";

    }

}
}

public class SolutionForSherlockStingValid {
    public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * String s = bufferedReader.readLine();
		 * 
		 * String result = Result.isValid(s);
		 * 
		 * bufferedWriter.write(result); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
      //  String s ="abacbac";
        String s= "ibfdgaeadiaefgbhbdghhhbgdfgeiccbiehhfcggchgghadhdhagfbahhddgghbdehidbibaeaagaeeigffcebfbaieggabcfbiiedcabfihchdfabifahcbhagccbdfifhghcadfiadeeaheeddddiecaicbgigccageicehfdhdgafaddhffadigfhhcaedcedecafeacbdacgfgfeeibgaiffdehigebhhehiaahfidibccdcdagifgaihacihadecgifihbebffebdfbchbgigeccahgihbcbcaggebaaafgfedbfgagfediddghdgbgehhhifhgcedechahidcbchebheihaadbbbiaiccededchdagfhccfdefigfibifabeiaccghcegfbcghaefifbachebaacbhbfgfddeceababbacgffbagidebeadfihaefefegbghgddbbgddeehgfbhafbccidebgehifafgbghafacgfdccgifdcbbbidfifhdaibgigebigaedeaaiadegfefbhacgddhchgcbgcaeaieiegiffchbgbebgbehbbfcebciiagacaiechdigbgbghefcahgbhfibhedaeeiffebdiabcifgccdefabccdghehfibfiifdaicfedagahhdcbhbicdgibgcedieihcichadgchgbdcdagaihebbabhibcihicadgadfcihdheefbhffiageddhgahaidfdhhdbgciiaciegchiiebfbcbhaeagccfhbfhaddagnfieihghfbaggiffbbfbecgaiiidccdceadbbdfgigibgcgchafccdchgifdeieicbaididhfcfdedbhaadedfageigfdehgcdaecaebebebfcieaecfagfdieaefdiedbcadchabhebgehiidfcgahcdhcdhgchhiiheffiifeegcfdgbdeffhgeghdfhbfbifgidcafbfcd";
        String result = Result1.isValid(s);
        System.out.println(result);
    }
}
