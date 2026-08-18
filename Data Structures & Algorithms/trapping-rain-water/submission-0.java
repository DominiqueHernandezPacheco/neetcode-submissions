class Solution {
    public int trap(int[] height) {

        int [] right=new int [height.length];
        int [] left=new int [height.length];
        int j=height.length-1;
        int tempR=0;
        int tempL=0;
        int traped=0;

        for (int i=0;i<height.length;i++){
            if(height[i]>tempR){
                tempR=height[i];
            }
            
            if(height[j]>tempL){
                tempL=height[j];
            }

            right[i]=tempR;
            left[j]=tempL;

            j--;
        }   

        for(int i=0;i<height.length;i++){
            int cal=Math.min(right[i],left[i])-height[i];
            traped=traped+cal;
        }

        return traped;
    }
}
