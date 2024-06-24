 <style> 
        .text-with-lines { 
            position: relative; 
            text-align: center; 
        } 
     
        .text-with-lines::before, 
        .text-with-lines::after { 
            content: ""; 
            position: absolute; 
            left: 0; 
            right: 0; 
            border-top: 1px solid black; 
        } 
     
        .text-with-lines::before { 
            top: 0; 
        } 
     
        .text-with-lines::after { 
            bottom: 0; 
        } 

        .img-container {
            display: flex;
            justify-content: center;
            align-items: center;
            width: 100%;
        }

        .img-container img {
            width: 30%;
            height: auto;
        }
    </style> 
  
        <div class="text-with-lines"> 
            <h1>Data Structures and Algorithms Examples</h1> 
        </div> 
        <div class="img-container"><img src="Images/Data-structures-and-algorithms-new.webp" alt="data structures and algorithms"></div>
        <p>This repository contains Java implementations of different data structures and algorithms. Each one shows a different concept. It is intended to show how these elements work and how they're implemented in Java.</p>
        <br>
        <h2>Contents:</h2>
        <h3>ArrayList and Stack (ArrayListAndStack):</h3>
        <ul><li>Implementation of a stack using an ArrayList for managing size.
        </li></ul>
        <h3>ArrayQueue (ArrayQueue):</h3>
        <ul><li>Implementation of a queue using an array with enqueue, dequeue, and peek operations.</li></ul>
        <h3>Binary Search Tree (BinarySearchTree):</h3>
        <ul><li>Implementation of a binary search tree with uses for insertion, deletion, and traversal.</li></ul>
        <h3>Double Linked List (DoubleLinkedList):</h3>
        <ul><li>Implementation of a doubly linked list with nodes containing references to previous and next nodes.</li></ul>
        <h3>Recursion (Recursion):</h3>
        <ul><li>Examples demonstrating recursive algorithms, including factorial computation, Fibonacci sequence, and recursive traversal.</li></ul>
        <h3>LinkedList Queue (LinkedListQueue):</h3>
        <ul><li>Implementation of a queue using a linked list with operations for enqueue, dequeue, and peek.</li></ul>
        <h3>Singly Linked List (SinglyLinkedList):</h3>
        <ul><li>Implementation of a singly linked list with operations for insertion, deletion, traversal, and managing the size of the singly linked list.</li></ul>
        <br>
        <h2>Usage:</h2>
        <p>Each Java file (*.java) can be compiled independently and run, to see the functionality of the data structure or algorithm. These examples are resources for understanding how to implement and use data structures and algorithms efficiently.</p>
        <br>
        <h2>Contributions:</h2>
        <p>Feel free to give improvements, bug fixes or more examples &#40;i.e. bubble sort, maps, graphs, etc.&#41; to improve the value of this repository. Pull requests are welcome! </p>
<br>
<h2>Author:</h2>
<p>Thomas Leavy, 2024</p>