package main.java.com.wagmi.finance.alg;

/*
 TODO[Student]: Binary search by Transaction ID
 - Array must be sorted by `Transaction.getId()` ascending.
 - Handle null array (throw NPE) and null id (return -1) per tests.
 - See `SearchTest` for target indices and edge cases.
*/

import main.java.com.wagmi.finance.model.Transaction;

public final class Search {
    private Search() {
    }

    public static int binarySearchById(Transaction[] sortedById, String id) {
        if(sortedById.length==0){
            return -1;
        }
        int low=0;
        int high=sortedById.length;
        while(low<=high){
            int m=(low+high)/2;
            if(sortedById[m].equals(id)){return m;}
            else if(sortedById[m]>id){high=m-1;}
            else{low=m+1;}
        }
        return -1;
        throw new UnsupportedOperationException("Not implemented");
    }
}
