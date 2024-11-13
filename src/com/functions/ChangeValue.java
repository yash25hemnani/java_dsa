package com.functions;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // When functions are passed to a function it is passed by value.
        // In java there is no pass by reference.
        /* When a variable is passed to the function, a copy of that variable
            is passed instead. That copy points to the value of the variable.
         */
        // So how do we actually change the value?
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[0] = 99;
        // If you make a change to the object via this reference variable the original object will change as well.

        /*
         Java always passes variables by value. However, when you pass an
         array (or any object) to a method, Java passes a copy of the
         reference to that object. This means that both the original
         and the copied reference point to the same memory location.
         So, if you modify the array's contents using this reference,
         the changes will be reflected outside the method because the
         same array in memory is being modified.

         For primitive data types (int, double, etc.), a copy of the actual value is passed.
         Modifying this copy doesn’t affect the original variable outside
         the method.
         For immutable objects like String, any "modification" inside a
         method actually creates a new instance, leaving the original
         object unchanged.
        */
    }
}
