class Solution {
    public int[] productExceptSelf(int[] nums) {
        int acumulado = 1;
        int[] resultado = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            resultado[i] = acumulado;
            acumulado = acumulado * nums[i];
        }
        acumulado = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            resultado[i] = resultado[i] * acumulado;
            acumulado = acumulado * nums[i];
        }
        
        return resultado;
    }
}
