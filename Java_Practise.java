// // import java.util.Stack;
// // public class Java_Practise {
// // public static void main(String[] args) {
// //     Stack<Integer>stack=new Stack<>();
// //     stack.push(10);
// //     stack.push(20);
// //     stack.push(30);
// //     stack.push(40);
// //     System.out.println("stack:"+stack);
// //     stack.pop();
// //     System.out.println("after pop"+stack);

// // }
    
// // }

// // import java.util.*;
// // public class Java_Practise{
// //     public static void main(String[] args) {
// //         Deque<Integer> stack=new ArrayDeque<>();
// //         stack.push(1);
// //         stack.push(2);
// //         stack.push(3);
// //         System.out.println(stack.peek());
// //         stack.pop();
// //         System.out.println(stack);
        
// //     }

// // }

// class MyStack{
//     int arr[];
//     int top;
//     int capacity;
//     MyStack(int size){
//         capacity=size;
//         arr=new int[size];
//         top=-1;
//     }

//     void push(int x){
//         if(top ==capacity-1){
//             System.out.println("stack overflow");
//             return;

//         }
//         arr[++top]=x;
//     }

//     int pop(){
//         if(top==-1){
//             System.out.println("stack underflow");
//             return -1;
//         }
//         return arr[top--];
//     }
//     int peek(){
//         if(top==-1){
//             return -1;
//         }
//         return arr[top];

//     }
// }
// public class Java_Practise{
//     public static void main(String [] args){
//         MyStack s=new MyStack(5);
//         s.push(10);
//         s.push(29);
//         s.push(30);
//         System.out.println(s.pop());
//         System.out.println(s.peek());
//     }

// }

