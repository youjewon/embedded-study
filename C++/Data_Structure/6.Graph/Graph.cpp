/*
그래프

개념
 객체간의 연결관계를 표현할 수 있는 자료구조
 EX) 지하철 노선, 지도, 도로, 네트워크 관계도
 트리와 다르게 계층적인 구조를 가지지 않음
 트리도 그래프의 일종으로 볼 수 있음

 종류 
 무방향 그래프 : 방향성이 없는 그래프 (간선을 양방향으로 간주
 방향 그래프 : 방향성이 있는 그래프 (Ex : 일방통행)
 가중치 그래프 : 간선에 가중치 값이 있는 그래프 (Weight)
 eX) 출발지 -> 목적지 갈때 비용이 얼마나 드는지

Graph.png참고

용어정리 
 정점(vertex) 데이터를 표현(노드 라고도 함)
 간선(edge) 연결관게를 표현(정점들을 연결하는데 사용)
 인접 정점(Adjacent Vertex) 직접 연결된 정점
 차수(Dgree) 인접 정점의 개수

그래프의 표현 방법

인접 그래프 (Adjacency List)
 특정 정점 기준으로, 실제 연결된 인접 정점을 값으로 가짐.
 정점간 연겨이되어있는지 확인시 정점의 값들을 순서대로 찾아야 함.
 연결이 적은 그래프에서 사용하는데 유리함.
 ex) 지하철 노선도, [특정 정점] = {인접 정점1,2,3...}

인접 행렬(Adjacency MAtrix)
 2차원 배열을 사용하여 모든 정점들간 연결 여부를 값으로 가짐
 정점간 연결이 되어있는지 확인시, 찾는 정점을 인덱스로 바로 찾을 수 있음.
 연결이 많은 그래프에서 사용하는데 유리 함.
 EX) 소셜 네트워크 관계도
 EX) [정점1][정점2] = 0(연결X) 1(연결O)


*/

//구현

#include<iostream>
#include<vector>
using namespace std;

// 인접 리스트
void CreateGraph_AdjacencyList()
{
    struct Vertex
    {
        int data;
    };
    // 정점 6개 생성
    vector<Vertex> v(6);
    
    //       0            1              2
    // [vector<int>][vector<int>][vector<int>]
    vector<vector<int>> adjacent; // 2차원 배열
    adjacent.resize(6);

    adjacent[0] = { 1, 3 }; // 0번 정점은 1, 3번 정점과 연결되어 있음.
    adjacent[1] = { 0, 2, 3 }; // 1번 정점은 0, 2, 3번 정점과 연결되어 있음.
    adjacent[3] = { 4 }; // 3번 정점은 4번 정점과 연결되어 있음.
    adjacent[4] = { 5 }; // 4번 정점은 5번 정점과 연결되어 있음.

    // Q) 0번이 3번에 연겨되어있는가?
    bool connected = false;

    // 정점이 가지고 있는 값들을 하나씩 조사.
    int size = adjacent[0].size();
    for(int i = 0;i < size; i++)
    {
        int vertex = adjacent[0][i];
        if(vertex == 3)
            connected = true;
    }
};

void CreateGraph_AdjacencyMatrix()
{
    struct Vertex
    {
        int data;
    };

    vector<Vertex> v(6);

    // 연결된 목록을 행렬로 관리
    // [X][O][X][O][X][X] 0 -> 1, 3
    // [O][X][O][O][X][X] 1 -> 0, 2, 3
    // [X][X][X][X][X][X] 2 -> x
    // [X][X][X][X][O][X] 3 -> 4
    // [X][X][X][X][X][X] 4 -> x
    // [X][X][X][X][O][X] 5 -> 4

    vector<bool> v(6,false);

    vector<vector<bool>> adjacent(6,vector<bool>(6,false));
    adjacent[0][1] = true;
    adjacent[0][3] = true;

    adjacent[1][0] = true;
    adjacent[1][2] = true;
    adjacent[1][3] = true;

    adjacent[3][4] = true;
    adjacent[5][4] = true;
    // Q) 0번 -> 3번 연결되어 있나요?
    // 정점을 인덱스로 사용하여 바로 접근 가능.
    bool connected = adjacent[0][3];

    // 가중치 그래프를 인접 행렬로 만들기. (정점간 연결되어 있지 않은 경우 = -1)
    // 값을 가중치로 사용하면 됨.
    vector<vector<int>> adjacent2 =
    {
        { -1, 15, -1, 35, -1, -1},
        { 15, -1, 5, 10, -1, -1},
        { -1, 5, -1, -1, -1, -1},
        { 35, 10, -1, -1, 5, -1},
        { -1, -1, -1, 5, -1, 5},
        { -1, -1, -1, -1, 5, -1},
    };


};