package arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //calculate sales
        //store all of the sales amounts of the day

        double[] mondaySales = {12.43,65.4,56.5,54.33};
        double[] tuesdaySales = {234.43,65.4,66.5,54.33};
        double[] wednesdaySales = {14.43,345.4,566.5,24.33};
        double[] thursdaySales = {134.43,15.4,56.5,124.33};

        double[][] weeklySales = new double[7][4];
        weeklySales[0] = mondaySales;
        weeklySales[1]= tuesdaySales;
        weeklySales[2]=wednesdaySales;
        weeklySales[3]=thursdaySales;
        System.out.println(Arrays.deepToString(weeklySales));


    }
}
