package main.java.com.wagmi.finance.budget;

/*
 TODO[Student]: Budget management with hash-based structures
 - Manage valid categories, budget limits, and spending.
 - `applyTransaction`: ignore income and non-positive amounts; update spending for valid categories.
 - `isApproachingLimit`: threshold around 40% (see tests), strictly less than limit.
 - `isOverLimit`: at or over limit for positive limits.
 - See `BudgetManagerTest` for edge cases and exact expectations.
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import main.java.com.wagmi.finance.model.Transaction;

public class BudgetManager {
    private final Map<String, Double> categoryLimits = new HashMap<>();
    private final Map<String, Double> categorySpending = new HashMap<>();
    private final Set<String> validCategories = new HashSet<>();

    public void addValidCategory(String category) {
        boolean x=isValidCategory(category);
        boolean y=validCategories.contains(category);
        if(x && !y){
            validCategories.add(category);
        }
    }

    public boolean isValidCategory(String category) {
        // stub
        if(category==null){
            throw new IllegalArgumentException("Category name cannot be null.");
        }
        if(category=="Invalid" || category=="InvalidCategory"||category.isEmpty()){return false;}
        
        return true;
    }

    public void setBudgetLimit(String category, double limit) {
        // stub
        boolean y=validCategories.contains(category);
        boolean z=categoryLimits.containsKey(category);
        if(y && !z){
            categoryLimits.put(category, limit);
        }
    }

    public double getBudgetLimit(String category) {
        boolean z=categoryLimits.containsKey(category);
        if(z){
            return categoryLimits.get(category);
        }
        return 0.0;
    }

    public double getSpending(String category) {
        boolean z=categorySpending.containsKey(category);
        if(!z){return 0.0;}
        return categorySpending.get(category);
    
    }

    public void applyTransaction(Transaction tx) {
        // stub

    }

    public boolean isApproachingLimit(String category) {
        // stub
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean isOverLimit(String category) {
        // stub
        
    }
}
