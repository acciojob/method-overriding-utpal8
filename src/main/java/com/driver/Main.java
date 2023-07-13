package com.driver;

// Step 1: Create class A with a method named meth
class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Step 2: Create class B which extends class A
class B extends A {}

public class Main {
    public static void main(String[] args) {
        // Step 3: Create an object of class B and call the method meth from class A
        B objB = new B();
        System.out.println(objB.meth());  // Output: Invoking method from class A

        // Step 4: Override the method meth in class B
        class B extends A {
            @Override
            public String meth() {
                return "Method is overridden in Extended class B";
            }
        }

        // Step 5: Call the overridden method from the object of class B
        B objB2 = new B();
        System.out.println(objB2.meth());  // Output: Method is overridden in Extended class B
    }
}