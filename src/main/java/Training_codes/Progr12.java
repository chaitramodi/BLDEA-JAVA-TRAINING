package Training_codes;
import java.util.Scanner;
public class Progr12 {
public static void main(String[] args) {
	int fp=0,sp=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of n: ");
	int n = sc.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
				if(j==0){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++){
				if(j==0 || i==(n-1) && j<=(n/2)){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++){
				if(j==0 || j==(n/2) || i==0 && j<=(n/2) || i==(n-1) && j<=(n/2)){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++){
				if(j==0 && i<=(n/2) || j==(n-1) && i<=(n/2) || (i+j)==(n-1) + (n/2) 
						|| (i-j)==(n/2)){
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++){
				if(j==0 || i==0 && j<=(n/2) || i==(n/2) && j<=(n/2) || i==(n-1) && j<=(n/2)){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++){
				if(j==0 || j==(n-1) || (j==fp || j==sp) && i<=(n/2)){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++){
				if(j==0 && i<=(n/2) || j==(n/2) || i==(n/2) && j<=(n/2) || i==(n-1) && j<=(n/2)){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++){
				if(j==0){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++){
				if(j==0 || j==(n-1) || i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0;j<n;j++){
				if(i==0 || j==(n-1) || i==(n-1) || j==(n/2)){
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++){
				if(j==(n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			for(int j=0;j<n;j++){
				if(j==0 || j==(n/2) || i==0 && j<=(n/2) || i==(n/2) && j<=(n/2)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			if(i==1)
			{
				fp=1;
				sp=(n-1);
			}
			fp++;
			sp--;
	}
	

	}

}
