package main.java.com.wagmi.finance.history;

/*
 TODO[Student]: Array-based stack
 - Enforce underflow/overflow behaviors per tests.
 - Note dynamic growth is allowed only when initial capacity >= 10.
 - Validate null pushes (should throw).
 - Run `OperationStackTest` after changes.
*/

public class OperationStack {
    private final String[] data;
    private int top = -1;

    public OperationStack(int capacity) {
        this.data = new String[capacity];
    }

    public void push(String operation) {
        if (top==-1){
            top=0;
            data[top]=operation;
        }
        else if(top==data.length){return;}
        else{top++;
        data[top]=operation;}
        
    }

    public String pop() {
        if(top==-1){
            return null;
        }
        else {
            String temp=data[top];
            top--;
            return temp;
        }
       
    }

    public String peek() {
        if(top==-1){
            return null;
        }
        String temp=data[top];
        return temp;
        
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public int size() {
        return top + 1;
    }
}
