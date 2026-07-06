 package Recursion;
 //class Test{
//	public static void main(String[] args) {
//		int [][] arr = {{1,2,3},{4,5,6}};
//		for(int i=0; i<arr.length; i++){
//			for(int j=0; j<arr[i].length; j++){
//				System.out.print(arr[i][j] + " ");
//			}System.out.println();
//        }
//	}
class Student {
//    Student() {
//        System.out.println("Constructor Called");
//    }
//}
//
//     public class test {
//         public static void main(String[] args) {
//             Student s1 = new Student();
//         }
//    static void sum(int a, int b){
//        System.out.println(a+b);
//    }
//
//     public static void main() {
//         sum(2,4);
//     }
//public class LeftHalfPyramid {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            for(int j = 6 - i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


