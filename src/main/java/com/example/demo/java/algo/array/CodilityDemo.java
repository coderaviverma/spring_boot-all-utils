package com.example.demo.java.algo.array;

public class CodilityDemo {

    public static void main(String[] args) {

        int M=3;
        int[] A={1,2,3,3,1,3,1};

        System.out.println(solution(M,A));

    }

    static  int solution(int M, int[] A){
        int N=A.length;
        int[] count=new int[M+1];
        for (int i = 0; i <= M; i++) {
            count[i]=0;
        }

        int maxOccurenc=1;
        int index=-1;
        for(int i=0;i<N;i++){

            if (count[A[i]]>0){
                int tem=count[A[i]];
                if (tem>maxOccurenc){
                    maxOccurenc=tem;
                    index=i;
                }
                count[A[i]]=tem+1;
            }else {
                count[A[i]]=1;
            }

        }

        return A[index];
    }
}
