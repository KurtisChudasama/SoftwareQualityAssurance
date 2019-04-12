package com.kurtis.Conventions;

public class CodingConventions {

    //Beginning Comments

    /*
     * Classname
     *
     * Version info
     *
     * Copyright notice
     */

    //Package & Import Statements

    package java.awt;

    import java.awt.Font;

    //breaking expression

    longName1 = longName2 * (longName3 + longName4 - longName5)
            + 4 * longname6;

    //breaking method

    function(longExpression1, longExpression2, longExpression3,
             longExpression4, longExpression5);

    //indenting method declarations

    someMethod(int anArg, Object anotherArg, String yetAnotherArg,
               Object andStillAnother) {
        ...
    }

    //avoid deep indentation

    private static synchronized horkingLongMethodName(int anArg,
                                                      Object anotherArg, String yetAnotherArg,
                                                      Object andStillAnother) {
        ...
    }

    //wrapping if statements

    if ((condition1 && condition2)
            || (condition3 && condition4)
            ||!(condition5 && condition6)) {
        doSomethingAboutIt();
    }

    //block comments

    /*
     * Here is a block comment.
     */

    //single-line comments

    if (condition) {
        /* Handle the condition. */
        ...
    }

    //trailing comments

    if (a == 2) {
        return TRUE; /* special case */
    } else {
        return isprime(a); /* works only for odd a */
    }

    //end-of-line comments

    if (foo > 1) {
        // Do a double-flip.
        ...
    }
    else
        return false; // Explain why here.
    //if (bar > 1) {
    //
    // // Do a triple-flip.
    // ...
    //}
    //else
    // return false;

    //documentation comments

    /**
     * The Example class provides ...
     */
    class Example { ...

    //one declaration per line

        int level;
        int size;

        //the three below are incorrect examples

        int level, size;
        long dbaddr, getDbaddr();
        int foo, fooarray[];

    //Placement of decalrations

        void MyMethod() {
            int int1; // beginning of method block
            if (condition) {
                int int2; // beginning of "if" block
                ...
            }
        }

    //Do not declare same variable name in inner block

        int count;
        ...
        func() {
            if (condition) {
                int count; // AVOID!
                ...
            }
            ...
        }

    //example of correct use of braces and parenthesis for class and interface

        class Sample extends Object {
            int ivar1;
            int ivar2;
            Sample(int i, int j) {
                ivar1 = i;
                ivar2 = j;
            }
            int emptyMethod() {}
            ...
        }

    //Simple statements

        argv++; //correct
        argc--;//correct

        argv++; argc--; //avoid this

    //if-else example

        if (condition) {
            statements;
        }
        if (condition) {
            statements;
        } else {
            statements;
        }
        if (condition) {
            statements;
        } else if (condition) {
            statements;
        } else if (condition) {
            statements;
        }

    //for loop example

        for (initialization; condition; update) {
            statements;
        }

    //while loop example

        while (condition) {
            statements;
        }

    //do-while example

        do {
            statements;
        } while (condition);

    //switch statement example

        switch (condition) {
            case ABC:
                statements;
                /* falls through */
            case DEF:
                statements;
                break;
            case XYZ:
                statements;
                break;
            default:
                statements;
                break;
        }

    //try-catch example

        try {
            statements;
        } catch (ExceptionClass e) {
            statements;
        }

    //blank space after key word example

        while (true) {
            ...
        }

    //blank space with operators examples

        a += c + d;
        a = (a + b) / (c * d);

    //class naming conventions

        class Raster;
        class ImageSprite;

    //interface naming conventions

        interface RasterDelegate;
        interface Storing;

    //method naming conventions

        run();
        runFast();
        getBackground();

    //variable naming conventions

        String myName;
        int goalCount;

    //constants naming conventions

        int MIN_WIDTH = 4;
        int MAX_WIDTH = 999;
        int GET_THE_CPU = 1;

    //example of using class to access variable/method

        classMethod();
        AClass.classMethod();

    //example of fixing an embedded assignment

        d = (a = b + c) + r;//wrong

        a = b + c;//correct
        d = a + r;//correct

    //FIXME example

    //TODO example
 }
