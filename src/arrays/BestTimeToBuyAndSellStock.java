public int maxProfit(int[] arr){
    int minPrice=arr[0];
    int maxProfit=0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]>minPrice){
         minPrice=arr[i];
        }else{
            int profit=arr[i]-minPrice;
            maxProfit=Math.max(maxProfit, profit);
        }
    }
    return maxProfit;
}