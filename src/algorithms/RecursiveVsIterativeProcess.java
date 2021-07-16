package src.algorithms;

public class RecursiveVsIterativeProcess {
    public static void main(String[] args){
        System.out.println("6! = " + factorial(6));
        System.out.println("6! = " + factorial_iter(1, 1, 6));
    }
    // when we think of recursive process, it is pretty straightforward.
    // we can just convert what we have in mind, just maths equation.
    // so n! = n * (n-1)! right? that's it. we just written.
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    // the other way to think of it is that we just multiply 1 * 2,
    // then * 3, and then * 4 until we reach n, right?
    // with this, we maintain a running product together with the counter
    // from 1 to n.
    // so the rule is
    // product <- counter * product
    // counter <- counter + 1
    // we might think of loop but nope, we can write this with recursive procudure.
    // this is called iterative process. we actually never need loop.
    static int factorial_iter(int product, int counter, int maxcount){
        if (counter > maxcount){
            return product;
        }
        return factorial_iter(counter * product, counter + 1, maxcount);
    }
    /* Now, let's look at the shapes.
    First, recursive process.
    factorial(6)
    6 * factorial(5)
    6 * 5 * factorial(4)
    6 * 5 * 4 * factorial(3)
    6 * 5 * 4 * 3 * factorial(2)
    6 * 5 * 4 * 3 * 2 * factorial(1)
    6 * 5 * 4 * 3 * 2 * 1
    6 * 5 * 4 * 3 * 2
    6 * 5 * 4 * 6
    6 * 5 * 24
    6 * 120
    720
    Now, the iterative process.
    factorial(1, 1, 6)
    factorial(1, 2, 6)
    factorial(2, 3, 6)
    factorial(6, 4, 6)
    factorial(24, 5, 6)
    factorial(120, 6, 6)
    factorial(720, 7, 6)
    720
    The substitution model reveals a shape of expansion followed by contraction.
    The expansion occurs as the process builds up a chain of deferred operations (in this case, a chain of multiplications). 
    The contraction occurs as the operations are actually performed. 
    This type of process, characterized by a chain of deferred operations, 
    is called a recursive process.
    the second process does not grow and shrink. At each step, 
    all we need to keep track of, for any n, 
    are the current values of the variables product, 
    counter, and max-count. We call this an iterative process. 
    Iterative process can be independently run at any point of the program.
    Recursive process cannot be.

    Conclusion, by using recursive procedure,
    we can write both recursive process and iterative process.
    */
}
