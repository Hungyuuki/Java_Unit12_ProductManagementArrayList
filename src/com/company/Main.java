package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = -1;
        ProductManagement productManagement = new ProductManagement();
        do {
            displayMenu();
            System.out.println("Nhập lựa chọn");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Danh sách sản phẩm:");
                    productManagement.displayAllProduct();
                    break;
                }
                case 2: {
                    System.out.println("Thêm sản phẩm:");
                    System.out.println("Nhập vị trí muốn thêm sản phẩm:");
                    int index = input.nextInt();
                    Product product = inputNewProduct();
                    productManagement.addNewProduct(index, product);
                    break;
                }
                case 3: {
                    System.out.println("Cập nhật sản phẩm:");
                    System.out.println("Nhập vị trí muốn cập nhật sản phẩm:");
                    int index = input.nextInt();
                    Product product = inputNewProduct();
                    productManagement.updateProduct(index, product);
                    break;
                }
                case 4:
                    System.out.println("Xóa sản phẩm:");
                    System.out.println("Nhập vị trí muốn xóa sản phẩm:");
                    int index = input.nextInt();
                    productManagement.removeProductById(index);
                    break;
                case 5:
                    System.out.println("Sắp xếp sản phẩm theo giá tăng dần:");
                    productManagement.priceIncreasingSort();
                    break;
                case 6:
                    System.out.println("Tìm kiếm sản phẩm theo tên:");
                    break;
                case 7:
                    System.out.println("Goodbye...");
                    break;
            }
        } while (choice != 0);
    }

    public static Product inputNewProduct() {
        System.out.print("Nhập id: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Nhập tên SP: ");
        String name = input.nextLine();
        System.out.print("Nhập giá: ");
        long price = input.nextLong();
        input.nextLine();
        System.out.print("Nhập mô tả: ");
        String description = input.nextLine();
        return new Product(id, name, price, description);
    }

    public static void displayMenu() {
        System.out.println("---MENU QUẢN LÝ SẢN PHẨM---");
        System.out.println("1. Hiển thị danh sách sản phẩm.");
        System.out.println("2. Thêm sản phẩm.");
        System.out.println("3. Cập nhật sản phẩm.");
        System.out.println("4. Xóa sản phẩm.");
        System.out.println("5. Sắp xếp sản phẩm theo giá.");
        System.out.println("6. Tìm kiếm sản phẩm theo tên.");
        System.out.println("7. Thoát menu.");
    }
}
