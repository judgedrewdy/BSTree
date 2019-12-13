package BST;

import java.util.*;


public class BSTManager {
	
	public static void printMenu() {
		System.out.println("\nWhat would you like to do to the list?");
		System.out.println("Press 'i' to insert an integer to the tree.");
		System.out.println("Press 'r' to remove an integer from the tree.");
		System.out.println("Press 'f' to find an integer in the tree.");
		System.out.println("Press 'p' to print the tree in ascending order.");
		System.out.println("Press 'd' to print the depth of the tree.");
		System.out.println("Press 'q' to quit.");
		}

	public static void main(String[] args) {
		
		BinaryST newTree = new BinaryST();
		
		Scanner scnr = new Scanner(System.in);
		
		String input = " ";
		
		while (!input.equals("q")) {
			printMenu();
			input = scnr.nextLine();
			if (input.equals("i")) {
				System.out.println("Type the integer you would like to add.");
				if (scnr.hasNextInt()) {
					int newInt = scnr.nextInt();
					newTree.BSTInsert(newInt);
					scnr.nextLine();
				}
				else {
					System.out.println("Not an integer.");
				}
			}
			else if (input.equals("p")) {
				newTree.BSTPrintInorder(newTree.root);
			}
			else if (input.equals("r")) {
				System.out.println("Type the integer you would like to remove.");
				if (scnr.hasNextInt()) {
					int remove = scnr.nextInt();
					scnr.nextLine();
					if(newTree.BSTRemove(remove)) {
						System.out.println(remove + " has been removed from the tree.");
					}
					else {
						System.out.println(remove + " not found in tree.");
					}
				}
				else {
					System.out.println("Not an integer.");
				}
			}
			else if(input.contentEquals("f")) {
				System.out.println("Type the integer you would like to find.");
				if (scnr.hasNextInt()) {
					int find = scnr.nextInt();
					scnr.nextLine();
					if(newTree.BSTFind(find)) {
						System.out.println(find + " has been found in the tree.");
					}
					else {
						System.out.println(find + " not found in tree.");
					}
				}
				else {
					System.out.println("Not an integer.");
				}
			}
			else if (input.equals("d")) {
				System.out.println("The maximum depth of the tree is: " + newTree.maxDepth(newTree.root));
			
			}
			
			else if (input.equals("q")) {
				break;
			}
			else {
				System.out.println("Not valid input.");
			}
//			
		}
	}
}