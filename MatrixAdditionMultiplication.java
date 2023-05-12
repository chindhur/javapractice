public class MatrixAdditionMultiplication {
    public static void main(String[] args){
        int[][] a = new int[][]{{1,2,3},{3,4,5},{6,8,9}};
        int[][] b = new int[][]{{1,2,3},{3,4,5},{6,8,9}};

        int [][] c= new int[3][3];
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();//new line
        }

        //matrix multiplication
        int[][]m = new int[][]{{3,4,5},{5,8,5},{5,8,1}};
        int[][]n = new int[][]{{3,7,4},{5,9,2},{4,7,1}};
        int[][]p = new int[3][3];
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");  //printing matrix element
            }
            System.out.println();
            }
        }
}
