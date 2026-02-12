class Solution {
    public void setZeroes(int[][] matrix) {
        int[] arr = new int[matrix.length];
        int[] arr1 = new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    arr[i]=-1;
                    arr1[j]=-1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(arr[i]==-1 || arr1[j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}