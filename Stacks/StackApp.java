import java.io.*;

public class StackApp {

    public static void main(String[] args) {
        // TODO code application logic here
        StackX theStack=new StackX(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        theStack.push(60);
        
        System.out.println("Peek :"+theStack.peek());
        
        while(!theStack.isEmpty()){
            long value=theStack.pop();
            System.out.print(""+value);
            System.out.print(" ");
        }
        System.out.println("");
        
        
        
    }
    
}

//-------------------------------------------------------

 class StackX {
    private int maxSize;
    private long[] stackArray;
    private int top;
    
    //constructor
    
    public StackX(int s){
        maxSize=s;
        stackArray=new long[maxSize];
        top=-1;
    }
    
    //push items on stack
    
    public void push(long j){
        stackArray[++top]=j;
        //put item on top pf stack
        //increment top and then insert 
    }
    
    //pop item from stack
    public long pop(){
        return stackArray[top--];
    }
    
    //take item feom the top
    //acess item and decrement the top
    
    //Find peek
    public long peek(){
        return stackArray[top];
    }
    
    //True if it empty 
    public boolean isEmpty(){
        return (top==-1);
    }
    
    //Check if stack is full
    public boolean isFull(){
        return (top==maxSize-1);
    }
}
