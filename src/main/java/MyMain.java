import java.lang.Math;
public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double sum = 0; 
        int count = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                sum = sum + mat[row][col];
                count++;
            }
        }
        return sum/count;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
    int count = 0;
    int count2 = 0;
       for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                for (int i = 0; i < mat.length * mat[0].length; i++){
                count ++;
        }}}
        double[] arr = new double[count];
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                for (int i = 0; i < mat.length * mat[0].length; i++){
                arr[count2] = mat[row][col];
                count2 ++; }}}

            if (count % 2 == 0){
       return (double)(arr[(int)count/2] + arr[(int)count/2-1])/2;
            }
    
    else {
       return (Math.round(arr[count/2]));}

    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        int count = 0;
        int most = 0; 
        double mode = 0;
       double[] arr = new double[mat.length * mat[0].length];
        double[] arr2 = new double[mat.length * mat[0].length];
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
            arr[count] = mat[row][col];
            arr2[count] = mat[row][col];
            count++;
        }} 
       for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                for (int i = 0; i < mat.length * mat[0].length; i++){
                count ++;
        }}}
    
        for(int i = 0; i < arr.length-1; i++){
            int equal = 0;
                if (arr[i] == arr[i+1]){equal++;}
            if (equal > most){equal = most; mode = arr[i];}
        }
        return mode;
    } 

    public static void main(String[] args) {
        double mat[][] = {{1, 3, 7, 10}, 
                         {14, 18, 19, 21}, 
                         {23, 26, 30, 31}};
    System.out.println(mean(mat));
    System.out.println(median(mat));
    System.out.println(mode(mat));

    }
}
