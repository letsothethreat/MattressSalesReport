package com.mycompany.mattresssalesreport;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MattressSalesReport {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // 1D array - products
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // 2D array - [product][month]
        int[][] sales = new int[3][3];

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1)
                        + " for " + products[i] + " mattress: ");
                sales[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        Product product = new Product(products, sales);
        PrintProduct printer = new PrintProduct(product);
        printer.printReport();
    }
} 
 
