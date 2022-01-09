package main;

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
        System.out.println("robot is in circle: " + new RobotBoundedInCircle().isRobotBounded("GGLLGG"));
    }
}
