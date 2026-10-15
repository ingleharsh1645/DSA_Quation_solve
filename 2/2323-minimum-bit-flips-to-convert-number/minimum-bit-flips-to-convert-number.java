
class Solution {
    public int minBitFlips(int start, int goal) {
        // XOR gives 1 wherever the bits of start and goal differ
        int xorResult = start ^ goal;
        
        // Count the number of set bits (1s) in the xorResult
        return Integer.bitCount(xorResult);
    }
}