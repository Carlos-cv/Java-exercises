//Class used to find the highest element on a given list

class Compute {  
    public int largest(int arr[], int n)
    {
        int max = 0; //Initial attribute used to saved the highest element of the list
         //Loop through every element of the list
        for (int i = 0; i <= (n - 1); i++) {
            //Condition to verify if the current element of the list is higher than or equal to the current max variable value
            if (arr[i] > max || arr[i] == max){ 
                max = arr[i]; //Update the value of max if the previous condition is met
            }
        }
        return max;
    }
    //main method
    public static void main(String[] args){ 
        int[] A = {1, 2, 0, 3, 2, 4, 5}; //Initial values of the list
        Compute myObj = new Compute(); //Create an object for Compute Class
        System.out.println(myObj.largest(A, 7));
    }
}
