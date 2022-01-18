package main;

public class CanPlaceFlower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int number = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && i==0){
                if (flowerbed.length==1)
                    number++;
                else if (flowerbed[i+1] == 0) {
                    number++;
                    flowerbed[0] = 1;
                }
            }else if (i-1>=0 && i+1<flowerbed.length){
                if (flowerbed[i-1] == 0 && flowerbed[i] == 0&& flowerbed[i+1]==0) {
                    number++;
                    flowerbed[i] = 1;
                }
            }else if (i == flowerbed.length-1){
                if (flowerbed[i] == 0 && flowerbed[i-1]==0) {
                    flowerbed[i] = 1;
                    number++;
                }
            }
        }
        return number >= n;

    }
}
