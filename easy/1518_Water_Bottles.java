class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         int totalDrunk = numBottles;   
        int empty = numBottles;       

        while (empty >= numExchange) {
            int newBottles = empty / numExchange;   
            int usedEmpties = newBottles * numExchange; 
            totalDrunk += newBottles;   
            empty = empty - usedEmpties + newBottles;
        }

        return totalDrunk;
    }
}