package com.backtracking;

public class Nqueen {
    public boolean isValidToPut(int board[][],int p,int q){
        //p,q are the position where we are checking if we can put the queen
        //check for raw
       // System.out.println(board[p][q]+"p"+p+"q"+q);
        for (int i=0;i<board[p].length;i++){
           if(board[p][i] != 0 ){
               return false;
           }
        }
        //check for column
        for (int i=0;i<board[q].length;i++){
            if(board[i][q] != 0 ){
                return false;
            }
        }
        //check for diagonals
        int ptemp=p+1;
        int qtemp=q+1;
        while(ptemp>-1 && ptemp<board[p].length && qtemp>-1 && qtemp<board[p].length ){
            if(board[ptemp][qtemp]!= 0){
                return false;
            }
            ++ptemp;++qtemp;

        }
        ptemp=p-1;
        qtemp=q-1;
        while(ptemp>-1 && ptemp< board[p].length && qtemp>-1 && qtemp<board[p].length ){
            if(board[ptemp][qtemp]!= 0){
                return false;
            }
            --qtemp;--ptemp;
        }

        ptemp=p+1;
        qtemp=q-1;
        while(ptemp>-1 && ptemp< board[p].length && qtemp>-1 && qtemp<board[p].length ){
            if(board[ptemp][qtemp]!= 0){
                return false;
            }
            ++ptemp;--qtemp;
        }
        ptemp=p-1;
        qtemp=q+1;
        while(ptemp>-1 && ptemp< board[p].length && qtemp>-1 && qtemp<board[p].length ){
            if(board[ptemp][qtemp]!= 0){
                return false;
            }
            --ptemp;++qtemp;

        }
        return true;
    }

    public boolean isPossible(int [][]board,int n,int p){
        if(n==p){
            return true;
        }
        for (int i=0;i<board[0].length;i++){
            //for(int j=q;j<board[i].length;j++){
                if(isValidToPut(board,p,i)){
                    board[p][i]=1;
                    if(isPossible(board,4,p+1)){
                        return true;
                    }
                    board[p][i]=0;
               // }

            }
        }
        return false;
    }


    public void initiate(int board[][]){
        for(int i=0;i<board[0].length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=0;
            }
        }
        //board[3][2]=1;
    }

    public static void main(String[] args) {
        Nqueen nqueen =new Nqueen();
        int [][]board =new int[4][4];
        nqueen.initiate(board);
        //nqueen.isValidToPut(board,0,0);
        System.out.println(nqueen.isPossible(board,4,0));

    }
}
