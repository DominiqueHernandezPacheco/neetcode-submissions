class Solution {
    public int maxArea(int[] heights) {
        int areaMax = 0;
        int j = heights.length - 1;
        int i = 0;

        while (i < j) {
            int ancho = j - i;
            int altura;
            int area;

            if (heights[i] > heights[j]) {
                altura = heights[j];
                area = ancho * altura;
                if (area > areaMax) {
                    areaMax = area;
                }

            } else {
                altura = heights[i];
                area = ancho * altura;
                if (area > areaMax) {
                    areaMax = area;
                }
            }

            if (heights[i] > heights[j]) {
                j--;
            } else {
                i++;
            }
        }
        return areaMax;
    }
}
