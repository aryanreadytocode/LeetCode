package main;

import java.awt.*;

public class MainClass {

    public static void main(String[] args) {

        /*int[][] arr = {{1,2},{2,3}} ;
        System.out.println("Number: "+new FindJudge1Jann().indJudge(3, arr));*/

//        System.out.println("bitwise compliment: "+ new BitwiseComplement().bitwiseComplement(0));


//        System.out.println("bitwise compliment: "+ new PalindromePartitioning().solution("aab"));


        /*int[][] trips = {{2,1,5},{3,3,7}};
        int capacity = 4;
        int[][] trips = {{3,2,7},{3,7,9},{8,3,9}};
        int capacity = 11;
        System.out.println("Car pool is : " + new CarPooling().solution2(trips, capacity));*/

//        int[][] grid = {{3, 1, 1}, {2, 5, 1}, {1, 5, 5}, {2, 1, 1}};
        int[][] grid = {{3, 1},
                        {2, 5}};

//        System.out.println("Maximum number: " + new CherryPick2().cherryPickup(grid));
//        System.out.println("robot is in circle: " + new RobotBoundedInCircle().isRobotBounded("GGLLGG"));

//        System.out.println("Binary Some: " + new AddBinary().solution("1111", "1111"));

//        InsertIntoBinary.Node node = new InsertIntoBinary().insertIntoNode(null, 8);
//        new InsertIntoBinary().insertIntoNode(node, 3);
//        new InsertIntoBinary().insertIntoNode(node, 6);
//        new InsertIntoBinary().insertIntoNode(node, 10);
//        new InsertIntoBinary().insertIntoNode(node, 4);
//        new InsertIntoBinary().insertIntoNode(node, 7);
//        new InsertIntoBinary().insertIntoNode(node, 1);
//        new InsertIntoBinary().insertIntoNode(node, 14);
//        new InsertIntoBinary().insertIntoNode(node, 13);
//        System.out.println("Node: "+node);
//        int[][]  points ={{10,16},{2,8},{1,6},{7,12}};
//        System.out.println("No of arrow count: "+ new MinimumNoOfArrowToBurstBaloon().solution(points));

//        System.out.println("String to Integer : "+new StringToInteger().myAtoi("+1"));

//        int[] arr = {100,-23,-23,404,100,23,23,23,3,404};
//        System.out.println("Number of steps : "+new JumpGameIV().minJumps(arr));
//        String pattern = "abba";
        String pattern = "ab";
//        String array = "cat dog dog cat";
//        String array = "dog dog";
//        System.out.println("Matched Pattern : "+new WordPattern().wordPattern(pattern, array));
//[1,0,0,0,0,0,1]
        int[] array ={0,0,0,1,0,1}; int n = 2;
        System.out.println("Can flower be planted: "+ new CanPlaceFlower().canPlaceFlowers(array, n));
    }
}
