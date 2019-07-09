package com.example.demo.java.algo.bfs;

public class JavaTest {

    public static void main(String[] args) {

        System.out.println(solution(268));

    }

    public static int solution(int N) {
        // write your code in Java SE 8

        int tempValue=N;
        int temp=0;

        //It is negative value
        if(N<0){
            String sum= "5" + Math.abs(N)+"";
            return -(Integer.valueOf(sum));
        }else if(N==0){
            return 50;
        }else {
            String s=N+"";
            char[] arr=s.toCharArray();
            char[] greater= new char[arr.length+1];
            char five='5';
            boolean insertedFive=false;

            int j=0;
            for(int i=0; i<arr.length;i++){

                if(!insertedFive){
                    if(arr[i]<five){
                        greater[j]=five;
                        j++;
                        greater[j]=arr[i];
                        insertedFive=true;
                    }else{
                        greater[j]=arr[i];
                        j++;
                    }
                }else{
                    greater[j]=arr[i];
                    // greater[j]=5;
                    j++;


                }
            }

            if(!insertedFive){
                greater[greater.length-1]=five;
            }

            String value=new String(greater);
            return Integer.valueOf(value);
        }


    }
}