package ExceptionHandling;


class StackOverflow extends Exception
{
    public String toString()
    {
        return "Stack is full!";
    }
}


class StackUnderflow extends Exception
{
    public String toString()
    {
        return "Stack is empty!";
    }
}


class Stack
{
    
    private int size;
    private int top=-1;
    private int s[];

    Stack(int size)
    {
        this.size = size;
        s = new int[size];
    }

    public void push(int num) throws StackOverflow
    {
        if(top == size-1)
        {
            throw new StackOverflow();
        }
        else
        {   
            top++;
            s[top] = num;
        }
    }

    public int pop() throws StackUnderflow
    {
        if(top==-1)
        {
            throw new StackUnderflow();
        }
        else
        {
            int x=s[top];
            top--;
            return x;
        }
    }
}




public class StudentChallenge {
    public static void main(String[] args) {

        Stack s = new Stack(5);

        try
        {
            s.push(10);
            s.push(11);
            s.push(12);
            s.push(13);
            s.push(14);
            s.push(15);
        }
        catch(StackOverflow e)
        {
            System.out.println(e);
        }


        try
        {
            System.out.print("Popped: " + s.pop() + "\n");
            System.out.print("Popped: " + s.pop() + "\n");
            System.out.print("Popped: " + s.pop() + "\n");
            System.out.print("Popped: " + s.pop() + "\n");
            System.out.print("Popped: " + s.pop() + "\n");
            System.out.print("Popped: " + s.pop() + "\n");
            System.out.print("Popped: " + s.pop() + "\n");
            System.out.print("Popped: " + s.pop() + "\n");
        }
        catch(StackUnderflow e)
        {
            System.out.println(e);
        }

    }
}
