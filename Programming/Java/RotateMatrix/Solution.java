class Solution {
    public void rotate(int[][] matrix) {          // the idea to solve this question is that first we take transpose of the matrix and then swap i and n-i column.
        int n=matrix.length;
        for(int i=0;i<n;i++){                    //In this for loop we take the transpose of the matrix
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int j=0;j<n/2;j++){                 //In this for loop we swap i and n-i column which rotates the matrix.
            for(int i=0;i<n;i++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}
