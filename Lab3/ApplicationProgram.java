/*
 * Purpose: Data Structure and Algorithms Lab 3 Problem 2
 * Status: Complete and thoroughly tested.
 * Last update: 9/23/18
 * Submitted:  9/24/18
 * Comment: Optional sample values added as well.
 * Comment: Extra Credit is at the bottom of this class.
 * @author: Kyle Kaminski
 * @version: 1.0
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.ListIterator;
import java.util.Scanner;

public class ApplicationProgram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run == true) {
			try {
				ArrayList<String> list = new ArrayList<String>();
				System.out.println("");
				System.out.println("**********");
				System.out.println("1. Insert item to list.");
				System.out.println("2. Remove item from list.");
				System.out.println("3. Get item from list.");
				System.out.println("4. Clear list.");
				System.out.println("5. Display size and content of list.");
				System.out.println("6. Delete largest item in the list.");
				System.out.println("7. Reverse list.");
				System.out.println("8. Exit Program.");
				System.out.print("Make a menu selection now: ");

				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("You are now inserting a new item to the list.");
					System.out.print("Enter item: ");
					String item = sc.next();

					System.out.print("Enter the position to insert the item in: ");
					int index1 = sc.nextInt();

					if (index1 > list.size()) {
						System.out.println("Position specified is out of range.");
					}

					list.add(index1, item);

					System.out.println("Item " + item + " inserted in position " + index1 + " in the list.");
					break;
				case 2:
					if (list.size() == 0) {
						System.out.println("The list is empty, nothing to remove.");
					} else {
						System.out.print("Enter position to remove item from: ");
						int index2 = sc.nextInt();

						if (list.size() >= index2) {
							list.remove(index2);
							System.out.println("Item at index " + index2 + " has been removed.");
						} else {
							System.out.println("That index is not on the list.");
						}
					}
					break;
				case 3:
					if (list.size() == 0) {
						System.out.println("The list is empty, nothing to get.");
					}

					System.out.print("Enter position to retrieve item from: ");
					int index3 = sc.nextInt();
					if (list.size() >= index3) {
						list.get(index3);
						System.out.println(list.get(index3) + " is at index " + index3 + ".");
					} else {
						System.out.println("That index is not on the list.");
					}
					break;
				case 4:
					if (list.isEmpty()) {
						System.out.println("The list is empty, nothing to clear.");
					} else {
						list.clear();
						System.out.println("The list has been cleared.");
					}
					break;
				case 5:
					if (list.size() == 1) {
						System.out.println("The list of size 1 has the following item: ");
						System.out.println("(0)" + list.get(0));
					} else if (list.size() != 0) {
						System.out.println("The list of size " + list.size() + " has the following items: ");
						int p5 = 0;
						while (p5 != list.size()) {
							System.out.println("(" + p5 + ")" + list.get(p5) + " ");
							p5++;
						}
					} else if (list.size() == 0) {
						System.out.println("The list is empty, nothing to display.");
					}
					System.out.println();
					break;
				case 6:
					if (list.isEmpty()) {
						System.out.println("The list is empty, nothing to delete.");
					} else {
						int largest6 = list.get(0).length();
						int index6 = 0;
						for (int i6 = 0; i6 < list.size(); i6++) {
							if (list.get(i6).length() > largest6) {
								largest6 = list.get(i6).length();
								index6 = i6;
							}
						}
						System.out.println("(" + index6 + ") " + list.get(index6) + " will be removed from the list.");
						list.remove(index6);
					}
					break;
				case 7:
					if (list.isEmpty()) {
						System.out.println("The list is empty, nothing to reverse.");
					} else {
						ListIterator i1 = list.listIterator();
						int pos1 = 1;
						int pos2 = list.size();
						ListIterator i2 = list.listIterator(pos2);
						while (pos1 < pos2) {
							Object o1 = i1.next();
							Object o2 = i2.previous();
							i1.set(o2);
							i2.set(o1);
							++pos1;
							--pos2;
						}
						System.out.println("The list has been reversed.");
					}
					break;
				case 8:
					System.out.println("Exiting program...Good Bye.");
					sc.close();
					run = false;
					break;
				default:
					System.out.println("Please choose a valid choice.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("That was not valid choice.");
				System.out.println("The program has ended. Please rerun and try again.");
				sc.close();
				run = false;
			}
		}
	}
}

/** // Extra Credit
private static void iterator() {
	class LRBIterator implements Iterator {
		class innerIterator implements ListIterator {
			@Override
			public void add(Object arg0) {
			}

			@Override
			public boolean hasNext() {
				return false;
			}

			@Override
			public boolean hasPrevious() {
				return false;
			}

			@Override
			public Object next() {
				return null;
			}

			@Override
			public int nextIndex() {
				return 0;
			}

			@Override
			public Object previous() {
				return null;
			}

			@Override
			public int previousIndex() {
				return 0;
			}

			@Override
			public void remove() {
			}

			@Override
			public void set(Object arg0) {
			}
		}

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public Object next() {
			return null;
		}
	}
}
**/
