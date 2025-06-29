package arrays;

public class setMatrixZero {
    public static void main (String[] args){
        int izero = 0;
        int jzero=0;
        //input of matrix
        int matrix[][]= {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        int m= matrix.length;
        int n = matrix[0].length;
        //print matrix
        System.out.println("your matrix is :");
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
                if(matrix[i][j]==0){
                    izero=i;
                    jzero =j;
                }
            }
            System.out.println(" ");
        }
        System.out.println("Your new Matrix is :");
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(i== izero || j==jzero){
                    matrix[i][j]=0;
                }
                System.out.print(matrix[i][j]+" ");
            }
             System.out.println(" ");
    }

    }
}
