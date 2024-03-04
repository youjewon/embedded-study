/*
트리 

트리는 자료구조의 한종류이며 각 요소를 노드라고 부르다.
각 노드는 데이터를 저장하며 다음 노드를 연결한다.

트리의 맨위의 노드를 루트(root) 라고 부른다.

트리에서 노드와 노드 사이는 엣지(Edge)로 연결되어있다.

parent : 자신보다 하위노드를 가지고있는 노드의 경우 parent 라고한다.
child : 자식노드
shibling : 같은 부모노드를 가지고있는 노드들을 sibling 이라고한다.
leaf : 자식노드를 가지지 않는 노드를 leaf라고 부른다.(자식이 없는 노드)
internal node : 적어도 하나 이상의 자식노드를 포함하는 노드를 internal node라고 부른다.
level : 루트부터 0레벨 그 하위 단계를 1단계씩 늘려나간다.
height 레벨의 역순
path : 노드와 노드 사이간에 나타나는 노드와 엣지의 순서
degree : 해당노드가 포함하는 자식 노드의 갯수
subtree : 노드의 각 자식은 재귀적으로 하위 트리를 형성한다.
          모든 자식노드는 부모 노드에서 하위트리를 형성한다.

대표적인 예시
컴퓨터 파일 매니저 시스템(디렉토리 내부 디렉토리 및 파일들)

*/

#include<iostream>
#include<queue>
using namespace std;

struct Node
{
    int data;
    Node* left;
    Node* right;
};
// 노드 생성함수
Node* CreateNode(int data)
{
    // 노드생성
    Node* newNode = new Node();
    if(!newNode)
    {
        cout << "Memory error\n";
        return NULL;
    }
    newNode->data = data;
    // 비어있는 자식노드 생성
    newNode->left = newNode->right = NULL;
    return newNode;
}

Node* InsertNode(Node* root,int data)
{
    if(root == NULL)
    {
        CreateNode(data);
        return root;
    }

    queue<Node*> q;
    q.push(root);

    while(!q.empty())
    {
        Node* temp = q.front();
        q.pop();

        if(temp->left != NULL)
            q.push(temp->left);
        else
        {
            temp->left = CreateNode(data);
            return root;
        }
        if(temp->right != NULL)
            q.push(temp->right);
        else
        {
            temp->right = CreateNode(data);
            return root;
        }
    }
}

/*
//Tree
------------------------------------------
                 1 //Root Node
                / \
               2    3
              / \  / \
             4  5  6  7 //Leaf Nodes
------------------------------------------

PreOrder Traversal: 1-2-4-5-3-6-7
InOrder Traversal: 4-2-5-1-6-3-7
PostOrder Traversal: 4-5-2-6-7-3-1
*/
void preoder(struct Node* node)
{
    if(node == NULL) return;
    cout << node->data << "->";
    preoder(node->left);
    preoder(node->right);
}
void inorder(struct Node* node)
{
    if(node == NULL) return;
    inorder(node->left);
    cout << node->data << "->";
    inorder(node->right);
}
void postorder(struct Node* node)
{
    if(node == NULL) return;
    postorder(node->left);
    postorder(node->right);
    cout << node->data << "->";
}