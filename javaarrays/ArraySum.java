package javaarrays;

        //Q#6 findind sum of array

public class ArraySum {

			    void calculateSum() {
			        int[] arr = {10, 20, 30, 40, 50};
			        int sum = 0;

			        for (int num : arr) {
			            sum += num;
			        }

			        System.out.println("Sum of array elements: " + sum);
			    }
			}

			// Q#7 finding max number from array
			
			class MaxElement {
			    void findMax() {
			        int[] arr = {12, 45, 7, 89, 34, 67};
			        int max = arr[0];

			        for (int num : arr) {
			            if (num > max) {
			                max = num;
			            }
			        }

			        System.out.println("Maximum element: " + max);
			    }
			}

			//Q#8 reversing the array
			
			class ReverseArray {
			    void printReverse() {
			        int[] arr = {5, 10, 15, 20, 25};

			        System.out.println("Array in reverse order:");
			        for (int i = arr.length - 1; i >= 0; i--) {
			            System.out.print(arr[i] + " ");
			        }
			        System.out.println();
			    }
			}

			// Q#9 Finding even numbers from array
			
			class EvenNumbers {
			    void printEven() {
			        int[] arr = {1, 4, 7, 8, 10, 13, 16, 18, 21, 24};

			        System.out.println("Even numbers in the array:");
			        for (int num : arr) {
			            if (num % 2 == 0) {
			                System.out.print(num + " ");
			            }
			        }
			        System.out.println();
			    }
			}
	
