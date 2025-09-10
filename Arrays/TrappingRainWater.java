package Arrays;

import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        int heights[] = { 4, 2, 0, 3, 2, 5 };

        int trapWater = CalculateTrapWater(heights);
        System.out.println(trapWater);
    }

    public static int CalculateTrapWater(int[] heights) {
        int TrapWater = 0;
        //Left Max Boundry
        int[] leftMax = new int[heights.length];
        leftMax[0] = heights[0];
        for (int i = 1; i < heights.length; i++) {
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }
        System.out.println(Arrays.toString(leftMax));
        
        //Right Max Boundry
        int[] rightMax = new int[heights.length];
        rightMax[heights.length - 1] = heights[heights.length - 1];
        for (int i = heights.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
        }
        System.out.println(Arrays.toString(rightMax));

        for (int i = 0; i < heights.length; i++) {
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);
            TrapWater+= (WaterLevel - heights[i]);
        }
        return TrapWater;
    }
}
