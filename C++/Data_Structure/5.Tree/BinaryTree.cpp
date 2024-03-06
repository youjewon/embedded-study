/*
이진트리
자식노드가 최대 2개까지 있는 트리를 이진트리라고한다.
이때 보통 자식노드를 left child rightchild라고 부른다.


이진트리(Binary Tree)의 종류

(완전 이진트리) 마지막 레벨을 제외하고 모든 레벨이 완전히 채워져 있는 트리
노드가 왼쪽부터 채워져야한다.

             1
           /    \
          2      3
         / \     / \
        4 NULL NULL NULL
       / \
     NULL NULL


(완전 이진트리 아님)
            1
          /    \
         2      3
        / \     / \
       4 NULL NULL NULL
      / \           \
   NULL NULL         NULL
  

(전 이진 트리) 모든 노드가 0개 또는 2개의 자식 노드를 가지는 트리
            1
          /    \
         2      3
        / \     / \
       4 NULL NULL NULL
      / \           
   NULL NULL         

(전 이진트리 아님)
            1
          /    \
         2      3
        / \     / \
       4 NULL NULL NULL
      / \           \
   NULL NULL         NULL

(포화 이진트리)
            1
          /    \
         2      3
        / \     / \
       4 NULL NULL NULL
      / \      /     \
   NULL NULL  NULL    NULL
   
(포화 이진트리 아님)
            1
          /    \
         2      3
        / \     / \
       4 NULL NULL NULL
      / \           
   NULL NULL         

*/
 

#include<iostream>
using namespace std;
class Node{
    public: 
        int data;
        Node* left;
        Node* right;
        
    Node(int val)
    {
        data = val;
        left = NULL;
        right = NULL;
    }
};

int main()
{
    // 노드생성
    Node* root = new Node(1);
    /* 트리형태
 
             1
            / \
        NULL   NULL
    */
   root->left = new Node(2);
   root->right = new Node(3);
   /* 2,3 자식노드 추가한 형태
                  1
                /   \
                2      3
               / \     / \
            NULL NULL NULL NULL
    */
   root->left->left = new Node(4);
   /* 2의 자식으로 4추가한 형태 
              1
            /    \
           2      3
          / \     / \
         4 NULL NULL NULL
        / \
      NULL NULL
    */
   return 0;
}


