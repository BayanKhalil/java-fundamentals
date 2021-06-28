/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.Random;


public class Library {
    public boolean someLibraryMethod() {
        return true;
    }


        public static void main(String[] args) {

            int index = 0;
            do {
                index = roll(6);
                System.out.print("["+index+",");
            }
            while (index != 6);

            int [] withDuplicates=new int[] {1,2,5,1};
            System.out.println("Checking array with duplicate " + duplicates(withDuplicates));

            int [] average= new int[] {1,3,5,6};
            System.out.println("average array " + avg(average));

            int [] [] lowestAverageInstance= new int[][]
                    {
                    {66, 64, 58, 65, 71, 57, 60},
                    {57, 65, 65, 70, 72, 65, 51},
                    {55, 54, 60, 53, 59, 57, 61},
                    {65, 56, 55, 52, 55, 62, 57}
            };
            System.out.println("lowest Average " + lowestAverage(lowestAverageInstance));

        }

        public static int roll(int seed) {
            Random randomGenerator;
            randomGenerator = new Random();
            return randomGenerator.nextInt(seed) + 1;
        }


        public static boolean duplicates (int[] arr) {
            boolean duplicatesNum=false;
            for (int i=0;i<arr.length;i++)
                for (int  k=i+1;k<arr.length;k++)
                    if (k!=i && arr[k] == arr[i])
                        duplicatesNum=true;
            return duplicatesNum;
        }

        public static double avg(int[] arr){
            if(arr.length==0) {
                return 0;
            }else {
                int sum = 0;
                double avgNum = 0;
                int size = arr.length;
                for (int x : arr) {
                    sum += x;
                }
                avgNum = sum / size;
                return avgNum;
            }
        }
    public static int[] lowestAverage(int[][]arr){
        double currentSum =0;
        double currentAvg=0;
        double lowAvg=0;
        int indexOfLowestArray=0;

        for (int x : arr[0]){
            currentSum+=x;
        }
        lowAvg = currentSum/arr[0].length;


        for(int i =1 ; i< arr.length; i++){

            currentSum=0;
            for (int x:arr[i]){
                currentSum+=x;
            }
            currentAvg= currentSum/arr[i].length;
            if(lowAvg>currentAvg){
                lowAvg=currentAvg;
               indexOfLowestArray=i;
            }

        }
        return arr[indexOfLowestArray];
    }



    }


