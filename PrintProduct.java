
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */
    // for printing the report
public class PrintProduct {
    private Product product;

    //Constructor
    public PrintProduct(Product product) {
        this.product = product;
    }

    //Prints total product sales
    public void printTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    //prints the average of each product
    public void printAverageProductSales() {
        System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductSold());
    }

    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    public void printReport() {
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("************************************************");
        System.out.println();
        printTotalProductSales();
        printAverageProductSales();
        printMostPopularProduct();
    }
}
    
