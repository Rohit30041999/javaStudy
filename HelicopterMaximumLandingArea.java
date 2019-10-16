//Question:-Maximum Landing space for helicopter:>>>
/* 
Sample test case:
("The total will be represented in array of strings")

input:>
5
x#o#o#o#x#o
x#o#o#o#x#x                        #o#o#o#
x#o#o#o#x#x              ===>      #o#o#o#    (length of this area is '3' which is maximum.)
x#o#x#o#o#x                        #o#o#o#
x#o#x#o#o#x
("Here '#' represents a delimeter between 'x' and 'o' ")

output:>(length of the maximum area for landing the helicopter.)
3
*/

//Code:

import java.io.*;
import java.util.*;
public class HelicopterMaximumLandingArea{
    public static int countArea(String[] a, int n){
        int max = Integer.MIN_VALUE;
        ArrayList<ArrayList<Character>> l = new ArrayList<ArrayList<Character>>(n);     //we should know the size("n") before initializing a List of List("List<List<DataType>>") object. 
        for(int i = 0; i < a.length; i++){
            ArrayList<Character> arr = new ArrayList<Character>();
            for(int j = 0; j < a[i].length(); j++){
                if(a[i].charAt(j) != '#'){             //just removing delimeter(#) for easy understanding.
                    arr.add(a[i].charAt(j));
                }
            }
            l.add(arr);
        }
        for(int i = 0; i < l.size() - 1; i++){
          if(l.get(i).size() != l.get(i+1).size()){
            return -1;
          }
        }
        if(n==0){
          return -1;
        }
        for(int i = 0; i < l.size(); i++){
          for(int j = 0; j < l.get(i).size(); j++){
            if(l.get(i).get(j) != 'x'){
              int count = countSpace(l, n, i, j, l.get(i).size());
              if(max < count){
                max = count;
              }
            }
          }
        }
        return max;        // max represents the maximum area length.
    }
    public static int countSpace(ArrayList<ArrayList<Character>> l, int n, int i, int j, int arrSize){
      int count = 0;
      int k, m;
      if(arrSize - j >= n){
        k = n;
        m = n;
      }
      else{
        k = arrSize - j;
        m = arrSize - j;
      }
      for(int irep = j; irep < k; irep++){
        ArrayList<Character> arr = new ArrayList<>();
        for(int jrep = j; jrep < m; jrep++){
          arr.add(l.get(irep).get(jrep));
        }
        if(arr.contains('x')){
          k--;
          m--;
        }
      }
      if(k == m) count = k;
      return count;
    }
    public static void main(String args[] ) throws Exception {
        int N;        //Number of strings.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        String[] areaLand = new String[N];
        for(int i = 0; i < N; i++){
            areaLand[i] = br.readLine();
        }
        System.out.print(countArea(areaLand, N));      //maximum length.
        sc.close();
   }
}
