// ======= DO NOT EDIT THIS FILE ============
class Node
  {Person info;
   int bal; // balance factor of the node p = height(p.right) - height(p.left)
   int level; // Level of the node
   Node left,right;
   Node(Person x)
     {info=x;left=right=null;
     }  
   }