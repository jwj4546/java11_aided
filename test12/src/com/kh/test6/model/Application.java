package com.kh.test6.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    static ArrayList<Food> menu = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

	        int choice;
	        do {
	            displayMenu();
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline character

	            switch (choice) {
	                case 1:
	                    addFood();
	                    break;
	                case 2:
	                    displayFoodInfo();
	                    break;
	                case 3:
	                    deleteFood();
	                    break;
	                case 4:
	                    System.out.println("프로그램을 종료합니다.");
	                    break;
	                default:
	                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
	            }
	        } while (choice != 4);

	        scanner.close();
	    }

	    public static void displayMenu() {
	        System.out.println("=== 음식 메뉴 리스트 ===");
	        System.out.println("1. 음식 추가");
	        System.out.println("2. 음식 정보");
	        System.out.println("3. 음식 삭제");
	        System.out.println("4. 프로그램 종료");
	        System.out.print("번호 선택: ");
	    }

	    public static void addFood() {
	        System.out.print("추가할 음식 입력: ");
	        String name = scanner.nextLine();
	        System.out.print("칼로리 입력: ");
	        int kcal = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character

	        Food food = new Food(name, kcal);
	        menu.add(food);
	        System.out.println("음식 정보가 추가되었습니다.");
	    }

	    public static void displayFoodInfo() {
	        for (int i = 0; i < menu.size(); i++) {
	            System.out.println(menu.get(i).toString());
	        }
	    }

	    public static void deleteFood() {
	        System.out.print("삭제하고 싶은 음식 이름 입력: ");
	        String nameToDelete = scanner.nextLine();

	        boolean found = false;
	        for (int i = 0; i < menu.size(); i++) {
	            if (menu.get(i).getName().equalsIgnoreCase(nameToDelete)) {
	                System.out.println(menu.get(i).toString() + "가 삭제되었습니다.");
	                menu.remove(i);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("해당 음식을 찾을 수 없습니다.");
	        }
	    }
	}

