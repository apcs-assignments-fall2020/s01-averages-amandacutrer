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
    double count = 0;
    double count2 = 0;
       for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                count ++;
            }
        }
        count = count / 2;
            if (count % 2 == 0){count = count / 2;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                count2++;
                if (count == count2){return (double)(mat[row][col]+mat[row][col+1])/2.0;}
            }
        }
    }
    else {count = count/2; 
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
            count2++;
            if (count == count2){return (double)(mat[row][col+1]);}
    }
    }
}
return 1.0;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // YOUR CODE HERE
        return -1.0;
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
