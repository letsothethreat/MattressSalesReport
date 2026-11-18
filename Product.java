
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {

    // 1D array: stores the 3 product names
    private String[] products;
    // 2D array: stores sales.
    private int[][] sales;

    // Constructor: receives data from Main and stores it for later calculations
    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    //loops through every product and every month and adds them up
    @Override
    public int GetTotalProductsSold() {
        int total = 0; // Accumulator - starts at 0
        // Outer loop: go through each product (row)
        for (int i = 0; i < sales.length; i++) {
            // Inner loop: go through each month (column) for that product
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j]; // Add this month's sales to total
            }
        }
        return total;
    }

    // Calculates AVERAGE: total / number of entries 
    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold(); 
        int count = sales.length * sales[0].length; // Total number of sales entries
        return (double) total / count; // Cast to double so we get decimal answer
    }

    // Finding the product with highest TOTAL sales
    //Cozy Nights Monarch(25) because total 63 is highest, max month is 25
    @Override
    public String GetMostPopularProduct() {
        int maxIndex = 0; // Position of most popular product in array
        int maxTotal = 0; // Highest total found so far

        //product with highest total
        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0; // Total for this one product
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }
            
            if (productTotal > maxTotal) {
                maxTotal = productTotal;
                maxIndex = i;
            }
        }

        //Find highest single month for that winning product
        int maxMonth = sales[maxIndex][0]; // Start with month 1
        for (int j = 1; j < sales[maxIndex].length; j++) {
            if (sales[maxIndex][j] > maxMonth) {
                maxMonth = sales[maxIndex][j];
            }
        }

        //Return name + highest month in brackets
        return products[maxIndex] + "(" + maxMonth + ")";
    }
}