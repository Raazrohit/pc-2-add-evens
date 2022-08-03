package com.jap.addevens;

public class AddEven
{
    //Write the logic to add evens in the methods
    public long addEvens(int n){
	int sum = 0;
	for(int i = 1; i<=n; i++){
		if(i%2==0)
			sum = sum + i;
	}
      return sum;
    }
        public static void main(String[] args) {
            int n = 9;
        // Initialize the object of AddEven class
            AddEven addEven = new AddEven();
            // Declare a variable to give as input to the addEvens method
            AddEven object = new AddEven();
            long sum = object.addEvens(n);
            // Call the addEvens method and display the result
            System.out.println(sum);
        }


}
