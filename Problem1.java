//*FIND MISSING NUMBER FROM ARRAY*
//Time complexity: o(logn);
//Space Complexity: o(1);
//Any doubts: No.
public static int findMissingElement(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(high-low>1)
        {
            //midpoint
            int mid= low+(high-low)/2;
            //difference
            int middifference= arr[mid]-mid;
            int lowdifference= arr[low]-low;
            int highdifference= arr[high]-high;
            if(middifference != lowdifference)
            {
                high=mid;
            }
            else if(middifference != highdifference)
            {
                low=mid;
            }
        }
        return arr[low]+1;
    }
