#define _CRT_SECURE_NO_WARNINGS 1
#include<string>
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<iostream>
#define Maxn 100
#define QueueSize 100
using namespace std;
typedef struct QElemType{
	string name;
	 
	 
}QElemType;
typedef struct {
	QElemType *base;
	int Front, Rear;
}CQueue;
void InitQueue(CQueue &Q){
	Q.base = new QElemType[QueueSize];
	Q.Front = Q.Rear = 0;
}
void EnQueue(CQueue &Q, QElemType e){
	Q.base[Q.Rear] = e;
	Q.Rear = (Q.Rear + 1) % Maxn;
}
void DeQueue(CQueue &Q, QElemType e){
	if (Q.Front == Q.Rear){
		printf("error !!! Queue is empty !!!\n"); return;
	}
	
	    e = Q.base[Q.Front++];
		cout << e.name;
		Q.Front = Q.Front%Maxn;
		 
	
	
}
void GetHead(CQueue &Q){
	if (Q.Front == Q.Rear){
		printf("error !!! Queue is empty !!!\n"); return;
	}
	QElemType e;
	e = Q.base[Q.Front];
	cout << e.name<<endl;
}
void PartnerPairing(CQueue &Qm, CQueue &Qw){
	int n, m, Min;
	m = (Qm.Rear - Qm.Front + Maxn) % Maxn;
	n = (Qw.Rear - Qw.Front + Maxn) % Maxn;
	printf("%d  %d\n", n, m);
	Min = m<n ? m : n;
	QElemType man, woman ;
	 
		for (int j = 0; j<Min; j++){
			DeQueue(Qm,man); 
			cout   << "<----->"  ;
			DeQueue(Qw, woman);
			cout << endl;
		}
		 
	
}
void isEmpty(CQueue& L){
	if (L.Front == L.Rear){
		cout << "队列为空"<<endl;

	}
	else{
		cout << "队列不为空"<<endl;
	}
}
int main()
{
	int n, m, a;
	QElemType  man, woman;
	CQueue Qm, Qw;
	cout << "********************" << endl;
	cout << "1、初始化           " << endl;
	cout << "2、入队列           " << endl;
	cout << "3、取队头元素       " << endl;
	cout << "4、判断是否为空     " << endl;
	cout << "5、舞者匹配并出队列 " << endl;
	cout << "6、退出             " << endl;
	cout << "********************" << endl;

	while (1){
		cout << "********************" << endl;

		cout << "请选择" << endl;

		cin >> a;
		switch (a){
		case 1:
			InitQueue(Qm), InitQueue(Qw);
			

			break;
		case 2:printf("请输入舞会 男舞者,女舞者各人数: \n");
			cin >> n >> m;
			printf("请输入男舞者的名字\n", n);
			for (int i = 0; i < n; i++){
				printf("第%d位 男舞者 name   \n", i + 1);
				cin >> man.name;
				EnQueue(Qm, man);

			}
			printf("请输入女舞者的名字 \n", m);
			for (int i = 0; i < m; i++){
				printf("第%d位 女舞者 name   \n", i + 1);
				cin >> woman.name;
				EnQueue(Qw, woman);
			}
			break;
		case 3:
			GetHead(Qm);
			cout << endl;

		    GetHead(Qw);
			break;
		case 4:
			isEmpty(Qm);
			cout << endl;
			isEmpty(Qw);
			break;
		 
		case 5:
			PartnerPairing(Qm, Qw);
			break;
		case 6:
			exit(0);
		default:
			break;

		}
		
	}
	system("pause");
	return 0;
}