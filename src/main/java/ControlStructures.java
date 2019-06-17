class ControlStructures {


    public static void main(String[] args) {



        // ----- Java uses curly braces to show structure.



        // In Python, indentation is used to show what is inside of what.
        // For example, we know because it is outdented
        // that the print statement below is not part of the if.
        //
        // class_size = 124
        // sections = 1;
        // if class_size > 100:
        //     sections = 2
        //     class_size = class_size / 2;
        // print('Sections: {} and class size: {}'.format(sections, class_size))



        // White space makes no difference to Java (although it is very
        // important to humans for code readability!)
        // We use curly braces instead to show this structure.



        // ----- If-statements



        // The simplest if-statement has just an if-condition and associated
        // body.
        int classSize = 124;
        int sections = 1;
        if (classSize > 100) {
            sections = 2;
            classSize = classSize / 2;
        }



        // Round brackets are required around the if-condition.



        // If the body of the if has just a single line, the curly braces
        // around the if-block are optional.
        // For instance, this would work just fine:
        if (classSize > 500){
            System.out.println("Wow, that's big!");}
        // But this code is vulnerable!  If we add more code, we may indent
        // it nicely and fool ourselves into thinking
        // it's inside the if-block:
        if (classSize > 500){
            System.out.println("Wow, that's big!");}
        sections = 3;
        classSize = classSize / 3;
        // But to Java, these extra lines are OUTSIDE the if-block.  They
        // happen regardless of the condition.
        // For this reason, you should always use the curly brackets on your
        // code blocks, even when they are
        // not (currently) required.



        // An if-statement can have a sequence of additional conditions, and
        // they can end with an else.
        // The meaning is just as you've seen in Python, but notice that we
        // say "else if" rather than "elif".
        int grade = 86;
        char letterGrade;
        if (grade > 80) {
            letterGrade = 'A';
        } else if (grade > 70) {
            letterGrade = 'B';
        } else if (grade > 60) {
            letterGrade = 'C';
        } else if (grade > 50) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }



        // And of course if-statements can be nested.
        boolean precipitation = true;
        boolean freezing = false;
        if (precipitation) {
            if (freezing) {
                System.out.println("Wear boots!");
            } else {
                System.out.println("Bring your umbrella!");
            }
        }
        // Remember that it is the curly braces, not the indentation, that
        // associates the else with the inner
        // (vs the outer) if-condition.



        // ----- While loops



        // Although harder to get right, the syntax for a while loop is very
        // simple.
        int number = 37;
        int divisor = 7;
        while (number > divisor) {
            number = number - divisor;
        }
        // We know here that (n > divisor) is false.
        System.out.println("Leftover: " + number);



        // The same structural rules hold here as for if-statements:
        // (1) The condition must be inside round brackets.
        // (2) The while-loop's body needs curly braces if it is more than one
        // line long, but it should have curly braces even if it is only one
        // line long.



        // The meaning of a while-loop is just as in Python.
        // Each time we hit the top of the loop the condition is evaluated.
        // If it evaluates to true, we execute the body of the loop and
        // go back to the top.  Thus, when the loop terminates, we know that
        // the loop condition is false.



        // ----- For loops



        // The syntax for a basic for-loop comes from the C language.  C is
        // now quite old, and this syntax feels as though we are doing things
        // quite "by hand".



        // This is the general structure of a basic for-loop:
        //     for (initialization; termination; increment) {
        //         loop body
        //     }
        // The initialization is executed once, before any iteration begins.
        // It is very often sets a counter to 0, but it can be any statement.
        // The termination is a boolean condition. If it evaluates to true,
        // we execute the loop body and then execute the increment.
        // The increment is usually, as the name suggests, a statement that
        // increments a variable, but it could be any statement.



        // You may have noticed that the for-loop template above is equivalent
        // to this while loop:
        //     initialization
        //     while (termination) {
        //        loop body
        //        increment
        // }



        // Here is a simple example, where we find the sum of the first n
        // numbers.
        int n = 15;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of the first " + n + "numbers is " + sum);
        // Here we counted from 1 to n inclusive.
        // Notice that the initialization included declaring the variable i.
        // As long as the initialization is one statement, it can be anything.
        // It is very common to put the variable declaration in the
        // initialization because this limits its scope (the part of the code
        // in which we can refer to it) to the loop.  The variable disappears
        // from our stack frame as soon as the loop is over, keeping a nice
        // clean namespace.



        // Here is an example with an array.  (An array is like a more
        // restricted version of a Python list, and you'll learn about arrays
        // in detail shortly.)
        int[] powers = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        for (int i = 0; i < powers.length; i++) {
            System.out.println(powers[i]);
        }
        // Notice that we defined i again.  Since the old i is gone, we can
        // do this.
        // Notice also that this time we count from 0 to powers.length - 1,
        // that is, through the valid indices of the array.



        // ----- An aside about ++ and += etc.



        // You have seen some of these syntactic shortforms in Python:
        // i++   is equivalent to   i = i + 1
        // i--   is equivalent to   i = i - 1
        // More generally:
        // x += y  is equivalent to x = x + y
        // x -= y  is equivalent to x = x - y



        // These are handy, and you will very often see i++ as the increment
        // in a for-loop.
        // But there are other uses of these shortcuts that are difficult to
        // read and therefore prone to bugs.  For instance, you can use ++i
        // instead of i++ and either of these can go inside expressions and
        // statements, in which case the ++i vs i++ matter.
        // Bottom line: Don't indulge in these "code tricks".  Use
        // auto-increment/decrement only as a stand-alone statement or as the
        // increment in a for-loop.



        // ----- Enhanced for-loops



        // Java also provides an enhanced form of for-loop, which is more like
        // what you're used to from Python.  It works on arrays and on
        // "collections", which you will learn about shortly.



        // Here's an example with an array:
        for (int p : powers) {
            System.out.println(p);
        }
        // This loop is much simpler, and therefore less error prone, than
        // the one above that uses a regular for-loop.  You should use
        // enhanced for-loops whenever possible.



    }
}