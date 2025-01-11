public class trappedRainWater {
    //
    public static int trap(int[] height) {
        int n = height.length;
        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];
        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
//        System.out.println(RainWaterTrapped(height));
        System.out.println(trap(height));
    }
}
//public static int RainWaterTrapped(int height[]) {
//        int n = height.length;
//
//
//        // calculate left max Boundary  -- array
//        int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//        for (int i = 1; i <n; i++) {
//            leftMax[i] = Math.max(height[i], leftMax[i-1]);
//        }
//
//        // calculate right max Boundary -- array
//        int rightMax[] = new int[n];
//        rightMax[n-1] = height[n-1];
//        for (int i = n-2; i>=0; i--) {
//            rightMax[i] = Math.max(height[i], rightMax[i+1] );
//        }
//
//        int trappedWater = 0;
//        for (int i = 0; i<n; i++) {
//            int WaterLevel = Math.min(rightMax[i] , leftMax[i]);
//            trappedWater += WaterLevel -height[i];
//        }
//        return trappedWater;
//    }